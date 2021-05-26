package Replit_And_Practice_Tasks.Methods_Tasks;

import java.util.Arrays;

/*
Given a time in 12 hour AM/PM format, convert it to military (24-hour) time.

Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.

The **timeConversion** method should convert and print the given number (String argument)

```
Input: 07:05:45PM

Output: 19:05:45
```

```
Input: 07:15:55AM

Output: 07:15:55
 */
public class TImeConversation {
    public static void main(String[] args) {
        String s = "09:00:00Pm";
        timeConversion(s);
    }

    public static void timeConversion(String s) {

        // TODO: =>> Write your code here.

        String time = s.substring(s.length()-2); // PM or AM
        s = s.substring(0, s.length()-2);        // 12:00:00
        String [] parts = s.split(":");          // [00, 00, 00]

        String hours24 = "";

        if (time.equalsIgnoreCase("AM")){
            if (parts[0].equals("12")){
                parts[0] = "00";
            }
            hours24 = String.join(":", parts);  // 00:00:00
           // System.out.println(hours24);
        } else if (time.equalsIgnoreCase("PM")){
            if (!parts[0].equals("12")){
                int temp = Integer.valueOf(parts[0]);
                temp += 12;
                // System.out.println("temp = "+temp);
                parts [0] = temp +"";
            }
            hours24 = String.join(":", parts);
        }
        System.out.println(hours24);


        /*
        // s = "12:00:00AM";
        String h24 = "";
        if (s.equalsIgnoreCase("12:00:00AM")) {

            h24 =  s.replace(s, "00:00:00");
        } else if (s.equalsIgnoreCase("12:00:00PM")) {
            h24 = s.replace(s, "12:00:00");
        }
        System.out.println(h24);

        if (s.contains("PM")) {
            h24 = s.replace("PM", "");
        } else if (s.contains("AM")) {
            h24 = s.replace("AM", "");
        }
        System.out.println(h24);


        String newS[] = s.split(":");

        if (newS[newS.length - 1].contains("AM") || newS[newS.length - 1].contains("am")) {
            newS[newS.length - 1] = newS[newS.length - 1].replaceAll("AM", "");
        } else if (newS[newS.length - 1].contains("PM")|| newS[newS.length - 1].contains("pm")) {
            newS[newS.length - 1] = newS[newS.length - 1].replaceAll("PM", "");
        }
        if (newS.equals(""))
        newS[newS.length - 1] = newS[newS.length - 1].replaceAll("PM", "");
        System.out.println(Arrays.toString(newS));

         */

    }
}
