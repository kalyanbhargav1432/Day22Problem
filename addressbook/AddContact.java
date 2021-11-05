package addressbook;

import java.util.ArrayList;

public class AddContact extends PersonDetail {
	ArrayList<AddContact> addContactDetails;
	InputScanner inputScanner = new InputScanner();
	ContactDetailsMain contact = new ContactDetailsMain();

	public void setContactDetails() {
		System.out.println("enter the First Name");
		setFirstName(inputScanner.inputString());
		System.out.println("enter the Last Name");
		setLastName(inputScanner.inputString());
		System.out.println("enter the Address Name");
		setAddress(inputScanner.inputString());
		System.out.println("enter the city Name");
		setCity(inputScanner.inputString());
		System.out.println("enter the State Name");
		setState(inputScanner.inputString());
		System.out.println("enter the Phone Number");
		setPhoneNumber(inputScanner.inputString());
		System.out.println("enter the Zip");
		setZip(inputScanner.inputString());
		System.out.println("enter the Email");
		setEmail(inputScanner.inputString());
	}

	public ArrayList<AddContact> getContactDetails() {
		getFirstName();
		getLastName();
		getAddress();
		getCity();
		getState();
		getPhoneNumber();
		getZip();
		getEmail();
		return addContactDetails;
	}

	public void editDetails(ArrayList<AddContact> contactDetails) {
		String name = inputScanner.inputString();
		System.out.println(contactDetails.size());
		for (int i = 0; i < contactDetails.size(); i++) {
			if (contactDetails.get(i).getFirstName().equals(name)) {
				System.out.printf(
						"enter the number to update contact details 1. First Name 2. to update Last Name 3. to phone number 4. to pincode 5. to address 6. to email 7. to state 8.city");
				int updateChoice = inputScanner.inputInteger();
				inputScanner.inputInteger();

				switch (updateChoice) {
				case 1:
					System.out.println("enter the name to update");
					String fName = inputScanner.inputString();
					contactDetails.get(i).setFirstName(fName);
					break;
				case 2:
					System.out.println("enter the Last name to update");
					String lName = inputScanner.inputString();
					contactDetails.get(i).setLastName(lName);
					break;
				case 3:
					System.out.println("enter the Phone Number to Update");
					String phNumber = inputScanner.inputString();
					contactDetails.get(i).setPhoneNumber(phNumber);
					break;
				case 4:
					System.out.println("enter the Pincode to Update");
					String pinC = inputScanner.inputString();
					contactDetails.get(i).setZip(pinC);
					break;
				case 5:
					System.out.println("enter the Address to Update");
					String address = inputScanner.inputString();
					contactDetails.get(i).setAddress(address);
					break;
				case 6:
					System.out.println("enter the Email to Update");
					String email = inputScanner.inputString();
					contactDetails.get(i).setEmail(email);
					break;
				case 7:
					System.out.println("enter the State to Update");
					String state = inputScanner.inputString();
					contactDetails.get(i).setState(state);
					break;
				case 8:
					System.out.println("enter the city to Update");
					String city = inputScanner.inputString();
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
		String name = inputScanner.inputString();
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