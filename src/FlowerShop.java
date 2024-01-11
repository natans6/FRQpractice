import java.util.Arrays;
import java.util.Collections;

public class FlowerShop {

    private Flower[] flowerInventory;

    // ADDED TO ENABLE TESTING
    public FlowerShop(Flower[] flowerInventory) {
        this.flowerInventory = flowerInventory;
    }

    // ADDED TO ENABLE TESTING
    public Flower[] getFlowerInventory() {
        return flowerInventory;
    }

    // IMPLEMENTATION ADDED TO ENABLE TESTING (NOT SHOWN IN FRQ)
    public Flower[] sortByQuantity(Flower[] arr) {
        Flower[] sortedCopy = new Flower[arr.length];
        for (int i = 0; i < sortedCopy.length; i++) {
            sortedCopy[i]= arr[i];
        }
        Arrays.sort(sortedCopy);
        Collections.reverse(Arrays.asList(sortedCopy));
        return sortedCopy;
    }

    // part a
    public void updateInventory(Flower[] newInventory) {
        for (int i = 0; i < newInventory.length; i++){
            int qualityTotal = newInventory[i].getQuantity() + flowerInventory[i].getQuantity();
            flowerInventory[i].setQuantity(qualityTotal);
        }
    }

    // part b
    public boolean topNSame(int n, Flower[] otherInventory) {
        int counter = 0;
        Flower[] flowerInv = sortByQuantity(flowerInventory);
        Flower[] tempInventory = sortByQuantity(otherInventory);
        for (int i = 0; i < n; i++){
            if (flowerInv[i].getName().equals(tempInventory[i].getName())){
                counter++;
            }
        }
        if (counter == n){
            return true;
        } else {
            return false;
        }
    }
}