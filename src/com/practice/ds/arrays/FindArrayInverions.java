package com.practice.ds.arrays;


/**
 * It will find the inversions in array
 *
 * if a[i] > a[j] and i < j then it is inversion
 * Input: [9,6,8, 5]
 *  a[0]{9} > a[1]{6} and 0 < 1 its inversion
 *  a[0]{9} > a[2]{8} and 1 < 2 its inversion
 *  a[0]{9} > a[3]{5} and 1 < 3 its inversion
 *  a[1]{6} < a[2]{8} and 1 < 2 its not inversion
 *  a[1]{6} > a[3]{5} and 1 < 3 its inversion
 *  a[2]{8} > a[3]{5} and 2 < 3 its inversion
 * Output: total inversions: 5
 */
public class FindArrayInverions {

    public static void main(String[] args) {
        int array[]={9,6,8,5};
        System.out.println("Array inversion count: "+getArrayInversionCount(array));
    }

    private static int getArrayInversionCount(int[] array) {
        int inversionCount = 0;
        for(int i=0; i<array.length; i++) {
            for(int j=i+1; j<array.length; j++) {
                if(array[i] > array[j] && i < j) {
                    inversionCount++;
                }
            }
        }

        return inversionCount;
    }
}
