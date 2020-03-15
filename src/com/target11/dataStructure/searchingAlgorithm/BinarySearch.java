package com.target11.dataStructure.searchingAlgorithm;

public class BinarySearch {

    public static int binarySearch(int[] a, int key) {
        int index = -1;

        int l = 0;
        int h = a.length - 1;
        int mid = 0;

        while (l <= h) {
            mid = (l + h) / 2;
            if (key > a[mid]) {
                l = mid + 1;

            } else if (key < a[mid]) {
                h = mid - 1;
            }
            else if (key == a[mid]) {

                index = mid;
                break;
            }
        }
        return index;
    }


    public static void main(String[] args) {

        int[] input = {4, 8, 10, 15, 18, 21, 29, 27, 29, 33, 34, 37, 39, 41, 42};

        int index = binarySearch(input, 18);
        System.out.println("Element present at index : " + index);
    }

}
