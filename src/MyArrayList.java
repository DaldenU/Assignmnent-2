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
        increaseArrSize();
        arr[a] = item;
    }

    // method that increases the size of an array by one
    public void increaseArrSize() {
        Object[] newArr = new Object[size() + 1];
        for(int i = 0; i < size(); i++){
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    // method that decreases the size of an array by one
    public void decreaseArrSize() {
        Object[] newArr = new Object[size() - 1];
        for(int i = 0; i < size() - 1; i++){
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    // method to add an element to the specified index
    @Override
    public void add(Object item, int index) {
        int holder = size(); // holder stores the size of an array before increase
        if(index < size()) {
            // size is increased only once, since the index is smaller than the previous size
            increaseArrSize();
            for(int i = size() - 1; i > index; i--) {
                arr[i] = arr[i - 1];
            }
        } else {
            // it increases the size of an array, so that it fits with the inputted index
            for(int i = 0; i < (index - holder + 1); i++) {
                increaseArrSize();
            }
        }
        arr[index] = item;
    }

    // method to remove the element by inputting its name
    @Override
    public boolean remove(Object item) {
        for(int i = 0; i < size(); i++) {
            if(arr[i] == item) {
                remove(i); // after finding the index of the item it uses remove by index
                break;
            }
        }
        return true;
    }

    // removes the item by its index in array
    @Override
    public Object remove(int index) {
        for(int i = index; i < size() - 1; i++) {
            arr[i] = arr[i + 1];
        }
        decreaseArrSize();
        return 0;
    }

    // method to clear the array
    @Override
    public void clear() {
        for(int i = 0; i < size(); i++) {
            arr[i] = null;
        }
    }

    @Override
    public Object get(int index) {
        return arr[index];
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

    // to get an array after its increase in size
    public Object[] getArr() {
        return arr;
    }
}
