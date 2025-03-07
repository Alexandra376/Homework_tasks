public abstract class SweetGift {
    String name;
    int price;
    int weight;

    public SweetGift(String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public abstract String getUniqueProperty();

    @Override
    public String toString() {
        return name + " - weight: " + weight + "g, price: " + price + "$, " + getUniqueProperty();
    }
}

