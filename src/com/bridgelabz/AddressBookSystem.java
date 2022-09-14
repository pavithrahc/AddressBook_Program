/**
 * 
 */
package com.bridgelabz;
import java.util.Scanner;
/**
 * @author PAVITHRA C
 *
 */
public class AddressBookSystem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddressBook addressBook = new AddressBook();
		Scanner sc = new Scanner(System.in);
		int exit = 1;
		while (exit == 1) {
			System.out.println(" Welcome to address book program ");
			System.out.println(" Select a choice : 1. Add 2.Edit  3. Exit");
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
				exit = 0;
				break;

			default:
				System.out.println(" Enter a valid choice");
				break;
			}
		}
		System.out.println(addressBook.cantactList);
	}

}



