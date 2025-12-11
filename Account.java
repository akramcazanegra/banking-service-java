// Khassna nimportiw java.util.ArrayList
import java.util.ArrayList; 

// Kat'implementi l'interface li talbin
public class Account implements AccountService { 
    private ArrayList<Transaction> transactions = new ArrayList<>();
    private int balance = 0;
    
    // Had les méthodes makhasshomch ykounou f l'interface, walakin darouryiin l'l'test case
    // Ma ymkench liya nbeddel l'interface public li 3tatini, walakin hna ghir kanzid les méthodes:
    
    // (Had l'méthode dyal l'test case)
    public void deposit(int amount, String date) {
        if (amount <= 0) throw new IllegalArgumentException("Invalid deposit"); // Handle Exceptions 
        balance += amount;
        transactions.add(new Transaction(date, amount, balance));
    }
    
    // (Had l'méthode dyal l'test case)
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

    // Signature dyal l'interface
    @Override
    public void printStatement() {
        // Zid l'entête kima f l'énoncé
        System.out.println("Date       || Amount || Balance"); 
        
        // Kan printi mn l'jdid l'lqdim (kima dertih)
        for (int i = transactions.size() - 1; i >= 0; i--) {
            System.out.println(transactions.get(i));
        }
    }
}