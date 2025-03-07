import java.util.ArrayList;
import java.util.List;

public class GiftBox {
    public static void main(String[] args) {
        List<SweetGift> giftBox = new ArrayList<>();
        giftBox.add(new Candy("Mishka", 10, 500, "chocolate with wafer"));
        giftBox.add(new Jellybean("Haribo", 5, 65, "bear-shaped"));
        giftBox.add(new Chocolate("Alpen Gold", 7, 200, "Switzerland"));

        int totalWeight = 0;
        int totalPrice = 0;

        System.out.println("Composition:");
        for (SweetGift sweet : giftBox) {
            System.out.println(sweet);
            totalWeight += sweet.weight;
            totalPrice += sweet.price;
        }

        System.out.println("\nTotal weight: " + totalWeight + "g");
        System.out.println("Total cost: " + totalPrice + "$");
    }
}
