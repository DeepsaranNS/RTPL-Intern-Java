package intern.learning;

public class Area_1 {
    int length,breadth;
    Area_1(int l, int b){
        length = l;
        breadth = b;
    }

    public int setDim(){
        return length*breadth;

    }
    public void  getArea(){
        System.out.println("The Area is:"+setDim());

    }

}
