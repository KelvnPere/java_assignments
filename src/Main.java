import java.io.Console;

 class Main {

    public static void main(String[] args) {
        System.out.println("Enter some user input");
        String input = System.console().readLine();
        System.out.println("You entered:" + input);
    }
}
