/**
 * Generate an email with the following syntax: firstname.lastname@department.company.com
 * Determine the department (sales, development, accounting), if none leave blank
 * Generate a random String for a password
 * Have set methods to change the password, set the mailbox capacity, and define an alternate email address
 * Have get methods to display the name, email, and mailbox capacity
*/

package emailapp;

public class EmailApp {
    public static void main(String[] args) {
        Email email = new Email("Jane", "Doe");
        email.setMailboxCapacity(5000);
        email.setAlternateEmail("janedoe@gmail.com");
        email.changePassword("*IKlm58!");

        System.out.println(email.showInfo());
    }
}
