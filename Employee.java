package LAB_08.package1;

public class Employee{
    protected int empid;
    private String ename;
    public double earnings(double x, int empid, String ename){
        double earn;
        earn = x + x*0.8 + x*0.15;
        System.out.println("Employee Id : " +empid);
        System.out.println("Employee Nmae Is : " +ename);
        System.out.println("The Total Salary Is : " +earn);
        return earn;
    }
}