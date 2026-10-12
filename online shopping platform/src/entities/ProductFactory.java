package entities;

import java.util.Locale;

/**
 * Should have the control and the logic to create Product objects
 */
public class ProductFactory {
    public Product createProduct(String category){
        switch(category.toLowerCase()){
            case "electronics":
                return new ElectronicProduct();
            case "clothing":
                return new ClothingProduct();
            default :
                throw new IllegalArgumentException("Invalid category asked :" + category);
        }
    }
}
