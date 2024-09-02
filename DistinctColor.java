import java.util.Scanner;

public class DistinctColor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No of test case");
        int t = sc.nextInt();
        while (t-- > 0) {
            System.err.println("Enter red");
            int red = sc.nextInt();
            System.err.println("Enter green");
            int green = sc.nextInt();
            System.err.println("Enter blue");
            int blue = sc.nextInt();
            int distinctColor = 0;

            if (red > 0) {
                distinctColor++;
            }
            if (blue > 0) {
                distinctColor++;
            }
            if (green > 0) {
                distinctColor++;
            }
            
            int minredgreen = Math.min(red, green);// yellow
            distinctColor += minredgreen;
            red-=minredgreen;
            green-=minredgreen;

            int minbluegreen = Math.min(blue, green);// cyan
            distinctColor += minbluegreen;
            blue-=minbluegreen;
            green-=minbluegreen;

            int minredblue = Math.min(red, green);// magenta
            distinctColor += minredblue;
            red-=minredblue;
            blue-=minredblue;

            
            System.out.println(distinctColor);
        }

    }
}
