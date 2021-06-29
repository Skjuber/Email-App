package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity= 500;
	private int defaultpasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "aeycompany.com";
	
// Constructor for first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
	    this.department = setDepartment();
	//Call a method asking for a department - return the department
	    
	    
	    // create a method that returns a random password 
	    this.password = randomPassword(defaultpasswordLength); 
	   System.out.println("Your password is: "+this.password);
	    
	    // Combine elements to generate e-mail
	    email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department+ "." + companySuffix;
	   
	}
	
	// Ask for the department
    private String setDepartment() {
    	System.out.print("New Yorker: " + firstName + ".Department Codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in); 
        int depChoice= in.nextInt();
        if  (depChoice ==1) {  return "sales";}
        else if (depChoice == 2) { return "dev"; }
        else if (depChoice == 3) { return "acct";}
        else  { return ""; } 
    }
    
	// Generate a random password
	private String randomPassword(int length) { 
	    String passwordSet = "ABCDEIFGH123456789!?*";
	    char[] password = new char[length];
	    for (int i=0; i<length; i++) {
	    	int rand = (int) (Math.random() * passwordSet.length());
	    	password[i] = passwordSet.charAt(rand);
	    }
	    return new String(password);
		// set the mailbox capacity
	}   
	public void setMailboxCapacity(int capacity ) {
		this.mailboxCapacity = capacity;
	}
	//set the alternate e-mail
    public void setAlternateEmail(String altEmail) {
    	this.alternateEmail = altEmail;
    }
	//Change the password
    public void changePassword(String password) {
    	this.password = password;     
    }
    
    public int getMailboxcapacity() { return mailboxCapacity; }
    public String getAlternateEmail() { return alternateEmail; } 
    public String getPassword() { return password; }  
    
    public String showInfo() {
    	return "DISPLAY NAME: " + firstName + " " + lastName + 
    			"\nCOMPANY EMAIL: " + email + 
    			"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";   
    }
}       
    
    
    
     