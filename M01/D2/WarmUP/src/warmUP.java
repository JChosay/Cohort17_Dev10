public class warmUP {
    public static void main (String [] args){
        String startString = "I love indian ", endString = " characters.";
        int stringLength = (startString + endString).length() + 2;
        String message = startString + stringLength + endString;
        System.out.println(message);
    }
}
