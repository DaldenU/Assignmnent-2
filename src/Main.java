import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Object[] arr = {1, 3, 5, "u", 0.6};
        MyArrayList arrL = new MyArrayList(arr);
        arrL.add(90);
        arrL.add("pop", 100);
    }
}