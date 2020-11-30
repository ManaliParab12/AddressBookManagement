package addressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
		
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to Address Book Program");		
		AddressBook addressbook = new AddressBook();		
		
		int answer=1;
	    while (answer == 1) {
	        System.out.println("Select any option for Address Book Operation");
	        System.out.println("1. Create New AddressBook"
	        		 		+ "\n2. open existing AddressBook"
	        		 		+ "\n3. Display AddressBook"
	        		 		+ "\n4. Quit");
	        int choice =scanner.nextInt();

            switch(choice) {
                case 1 :
                    addressbook.newAddressBook();
                    break;
                case 2 :
                    addressbook.openAddressBook();
                    
                    int input=1;
                    while (input == 1) {					
                    	System.out.println("Select any option From Menu ");
                    	System.out.println("1. Add Person"
							+ "\n2. Edit Person"
							+ "\n3. Delete Person"					
							+ "\n4. Display"
							+ "\n5. Quit");
                    	int value = scanner.nextInt();
			
						switch (value) {
						case 1 :
							addressbook.addPerson();
							break;
						case 2 :
							addressbook.editPerson();
							break;
						case 3 :
							addressbook.deletePerson();
							break;			
						case 4 :
							addressbook.display();
							break;
						case 5 :
							input = 0;
							break;
						default :
							System.out.println("Incorrect Choice" + "\nEnter a number between 1 and 4");			
					    }
					 }
                    break;
                    case 3 :
                    addressbook.displayAddressBook();
                    break;
                case 4 :
                    answer = 0;
                    break;
                default :
                    System.out.println("Enter a number between 1 and 3");
            }
	    }
	}		
}
	
