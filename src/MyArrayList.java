import java.util.Arrays;

// used "implements" to implement "MyList" interface
public class MyArrayList implements MyList {
    private Object[] arr; // private instance variable of type Object[] to hold the elements of the list
    private int size; // int variable to keep track of the number of elements in the list.

    // constructor to access private instances
    public MyArrayList (Object[] arr) {
        this.arr = arr;
        this.size = 0;
    }

    // method that returns the size of an array by using "length" property
    @Override
    public int size() {
        size = arr.length;
        return size;
    }

    // method to find if the inputted element exists in the array
    @Override
    public boolean contains(Object o) {
        for(int i = 0; i < size(); i++) {
            if(arr[i] == o) {
                return true;
            }
        }
        return false;
    }

    // when the new element is added, "newArr" which has a bigger size, will become the "arr"
    @Override
    public void add(Object item) {
        int a = size();
        Object[] newArr = new Object[size() + 1];
        for(int i = 0; i < size(); i++){
            newArr[i] = arr[i];
        }
        arr = newArr;
        arr[a] = item;
    }

    @Override
    public void add(Object item, int index) {

    }

    @Override
    public boolean remove(Object item) {
        return false;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public void sort() {

    }
}
