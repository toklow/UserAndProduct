package kto.learning;

public class Product {

    private Long id;
    private String productName;
    private float price;
    private float weight;
    private String color;
    private float productCount;

    public Product(Long id, String productName, float price, float weight, String color, float productCount) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.weight = weight;
        this.color = color;
        this.productCount = productCount;
    }

    public Long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public float getPrice() {
        return price;
    }

    public float getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public float getProductCount() {
        return productCount;
    }
}
