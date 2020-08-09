package com.weave.structures.algorithm;

/**
 * BubbleSort
 * =============================================================
 * Topic : 버블정렬
 * @author BAEKJH
 * @since 2020-08-09
 * =============================================================
 */
public class BubbleSort {

    // 버블정렬은 서로 인접한 두 원소를 검사하여 정렬하는 알고리즘이다.
    // 따라서 두 원소를 검사하는 메서드, 그리고 정렬하는 메서드로 이루어진다.

    /**
     * 상수 시간(constant time)
     * 정렬(데이터 교환)
     * @param array
     * @param i
     * @param k
     */
    public static void swapElements(int[] array, int i, int k) {
        int temp = array[i];
        array[i] = array[k];
        array[k] = temp;
    }

    /**
     * 버블정렬 : 이차(quadratic)
     * 일반적으로 자료의 교환 작업(SWAP)이 자료의 이동 작업(MOVE)보다 더 복잡하기 때문에 버블 정렬은 단순성에도 불구하고 거의 쓰이지 않는다.
     * 비교 횟수 : n(n-1)/2
     * 교환 횟수 : 3n(n-1)/2
     * @param array
     */
    public static void bubbleSort(int[] array) {
        for(int i=0; i<array.length-1; i++) {
            for(int k=i+1; k<array.length; k++) {
                if(array[i] < array[k]) {
                    swapElements(array, i, k);
                }
            }
        }
    }

    // 19 9
    public static void main(String[] args) {
        int[] array = {1, 9, 2, 5, 11, 10};
        BubbleSort.bubbleSort(array);
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i]);
        }
    }

}
