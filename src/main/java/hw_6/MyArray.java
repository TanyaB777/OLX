package hw_6;

public class MyArray {
    private String[] array;
    private int size;

    public MyArray() {
        this(5);
    }

    public MyArray(int capacity) {
        array = new String[capacity];
        size = 0;
    }

    public int length() {
        return size;
    }

    public void put(String str) {
        if (size == array.length) {
            resize();
        }
        array[size++] = str;
    }

    public String get() {
        if (size == 0) {
            return "No more elements";
        }
        String result = array[0];
        for (int i = 1; i < size; i++) {
            array[i - 1] = array[i];
        }
        array[--size] = null;
        return result;
    }

    private void resize() {
        String[] newArray = new String[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }
}
