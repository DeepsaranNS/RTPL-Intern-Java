package intern.learning;

import java.util.Scanner;

public class ComplexNumber {

        double real, img;
        ComplexNumber(double r, double i){
            this.real = r;
            this.img = i;
        }
        public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2)
        {
            ComplexNumber temp1 = new ComplexNumber(0, 0);
            temp1.real = c1.real + c2.real;
            temp1.img = c1.img + c2.img;
            return temp1;
        }
        public static ComplexNumber diff(ComplexNumber c1, ComplexNumber c2)
        {
            ComplexNumber temp2 = new ComplexNumber(0, 0);
            temp2.real = c1.real - c2.real;
            temp2.img = c1.img - c2.img;
            return temp2;
        }
        public static ComplexNumber product(ComplexNumber c1, ComplexNumber c2)
        {
            ComplexNumber temp3 = new ComplexNumber(0, 0);
            temp3.real = c1.real * c2.real;
            temp3.img = c1.img * c2.img;
            return temp3;
        }


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ComplexNumber c1 = new ComplexNumber(5.5, 4);
            ComplexNumber c2 = new ComplexNumber(1.2, 3.5);
            ComplexNumber temp1 = sum(c1, c2);
            System.out.println("Sum is: "+ temp1.real+" + "+ temp1.img +"i");
            ComplexNumber temp2 = diff(c1,c2);
            System.out.println("diff is: "+ temp2.real+" + "+ temp2.img +"i");
            ComplexNumber temp3 = product(c1,c2);
            System.out.println("product is: "+ temp3.real+" + "+ temp3.img +"i");

        }
    }