package coreJava.classes;

public class StringManipulation {
    public static void main(String[] args) {

        String result = "Your order has been successfully processed!\n" +
                        "Order number: 1019986\n" +
                        "Click here for order details.";

        System.out.println(result);
        System.out.println(result.contains("Order number:"));
        String[] texts = result.split("Order number: ");
        String[] texts2 = texts[1].split("\nClick here");

        System.out.println(texts2[0]);

        System.out.println("    space    ");
        System.out.println("    space   ".trim());


    }
}
