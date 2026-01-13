import java.util.*;
public class cs52400185ex2 {
    public static void main(String[] args) {
        Scanner scVar = new Scanner(System.in);
        System.out.println("Input String: ");
        String s = scVar.nextLine();
        s = s.toLowerCase();

        System.out.println("Input token taget");
        String target = scVar.nextLine();
        target = target.toLowerCase();

        StringTokenizer st = new StringTokenizer(s, " ");
        int cnt = 0;
        while(st.hasMoreTokens()) {
            if (target.equals(st.nextToken())) cnt++;
        }
        System.out.println("count: " + cnt);
    }
}