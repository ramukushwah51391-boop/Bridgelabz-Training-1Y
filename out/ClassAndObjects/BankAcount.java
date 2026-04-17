public class BankAcount {
public static void main(String[] args) {
    Bank B = new Bank();
    System.out.println(B.name);
    System.out.println(B.Name);

    B.withdraw(200);
    B.deposite(500);
    
    
}
}
class Bank{
    String name = "State bank of India";
    String Name = "Raj";
    int balance =1000;
    void withdraw(int amount){
        balance =  balance-amount;
        System.out.println(balance);
    }
    void deposite(int amount){
        balance = balance+amount;
        System.out.println(balance);
    }
}
