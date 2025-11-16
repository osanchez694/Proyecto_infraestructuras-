package com.example.demo.controller;

import com.example.demo.model.CartItem;
import com.example.demo.model.Product;
import com.example.demo.service.StoreService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@SessionAttributes("cart")   // carrito guardado en sesión
public class StoreController {

    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    // 🔹 Se crea el carrito vacío la primera vez
    @ModelAttribute("cart")
    public List<CartItem> cart() {
        return new ArrayList<>();
    }

    // 🔹 HOME
    @GetMapping("/")
    public String home(Model model,
                       @ModelAttribute("cart") List<CartItem> cart) {

        model.addAttribute("categories", storeService.getCategories());
        model.addAttribute("products", storeService.getNewProducts());
        model.addAttribute("cartCount", cart.size());
        return "index";
    }

    // 🔹 LISTA POR CATEGORÍA
    @GetMapping("/categoria/{name}")
    public String categoryPage(@PathVariable("name") String name,
                               Model model,
                               @ModelAttribute("cart") List<CartItem> cart) {

        model.addAttribute("categories", storeService.getCategories());
        model.addAttribute("selectedCategory", name);         // 👈 coincide con categoria.html
        model.addAttribute("products", storeService.getProductsByCategory(name));
        model.addAttribute("cartCount", cart.size());
        return "categoria";
    }

    // 🔹 DETALLE PRODUCTO
    @GetMapping("/producto/{id}")
    public String productDetail(@PathVariable("id") Long id,
                                Model model,
                                @ModelAttribute("cart") List<CartItem> cart) {

        Product product = storeService.getProductById(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));

        model.addAttribute("product", product);
        model.addAttribute("categories", storeService.getCategories());
        model.addAttribute("cartCount", cart.size());
        return "producto";
    }

    // 🔹 AGREGAR AL CARRITO (POST)
    @PostMapping("/carrito/agregar")
    public String addToCart(@RequestParam("productId") Long productId,
                            @RequestParam("size") String size,
                            @RequestParam("quantity") int quantity,
                            @ModelAttribute("cart") List<CartItem> cart) {

        storeService.getProductById(productId).ifPresent(product -> {
            // Si ya existe el mismo producto+size, solo aumenta cantidad
            for (CartItem item : cart) {
                if (item.getProduct().getId().equals(productId)
                        && item.getSize().equals(size)) {
                    item.setQuantity(item.getQuantity() + quantity);
                    return;
                }
            }
            cart.add(new CartItem(product, size, quantity));
        });

        return "redirect:/carrito";
    }

    // 🔹 VER CARRITO
    @GetMapping("/carrito")
    public String viewCart(@ModelAttribute("cart") List<CartItem> cart,
                           Model model) {

        int totalCart = cart.stream()
                .mapToInt(item -> item.getProduct().getPrice() * item.getQuantity())
                .sum();

        model.addAttribute("categories", storeService.getCategories());
        model.addAttribute("items", cart);
        model.addAttribute("cartCount", cart.size());
        model.addAttribute("totalCart", totalCart);
        return "carrito";
    }

    // 🔹 FINALIZAR COMPRA (checkout)
    @PostMapping("/checkout")
    public String checkout(@ModelAttribute("cart") List<CartItem> cart,
                           Model model) {

        int totalCart = cart.stream()
                .mapToInt(item -> item.getProduct().getPrice() * item.getQuantity())
                .sum();

        List<CartItem> itemsCopy = new ArrayList<>(cart); // copia para la vista
        cart.clear();                                     // vaciar carrito

        model.addAttribute("categories", storeService.getCategories());
        model.addAttribute("items", itemsCopy);
        model.addAttribute("cartCount", cart.size()); // ahora 0
        model.addAttribute("totalCart", totalCart);

        return "checkout";
    }

    // 🔹 PÁGINA DE CONTACTO
    @GetMapping("/contacto")
    public String contacto(@ModelAttribute("cart") List<CartItem> cart,
                           Model model) {

        model.addAttribute("categories", storeService.getCategories());
        model.addAttribute("cartCount", cart.size());
        return "contacto";
    }
}
