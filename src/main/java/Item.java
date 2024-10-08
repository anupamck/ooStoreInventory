public abstract class Item {
    private int capacity;
    private int quantityAvailable;
    private int restockLimit;
    protected String itemName;

    void setItemCapacity(int itemCapacity) {
        capacity = itemCapacity;
        quantityAvailable = capacity;
    }

    void setRestockLimit(int limit) {
        restockLimit = limit;
    }

    int getStock() {
        return quantityAvailable;
    }

    void setItemName(String name) {
        itemName = name;
    }

    abstract String getItemName();

    void sell(int saleQuantity) {
        quantityAvailable = quantityAvailable - saleQuantity;
    }

    void restock() {
        quantityAvailable = capacity;
    }

    void autoRestockSelf() {
        if(quantityAvailable < restockLimit) {
            restock();
            System.out.println("Item " + itemName + " has now been restocked");
        }
    }
}
