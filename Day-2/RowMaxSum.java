package PST;

import java.util.Scanner;

public class RowMaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int maxSum = 0;
        int rowIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }

            if (sum > maxSum) {
                maxSum = sum;
                rowIndex = i;
            }
        }

        System.out.println("Row with maximum sum: " + rowIndex);
        System.out.println("Maximum sum: " + maxSum);

        sc.close();
    }
}