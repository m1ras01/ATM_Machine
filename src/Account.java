import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,###.00");

    private int customerNumber;
    private int pinNumber;
    private double savingBalance = 0.0;
    private double checkingBalance = 10000.0;

    public void setCustomerNumber(int customerNumber){
        this.customerNumber = customerNumber;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public int getPinNumber(){
        return pinNumber;
    }


    public double getCheckingBalance() {
        return checkingBalance;
    }
    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }
    public double getSavingBalance(){
        return savingBalance;
    }
    public void setSavingBalance(double savingBalance){
        this.savingBalance = savingBalance;
    }

    public double widthDrawSavingBalance(double amount){
        savingBalance-=amount;
        return savingBalance;
    }
    public double widthDrawCheckingBalance(double amount){
        checkingBalance-=amount;
        return checkingBalance;
    }
    public double depositToCheckingBalance(double amount){
        checkingBalance+=checkingBalance;
        return checkingBalance;
    }
    public double depositToSavingBalance(double amount){
        savingBalance+=amount;
        return savingBalance;
    }

    public void getCheckingWidthDraw(){
        System.out.println("Checking Account Balance: "+ moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to withdraw from Checking Account:");
        double amount = input.nextDouble();
        if (amount<=checkingBalance){
            widthDrawCheckingBalance(amount);
            System.out.println("You withdraw in checking card:"+moneyFormat.format(amount)+"  Current checking balance:"+moneyFormat.format(checkingBalance));
        }else{
            System.out.println("Your balance is not enough"+"\n");
        }
    }

}
