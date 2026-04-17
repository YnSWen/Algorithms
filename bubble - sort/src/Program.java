// Реализация пузырьковой сортировки


import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] arr = {76, 9, 1, 32, 8, 318, 71};

        System.out.println("Неотсортированный массив: " + Arrays.toString(arr));
        System.out.println("Отсортированный массив: " + Arrays.toString(BubbleSort(arr)));


    }

        public static int[] BubbleSort (int[] arr){
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                boolean sorted = false;

                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;

                        sorted = true;
                    }

                }
                if (!sorted) {
                    break;
                }

            }
            return arr;
        }


}
