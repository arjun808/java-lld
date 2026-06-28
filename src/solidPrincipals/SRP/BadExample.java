package solidPrincipals.SRP;
class Invoice {
    String customerName;
    int amount;

    Invoice(String customerName, int amount) {
        this.customerName = customerName;
        this.amount = amount;
    }

    void calculateTotal() {
        System.out.println("Total amount: " + amount);
    }

    void printInvoice() {
        System.out.println("Printing invoice for: " + customerName);
        System.out.println("Amount: " + amount);
    }

    void saveToDatabase() {
        System.out.println("Saving to DB: " + customerName + " - " + amount);
    }

    void sendEmail() {
        System.out.println("Sending email to: " + customerName);
    }
}

public class BadExample {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("Arjun", 500);
        invoice.printInvoice();
        invoice.saveToDatabase();
        invoice.sendEmail();
    }
}
