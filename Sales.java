package LAB_08.Package2;

import java.util.Scanner;
public class Sales extends package1.Employee{
    void tollallowance(double x){
        double trav_allow;
        trav_allow = x*0.05;
        System.out.println("The TollAllowance Is : "+trav_allow);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Name : ");
        String ename = sc.nextLine();
        System.out.println("Enter Employee ID : ");
        int empid = sc.nextInt();
        System.out.println("Enter The Basic Salary : ");
        double x = sc.nextDouble();
        Sales S = new Sales();
        double z = S.earnings(x, empid, ename);
        S.tollallowance(z);

    }
}