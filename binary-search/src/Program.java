import java.lang.reflect.Array;
import java.util.Arrays;

// Бинарный поиск - алгоритм поиска элемента в отсортированном массиве за время
// О(log n), работающий путем деления диапазона поиска пополам.
public class Program {
    public static void main(String[] args) {
        int [] someArr = {0, 13, 37, 38, 40, 52, 103, 214}; // Отсортированный
        // массив

        int someTarget = 214;

        int result = binarySearch(someArr, someTarget);


        if (result  != -1 ) {
            System.out.println("Элемент " + someTarget + " находится на индексе: "
                    + result);
        } else {
            System.out.println("Элемент не найден");
        }

        }




    static int binarySearch(int[] arr, int target){
        int leftIndex = 0;
        int rightIndex= arr.length - 1;
        while (leftIndex <= rightIndex) {
            int mid = leftIndex + (rightIndex - leftIndex) / 2;
            if (arr[mid] == target){
                return mid;
            }
            if (arr[mid] < target){
                leftIndex = mid + 1;
            }
            if (arr[mid] > target){
                rightIndex = mid - 1;

            }
        }
        return - 1;



    }


}