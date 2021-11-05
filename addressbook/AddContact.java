package addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddContact extends PersonDetail {
	Scanner scanData = new Scanner(System.in);

	public void setContactDetails() {
		System.out.println("enter the First Name");
		setFirstName(scanData.nextLine());
		System.out.println("enter the Last Name");
		setLastName(scanData.nextLine());
		System.out.println("enter the Address Name");
		setAddress(scanData.nextLine());
		System.out.println("enter the city Name");
		setCity(scanData.nextLine());
		System.out.println("enter the State Name");
		setState(scanData.nextLine());
		System.out.println("enter the Phone Number");
		setPhoneNumber(scanData.nextLine());
		System.out.println("enter the Zip");
		setZip(scanData.nextLine());
		System.out.println("enter the Email");
		setEmail(scanData.nextLine());
	}

	public void getContactDetails() {
		getFirstName();
		getLastName();
		getAddress();
		getCity();
		getState();
		getPhoneNumber();
		getZip();
		getEmail();
	}

	public void editDetails(ArrayList<AddContact> contactDetails) {
		String name = scanData.nextLine();
		System.out.println(contactDetails.size());
		for (int i = 0; i < contactDetails.size(); i++) {
			if (contactDetails.get(i).getFirstName().equals(name)) {
				System.out.printf(
						"enter the number to update contact details 1. First Name 2. to update Last Name 3. to phone number 4. to pincode 5. to address 6. to email 7. to state 8.city");
				int updateChoice = scanData.nextInt();
				scanData.nextLine();

				switch (updateChoice) {
				case 1:
					System.out.println("enter the name to update");
					String fName = scanData.nextLine();
					System.out.println("acb");
					contactDetails.get(i).setFirstName(fName);
					break;
				case 2:
					System.out.println("enter the Last name to update");
					String lName = scanData.nextLine();
					contactDetails.get(i).setLastName(lName);
					break;
				case 3:
					System.out.println("enter the Phone Number to Update");
					String phNumber = scanData.nextLine();
					contactDetails.get(i).setPhoneNumber(phNumber);
					break;
				case 4:
					System.out.println("enter the Pincode to Update");
					String pinC = scanData.nextLine();
					contactDetails.get(i).setZip(pinC);
					break;
				case 5:
					System.out.println("enter the Address to Update");
					String address = scanData.nextLine();
					contactDetails.get(i).setAddress(address);
					break;
				case 6:
					System.out.println("enter the Email to Update");
					String email = scanData.nextLine();
					contactDetails.get(i).setEmail(email);
					break;
				case 7:
					System.out.println("enter the State to Update");
					String state = scanData.nextLine();
					contactDetails.get(i).setState(state);
					break;
				case 8:
					System.out.println("enter the city to Update");
					String city = scanData.nextLine();
					contactDetails.get(i).setCity(city);
					break;
				default:
					System.out.println("you have not update any details");
					break;
				}

			} else
				System.out.println("not match any details");
		}
	}

	public void deleteDetails(ArrayList<AddContact> contactDetails) {
		System.out.println("enter the name");
		String name = scanData.nextLine();
		for (int i = 0; i < contactDetails.size(); i++) {
			if (contactDetails.get(i).getFirstName().equals(name)) {
				contactDetails.remove(i);
			} else
				System.out.println("not match any details");
		}
	}

	public void print(ArrayList<AddContact> addContactDetails) {
		for (AddContact s : addContactDetails) {
			System.out.println((s));
		}

	}

	public boolean checkDuplicate(ArrayList<AddContact> addContactDetails2, AddContact addPersonDetails) {

		boolean check = false;
		for (AddContact contact : addContactDetails2) {
			if (addPersonDetails.getFirstName().equals(contact.getFirstName()))
				check = true;
		}
		return check;
	}

}