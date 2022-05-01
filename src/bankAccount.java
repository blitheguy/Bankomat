import javax.lang.model.util.ElementScanner6;
import java.util.Scanner;

public class bankAccount {

    static long[][] accountNumber = {{1111222233334444L, 2222333344445555L}, {1111, 2222}};

    public static void accountNumber() {
        Scanner scanner = new Scanner(System.in);
        long cardNumber = scanner.nextLong();
        int countPin = 2;
        boolean card = false;
        int i = 0;
        for (int b = 0; b < 2; b++) {
            if (accountNumber[0][b] == cardNumber) {
                card = true;
                i = b;
                break;
            } else {
                card = false;
            }

        }
    if (card) {
    }else {
        System.out.println("Извините, нет такого счета");
        System.exit(0);
    }
        if (card) {
            System.out.println("Введите пин код (4 цифры)");
            for (int j = 0; j < 3; j++) {
                Scanner scan = new Scanner(System.in);
                long pinCode = scan.nextLong();
                if (pinCode == accountNumber[1][i]) {
                    System.out.println("Пин код введен верно");
                    break;
                } else {
                    System.out.println("Пин код введен не верно. Осталось " + (countPin--) + " попытка(ки)");
                }
            }
        }
        if (countPin==-1){
            System.out.println("\nПин код введен неправильно 3 раза!\n\t\tCеанс завершен");
            System.exit(0);
       }

    }
    public static boolean card(){
        return false;
    }
}