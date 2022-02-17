package oracle.ecommerce.model.eo.base;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class ProductBaseEO extends BaseEO {
    
    @Column(name = "PRICE")
    protected double price;
    @Column(name = "QUANTITY")
    protected long quantity;
    @Column(name = "BRAND")
    protected String brand;
    @Column(name = "COLOR")
    protected String color;

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
