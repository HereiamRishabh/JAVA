
abstract class student{
    public int roll_no;
    public int reg_no;

    public abstract void course();

}

class Kiitian extends student{
    public void course(){

        System.out.println("The course currently being taught is CSE");
    }
}
public class q1 {
    public static void main(String[] args) {
        Kiitian kiitian = new Kiitian();
        kiitian.course();

    }
}
