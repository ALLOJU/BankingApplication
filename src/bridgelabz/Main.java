package bridgelabz;

public class Main {
	/**
	 * Purpose: Main method to calculate monthly interest and annual interest
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * PROCEDURE
		 * 1.Instantiate 2 saving account objects saver1 and saver2
		 * 2.Set the annual interest rate to 4%=0.04
		 * 3.Calculate monthly interest for both saver1 and saver2
		 * 4.Print out the new balances for both savers
		 * 5.Set the annual interest rate to 5%=0.05
		 * 6.Calculate the next month interest rate and print out balances
		 */
		SavingsAccount saver1,saver2;
		saver1 = new SavingsAccount (2000.0);
        saver2= new SavingsAccount (3000.0);
        /**
         * 2.Set the annual interest rate to 4%=0.04
         */
        SavingsAccount.modifyInterestRate (0.04);
        /**
         * 3.Calculate monthly interest for both saver1 and saver2
         */
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        /**
        * 4.Print out the new balances for both savers
        */
        System.out.println("This month:\nSaver 1 balance= "+ saver1.getBalance());
        System.out.println("Saver 2 balance= "+ saver2.getBalance());
        /**
         * 5.Set the annual interest rate to 5%=0.05
         */
        SavingsAccount.modifyInterestRate (0.05);
        /**
         * 6.Calculate the next month interest rate and print out balances
         */
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Next month:\nSaver 1 balance= "+ saver1.getBalance());
        System.out.println("Saver 2 balance= "+ saver2.getBalance());
	}
}
