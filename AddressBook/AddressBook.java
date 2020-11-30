package addressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	
	Scanner sc = new Scanner(System.in);
	
	ArrayList<Person> personInfo = new ArrayList<Person>();
	ArrayList<AddressBookList> addressbooklist = new ArrayList<AddressBookList>();
	
	public void newAddressBook() {
		System.out.println("Enter AddressBook Name");
	    String bookName = sc.next();
	    
	    AddressBookList address = new AddressBookList(bookName);
	    
	    addressbooklist.add(address);
	    System.out.println(addressbooklist.toString());
	}
	
	public void openAddressBook() {  
		displayAddressBook();
        System.out.println("Enter name to Open  AddressBook");
        String bookName = sc.next();
        for (AddressBookList A : addressbooklist) {
            if (bookName.equals(A.getbookName())) {
                System.out.println("Address Book " + A.getbookName() + " is opened ");
            }
        }
    }
	
	 public void displayAddressBook() {
	        System.out.println("Display List of all AddressBook");
	        for (int i = 0; i < addressbooklist.size(); i++) {
	            System.out.println(addressbooklist.get(i));
	        }
	    }
	 
	public void addPerson() {	
		
		System.out.println("Enter First Name");
        String firstName = sc.next();
        
        System.out.println("Enter Last Name");
        String lastName = sc.next();
        
        System.out.println("Enter City");
        String city = sc.next();
        
        System.out.println("Enter State");
        String state = sc.next();
        
        System.out.println("Enter phone Number");
        long phoneNumber = sc.nextLong();
        
        System.out.println("Enter Zip");
        int zip = sc.nextInt();
  
       Person person = new Person(firstName, lastName, city, state, phoneNumber, zip );
       personInfo.add(person);
 
	}   
	
	public void display() {
		System.out.println("Person Information");
		for(int i=0; i<personInfo.size(); i++) {
			System.out.println(personInfo.get(i));
		}
	}
	
	public void editPerson() {
		
		System.out.println("Enter First Name to update Record");
        String firstName = sc.next();
        
        for ( int i=0; i< personInfo.size(); i++) {
        	Person person = (Person)personInfo.get(i);
        	
			if(firstName.equals(person.getFirstName())) {
				
				System.out.println("Select any option to edit ");				
				System.out.println("1.Phone Number" + "\n2.Address" + "\n3.Quit");
				int choice = sc.nextInt();
				
				switch (choice) {
			    case 1 :
			    	System.out.println("Enter new Phone Number");
			    	long phoneNumber = sc.nextLong();
			    	
			    	person.setPhoneNumber(phoneNumber);
                    break;                            
			    case 2 :
			    	System.out.println("Enter new City");
			    	String city = sc.next();
			    	
			    	System.out.println("Enter new State");
			    	String state = sc.next();
			    	
			    	System.out.println("Enter new Zip");
			    	int zip = sc.nextInt();
			    	
			    	person.setCity(city);	
			    	person.setState(state);	
			    	person.setZip(zip);	
			    	break;			  
			    case 3 :
			    	System.exit(0);
			    	break;			      
			    default :
			    	System.out.println("Incorrect Choice");				
				}			      
			}
        }        
	}
	
	public void deletePerson() {
		System.out.println("Enter Last Name to delete its Entry");
		String lastName = sc.next();
		for ( int i=0; i< personInfo.size(); i++) {
			Person person = (Person)personInfo.get(i);
			if(lastName.equals(person.getLastName())) {
				System.out.println(personInfo.get(i));
				personInfo.remove(i);
				System.out.println("Record Deleted");
			}
		}		
	}
	
	@Override  
	protected void finalize() {   
		sc.close(); 
    }  
}
