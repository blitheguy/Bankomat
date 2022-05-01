import java.util.Scanner;

public class ATM {
    public void welocome(){
        System.out.println("Добро пожаловать в Банкомат JavaBank");
    }
    public void inputAccountNumber(){
        System.out.println("Введите номер счета (16 цифр)");
    }
    public void inputTransaction(){
        System.out.println("Выберите действие\nЗапрос баланса - 1\nПополнение - 2\nСнятие - 3\nПеревод - 4\nПоследние 15 операций - 5\nЗавершить - 6");
    }
}
