package org.howard.edu.lsp.oopfinal.question2;

public class PaymentStrategyDriver {
    public static void main(String[] args) {
    	System.out.println("This is your output:");
        ShoppingCart cart = new ShoppingCart();

        // Set the payment strategy to CreditCard and perform checkout
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        cart.checkout(100.0);

        // Set the payment strategy to PayPal and perform checkout
        cart.setPaymentStrategy(new PayPalPayment("user@example.com"));
        cart.checkout(50.0);

        // Set the payment strategy to Bitcoin and perform checkout
        cart.setPaymentStrategy(new BitcoinPayment("1AaBbCcDdEeFfGgHh"));
        cart.checkout(75.0);
    }
}
