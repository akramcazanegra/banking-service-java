public class Main {
    public static void main(String[] args) {
        Account a = new Account();
        a.deposit(1000, "10-01-2012");
        a.deposit(2000, "13-01-2012");
        a.withdraw(500, "14-01-2012");
        a.printStatement();
    }
}