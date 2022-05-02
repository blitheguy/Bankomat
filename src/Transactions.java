import java.util.Random;
import java.util.Scanner;

public class Transactions {
    int balance;
    static int[][] bLog = new int[16][16];
    public static void balanceLog(){
        for (int i = 1; i < 16; i++) {
            System.out.println(bLog[bankAccount.holderNumber][i]);
        }
    }
    public static int getBalance(){
    int i = bLog[bankAccount.holderNumber][0];
    return i;
}
    public static void depositIn(){
        bLog[bankAccount.holderNumber][0] = bLog[bankAccount.holderNumber][0]+scan();
                bLog[bankAccount.holderNumber][1] = bLog[bankAccount.holderNumber][0];
    }
    public static void depositOut(){
        bLog[bankAccount.holderNumber][0] = bLog[bankAccount.holderNumber][0]-scan();
    }
    public static void transfer(){
            boolean card = false;
            long cardNumber;
            int i=0;
            cardNumber = scanAccount();
            for (int b = 0; b < 2; b++) {
                if (bankAccount.accountNumber[0][b] == cardNumber) {
                    card = true;
                    i=b;
                  break;
                } else {
                    card = false;
                }
            }
            if (card) {
                System.out.println("Введите сумму: ");
                int money = scan();
                bLog[i][0] = bLog[i][0]+money;
                bLog[bankAccount.holderNumber][0] = bLog[bankAccount.holderNumber][0]-money;
                bLog[bankAccount.holderNumber+1][1] = bLog[bankAccount.holderNumber+1][0];
            }else {
                System.out.println("Извините, нет такого счета");
            }

    }
    public static int random() {
        Random newRandom = new Random();
        int randoNumber = newRandom.nextInt(1000) + 1;
        return randoNumber;
    }
    public static int scan(){
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
    public static long scanAccount(){
        Scanner scan = new Scanner(System.in);
        return scan.nextLong();
    }
}
