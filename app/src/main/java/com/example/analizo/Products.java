package com.example.analizo;

public class Products {
    //Attributes for each product
    private String id;
    private String productName;
    private String productDescription;
    private String productImage;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public Products(){}

    public Products(String id, String productName, String productDescription, String productImage){
        this.id = id;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productImage = productImage;
    }

}
