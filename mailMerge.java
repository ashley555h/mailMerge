"import static java.lang.System.out;
import java.util.Scanner;
public class mailMerge
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        float donationAmount;
        boolean keepGoing = true;
        String nameEntered;
        String firstName;
        String lastName;
        String personName;

        out.println("---Thank You Letters---");

        while (keepGoing == true)
        {
            out.println("Is there a name to enter? Enter \"quit\" to stop the program.");
            nameEntered = keyboard.next();

            if (nameEntered.equals ("quit")) {
                keepGoing = false;
            } else {
        
        out.println("What is the donor's first name?");
        firstName = keyboard.next();

        out.println("What is the donor's last name?");
        lastName = keyboard.next();

        out.println("How much would you like to donate?");
        donationAmount = keyboard.nextFloat();

        personName = firstName + " " + lastName;

        System.out.println("Dear " + personName);
        System.out.println("");
        System.out.println("Thank you for your donation! We rely on donors like you to keep our");
        System.out.println("organization effective, and you came through for us. Your donation of $" + donationAmount);
        System.out.println("will help our efforts to make a difference in the world.");
        System.out.println("");
        System.out.println("As you may know, we area  registered non-profit organization, so your");
        System.out.println("donation is tax deductible. You may use this letter as a receipt for tax");
        System.out.println("purposes.");
        System.out.println("");
        System.out.println("Thank you again for your support!");
        System.out.println("");
        System.out.println("Sincerely,");
        System.out.println("Paula Jones");
        System.out.println("YourCharity.org");

    }

}
}
}

