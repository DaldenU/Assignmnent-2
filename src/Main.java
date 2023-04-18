public class Main {
    public static void main(String[] args) {
        Object[] arr = {1, 3, "p", 96};
        MyArrayList arrL = new MyArrayList(arr);
        System.out.println(arrL.contains("p"));
    }
}