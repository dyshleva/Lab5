package flower.store;

import lombok.Getter;

@Getter
public class FlowerPack {
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower, int quantity) {
        this.flower = flower;
        this.setQuantity(quantity);
    }

    public void setQuantity(int value) {
        if (value < 1) {
            this.quantity = 1;
        } else {
            this.quantity = value;
        }
    }

    double getPrice() {
        return quantity * flower.getPrice();
    }
}
