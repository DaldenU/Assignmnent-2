import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Object[] arr = {1, 3, 5, "u", 0.6, "45", "pop"};
        MyArrayList arrL = new MyArrayList(arr);
        System.out.println(arrL.get(5));
        System.out.println(Arrays.toString(arrL.getArr()));
    }
}