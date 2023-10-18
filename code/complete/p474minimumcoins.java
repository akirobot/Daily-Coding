package complete;
/*
 * Find the minimum number of coins to make n cents using standard American denominations of 1, 5, 10, and 25. 
 */

 public class p474minimumcoins {
    public static int coins(int total){
        //Initialize coin counts
        int quarter, dime, nickel, penny;
        quarter = dime = nickel = penny = 0;
        //When dividing the total by 25, if the remainder is greater than one, meaning that at least one quarter is used
        if ((quarter = total / 25) >= 1){
            //Subtract the number of quarters from the total
            total -= (25*quarter);
        }
        //When dividing the total by 10, if the remainder is greater than one, meaning that at least one dime is used
        if ((dime = total / 10) >= 1){
            //Subtract the number of dimes from the total
            total -= (10*dime);
        }
        //When dividing the total by 5, if the remainder is greater than one, meaning that at least one nickel is used
        if ((nickel = total / 5) >= 1){
            //Subtract the number of nickels from the total
            total -= (5*nickel);
        }
        //The remaining total is the number of pennies needed.
        penny = total;

        System.out.println(quarter +" Quarters");
        System.out.println(dime +" Dimes");
        System.out.println(nickel +" Nickels");
        System.out.println(penny +" Pennies");
        
        return (quarter + dime + nickel + penny);
    }
    public static void main (String[] args){
        System.out.println(coins(49) +" coins total");
    }
}