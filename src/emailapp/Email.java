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
    private String company = "h2oltd";
    private String password;
    private int defaultPasswordLength = 10;
    private double mailboxCapacity;
    private String email;
    private String alternateEmail;

    //Constructor for names
    public Email(String firstName, String lastName) {
        this.firstName = firstName.toLowerCase();
        this.lastName = lastName.toLowerCase();
        System.out.println("Creating new email account for " + firstName + " " + lastName);
        //Call a method to ask for department, return department
        this.department = setDepartment();

        //Concatenate email address
        this.email = this.firstName + "." + this.lastName + "@" + this.department + "." + company + ".com";
        System.out.println("Email created: " + email);

        //Call a method to generate random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your temporary password is: " + this.password + "\nPlease change your password.");
    }

    //Ask for department
    private String setDepartment() {
        System.out.print("Select the department:\n1 Sales\n2 Development\n3 Accounting\n4 Others\nPlease enter your department number: ");
        Scanner input = new Scanner(System.in);
        int dept = input.nextInt();
        if (dept == 1) {return "sales";}
        else if (dept == 2) {return "development";}
        else if (dept == 3) {return "accounting";}
        else {return "";}
    }

    //Generate password
    private String randomPassword(int length) {
        String charSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%&*?";
        char [] password = new char[length];
        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * charSet.length());
            password[i] = charSet.charAt(random);
        }
        return new String(password);
    }

    //Set mailbox capacity
    public void setMailboxCapacity(double mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    public double getMailboxCapacity() {
        return mailboxCapacity;
    }

    //Set alternate email
    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    //Change password
    public void changePassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    //Show info
    public String showInfo() {
        System.out.println();
        return "Name: " + firstName + " " + lastName +
                "\nEmail address: " + email +
                "\nMailbox Capacity: " + mailboxCapacity + " MB" +
                "\nPassword: " + password;
    }
}
