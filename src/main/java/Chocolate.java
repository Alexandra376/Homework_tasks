public class Chocolate extends SweetGift {

    private String countryOfOrigin;

    public Chocolate(String name, int price, int weight, String countryOfOrigin) {
        super(name, price, weight);
        this.countryOfOrigin = countryOfOrigin;
    }

    @Override
    public String getUniqueProperty() {
        return "country of origin: " + countryOfOrigin;
    }
}
