public class Candy extends SweetGift {

    private String flavor;

    public Candy(String name, int price, int weight, String flavor) {
        super(name, price, weight);
        this.flavor = flavor;
    }

    @Override
    public String getUniqueProperty() {
        return "flavor: " + flavor;
    }
}
