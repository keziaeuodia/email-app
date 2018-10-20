/**
 * Generate an email with the following syntax: firstname.lastname@department.company.com
 * Determine the department (sales, development, accounting), if none leave blank
 * Generate a random String for a password
 * Have set methods to change the password, set the mailbox capacity, and define an alternate email address
 * Have get methods to display the name, email, and mailbox capacity
 */

package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private int defaultPasswordLength = 10;
    private int mailboxCapacity;
    private String alternateEmail;

    //Constructor for names
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        //Call a method to ask for department, return department
        this.department = setDepartment();

        //Call a method to generate random password
        this.password = randomPassword(defaultPasswordLength);
    }

    //Ask for department
    private String setDepartment() {
        System.out.println("Select the department:\n1 Sales\n2 Development\n3 Accounting\n4 None");
        Scanner input = new Scanner(System.in);
        int dept = input.nextInt();
        if (dept == 1) {return "sales";}
        else if (dept == 2) {return "dev";}
        else if (dept == 3) {return "acct";}
        else {return "";}
    }

    private String randomPassword(int length) {
        String charSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*()-_=+?";
        char [] password = new char[length];
        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * charSet.length());
            password[i] = charSet.charAt(random);
        }
        return new String(password);
    }


    //Generate password

    //Set mailbox capacity

    //Set alternate email

    //Change password


}
