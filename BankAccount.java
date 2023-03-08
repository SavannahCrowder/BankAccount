public class BankAccount {

    private String number;

    private double balance;

    public BankAccount(){
        balance =  0;
    }
    public void deposit (double depositAmount) {
        System.out.println(depositAmount);
        balance = balance + depositAmount;

    }

    public void withdraw (double withdrawAmount) {
        System.out.println(withdrawAmount);
        if (withdrawAmount > balance){
            System.out.println("You can't withdraw more than you have");
        }
        else{
            balance = balance - withdrawAmount;
        }


    }

    public double getBalance(){
        System.out.println("Your balance is :" + balance);
        return balance;
    }
}