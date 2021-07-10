package intern.learning;

import java.util.Scanner;

public class MainArea_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length:");
        int len = sc.nextInt();
        System.out.println("Enter the Breadth");
        int bre = sc.nextInt();
        Area_1 rec_area = new Area_1(len, bre);
        rec_area.getArea();

    }
}
