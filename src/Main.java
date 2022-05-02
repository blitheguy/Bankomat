import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    String type="go";
    ATM atm = new ATM();
    accountHolder holder = new accountHolder();
    atm.welocome();//приветствие
         while (type!="end") {
                    atm.inputAccountNumber();//приглашение для ввода номера счета
                    bankAccount.accountNumber();//проверка счета и пин кода
                    System.out.println("Здравствуйте " + holder.holder[bankAccount.holderNumber]);
                    atm.inputAction();
                    //System.out.println("Для завершения наберите: end");
        }
    }
}

