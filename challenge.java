import java.util.Scanner;
import java.util.Calendar;

public class challenge{

    public static void main(String[] args){
        Scanner myInput = new Scanner(System.in);
        String name, surname, myDob, distFromStore;
        int myAge, myYear, secAge;
        double millSecAge;

        int year = Calendar.getInstance().get(Calendar.YEAR);

         System.out.println("Enter your name:");
        name = myInput.nextLine(); 

        System.out.println("Enter your surname:");
        surname = myInput.nextLine(); 

        System.out.println("You are " + name + " " + surname);

        System.out.println("Enter date of birth in yyyy/mm/dd format:  ");
        myDob = myInput.nextLine();

        myYear = Integer.parseInt(myDob.split("/")[0]);

        myAge = year - myYear;

        System.out.println("You are " + myAge+" years old.");

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