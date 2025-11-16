package com.example.demo.service;

import com.example.demo.model.Category;
import com.example.demo.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StoreService {

    private final List<Category> categories = new ArrayList<>();
    private final List<Product> products = new ArrayList<>();

    public StoreService() {

        // ===== CATEGORÍAS =====
        categories.add(new Category(1L, "ACCESORIOS", "/img/accesorios.jpg"));
        categories.add(new Category(2L, "CAMISETAS", "/img/camisetas (2).png"));
        categories.add(new Category(3L, "HOODIES", "/img/hoodies.jpg"));
        categories.add(new Category(4L, "INFERIORES", "/img/pantalones.jpg"));
        categories.add(new Category(5L, "TOPS", "/img/tops.jpg"));

        // =====================================================
        // ===============   NUEVOS LANZAMIENTOS   =============
        // =====================================================

        products.add(new Product(
                1L, "CAMISETA TRIBAL", "CAMISETAS",
                "/img/camiseta0.jpg", "/img/camiseta-tribal-back.jpg",
                100000, "Camiseta tribal original.", "Boxy fit",
                List.of("S", "M", "L", "XL"),
                10
        ));

        products.add(new Product(
                2L, "BARREL JEAN", "INFERIORES",
                "/img/barrel-jean-full.jpg", "/img/barrel-jean-full.jpg",
                170000, "Jean barrel de corte amplio.", "Relaxed",
                List.of("28", "30", "32", "34"),
                6
        ));

        // =====================================================
        // ================   8 ACCESORIOS   ===================
        // =====================================================

        products.add(new Product(
                101L, "GORRA  BEIGE CON VERDE OZZIE", "ACCESORIOS",
                "/img/accesorio1.jpg", "/img/accesorio1.jpg",
                90000, "GORRA  BEIGE CON VERDE OZZIE.", "Ajustable",
                List.of("ÚNICA"),
                15
        ));

        products.add(new Product(
                102L, "GORRA AMARILLA", "ACCESORIOS",
                "/img/accesorio2.jpg", "/img/accesorio2.jpg",
                95000, "GORRA AMARILLA OZZIE.", "Ajustable",
                List.of("ÚNICA"),
                10
        ));

        products.add(new Product(
                103L, "LLAVERO DENIM STAR", "ACCESORIOS",
                "/img/accesorio3.jpg", "/img/accesorio3.jpg",
                95000, "LLAVERO DENIM STAR.", "Ajustable",
                List.of("ÚNICA"),
                8
        ));

        products.add(new Product(
                104L, "GORRA AZUL OZZIE", "ACCESORIOS",
                "/img/accesorio4.jpg", "/img/accesorio4.jpg",
                65000, "GORRA AZUL OZZIE.", "Regular",
                List.of("ÚNICA"),
                12
        ));

        products.add(new Product(
                105L, "Pañoleta F*ck Cupid – Edición Última Flecha OZZIE 🏹", "ACCESORIOS",
                "/img/accesorio5.jpg", "/img/accesorio5.jpg",
                65000, "Pañoleta F*ck Cupid – Edición Última Flecha OZZIE 🏹.", "Regular",
                List.of("ÚNICA"),
                9
        ));

        products.add(new Product(
                106L, "BEANIE PELUCHE CRUCES BLANCO", "ACCESORIOS",
                "/img/accesorio6.jpg", "/img/accesorio6.jpg",
                50000, "BEANIE PELUCHE CRUCES BLANCO.", "Unisex",
                List.of("ÚNICA"),
                20
        ));

        products.add(new Product(
                107L, "GORRA WASHED HEART BONES ROSADO", "ACCESORIOS",
                "/img/accesorio7.jpg", "/img/accesorio7.jpg",
                40000, "GORRA WASHED HEART BONES ROSADO", "Unisex",
                List.of("ÚNICA"),
                25
        ));

        products.add(new Product(
                108L, "PAÑOLETA CAZZIEL NEGRO OZZIE", "ACCESORIOS",
                "/img/accesorio8.jpg", "/img/accesorio8.jpg",
                70000, "PAÑOLETA CAZZIEL NEGRO OZZIE", "Unisex",
                List.of("ÚNICA"),
                7
        ));

        // =====================================================
        // ================   8 CAMISETAS   ====================
        // =====================================================

        products.add(new Product(
                201L, "CAMISETA OZZIE LOGO BLANCA", "CAMISETAS",
                "/img/camiseta1.jpg", "/img/camiseta1.jpg",
                95000, "Camiseta blanca con logo OZZIE centrado.", "Regular fit",
                List.of("S", "M", "L", "XL"),
                12
        ));

        products.add(new Product(
                202L, "BOXY FIT FUTBOL BATS BOXY NEGRO", "CAMISETAS",
                "/img/camiseta2.jpg", "/img/camiseta2.jpg",
                95000, "BOXY FIT FUTBOL BATS BOXY NEGRO", "Regular fit",
                List.of("S", "M", "L", "XL"),
                10
        ));

        products.add(new Product(
                203L, "CAMISETA OVERSIZE NEGRO HOLY TEARS", "CAMISETAS",
                "/img/camiseta3.jpg", "/img/camiseta3.jpg",
                110000, "CAMISETA OVERSIZE NEGRO HOLY TEARS", "Boxy fit",
                List.of("S", "M", "L", "XL"),
                8
        ));

        products.add(new Product(
                204L, "CAMISETA LIL PEEP NEGRO", "CAMISETAS",
                "/img/camiseta4.jpg", "/img/camiseta4.jpg",
                100000, "CAMISETA LIL PEEP NEGRO", "Boxy fit",
                List.of("S", "M", "L", "XL"),
                7
        ));

        products.add(new Product(
                205L, "CAMISETA BOXY FIT MAJESTIC ÁNGEL", "CAMISETAS",
                "/img/camiseta5.jpg", "/img/camiseta5.jpg",
                98000, "CAMISETA BOXY FIT MAJESTIC ÁNGEL", "Boxy fit",
                List.of("S", "M", "L", "XL"),
                9
        ));

        products.add(new Product(
                206L, "CAMISETA POISON NEGRO", "CAMISETAS",
                "/img/camiseta6.jpg", "/img/camiseta6.jpg",
                105000, "CAMISETA POISON NEGRO", "Boxy fit",
                List.of("S", "M", "L", "XL"),
                6
        ));

        products.add(new Product(
                207L, "CAMISETA OVERSIZE NIGHTNARE", "CAMISETAS",
                "/img/camiseta7.jpg", "/img/camiseta7.jpg",
                90000, "CAMISETA OVERSIZE NIGHTNARE", "Oversize",
                List.of("M", "L", "XL"),
                11
        ));

  

        // =====================================================
        // ================   8 HOODIES   ======================
        // =====================================================

        products.add(new Product(
                301L, "CAMISETA TEJIDA SKELETON NEGRO OVERSIZED", "HOODIES",
                "/img/hoodie1.jpg", "/img/hoodie1.jpg",
                180000, "CAMISETA TEJIDA SKELETON NEGRO OVERSIZED", "Oversize",
                List.of("S", "M", "L"),
                8
        ));

        products.add(new Product(
                302L, "HOODIE OVERSIZE FAITH EDITION", "HOODIES",
                "/img/hoodie2.jpg", "/img/hoodie2.jpg",
                180000, "HOODIE OVERSIZE FAITH EDITION", "Oversize",
                List.of("S", "M", "L"),
                6
        ));

        products.add(new Product(
                303L,"CAMIBUZO TEJIDO EDGERUNNERS NEGRO/BLANCO OVERSIZED", "HOODIES",
                "/img/hoodie3.jpg", "/img/hoodie3.jpg",
                165000, "CAMIBUZO TEJIDO EDGERUNNERS NEGRO/BLANCO OVERSIZED", "Regular fit",
                List.of("M", "L", "XL"),
                9
        ));

        products.add(new Product(
                304L, "BUZO HEART – EDICIÓN ÚLTIMA FLECHA 🏹", "HOODIES",
                "/img/hoodie4.jpg", "/img/hoodie4.jpg",
                175000, "BUZO HEART – EDICIÓN ÚLTIMA FLECHA 🏹", "Regular fit",
                List.of("M", "L"),
                7
        ));

        products.add(new Product(
                305L, "HOODIE CON CAPUCHA DARK FAITH", "HOODIES",
                "/img/hoodie5.jpg", "/img/hoodie5.jpg",
                170000, "HOODIE CON CAPUCHA DARK FAITH", "Oversize",
                List.of("S", "M"),
                5
        ));

        products.add(new Product(
                306L, "HOODIE SIGILLUM CRUDO RELAXED FIT", "HOODIES",
                "/img/hoodie6.jpg", "/img/hoodie6.jpg",
                185000, "HOODIE SIGILLUM CRUDO RELAXED FIT", "Oversize",
                List.of("M", "L"),
                5
        ));

        products.add(new Product(
                307L, "BUZO OVERSIZE ESSENTIAL D13", "HOODIES",
                "/img/hoodie7.jpg", "/img/hoodie7.jpg",
                190000, "Hoodie con cierre y detalles tribales.", "Oversize",
                List.of("M", "L", "XL"),
                4
        ));

        products.add(new Product(
                308L, "CAMIBUZO TEJIDO EDGERUNNERS NEGRO/FUCSIA OVERSIZED", "HOODIES",
                "/img/hoodie8.jpg", "/img/hoodie8.jpg",
                160000, "CAMIBUZO TEJIDO EDGERUNNERS NEGRO/FUCSIA OVERSIZED", "Regular fit",
                List.of("S", "M", "L"),
                10
        ));

        // =====================================================
        // ================   8 INFERIORES   ===================
        // =====================================================

        products.add(new Product(
                401L, "PANTALÓN CAMUFLADO UNISEX VERDE", "INFERIORES",
                "/img/pantalones.jpg", "/img/inferior1.jpg",
                165000, "PANTALÓN CAMUFLADO UNISEX VERDE", "Wide leg",
                List.of("28", "30", "32", "34"),
                6
        ));

        products.add(new Product(
                402L, "BERMUDA JORTS CARGO OVERSIZE WASHED BLUE", "INFERIORES",
                "/img/inferior2.jpg", "/img/inferior2.jpg",
                165000, "BERMUDA JORTS CARGO OVERSIZE WASHED BLUE", "Wide leg",
                List.of("28", "30", "32", "34"),
                5
        ));

        products.add(new Product(
                403L, "SUDADERA PARA HOMBRE ARENA BÁSICA", "INFERIORES",
                "/img/inferior3.jpg", "/img/inferior3.jpg",
                160000, "SUDADERA PARA HOMBRE ARENA BÁSICA", "Regular",
                List.of("30", "32", "34"),
                8
        ));

        products.add(new Product(
                404L, "CURVED CARGO JEANUNISEX AZUL", "INFERIORES",
                "/img/inferior4.jpg", "/img/inferior4.jpg",
                160000, "CURVED CARGO JEANUNISEX AZUL", "Regular",
                List.of("30", "32", "34"),
                7
        ));

        products.add(new Product(
                405L, "PARACHUTE HOLLOW UNISEX NEGRO", "INFERIORES",
                "/img/inferior5.jpg", "/img/inferior5.jpg",
                120000, "PARACHUTE HOLLOW UNISEX NEGRO", "Regular",
                List.of("28", "30", "32"),
                9
        ));

        products.add(new Product(
                406L, "CARGO JEAN NEGRO UNISEX NEGRO", "INFERIORES",
                "/img/inferior6.jpg", "/img/inferior6.jpg",
                130000, "CARGO JEAN NEGRO UNISEX NEGRO", "Slim fit",
                List.of("S", "M", "L"),
                10
        ));

        products.add(new Product(
                407L, "PANTALONETA ACID WASH DB13", "INFERIORES",
                "/img/inferior7.jpg", "/img/inferior7.jpg",
                130000, "PANTALONETA ACID WASH DB13", "Slim fit",
                List.of("S", "M", "L"),
                11
        ));


        // =====================================================
        // ================   8 TOPS   =========================
        // =====================================================

        products.add(new Product(
                501L, "CROP TOP NATURAL BABY TEES", "TOPS",
                "/img/top1.jpg", "/img/top1.jpg",
                80000, "CROP TOP NATURAL BABY TEES", "Slim fit",
                List.of("S", "M"),
                7
        ));

        products.add(new Product(
                502L, "CROP TOP VELOCITY", "TOPS",
                "/img/top2.jpg", "/img/top2.jpg",
                85000, "CROP TOP VELOCITY", "Slim fit",
                List.of("S", "M"),
                6
        ));

        products.add(new Product(
                503L, "BABY TEE DISTRESSED NIGHTMARE VAINILLA", "TOPS",
                "/img/top3.jpg", "/img/top3.jpg",
                75000, "BABY TEE DISTRESSED NIGHTMARE VAINILLA", "Slim fit",
                List.of("S", "M", "L"),
                9
        ));

        products.add(new Product(
                504L, "TOP STRAPLESS CRUZ STAR NEGRO", "TOPS",
                "/img/top4.jpg", "/img/top4.jpg",
                75000, "TOP STRAPLESS CRUZ STAR NEGRO", "Slim fit",
                List.of("S", "M", "L"),
                8
        ));

        products.add(new Product(
                505L, "CORE TOP DIVINIDAD GRIS", "TOPS",
                "/img/top5.jpg", "/img/top5.jpg",
                78000, "CORE TOP DIVINIDAD GRIS", "Slim fit",
                List.of("S", "M"),
                5
        ));

        products.add(new Product(
                506L, "CROP TOP PARA MUJER REGULAR SAND", "TOPS",
                "/img/top6.jpg", "/img/top6.jpg",
                78000, "CROP TOP PARA MUJER REGULAR SAND", "Slim fit",
                List.of("S", "M"),
                4
        ));

        products.add(new Product(
                507L, "CROP TOP BLACKHEAT CON CAPUCHA", "TOPS",
                "/img/top7.jpg", "/img/top7.jpg",
                90000, "CROP TOP BLACKHEAT CON CAPUCHA", "Slim fit",
                List.of("S", "M", "L"),
                6
        ));

        products.add(new Product(
                508L, "TOP STRAPLESS HEART OF THORNS CRUDO", "TOPS",
                "/img/top8.jpg", "/img/top8.jpg",
                95000, "TOP STRAPLESS HEART OF THORNS CRUDO", "Slim fit",
                List.of("S", "M"),
                3
        ));
    }

    // ===== HOME: solo nuevos lanzamientos =====
    public List<Product> getNewProducts() {
        return products.stream()
                .filter(p -> p.getId() == 1L || p.getId() == 2L)
                .collect(Collectors.toList());
    }

    // ===== CATEGORÍAS =====
    public List<Category> getCategories() {
        return categories;
    }

    // ===== Lista productos por categoría =====
    public List<Product> getProductsByCategory(String category) {
        return products.stream()
                .filter(p -> p.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    // ===== Detalle de producto =====
    public Optional<Product> getProductById(Long id) {
        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }
}

