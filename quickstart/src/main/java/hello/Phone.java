package hello;

public class Phone {
    private String brand;
    private String price;
    private String color;
    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price='" + price + '\'' +
                ", color='" + color + '\'' +
                '}';
    }


    public Phone(String brand, String price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }



    public String getBrand() {
        return brand;
    }

    public String getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }


}
