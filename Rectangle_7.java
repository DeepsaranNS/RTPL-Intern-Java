package intern.learning;

import java.util.Scanner;

public class Rectangle_7 {

    int length,breadth;
    Rectangle_7(int a, int b){
        length = a;
        breadth = b;
    }
    public void rec_param_area(){
        System.out.printf("The Area of (%d,%d) is: %d\n",length,breadth,(length*breadth));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the length:");
        int a1 = sc.nextInt();
        System.out.println("Give the Breadth:");
        int b1 = sc.nextInt();
        Rectangle_7 rec = new Rectangle_7(a1,b1);

        rec.rec_param_area();

    }
}
