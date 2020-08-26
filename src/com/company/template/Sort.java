package com.company.template;

public class Sort {

    public static void main(String[] args) {
        int[] nums = {3, 2, 4, 2, 1, 4, 5, 7};
        QuickSort(nums, 0, nums.length - 1);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            System.out.print(",");
        }

        int[] mergeNums = {3, 2, 4, 2, 1, 4, 5, 7};
        mergeSort(mergeNums, 0, nums.length - 1);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            System.out.print(",");
        }
    }

    /**
     * 快排
     *
     * @param args
     * @param start
     * @param end
     */
    public static void QuickSort(int[] args, int start, int end) {
        if (start >= end) {
            return;
        }
        int pivot = partition(args, start, end);
        QuickSort(args, start, pivot - 1);
        QuickSort(args, pivot + 1, end);
    }

    private static int partition(int[] args, int begin, int end) {
        int pivot = end;
        int count = begin;
        for (int i = begin; i < end; i++) {
            if (args[i] < args[pivot]) {
                int temp = args[i];
                args[i] = args[count];
                args[count] = temp;
                count++;
            }
        }
        int temp = args[count];
        args[count] = args[end];
        args[end] = temp;
        return count;
    }

    public static void mergeSort(int[] args, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) >> 1;
        mergeSort(args, left, mid);
        mergeSort(args, mid + 1, right);
        merge(args, left, mid, right);
    }

    private static void merge(int[] args, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= right) {
            temp[k++] = args[i] < args[j] ? args[i++] : args[j++];
        }
        while (i <= mid) {
            temp[k++] = args[i++];
        }
        while (j <= right) {
            temp[k++] = args[j++];
        }
        for (int l = 0; l < temp.length; l++) {
            args[left + l] = temp[l];
        }
    }



}
