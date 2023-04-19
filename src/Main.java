public class Main {
    public static void main(String[] args) {
        Object[] arr = {1, 3, 5, "u", 0.6, "45", "pop", 5, 9, 5, 1};
        MyArrayList arrL = new MyArrayList(arr);
        System.out.println(arrL.get(9));
    }
}