package solidPrincipals.SRP;

class Invoice {
    private String customerName;
    private int amount;

    Invoice(String customerName, int amount) {
        this.customerName = customerName;
        this.amount = amount;
    }

    public String getCustomerName() { return customerName; }
    public int getAmount() { return amount; }

    public void calculateTotal() {
        System.out.println("Total amount: " + amount);
    }
}

// Sirf printing ki responsibility
class InvoicePrinter {
    public void print(Invoice invoice) {
        System.out.println("Printing invoice for: " + invoice.getCustomerName());
        System.out.println("Amount: " + invoice.getAmount());
    }
}

// Sirf database ki responsibility
class InvoiceRepository {
    public void save(Invoice invoice) {
        System.out.println("Saving to DB: " + invoice.getCustomerName());
    }
}

// Sirf email ki responsibility
class InvoiceEmailSender {
    public void send(Invoice invoice) {
        System.out.println("Sending email to: " + invoice.getCustomerName());
    }
}

public class GoodExample {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("Arjun", 500);

        InvoicePrinter printer = new InvoicePrinter();
        InvoiceRepository repo = new InvoiceRepository();
        InvoiceEmailSender emailSender = new InvoiceEmailSender();

        printer.print(invoice);
        repo.save(invoice);
        emailSender.send(invoice);
    }
}