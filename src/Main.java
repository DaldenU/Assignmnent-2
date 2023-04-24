import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Object[] arr = new Object[0];
        Object[] list = {"s", 15.02, "pop", 55, -9, "turan"};
        MyArrayList arrL = new MyArrayList(arr);
        System.out.println(arrL.size());
        arrL.addAll(list, list.length);
        System.out.println(arrL.size());
        System.out.println(Arrays.toString(arrL.getArr()));
    }
}