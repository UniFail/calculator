import java.util.Arrays;
public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        //Task 1
    int[] arr = generateRandomArray();
        float sum = 0;
        int max = -1;
        int min = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            sum += arr[i];
                if (arr[i] > arr[i + 1])
                    max = arr[i];
                if (arr[i] < arr[i + 1])
                    min = arr[i];

        }
        System.out.println("Monthly expenses " + sum + " Rub");
        //Task 2
        System.out.println("Max monthly expenses " + max + " Rub");
        System.out.println("Min monthly expenses " + min + " Rub");
        //Task 3
        System.out.println("Avg Monthly expenses " + sum / arr.length + " Rub");

        //Task 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int i = reverseFullName.length - 1; i >= 0  ; i--) {
                System.out.print(reverseFullName[i]);

        }


    }



}