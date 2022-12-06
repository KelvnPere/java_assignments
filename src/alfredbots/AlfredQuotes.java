package alfredbots;

import java.text.SimpleDateFormat;
import java.util.Date;
public class AlfredQuotes {
    Date date = new Date();
    String datePatternStyle = " EEEEE, 'the' dd 'of' MMMMMMMM, YYYY";
    String refactor = " 'It is currently' EEEE MMMMMMMM dd HH:mm a 'PDT' YYYY ";
//    	"It is currently Wed Aug 11 16:34:59 PDT 2022."

    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return String.format("Hello," + name + ".Lovely to see you");
    }

//     Ninja Bonus (Overload)
    public String guestGreeting(String name, String address) {
        // YOUR CODE HERE
        return String.format("Hello," + name + ".Lovely to see you in this location " + address );
    }

    public String dateAnnouncement() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(refactor);
        String formatType = simpleDateFormat.format(date);
        // YOUR CODE HERE
        return formatType;
    }

    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        String alexisChecker = "Alexis";
        String alfredChecker = "Alfred";

        if (conversation.contains(alexisChecker)){
            return "Right away, sir. She certainly isn't sophisticated enough for that";
        }else if (conversation.contains(alfredChecker)){
            return "At your service. As you wish, naturally";
        }else {
            return "Right. And with that I shall retire.";
        }

    }

    // NINJA BONUS
    // See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

