public class Main {
    public static void main(String[] args) {

        /* TESTING PART A */
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~          TESTING PART A          ~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Flower flower1a = new Flower("daffodil", 225);
        Flower flower1b = new Flower("rose", 550);
        Flower flower1c = new Flower("tulip", 419);
        Flower[] flowerInventory = {flower1a, flower1b, flower1c};
        FlowerShop sunnyFlowers = new FlowerShop(flowerInventory);
        Flower flower1e = new Flower("daffodil", 200);
        Flower flower1f = new Flower("rose", 50);
        Flower flower1g = new Flower("tulip", 150);
        Flower[] newFlowers = {flower1e, flower1f, flower1g};
        sunnyFlowers.updateInventory(newFlowers);
        Flower[] updatedInv = sunnyFlowers.getFlowerInventory();
        System.out.println("flowerInventory after calling updateInventory:");
        System.out.print("|  ");
        for (Flower f : updatedInv) {
            System.out.print(f.getName() + " " + f.getQuantity() + "  |  ");
        }
        System.out.println();
        if (updatedInv[0].getName().equals("daffodil") && updatedInv[0].getQuantity() == 425 &&
                updatedInv[1].getName().equals("rose") && updatedInv[1].getQuantity() == 600 &&
                updatedInv[2].getName().equals("tulip") && updatedInv[2].getQuantity() == 569) {
            System.out.println("---> Correct: TEST PASS");
        } else {
            System.out.println("---> Incorrect: TEST FAIL!!!!!!!!");
            System.out.println("should be:");
            System.out.println("|  daffodil 425  |  rose 600  |  tulip 569  |");
        }
        System.out.println();
        System.out.println("newFlowers after calling updateInventory (should be UNCHANGED):");
        System.out.print("|  ");
        for (Flower f : newFlowers) {
            System.out.print(f.getName() + " " + f.getQuantity() + "  |  ");
        }
        System.out.println();
        if (newFlowers[0].getName().equals("daffodil") && newFlowers[0].getQuantity() == 200 &&
                newFlowers[1].getName().equals("rose") && newFlowers[1].getQuantity() == 50 &&
                newFlowers[2].getName().equals("tulip") && newFlowers[2].getQuantity() == 150) {
            System.out.println("---> Correct: TEST PASS");
        } else {
            System.out.println("---> Incorrect: TEST FAIL!!!!!!!!");
            System.out.println("should be:");
            System.out.println("|  daffodil 200  |  rose 50  |  tulip 150  |");
        }

        /* TESTING PART B */
        System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~          TESTING PART B          ~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Flower flower2a = new Flower("rose", 615);
        Flower flower2b = new Flower("daffodil", 320);
        Flower flower2c = new Flower("daisy", 375);
        Flower flower2d = new Flower("carnation", 50);
        Flower flower2e = new Flower("tulip", 419);
        Flower[] flowerInventory2 = {flower2a, flower2b, flower2c, flower2d, flower2e};
        sunnyFlowers = new FlowerShop(flowerInventory2);
        Flower flower3a = new Flower("carnation", 250);
        Flower flower3b = new Flower("rose", 525);
        Flower flower3c = new Flower("daffodil", 220);
        Flower flower3d = new Flower("tulip", 310);
        Flower flower3e = new Flower("daisy", 500);
        Flower[] stockB = {flower3a, flower3b, flower3c, flower3d, flower3e};
        boolean top1 = sunnyFlowers.topNSame(1, stockB);
        System.out.print(top1 + "  ");
        boolean top2 = sunnyFlowers.topNSame(2, stockB);
        System.out.print(top2 + "  ");
        boolean top3 = sunnyFlowers.topNSame(3, stockB);
        System.out.print(top3 + "  ");
        Flower flower5a = new Flower("daisy", 615);
        Flower flower5b = new Flower("tulip", 320);
        Flower flower5c = new Flower("rose", 375);
        Flower flower5d = new Flower("carnation", 50);
        Flower flower5e = new Flower("daffodil", 419);
        Flower[] stockD = {flower5a, flower5b, flower5c, flower5d, flower5e};
        boolean top4 = sunnyFlowers.topNSame(3, stockD);
        System.out.print(top4 + "  ");
        Flower flower4a = new Flower("carnation", 300);
        Flower flower4b = new Flower("tulip", 500);
        Flower flower4c = new Flower("rose", 600);
        Flower flower4d = new Flower("daffodil", 100);
        Flower flower4e = new Flower("daisy", 400);
        Flower[] stockC = {flower4a, flower4b, flower4c, flower4d, flower4e};
        boolean top5 = sunnyFlowers.topNSame(3, stockC);
        System.out.print(top5 + "  ");
        boolean top6 = sunnyFlowers.topNSame(4, stockC);
        System.out.println(top6 + "  ");
        if (top1 && !top2 && !top3 && !top4 && top5 && !top6) {
            System.out.println("---> Correct: TEST PASS");
        } else {
            System.out.println("---> Incorrect: TEST FAIL!!!!!!!!");
            System.out.println("should be:\ntrue  false  false  false  true  false");
        }
        System.out.println();
        updatedInv = sunnyFlowers.getFlowerInventory();
        System.out.println("flowerInventory after calling topNSame (should be UNCHANGED):");
        System.out.print("|  ");
        for (Flower f : updatedInv) {
            System.out.print(f.getName() + " " + f.getQuantity() + "  |  ");
        }
        System.out.println();
        if (updatedInv[0].getName().equals("rose") && updatedInv[0].getQuantity() == 615 &&
                updatedInv[1].getName().equals("daffodil") && updatedInv[1].getQuantity() == 320 &&
                updatedInv[2].getName().equals("daisy") && updatedInv[2].getQuantity() == 375 &&
                updatedInv[3].getName().equals("carnation") && updatedInv[3].getQuantity() == 50 &&
                updatedInv[4].getName().equals("tulip") && updatedInv[4].getQuantity() == 419) {
            System.out.println("---> Correct: TEST PASS");
        } else {
            System.out.println("---> Incorrect: TEST FAIL!!!!!!!!");
            System.out.println("should be:");
            System.out.println("|  rose 615  |  daffodil 320  |  daisy 375  |  carnation 50  |  tulip 419  |");
        }
        System.out.println();
        System.out.println("stockB after calling topNSame (should be UNCHANGED):");
        System.out.print("|  ");
        for (Flower f : stockB) {
            System.out.print(f.getName() + " " + f.getQuantity() + "  |  ");
        }
        System.out.println();
        if (stockB[0].getName().equals("carnation") && stockB[0].getQuantity() == 250 &&
                stockB[1].getName().equals("rose") && stockB[1].getQuantity() == 525 &&
                stockB[2].getName().equals("daffodil") && stockB[2].getQuantity() == 220 &&
                stockB[3].getName().equals("tulip") && stockB[3].getQuantity() == 310 &&
                stockB[4].getName().equals("daisy") && stockB[4].getQuantity() == 500) {
            System.out.println("---> Correct: TEST PASS");
        } else {
            System.out.println("---> Incorrect: TEST FAIL!!!!!!!!");
            System.out.println("should be:");
            System.out.println("|  carnation 250  |  rose 525  |  daffodil 220  |  tulip 310  |  daisy  |");
        }
    }
}