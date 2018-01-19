package com.codecool.dynamicArrayDojo;

public class DynamicIntArray {

    private int size = 0;
    private int[] array;

    DynamicIntArray() {}

    DynamicIntArray(int size) {
        this.size = size;
        array = new int[size];
    }

    public void add(int newItem) {

        int[] newArray = new int[size + 1];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        newArray[size] = newItem;
        size += 1;
        array = newArray;
    }

    public void remove(int index) {

        int[] newArray = new int[size - 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        for (int i = index + 1; i < size; i++) {
            newArray[i - 1] = array[i];
        }
        size -= 1;
        array = newArray;
    }

    public void insert(int index, int newItem) {

        if (index > size) {
            add(newItem);
        } else {
            int[] newArray = new int[size + 1];
            for (int i = 0; i < index; i++) {
                newArray[i] = array[i];
            }
            newArray[index] = newItem;
            for (int i = index; i < size; i++) {
                newArray[i + 1] = array[i];
            }
            size += 1;
            array = newArray;
        }
    }

    @Override
    public String toString() {

        String result = "";
        for (int i = 0; i < size; i++) {
            result += " " + array[i];
        }
        return result;
    }
}
