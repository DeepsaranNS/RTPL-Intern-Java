package intern.learning;

public class Rec_param_6 {
    int length,breadth;
    Rec_param_6(int a, int b){
        length = a;
        breadth = b;
    }
    public void rec_param_area(){
        System.out.printf("The Area of (%d,%d) is: %d\n",length,breadth,(length*breadth));
    }

    public static void main(String[] args) {
        Rec_param_6 rec1 = new Rec_param_6(4,5);
        Rec_param_6 rec2 = new Rec_param_6(5,8);
        rec1.rec_param_area();
        rec2.rec_param_area();
    }
}
