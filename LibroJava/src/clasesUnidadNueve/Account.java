package clasesUnidadNueve;

import java.util.Date;

public class Account {
	private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;

    }

    public Account(int id, double balance) {

        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
        annualInterestRate = 0;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        Date startDate = dateCreated;
        return startDate;
    }

    public double getMonthlyInterestRate() {
        double InterestRatePerMonth = (annualInterestRate / 12);
        return InterestRatePerMonth;
    }

    public double getMonthlyInterest() {
        double monthlyInterest = balance * (this.getMonthlyInterestRate() / 100);
        return monthlyInterest;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amountDeposit) {
        balance += amountDeposit;
    }
}
