import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OptionMenu extends Account{
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("$###,###.00");
    HashMap<Integer,Integer> data = new HashMap<>();
    public void getLogin() throws Exception {
        int x =1;
        do {
            try {
                data.put(12345, 1234);
                System.out.println("Welcome to the ATM Project!");
                System.out.println("Enter your customer number:");
                setCustomerNumber(menuInput.nextInt());

                System.out.println("Enter your pin number:");
                setPinNumber(menuInput.nextInt());
            }catch (Exception e){
                System.out.println("You can write only number:"+e);
                x=2;
            }
            for (Map.Entry<Integer,Integer> entry : data.entrySet()){
                if (entry.getValue()==getPinNumber()&&entry.getKey()==getCustomerNumber()){
                    getAccountType();
                }
                else {
                    System.out.println("\nIncorrect customer number or pin number\n");

                }
            }
        }while (x==1);
    }
    public void getAccountType(){
        System.out.println("Select the Account you want access:");
        System.out.println("Type 1 - Checking Account");
        System.out.println("Type 2 - Saving Account");
        System.out.println("Type 3 - Exit");
        System.out.println("Choose:");
        int n = menuInput.nextInt();

        switch (n){
            case 1:
                getChecking();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("Thank you for using ATM");
            default:
                System.out.println("\nInvalid choice\n");
                getAccountType();
        }
    }
    public void getChecking(){
        System.out.println("Checking Account:");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Funds");
        System.out.println("Type 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");
        System.out.println("Choice:");
        int n = menuInput.nextInt();
        switch (n){
            case 1:
                System.out.println("Checking Account Balance:"+moneyFormat.format(getCheckingBalance()));
                getAccountType();
                break;
            case 2:
                getCheckingWidthDraw();
                getAccountType();
                break;
            case 3:
                getCheckingDeposit();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank you for using ATM");
            default:
                System.out.println("\nInvalid choice\n");
                getChecking();
        }
    }
    public void getSaving(){
        System.out.println("Saving Account:");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Funds");
        System.out.println("Type 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");
        System.out.println("Choice:");
        int n = menuInput.nextInt();
        switch (n){
            case 1:
                System.out.println("Saving Account Balance:"+moneyFormat.format(getSavingBalance()));
                getAccountType();
                break;
            case 2:
                getSavingWidthDraw();
                getAccountType();
                break;
            case 3:
                getSavingDeposit();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank you for using ATM");
            default:
                System.out.println("\nInvalid choice\n");
                getSaving();
        }
    }
}


