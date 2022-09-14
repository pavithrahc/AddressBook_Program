/**
 * 
 */
package com.bridgelabz;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author PAVITHRA C
 *
 */
public class AddressBook {

	/**
	 * @param args
	 */
	static ArrayList<Cantacts> cantactList = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		AddressBook addressBook = new AddressBook();
		Scanner sc = new Scanner(System.in);
		int exit = 1;
		while (exit == 1) {
			System.out.println(" Welcome to address book program ");
			System.out.println(" Select a choice : 1. Add 2.Edit 3.Delete  4. Exit");
			System.out.print(":==");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				addressBook.addCantact();
				break;

			case 2:
				if (addressBook.cantactList.isEmpty()) {
					System.out.println(" Address book is empty ");
					break;
				}
				addressBook.editContact();
				break;

			case 3:
				if (addressBook.cantactList.isEmpty()) {
					System.out.println(" Address book is empty ");
					break;
				}
				addressBook.deleteCantact();

			case 4:
				exit = 0;
				break;

			default:
				System.out.println(" Enter a valid choice");
				break;
			}
		}
		System.out.println(addressBook.cantactList);
	}

	public static void addCantact() {

		System.out.println(" Enter your first name : ");
		String firstName = sc.nextLine();

		System.out.println(" Enter your last name : ");
		String lastName = sc.nextLine();

		System.out.println(" Enter your city name : ");
		String city = sc.nextLine();

		System.out.println("Enter your state  : ");
		String state = sc.nextLine();

		System.out.println(" Enter your zip code : ");
		long zip = sc.nextLong();

		System.out.println(" Enter your phone number : ");
		long phoneNumber = sc.nextLong();

		System.out.println(" Enter your email : ");
		String email = sc.next();

		Cantacts addressBook = new Cantacts(firstName, lastName, email, city, state, phoneNumber, zip);
		cantactList.add(addressBook);
	}

	// method for editing existing contact
	public void editCantact() {

		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the first name ");
		String fName = sc.nextLine();

		for (int index = 0; index < cantactList.size(); index++) {

			if (cantactList.get(index).getFirstName().equals(fName)) {
				cantactList.remove(index);

				AddressBook addressBook = new AddressBook();
				addressBook.addCantact();

			} else {
				System.out.println(" There is no contact ");
			}
		}
	}

	public void deleteCantact() {

		Scanner deleteNameInput = new Scanner(System.in);
		System.out.println(" Enter the first name ");
		String deleteFirstName = deleteNameInput.nextLine();

		for (int increment = 0; increment < cantactList.size(); increment++) {
			if (cantactList.get(increment).getFirstName().equals(deleteFirstName)) {
				cantactList.remove(increment);
			} else {
				System.out.println(" Name does not exist");
			}
		}
	}

}