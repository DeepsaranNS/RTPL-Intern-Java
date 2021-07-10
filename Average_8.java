package intern.learning;

import java.util.Scanner;

public class Average_8 {
    public void calc_average(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Average:"+((a+b+c)/3));
    }

    public static void main(String[] args) {
        Average_8 avg = new Average_8();
        avg.calc_average();
    }
}
