package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {3,5,16,19,26,30};
        int[] arr2 = {15,3,67,3,14,42,30};
        int pattern = 26;
        int i = binarySort(arr, pattern);
        if(i==-1)
            System.out.println("Элемент не найден");
        else
            System.out.println("Цифра " + pattern + " на " + ++i + " месте.");
        bubbleSort(arr2);
        for(int j : arr2)
            System.out.print(j + " ");
        System.out.println();
        System.out.println(arr2.length);
    }

    public static void bubbleSort(int[] arr) {
        for(int i=arr.length-1; i>0; i--)
            for(int j=0; j<i; j++)
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
    }

    public static int binarySort(int[] arr, int patt) {
        int left = 0, right = arr.length, middle, index = -1;

        while(left < right) {
            middle = (left + right)/2;
            if(patt == arr[middle]) {
                index = middle;
                break;
            } else
                if(patt < arr[middle])
                    right = middle;
                else
                    left = middle + 1;
        }

        return index;
    }
}
