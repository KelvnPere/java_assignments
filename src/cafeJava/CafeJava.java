package cafeJava;

import java.util.concurrent.TimeUnit;

public class CafeJava {
    public static void main(String[] args) throws InterruptedException {
        // APP VARIABLES
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        String cofferOrdered = ", ordered a coffe";

        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffee = 3.7;
        double latte = 4.5;
        double cappucino = 5.5;

        // Customer name variables (add yours below)
        String cindhuriCustomer1 = "Cindhuri";
        String sameCustomer2 = "Sam";
        String jimmyCustomer = "Jimmy";
        String noahCustomer4 = "Noah";

        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean  isReadyOrder3 = true;
        boolean isReadyOrder4  = false;

        boolean statusChecker = true;
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
      System.out.println(generalGreeting + cindhuriCustomer1); // Displays "Welcome to Cafe Java, Cindhuri"
        // ** Your customer interaction print statements will go here ** //

//        Scenario 1 (Cindhuri)
        System.out.println(cindhuriCustomer1 + cofferOrdered);
        System.out.println(readyMessage);
        System.out.println(cindhuriCustomer1 +  readyMessage);

//        Scenario 2 (Noah)
        System.out.println(jimmyCustomer + cofferOrdered);
        System.out.println(jimmyCustomer + "Order Status is?");
        if (isReadyOrder4){
            System.out.println("Order status is true");
            System.out.println("The toal cost of your order is $" +cappucino);
        }else {
            System.out.println("Order status is false");
        }

//        Scenario 2 (Sam)
        System.out.println(sameCustomer2 + " " +  "just ordered 2 latte");
        System.out.println("The first order costs " + latte);
        System.out.println("The second order costs " + latte);
        System.out.println("The total is " + latte * 2);

        if (isReadyOrder2){
            System.out.println("Order status is true");
            System.out.println("Meaning that your coffee is so ready for consumption");
        }else{
            System.out.println("Order status is false");
            System.out.println("Meaning that your coffee is NOT ready for consumption");
        }


//        Scenario 4
        System.out.println( jimmyCustomer + " just ordered");
        System.out.println( jimmyCustomer + " order costs " + dripCoffee);
        System.out.println( jimmyCustomer + " Now realised he was charged a coffee which cost " + dripCoffee + " instead of a latte which costs " + latte );
        double difference = latte - dripCoffee;
        double randOff = Math.round(difference * 100D)/100D;
        System.out.println("That means " + jimmyCustomer + " currently owes " + randOff + " which needs to be paid before leaving the shop");
  }
}
