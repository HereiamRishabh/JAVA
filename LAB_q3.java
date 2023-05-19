import java.util.Scanner;

class LessBalanceException extends Exception {

  LessBalanceException(String str) {
    String st = str;
    System.out.println(st);
  }
}

public class q3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int deposit_amount, withdrawl_amount;

    System.out.println("Enter the amount to be deposited\n");
    deposit_amount = sc.nextInt();

    System.out.println("Enter the withdrawl amount\n");

    try {
      withdrawl_amount = sc.nextInt();
      if (deposit_amount - withdrawl_amount < 500) {
        throw new LessBalanceException("Withdrawl amount is not valid\n");
      }
    } catch (LessBalanceException e) {
      System.out.println(e);
    }
  }
}