package application;

import java.util.Locale;
import java.util.Scanner;

import entities.PersonalAccount;


public class Program01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter account number: ");
		int accNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char valid = sc.next().charAt(0);
		double balance = 0.0;
		if(valid == 'y') {
			System.out.print("Enter initial deposit value: ");
			 balance = sc.nextDouble();
		}
		else {
			balance = 0.0;
		}
		
		PersonalAccount person = new PersonalAccount(name, accNumber, balance);
	
		
		System.out.println();
		System.out.println("Account data: " + person);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		person.depositAccount(deposit);
		
		System.out.println();
		System.out.println("Update account data: " + person);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		person.withdrawAccount(withdraw);
		
		System.out.println();
		System.out.println("Update account data: " + person);
		
		
		
		sc.close();
	}

}
