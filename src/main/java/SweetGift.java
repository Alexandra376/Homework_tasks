import java.util.ArrayList;
import java.util.List;

public class SweetGift {

    String name;
    int price;
    int weight;
    String taste;

    public SweetGift(String name, int price, int weight, String taste) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.taste = taste;
    }
    public static void main(String[] args) {

        List<SweetGift> giftBox = new ArrayList<>();
        giftBox.add(candy());
        giftBox.add(jellybean());

        int totalWeight = 0;
        int totalPrice = 0;

        System.out.println("Composition:");
        for (SweetGift sweet : giftBox) {
            System.out.println(sweet.name + " - weight: " + sweet.weight + "g, price: " + sweet.price + "$, taste: " + sweet.taste);
            totalWeight += sweet.weight;
            totalPrice += sweet.price;
        }

        System.out.println("\nWeight: " + totalWeight + "g");
        System.out.println("Cost: " + totalPrice + "$");
    }

    public static SweetGift candy() {
        return new SweetGift("Mishka", 10, 500, "chocolate with wafer");
    }

    public static SweetGift jellybean() {
        return new SweetGift("Haribo", 5, 65, "apple");
    }

}
