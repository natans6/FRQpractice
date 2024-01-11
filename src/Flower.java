public class Flower implements Comparable {

    private String name;
    private int quantity;

    public Flower(String n, int q) {
        name = n;
        quantity = q;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int newValue) {
        quantity = newValue;
    }

    // ADDED TO ENABLE TESTING (NOT IN ORIGINAL FRQ)
    @Override
    public int compareTo(Object o) {
        Flower other = (Flower) o;
        if (this.quantity < other.quantity) {
            return -1;
        } else if (this.quantity > other.quantity) {
            return 1;
        } else {
            return 0;
        }
    }
}
