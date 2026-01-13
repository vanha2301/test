import java.util.*;

public class cs52400185ex3 {
    public static void main(String[] args) {
        Scanner scVar = new Scanner(System.in);

        System.out.print("Input n: ");
        int n = scVar.nextInt();

        int[] arr = new int[n];

        System.out.println("Input " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scVar.nextInt();
        }

        processArray(arr);

        System.out.println("Result:");
        for (int item : arr) {
            System.out.println(item);
        }

        scVar.close();
    }

    public static void processArray(int[] list) {
        for (int i = 0; i < list.length; i++) {
            list[i] = Math.abs(list[i]);
            if (list[i] % 2 == 0) {
                list[i] = list[i] * 2;
            }
        }
    }
}
