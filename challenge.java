import java.util.Calendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class challenge{

    public static boolean validateJavaDate(String strDate)
    {
        /* Check if date is 'null' */
        if (strDate.trim().equals(""))
        {
            return true;
        }
        /* Date is not 'null' */
        else
        {
            /*
             * Set preferred date format,
             * For example MM-dd-yyyy, MM.dd.yyyy,dd.MM.yyyy etc.*/
            SimpleDateFormat sdfrmt = new SimpleDateFormat("yyyy/MM/dd");
            sdfrmt.setLenient(false);
            /* Create Date object
             * parse the string into date
             */
            try
            {
                Date javaDate = sdfrmt.parse(strDate);
                System.out.println(strDate+" is valid date format");
            }
            /* Date format is invalid */
            catch (ParseException e)
            {
                System.out.println(strDate+" is Invalid Date format");
                return false;
            }
            /* Return true if date format is valid */
            return true;
        }
    }




    public static void main(String[] args){
        Scanner myInput = new Scanner(System.in);
        String name, surname, myDob, distFromStore;
        int myAge = 0, myYear, secAge, myMonth, myDay;
        double millSecAge;

        int year = Calendar.getInstance().get(Calendar.YEAR);

        System.out.println("Enter your name:");
        name = myInput.nextLine();

        System.out.println("Enter your surname:");
        surname = myInput.nextLine();

        System.out.println("You are " + name + " " + surname);

        System.out.println("Enter date of birth in yyyy/mm/dd format:  ");
        myDob = myInput.nextLine();
        validateJavaDate(myDob);


        myYear = Integer.parseInt(myDob.split("/")[0]);
        myMonth = Integer.parseInt(myDob.split("/")[1]);
        myDay = Integer.parseInt(myDob.split("/")[2]);
        if (myYear > year){
            System.out.println("year input not valid");

        } else if (myMonth > 12) {
            System.out.println("input a valid month of the year");
        } else if (myDay > 31) {
            System.out.println("input a valid date of the month");

        } else {
            myAge = year - myYear;
        }

        System.out.println("You are " + myAge +" years old.");

        System.out.println("How far is your favorite store in km from your home: ");
        distFromStore = myInput.nextLine();
        System.out.println("you are " + distFromStore + " km from your favorite store");

        secAge = myAge * 60 *60 * 24 * 366;
        millSecAge = secAge * 1000;

        System.out.println("Your age in seconds is " + secAge);

        System.out.println("Your age in milliseconds is " + (double)(millSecAge));

        System.out.println("My age in hexa =" + Integer.toHexString(myAge));
        System.out.println("My age in octal =" + Integer.toOctalString(myAge));
        System.out.println("My age in binary =" + Integer.toBinaryString(myAge));



    }
}