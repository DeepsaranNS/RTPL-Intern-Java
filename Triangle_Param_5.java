package intern.learning;

public class Triangle_Param_5 {
    int s1,s2,s3;
    Triangle_Param_5(int a1, int a2, int a3){
        s1 = a1;
        s2 = a2;
        s3 = a3;
    }
    public void triPerimeter(){
        System.out.println("Perimeter:"+(s1+s2+s3));
    }
    public void triArea(){
        int ans = (s1+s2+s3)/2;
        System.out.println("Area:"+Math.sqrt(ans*(ans-s1)*(ans-s2)*(ans-s3)));
    }

    public static void main(String[] args) {
        Triangle_Param_5 tri = new Triangle_Param_5(3, 4, 5);
        tri.triArea();
        tri.triPerimeter();
    }
}


