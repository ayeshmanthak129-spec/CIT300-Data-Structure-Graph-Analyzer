
package analyzer;

import java.util.Arrays;

public class ArrayOperations {

    private int[] data = new int[100];
    private int size = 0;

    public boolean insert(int value) {
        if (size >= data.length) {
            System.out.println("Array is full.");
            return false;
        }

        data[size] = value;
        size++;
        System.out.println("Inserted successfully: " + value);
        return true;
    }

    public boolean delete(int value) {
        int index = search(value);

        if (index == -1) {
            System.out.println("Value not found.");
            return false;
        }

        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }

        size--;
        System.out.println("Deleted successfully: " + value);
        return true;
    }

    public int search(int value) {
        for (int i = 0; i < size; i++) {
            if (data[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public void display() {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }

        System.out.println("Array elements: "
                + Arrays.toString(Arrays.copyOf(data, size)));
    }

    public int[] getElements() {
        return Arrays.copyOf(data, size);
    }

    public int getSize() {
        return size;
    }
}
