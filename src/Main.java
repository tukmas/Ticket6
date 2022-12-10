import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] > 2 && arr[i] < 8) {
                arr[i]++;
                System.out.println(arr[i]);
            }else if
            (arr[i] > 2 && arr[i] < 8) {
                System.out.println(arr[i]);
            }

        }
return;
    }
}