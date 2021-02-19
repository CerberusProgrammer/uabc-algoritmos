package src.work.blackbuster;

public class Producto {

    private int code;
    private String name;
    private int price;
    private boolean renta;

    public Producto(int code, String name, int price) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.renta = false;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean getRenta() {
        return renta;
    }

    public void setRenta(boolean renta) {
        this.renta = renta;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", price=" + price + '\'' +
                ", renta=" + renta +
                '}';
    }
}
