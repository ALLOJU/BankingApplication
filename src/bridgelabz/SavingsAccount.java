package bridgelabz;


public class SavingsAccount {
	/**
	 * calculateMonthlyInterest - this calculate monthly interest
	 * modifyInterestRate -  it modifies the interest with new interest
	 * getBalance - it returns the savings balance amount
	 * getInterestRate - it returns the interest rate
	 */
	/**
	 * Savings account class to calculate annual and monthly interest rate
	 */
	/**
	 * declaring instance variables
	 */
	private static double annualInterestRate; // static variable; 
	private double savingsBalance;
	
	/**
	 * creating constructor with parameters as saving balance
	 * @param initBalance - input taken as initial balance
	 */
	public SavingsAccount(double initialBalance)
	{
		savingsBalance = initialBalance;
	}
	/**
	 * it returns savings balance using getters
	 * @return
	 */
	public double getBalance() 

	{ return savingsBalance;
	}
    /**
     * it returns the annual interest rate by using getters
     * @return
     */
	public static double getInterestRate()
	{
		return annualInterestRate;
	}
	/**
	 * calculate monthly interest rate
	 */
	public void calculateMonthlyInterest()
	{
		double monthlyInterest; 
		monthlyInterest= (double)(this.savingsBalance *annualInterestRate/12);
		//System.out.println("The monthly interest is : " +monthlyInterest);
		this.savingsBalance+=monthlyInterest;
	}
	/**
	 * modify interest with new interest rate
	 * @param newRate - input of new interest rate 
	 */
	public static void modifyInterestRate(double newInterestRate) // static method
	{
		annualInterestRate = newInterestRate;
	}



}
