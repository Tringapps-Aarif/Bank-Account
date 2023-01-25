
/*"1. Design a class for a simple bank account. The class should have the following features:
- Instance variables for the account holder's name, account number, and balance.
- A constructor that allows the user to create an account with a given name, account number, and balance.
- A method that allows the user to make a deposit to the account.
- A method that allows the user to make a withdrawal from the account.
- A method that returns the current balance of the account.
*/
import java.util.*;

class details {
    int accno, bal;
    int currentBalance = 0, depAmt, wAmt;
    String name;
    Scanner sc = new Scanner(System.in);

    details(int acc, String nam) {
        accno = acc;
        name = nam;
    }

    void getData() {
        System.out.println("NAME:" + name);
        System.out.println("ACCOUNT NUMBER:" + accno);
        System.out.println("CURRENT BALANCE:" + currentBalance);
    }

    void deposit() {

        System.out.println("Enter the Amount");
        depAmt = sc.nextInt();
        currentBalance = currentBalance + depAmt;
        getData();

    }

    void widthDrawal() {
        System.out.println("Enter the you need to widthdraw");
        wAmt = sc.nextInt();
        currentBalance = currentBalance - wAmt;
        getData();
    }
}

class Bank {
    public static void main(String[] args) {
        {
            int accno, ch = 0;
            String name;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the name");
            name = sc.nextLine();
            System.out.println("Enter the Account number:");
            accno = sc.nextInt();
            details D = new details(accno, name);
            while (ch != 3) {

                System.out.println("Enter your choice \n1.DEPOSIT \n2.WIDTHDRAW");
                ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        D.deposit();
                        break;
                    case 2:
                        D.widthDrawal();
                        break;
                    case 3:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("invalid choice");
                        break;
                }
            }
        }
    }
}