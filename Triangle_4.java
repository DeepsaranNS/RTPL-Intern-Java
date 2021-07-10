package intern.learning;

public class Triangle_4 {
    int s1,s2,s3;
    Triangle_4(){
        s1 = 3;
        s2 = 4;
        s3 = 5;
    }
    public void triPerimeter(){
        System.out.println("Perimeter:"+(s1+s2+s3));
    }
    public void triArea(){
        int ans = (s1+s2+s3)/2;
        System.out.println("Area:"+Math.sqrt(ans*(ans-s1)*(ans-s2)*(ans-s3)));
    }

    public static void main(String[] args) {
        Triangle_4 tri = new Triangle_4();
        tri.triArea();
        tri.triPerimeter();
    }
}
