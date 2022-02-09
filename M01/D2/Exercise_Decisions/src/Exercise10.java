import java.util.Scanner;

public class Exercise10 {

    public static void main(String[] args) {
        // USPS
        // Below is an abbreviated version of the US Postal Service retail parcel rates:
        /*
        Lbs | Zones 1&2 | Zone 3
        ===============
        1      $7.50      $7.85
        2       8.25       8.70
        3       8.70       9.70
        4       9.20      10.55
        5      10.20      11.30
        */

        // 1. Collect the parcel lbs and zone (1, 2, or 3) from the user.
        // 2. Add `if`/`else if`/`else` logic to cover all rates.
        // Use whatever strategy you think is best. You can create compound conditions or nest if/else statements.
        // If a lbs/zone combo does not exist, print a warning message for the user.

        Scanner console = new Scanner(System.in);
        int zone, lbs;
        double rate;
        System.out.print("Enter zone number: ");
        zone = Integer.parseInt(console.nextLine());
        System.out.print("Enter weight (whole number): ");
        lbs = Integer.parseInt(console.nextLine());
        switch (lbs){
            case 1:
                if(zone == 3)
                    rate = 7.85;
                else if (zone == 1 || zone == 2)
                    rate = 7.50;
                else
                    rate = -1;
                break;
            case 2:
                if(zone == 3)
                    rate = 8.70;
                else if (zone == 1 || zone == 2)
                    rate = 8.25;
                else
                    rate = -1;
                break;
            case 3:
                if(zone == 3)
                    rate = 9.70;
                else if (zone == 1 || zone == 2)
                    rate = 8.70;
                else
                    rate = -1;
                break;
            case 4:
                if(zone == 3)
                    rate = 10.55;
                else if (zone == 1 || zone == 2)
                    rate = 9.20;
                else
                    rate = -1;
                break;
            case 5:
                if(zone == 3)
                    rate = 11.30;
                else if (zone == 1 || zone == 2)
                    rate = 10.20;
                else
                    rate = -1;
                break;
            default:
                rate = -1;
                break;
        }
        if (rate == -1)
            System.out.println("The lbs/zone combo does not exist. Try again.");
        else
            System.out.printf("In zone %d a parcel with %d lbs has a rate of %.2f.", zone, lbs, rate);
    }
}
