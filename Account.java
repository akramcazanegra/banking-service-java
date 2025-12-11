import java.util.ArrayList; 

public class Account implements AccountService { 
    private ArrayList<Transaction> transactions = new ArrayList<>();
    private int balance = 0;
    

    

    public void deposit(int amount, String date) {
        if (amount <= 0) throw new IllegalArgumentException("Invalid deposit"); // Handle Exceptions 
        balance += amount;
        transactions.add(new Transaction(date, amount, balance));
    }
    

    public void withdraw(int amount, String date) {
        if (amount <= 0 || amount > balance) throw new IllegalArgumentException("Invalid withdraw"); // Handle Exceptions 
        balance -= amount;
        transactions.add(new Transaction(date, -amount, balance));
    }

    // Implementation dyal l'interface, walakin ma ghadich nst3mlouha f Main.java l'anna ma 3andnach date
    @Override
    public void deposit(int amount) {
        throw new UnsupportedOperationException("L'interface ma katst3melch f had l'test, khdem b'l'méthode li fiha date.");
    }
    
    @Override
    public void withdraw(int amount) {
        throw new UnsupportedOperationException("L'interface ma katst3melch f had l'test, khdem b'l'méthode li fiha date.");
    }


    @Override
    public void printStatement() {
        // Zid l'entête kima f l'énoncé
        System.out.println("Date       || Amount || Balance"); 
        
    
        for (int i = transactions.size() - 1; i >= 0; i--) {
            System.out.println(transactions.get(i));
        }
    }
}
