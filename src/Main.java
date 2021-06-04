
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Binary Search Tree demo");
        Random random = new Random();
        final int MAX = 100;
        final int MIN = 0;
        final int COUNT = 30;
        BinarySearchTree bst = new BinarySearchTree();
        for (int i=0; i<COUNT; i++) {
            int number = random.nextInt(MAX - MIN) + MIN;
            bst.add(number);
        }
        bst.display();
    }
}
