package intern.learning;

public class Student_2_and_3 {
    public String name;
    public int roll_no;
    public String address;
    Student_2_and_3(String stu_name, int stu_no, String addr){
        name = stu_name;
        roll_no = stu_no;
        address = addr;
    }
    public void print(){
        System.out.printf("Name: %s \nRoll NO: %d \nAddress: %s\n",name,roll_no,address);
        System.out.println("");

    }
}
