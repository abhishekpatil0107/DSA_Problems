import java.util.*;

class Tax {
    String name;
    double percentage;

    Tax(String name, double percentage) {
        this.name = name;
        this.percentage = percentage;
    }
}

class TaxGroup {
    String name;
    List<Tax> taxes;

    TaxGroup(String name, List<Tax> taxes) {
        this.name = name;
        this.taxes = taxes;
    }

    double calculateTax(double price) {
        double totalTax = 0;
        for (Tax tax : taxes) {
            totalTax += (tax.percentage / 100.0) * price;
        }
        return Math.round(totalTax * 100.0) / 100.0;
    }
}

class Product {
    String name;
    double price;
    TaxGroup taxGroup;

    Product(String name, double price, TaxGroup taxGroup) {
        this.name = name;
        this.price = price;
        this.taxGroup = taxGroup;
    }
}

class InvoiceItem {
    Product product;

    InvoiceItem(Product product) {
        this.product = product;
    }

    double getTax() {
        return product.taxGroup.calculateTax(product.price);
    }

    double getTotalPrice() {
        return product.price + getTax();
    }
}

public class Task {

    public static void main(String[] args) {

        Tax cgst = new Tax("CGST", 5.0);
        Tax sgst = new Tax("SGST", 5.0);
        Tax vat = new Tax("VAT", 1.85);
        Tax none = new Tax("NONE", 0.0);

        TaxGroup noTax = new TaxGroup("NoTax", Arrays.asList(none));
        TaxGroup vatOnly = new TaxGroup("VATOnly", Arrays.asList(vat));
        TaxGroup gst = new TaxGroup("GST", Arrays.asList(cgst, sgst));

        Map<String, Product> productCatalog = new HashMap<>();
        productCatalog.put("Rice", new Product("Rice", 20.0, noTax));
        productCatalog.put("Petrol", new Product("Petrol", 65.0, vatOnly));
        productCatalog.put("Soap", new Product("Soap", 10.0, gst));

        List<String> purchasedNames = Arrays.asList("Soap", "Petrol");
        List<InvoiceItem> invoiceItems = new ArrayList<>();

        for (String name : purchasedNames) {
            Product p = productCatalog.get(name);
            if (p != null) {
                invoiceItems.add(new InvoiceItem(p));
            }
        }

        printInvoice(invoiceItems);
    }

    public static void printInvoice(List<InvoiceItem> items) {
        double totalPrice = 0.0;
        double totalTax = 0.0;

        System.out.println("-----------------------------");
        System.out.println("Product    Price    Tax");

        for (InvoiceItem item : items) {
            double price = item.product.price;
            double tax = item.getTax();
            totalPrice += price;
            totalTax += tax;

            System.out.println(item.product.name + "    " + price + "    " + tax);
        }

        System.out.println();
        System.out.println("Total      " + totalPrice + "    " + totalTax);
        System.out.println();
        System.out.println("Grand Total  : " + (Math.round((totalPrice + totalTax) * 100.0) / 100.0));
        System.out.println("-----------------------------");
    }
}
