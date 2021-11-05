package addressbook;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Hashtable;

public class ContactDetailsMain {

	static Hashtable<Integer, ArrayList<AddContact>> hashTable = new Hashtable<Integer, ArrayList<AddContact>>();

	private static char inputCharater() {
		Scanner scanCharater = new Scanner(System.in);
		char charaterInput = scanCharater.next().charAt(0);
		return charaterInput;
	}

	private static int inputInteger() {
		Scanner scanCharater = new Scanner(System.in);
		int integerInput = scanCharater.nextInt();
		return integerInput;
	}

	public static void main(String[] args) {
		System.out.println("enter the address book limit");
		int addressBookLimit = inputInteger();
		for (int i = 1; i <= addressBookLimit; i++) {
			ArrayList<AddContact> addDetails = new <AddContact>ArrayList();
			while (true) {
				AddContact addPersonDetails = new AddContact();
				System.out.printf(
						"Input the Charater A to add Details E to Edit details D to delete details\n Any charater to Ignore");
				char charater = inputCharater();
				if (charater == 'A' || charater == 'E' || charater == 'D' || charater == 'a' || charater == 'e'
						|| charater == 'd') {
					switch (charater) {
					case 'A':
						addPersonDetails.setContactDetails();
						boolean checkDuplicate = addPersonDetails.checkDuplicate(addDetails, addPersonDetails);
						if (!checkDuplicate)
							addDetails.add(addPersonDetails);
						else
							System.out.println("Dont enter duplicate entry");
						break;
					case 'E':
						System.out.println("Enter the name to edit");
						addPersonDetails.editDetails(addDetails);
						break;
					case 'D':
						addPersonDetails.deleteDetails(addDetails);
						break;
					default:
						System.out.println("you have not perform any operation");
						break;
					}

				} else {
					System.out.println("Details are uptodate");
					break;
				}
			}
			hashTable.put(i, addDetails);
		}
		for (int i = 1; i <= hashTable.size(); i++) {
			System.out.println("address book " + i);
			System.out.println(hashTable.get(i));
		}
	}
}