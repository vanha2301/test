import java.util.*;
public class cs52400185 {
    public static void main(String[] args){
        Scanner scVar = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = scVar.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Input number[" + i + "]: ");
            arr[i] = scVar.nextInt();
        }
        float sum = 0;
        for(int item : arr) {
            sum = sum + item;
        }

        System.out.println("Average: " + sum / arr.length);
        Arrays.sort(arr);
        
        if (arr.length % 2 == 0) {
            System.out.println("Median: " + arr[arr.length / 2]);
        }
        else {
            System.out.println("Median: " + (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2.0);
        }
        scVar.close();
    }
}