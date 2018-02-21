import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /**
         * Bank account type checkings
         */
        CHECKINGS,
        /**
         * Bank account type savings
         */
        SAVINGS,
        /**
         * Bank account type student
         */
        STUDENT,
        /**
         * Bank account type workplace
         */
        WORKPLACE
    }

    /**
     * account number to identify the account
     */
    private int accountNumber;
    /**
     * type of account
     */
    private BankAccountType accountType;
    /**
     * balance available in the account
     */
    private double accountBalance;
    /**
     * the owner name of the account
     */
    private String ownerName;
    /**
     * the rate of interest
     */
    private double interestRate;
    /**
     * the total amount interest earned
     */
    private double interestEarned;

    /**
     *
     * @param name name of the bank account
     * @param accountCategory catagory of the account
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;
        accountType = accountCategory;
    }

    /**
     *
     * @return
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * set account number
     * @param accnum account number
     */
    public void setAccountNumber(final int accnum) {
        accountNumber = accnum;
    }

    /**
     *
     * @return type of the account
     */
    public BankAccountType getAccountType() {
        return accountType;
    }

    /**
     *
     * @param t type of account
     */
    public void setAccountType(final BankAccountType t) {
        accountType = t;
    }

    /**
     *
     * @return balance of the account
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     *
     * @param balance input amount of balance available
     */
    public void setAccountBalance(final int balance) {
        accountBalance = balance;
    }

    /**
     *
     * @return owner name of the account
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     *
     * @param name input owner name
     */
    public void setOwnerName(final String name) {
        ownerName = name;
    }

    /**
     *
     * @return interest rate of the account
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     *
     * @param rate input the interest rate
     */
    public void setInterestRate(final double rate) {
        interestRate = rate;
    }

    /**
     *
     * @return amount of interest earned
     */
    public double getInterestEarned() {
        return interestEarned;
    }

    /**
     *
     * @param earned input the amount of interest earned
     */
    public void setInterestEarned(final double earned) {
        interestEarned = earned;
    }

}