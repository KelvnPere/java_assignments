package cafeBusinessLogic;

import javax.swing.*;
import java.awt.font.NumericShaper;
import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class CafeUtil {

    public int getStreakGoal() {
        IntStream intStreamRangeOf = IntStream.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        return intStreamRangeOf.sum();
    }

    //Ninja Bonus
    public int getStreakGoalChange(int num) {
        IntStream intStreamRangeOf = IntStream.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        return intStreamRangeOf.sum();
    }


    public double getOrderTotal(double[] prices) {
        double total = Arrays.stream(prices).sum();
        return total;
    }


    // printing out each index and menu item.
    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        //TODO
        // I will have to revert back to this because i am getting the below error message
//        Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.io.Console.readLine()" because the return value of "java.lang.System.console()" is null
    }

}
