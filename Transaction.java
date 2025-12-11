public class Transaction {
    private String date;
    private int amount;
    private int balance;

    public Transaction(String date, int amount, int balance) {
        // Tqadit l'date bach twelli DD/MM/YYYY kima f l'énoncé
        this.date = date.replace("-", "/"); 
        this.amount = amount;
        this.balance = balance;
    }

    @Override
    public String toString() {
        // Kheddit String.format bach ykoun l'affichage mqad w ybann kima f l'énoncé
        // "%-10s" l'Date, "%-6d" l'Amount, w "%d" l'Balance
        return String.format("%-10s || %-6d || %d", date, amount, balance);
    }
}