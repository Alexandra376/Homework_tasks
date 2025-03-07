public class Jellybean extends SweetGift {

    private String shape;

    public Jellybean(String name, int price, int weight, String shape) {
        super(name, price, weight);
        this.shape = shape;
    }

    @Override
    public String getUniqueProperty() {
        return "shape: " + shape;
    }
}
