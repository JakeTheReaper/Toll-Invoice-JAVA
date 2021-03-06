/*
 * Name: Jake Duran Zerafa
 * Student ID: s3679109
 * 
 */

import java.util.*;
public class BasicTollInvoicingStageOne 
{
	public static void main(String[] args) 
	{
		//Declare variables
		String custTitle;
		String custName;
		String custEmail;
		String mobileNo;
		String homeAddress;
		String regoState;
		String licencePlate;
		String vehicle;
		String creditCardNo;
		String cardExpiry;
		int securityCode;
		int sectorsTravelled;
		double sectorRate = 2.50;
		
		//Create Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("*** Toll Road Invoicing System ***");
		System.out.println();
		
		//Get user input;
		System.out.print("Enter Customer Title: ");
		custTitle = input.nextLine();
		
		System.out.print("Enter Customer Name: ");
		custName = input.nextLine();
		
		System.out.print("Enter Customer Email Address: ");
		custEmail = input.nextLine();
		
		System.out.print("Enter Customer Mobile Phone No: ");
		mobileNo = input.nextLine();
		
		System.out.print("Enter Customer Home Address: ");
		homeAddress = input.nextLine();
		
		System.out.println();
		System.out.print("Enter Registration State: ");
		regoState = input.nextLine();
		
		System.out.print("Enter Licence Plate No: ");
		licencePlate = input.nextLine();
		
		System.out.print("Enter Make / Model Of Vehicle: ");
		vehicle = input.nextLine();
		
		System.out.println();
		System.out.print("Enter Credit Card No: ");
		creditCardNo = input.nextLine();
		
		System.out.print("Enter Expriry Date: ");
		cardExpiry = input.nextLine();
		
		System.out.print("Enter Security Code: ");
		securityCode = input.nextInt();
		
		System.out.println();
		System.out.print("Enter Sectors Travelled: ");
		sectorsTravelled = input.nextInt();
		
		//Display results to screen
		System.out.println();
		System.out.println("Customer Details:");
		System.out.println();
		System.out.printf("Name: %80s\n", custTitle + " " +custName);
		System.out.printf("Email Address: %71s\n", custEmail);
		System.out.printf("Mobile Phone Number: %65s\n", mobileNo);
		System.out.printf("Home Address: %72s\n", homeAddress);
		System.out.println();
		System.out.println("Vehicle Details:");
		System.out.println();
		System.out.printf("Registration State: %66s\n", regoState);
		System.out.printf("Licence Plate Number: %64s\n", licencePlate);
		System.out.printf("Make / Model: %72s\n", vehicle);
		System.out.println();
		System.out.println("Card Details:");
		System.out.println();
		System.out.printf("Credit Card No: %70s\n", creditCardNo);
		System.out.printf("Expiry Date: %73s\n", cardExpiry);
		System.out.printf("Security Code: %71s\n", securityCode);
		System.out.println();
		System.out.println("Trip Details:");
		System.out.println();
		System.out.printf("Sectors Travelled: %67s\n", sectorsTravelled);
		System.out.printf("Sector Rate: %73.2f\n", sectorRate);
		System.out.println();
		System.out.printf("Total Invoice Charged: %63.2f\n", (sectorsTravelled*sectorRate));	
	}
}
