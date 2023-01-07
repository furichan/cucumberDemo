package cucumberDemo.common;

public class IsItFriday {
    public static boolean isItFriday(String today) {
        return today.equalsIgnoreCase("Friday")? true:false;
    }
}
