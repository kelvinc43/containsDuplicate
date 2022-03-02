import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Thing test = new Thing();

        int[][] numArr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Expected Result: false");
        System.out.println("Actual Result: " + test.containsDupes(numArr));
        int[][] numArr1 = {{1,2,3},{4,5,6},{1,8,9}};
        System.out.println("Expected Result: true");
        System.out.println("Actual Result: " + test.containsDupes(numArr1));
        int[][] numArr2 = {{1,1,1},{1,1,1},{1,1,1}};
        System.out.println("Expected Result: true");
        System.out.println("Actual Result: " + test.containsDupes(numArr2));
        int[][] numArr3 = {{1,2,3},{4,5,6},{7,8,3}};
        System.out.println("Expected Result: true");
        System.out.println("Actual Result: " + test.containsDupes(numArr3));

    }
}
