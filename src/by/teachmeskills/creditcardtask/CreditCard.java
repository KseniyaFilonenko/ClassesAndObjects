package by.teachmeskills.creditcardtask;

public class CreditCard {
    private String accountNumber;
    private double currentSum;
    public CreditCard(String accountNumber){
        this.accountNumber = accountNumber;
        this.currentSum = 0;
    }
    public void addSum(double sumToAdd){
        this.currentSum = this.currentSum + sumToAdd;
    }
    public void withdrawSum(double sumToWithdraw){
        this.currentSum = this.currentSum - sumToWithdraw;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public double getCurrentSum(){
        return currentSum;
    }
    public void setCurrentSum(double currentSum){
        this.currentSum = currentSum;
    }
    public String getInfo(){
        return "Account number " + this.accountNumber;
    }
    public String getSum(){
        return "Account number " + this.currentSum;
    }
}
