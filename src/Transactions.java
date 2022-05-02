public class Transactions {
    int balance;
    int[] bLog = new int[15];
    public void balanceLog(){
        for (int i = 0; i < 15; i++) {
            System.out.println(bLog[i]);
        }

    }
}
