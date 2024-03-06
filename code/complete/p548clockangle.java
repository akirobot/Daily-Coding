package complete;
/*
 * Given a clock time in hh:mm format, determine, to the nearest degree, the angle betwen the hour and minute hands.
 * 
 * Assuming the minute hand ticks between each minute and doesn't move constantly.
 * 
 * Following clockwise rotation, so if the hour was at 12, and the minutes were 50, it would be the entirety from 12 to 10. The counter clockwise angle could be calculated to get that angle too.
 */

import java.util.*;
import java.util.regex.*;

public class p548clockangle {
    public static void clockAngle(String time){
        String[] arrTime = time.split(":");
        int hourAngle = Integer.valueOf(arrTime[0]) * 30;
        int minuteAngle = Integer.valueOf(arrTime[1]) * 6;
        int angle = Math.abs(hourAngle - minuteAngle);
        System.out.println("Clockwise angle: " +(360-angle));
        System.out.println("Counter-clockwise angle: " +angle);
    }
    public static boolean formatCheck (String time, int format){
        String format12 = "([0-1][0-9]):([0-5][0-9])";
        String format24 = "([0-2][0-9]):([0-5][0-9])";
        switch(format) {
            case 12:
                Pattern pattern12 = Pattern.compile(format12);
                Matcher matcher12 = pattern12.matcher(time);
                return matcher12.find();
            case 24:
                Pattern pattern24 = Pattern.compile(format24);
                Matcher matcher24 = pattern24.matcher(time);
                return matcher24.find();
            default:
                System.out.println("Error");
                return false;
        }
    }
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        /*int form = 0;
        do{
            System.out.print("12 or 24 hour time? ");
            form = in.nextInt();
            if (form == 12 || form == 24){
                break;
            }
            else {
                System.out.println("Incorrect format");
            }
        }while(form == 12 || form == 24);
        switch(form) {
            case 12:
                System.out.print("Enter time in 12 hour hh:mm format: ");
            case 24:
                System.out.print("Enter time in 24 hour hh:mm format: ");
            default:
                System.out.println("Error");
        }*/
        
        System.out.print("Enter time in 12 hour hh:mm format: ");
        String str = in.nextLine();
        in.close();
        clockAngle(str);
        /*if (formatCheck(str, form)){
            clockAngle(str);
        }*/
    }
}
