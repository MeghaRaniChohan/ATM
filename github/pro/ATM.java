import java.util.Scanner;
class ATM
{
public static void main (String args[])
{
	int balance=100000, withdraw, deposit;
	Scanner r = new Scanner (System.in);
	
	while (true)		// while loop for repetion //
  {
	System.out.println(" Automated Teller Machine ");
	System.out.println(" Choose 1 for Withdraw ");
	System.out.println(" Choose 2 for Deposit ");
	System.out.println(" Choose 3 for Balance ");
	System.out.println(" Choose 4 for Exit ");
	System.out.print(" Choose the operation you want to perform : ");

	int choice = r.nextInt();

	switch(choice)		// click on olny these cracters //
     {
		case 1:		// Click on 1 than enter this //
			System.out.print(" Enter money to be Withdraw : ");
			withdraw = r.nextInt();

			if (balance >= withdraw)
	  	{
			balance = balance - withdraw ;
			System.out.println(" your Money to be Withdraw ");
		//	System.out.println(" Balance : "+balance);	//
	  	}
			else
	  	{
			System.out.println(" Insufficient Balance ");
	  	}

	System.out.println(" ");
	break;		// break case //		
		
		case 2:		// Click on 2 than enter this //
			System.out.print(" Enter Money to be Deposited ");
			deposit = r.nextInt();

			balance = balance + deposit ;
			
			System.out.println(" Your Money has Sucsessfuly Deposit ");

	
	System.out.println(" ");
	break;		// break case //	

		case 3:		// Click on 3 than enter this //
			System.out.println(" Balance : "+balance);
		
	System.out.println(" ");
	break;		// break case //

		case 4:		// Click on 4 than enter this //
	System.exit(0);		// Exit to switch //

     }		// Click on other Carecter than loop is start again //

  }		// Exit to while loop //
}
}