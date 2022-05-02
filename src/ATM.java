import java.util.Scanner;

public class ATM {

//    public int scan(){
//        Scanner scan = new Scanner(System.in);
//        int action = scan.nextInt();
//        return action;
//    }
    public void welocome(){
        System.out.println("Добро пожаловать в Банкомат JavaBank");
    }
    public void inputAccountNumber(){
        System.out.println("Введите номер счета (16 цифр)");
    }
    public int inputAction(){
        int action = 6;
        System.out.println("Выберите действие\nЗапрос баланса - 1\nПополнение - 2\nСнятие - 3\nПеревод - 4\nПоследние пятнадцать операций - 5\nЗавершить - 0");
        while (action!=0){
            Scanner scan = new Scanner(System.in);
            action = scan.nextInt();
            if (action==1){System.out.println("Ваш баланс "+Transactions.getBalance());}
            if (action==2){System.out.println("Введите сумму пополнения: ");Transactions.depositIn();}
            if (action==3){System.out.println("Введите сумму снятия: ");Transactions.depositOut();}
            if (action==4){System.out.println("Введите номер счета получателя: ");Transactions.transfer();}
            if (action==5){System.out.println("Последние пятнадцать операций:");Transactions.balanceLog();}
            else if (action>6){System.out.println("Не правильный номер действия, повторите ввод");}

        };
        return action;
    }
}
