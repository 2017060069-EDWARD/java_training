import java.util.Scanner;
import java.time.LocalDate;  
import java.time.Period;  

public class challenge1{

    public static void main(String[] args){

        Scanner myInput = new Scanner(System.in);
        String name, surname, myDob;

        System.out.println("Enter your name:");
        name = myInput.nextLine(); 

        System.out.println("Enter your surname:");
        surname = myInput.nextLine(); 

        System.out.println("You are " + name + " " + surname);

        System.out.print("Enter date of birth in YYYY-MM-DD format: ");
        myDob = myInput.nextLine();

        LocalDate dob = LocalDate.parse(myDob);

        System.out.println("You are " + calculateAge(dob) +" years old.");

        System.out.println("How far is your favorite store from your home: "); 

        

}

public static int calculateAge(LocalDate dob)   
{  
//creating an instance of the LocalDate class and invoking the now() method      
//now() method obtains the current date from the system clock in the default time zone      
LocalDate curDate = LocalDate.now();  
//calculates the amount of time between two dates and returns the years  
if ((dob != null) && (curDate != null))   
{  
return Period.between(dob, curDate).getYears();  
}  
else  
{  
return 0;  
}  
} 


}