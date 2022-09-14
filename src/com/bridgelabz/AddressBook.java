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
			public void editContact() {
				Scanner sc = new Scanner(System.in);
				System.out.println(" Enter the first name. ");
				String fName = sc.nextLine();

				for (int index = 0; index < cantactList.size(); index++) {

					if (cantactList.get(index).getFirstName().equals(fName)) {
						cantactList.remove(index);

						AddressBook addressBook = new AddressBook();
						addressBook.addCantact();

					} else {
						System.out.println(" There is no cantact.. ");
					}
				}
			}
	}