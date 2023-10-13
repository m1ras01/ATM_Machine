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
        System.out.println("welcome");
    }
}


