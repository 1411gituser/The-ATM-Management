import java.util.Scanner;

public class ATMMachine
{
    public static void main(String[] args)
    {
        // declare and initialize balance, withdraw and deposit

        int balance=100000, withdraw, deposit;

        //create scanner class object to get choice of user

        Scanner sc=new Scanner(System.in);

        while(True)

        {

            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 from withdraw");
            System.out.println("Choose 2 from deposit");
            System.out.println("choose 3 from check balance");
            System.out.println("choose 4 from for EXIT");
            System.out.println("choose the operation you want to perform");
        }
        // get choice from user

        int choice=sc.nextline();
        switch(choice)
        {
            case 1:
            System.out.println("enter money to be withdraw");

            //get the withdraw money from the user

            withdraw=sc.nextline();

            if(balance >= withdraw)
            {
                //remove the withdraw amount from the total balance

                balance=balance-withdraw;

                System.out.println("please collect your money");
            }
            else
            {
                //show custom error messages

                System.out.println("insufficient balance");
            }
            System.out.println(" ");
            break;


            case 2:

            System.out.println("enter money to be deposited");

            //get the deposit amount to the total balance
            deposit= sc.nextint();
            
            balance=balance+deposit;

            System.out.println("your money hasa been successfully deposited");

            System.out.println("");

            break;

            case 3:

            //displaying the total balance of the user

            System.out.println("balance : "+balance);

            System.out.println("");

            break;

            case 4:

            System.exit(0);

        }
    }
}