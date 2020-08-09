package com.weave.structures.algorithm;

/**
 * SelectionSort
 * =============================================================
 * Topic : 선택정렬
 * @author BAEKJH
 * @since 2020-08-09
 * =============================================================
 */
public class SelectionSort {

    // 선택정렬은 주어진 값 중 최솟값을 찾고 맨 앞의 위치에 있는 데이터와 교환(정렬)하는 알고리즘이다.
    // 따라서 최솟값을 찾는 메서드와 데이터 교환하는 메서드, 그리고 그 두 메서드를 호출하는 메서드로 이루어지게 된다.

    /**
     * 상수 시간(constant time) 연산
     * i와 k의 위치에 있는 값을 바꾼다.
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
     * 선형(linear)
     * start  로 부터 시작하는 최솟값의 위치를 찾고(start 포함)
     * 배열의 마지막 위치로간다.
     * 비교 횟수 : n-start
     * @param array
     * @param start
     * @return
     */
    public static int indexLowest(int[] array, int start) {
        int lowIndex = start;
        for(int i=start; i<array.length; i++) {
            if(array[i] < array[lowIndex]) {
                lowIndex = i;
            }
        }
        return lowIndex;
    }

    /**
     * 이차(quadratic)
     * 선택 정렬을 사용하여 요소를 정렬한다.
     * 총 비교 횟수 : n+n-1+n-2+...+1+0 > n(n+1)/2 이고 n 제곱에 비례한다.
     * @param array
     */
    public static void selectionSort(int[] array) {
        for(int i=0; i<array.length; i++) {
            int k = indexLowest(array, i);
            swapElements(array, i, k);
        }
    }

}
