public class Transaction {
    private String date;
    private int amount;
    private int balance;

    public Transaction(String date, int amount, int balance) {
        this.date = date.replace("-", "/"); 
        this.amount = amount;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return String.format("%-10s || %-6d || %d", date, amount, balance);
    }
}
