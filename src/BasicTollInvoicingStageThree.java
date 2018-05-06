/*
 * Name: Jake Duran Zerafa
 * Student ID: s3679109
 * 
 */

import java.util.*;
public class BasicTollInvoicingStageThree 
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
		String vehicleType;
		double sectorRate;
		String tripTime = "";
		double adjustedSectorRate;
		String menu;
		String exitMenu = "";
		String recordTrip="";
		String recordBreakdown="";
		String breakdown = null;
		String trip = null;
		String tripDate = null;
		int entryPoint = 0;
		int exitPoint = 0;
		String breakdownDate = null;
		int breakdownSector = 0;
		double recoveryCost = 0;
		double tollCharge;
		double totalTollCharge = 0;
		double totalBreakdownCharge = 0;
		
		//Declare and initialize constants
		final double MOTORCYCLE_RATE = 1.40;
		final double CAR_RATE = 2.40;
		final double LCV_RATE = 3.80;
		final double HCV_RATE = 7.20;
		
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
		System.out.print("Enter Vehicle Type (M, C, LCV, HCV): ");
		vehicleType = input.next();
		
		switch (vehicleType.toUpperCase())
		{
			case "M":
			{
				sectorRate = MOTORCYCLE_RATE;
				
				//Data entry menu for entering trips and breakdowns
				while (exitMenu.equalsIgnoreCase("X") == false)
				{
					System.out.println();
					System.out.println("Toll Road Data Entry Menu");
					System.out.println("--------------------------------------------------");
					System.out.println();
					System.out.println("A - Record Trip");
					System.out.println("B - Record Breakdown Incident");
					System.out.println("X - Exit");
					System.out.println();
					
					System.out.print("Enter Your Selection: ");
					menu = input.next();
					
					switch (menu.toUpperCase())
					{
						case "A":
							System.out.print("Enter Trip Date: ");
							tripDate = input.next();
							System.out.print("Enter Entry Point: ");
							entryPoint = input.nextInt();
							System.out.print("Enter Exit Point: ");
							exitPoint = input.nextInt();
							break;
						case "B":
							System.out.print("Enter Breakdown Incident Date: ");
							breakdownDate = input.next();
							System.out.print("Enter Sector Breakdown Occurred In: ");
							breakdownSector = input.nextInt();
							System.out.print("Enter Vehicle Recovery Cost: ");
							recoveryCost = input.nextInt();
							break;
						case "X":
							System.out.print("Exiting Data Entry Menu...");
							System.out.println();
							exitMenu = "X";
							break;
						default:
							System.out.print("Error...Enter a valid choice!");
							break;
					}
					
					//record and calculate trips and breakdowns
					if(menu.equalsIgnoreCase("A"))
					{
						tollCharge = Math.abs(exitPoint-entryPoint)* sectorRate;
						
						trip = String.format("- Trip on %s from sector %d to sector %d at rate $%.2f (toll charge: $%.2f)\n",
								tripDate, entryPoint, exitPoint, sectorRate, tollCharge);
						
						recordTrip = recordTrip.concat(trip);
						totalTollCharge = totalTollCharge + tollCharge;		
					} 
					else if (menu.equalsIgnoreCase("B")) 
					{
						breakdown = String.format("- Breakdown on %s in sector %d (recovery cost: $%.2f)\n", 
								breakdownDate, breakdownSector, recoveryCost);
						
						recordBreakdown = recordBreakdown.concat(breakdown);
						totalBreakdownCharge = totalBreakdownCharge + recoveryCost;
					}	
				}
				break;
			}
			case "C":
			{
				sectorRate = CAR_RATE;
				
				//Data entry menu for entering trips and breakdowns
				while (exitMenu.equalsIgnoreCase("X") == false)
				{
					System.out.println();
					System.out.println("Toll Road Data Entry Menu");
					System.out.println("--------------------------------------------------");
					System.out.println();
					System.out.println("A - Record Trip");
					System.out.println("B - Record Breakdown Incident");
					System.out.println("X - Exit");
					System.out.println();
					
					System.out.print("Enter Your Selection: ");
					menu = input.next();
					
					switch (menu.toUpperCase())
					{
						case "A":
							System.out.print("Enter Trip Date: ");
							tripDate = input.next();
							System.out.print("Enter Entry Point: ");
							entryPoint = input.nextInt();
							System.out.print("Enter Exit Point: ");
							exitPoint = input.nextInt();
							break;
						case "B":
							System.out.print("Enter Breakdown Incident Date: ");
							breakdownDate = input.next();
							System.out.print("Enter Sector Breakdown Occurred In: ");
							breakdownSector = input.nextInt();
							System.out.print("Enter Vehicle Recovery Cost: ");
							recoveryCost = input.nextInt();
							break;
						case "X":
							System.out.print("Exiting Data Entry Menu...");
							System.out.println();
							exitMenu = "X";
							break;
						default:
							System.out.print("Error...Enter a valid choice!");
							break;
					}
					
					//record and calculate trips and breakdowns
					if(menu.equalsIgnoreCase("A"))
					{
						tollCharge = Math.abs(exitPoint-entryPoint)* sectorRate;
						
						trip = String.format("- Trip on %s from sector %d to sector %d at rate $%.2f (toll charge: $%.2f)\n", 
								tripDate, entryPoint, exitPoint, sectorRate, tollCharge);
						
						recordTrip = recordTrip.concat(trip);
						totalTollCharge = totalTollCharge + tollCharge;		
					} 
					else if (menu.equalsIgnoreCase("B")) 
					{
						breakdown = String.format("- Breakdown on %s in sector %d (recovery cost: $%.2f)\n",
								breakdownDate, breakdownSector, recoveryCost);
						
						recordBreakdown = recordBreakdown.concat(breakdown);
						totalBreakdownCharge = totalBreakdownCharge + recoveryCost;
					}	
				}
				break;
			}
			case "LCV":
			{
				sectorRate = LCV_RATE;
				
				//Data entry menu for entering trips and breakdowns
				while (exitMenu.equalsIgnoreCase("X") == false)
				{
					System.out.println();
					System.out.println("Toll Road Data Entry Menu");
					System.out.println("--------------------------------------------------");
					System.out.println();
					System.out.println("A - Record Trip");
					System.out.println("B - Record Breakdown Incident");
					System.out.println("X - Exit");
					System.out.println();
					
					System.out.print("Enter Your Selection: ");
					menu = input.next();
					
					switch (menu.toUpperCase())
					{
						case "A":
							System.out.print("Enter Trip Date: ");
							tripDate = input.next();
							System.out.print("Enter Entry Point: ");
							entryPoint = input.nextInt();
							System.out.print("Enter Exit Point: ");
							exitPoint = input.nextInt();
							break;
						case "B":
							System.out.print("Enter Breakdown Incident Date: ");
							breakdownDate = input.next();
							System.out.print("Enter Sector Breakdown Occurred In: ");
							breakdownSector = input.nextInt();
							System.out.print("Enter Vehicle Recovery Cost: ");
							recoveryCost = input.nextInt();
							break;
						case "X":
							System.out.print("Exiting Data Entry Menu...");
							System.out.println();
							exitMenu = "X";
							break;
						default:
							System.out.print("Error...Enter a valid choice!");
							break;
					}
					
					//record and calculate trips and breakdowns
					if(menu.equalsIgnoreCase("A"))
					{
						tollCharge = Math.abs(exitPoint-entryPoint)* sectorRate;
						
						trip = String.format("- Trip on %s from sector %d to sector %d at rate $%.2f (toll charge: $%.2f)\n",
								tripDate, entryPoint, exitPoint, sectorRate, tollCharge);
						
						recordTrip = recordTrip.concat(trip);
						totalTollCharge = totalTollCharge + tollCharge;		
					} 
					else if (menu.equalsIgnoreCase("B")) 
					{
						breakdown = String.format("- Breakdown on %s in sector %d (recovery cost: $%.2f)\n",
								breakdownDate, breakdownSector, recoveryCost);
						
						recordBreakdown = recordBreakdown.concat(breakdown);
						totalBreakdownCharge = totalBreakdownCharge + recoveryCost;
					}	
				}
				break;
			}
			case "HCV":
			{
				sectorRate = HCV_RATE;
				System.out.print("Enter Trip Time (Peak, Off-Peak or Night): ");
				tripTime = input.next();
				
				//Determine trip time and adjust sector rate
				if (tripTime.equalsIgnoreCase("Peak"))
				{
					adjustedSectorRate = (sectorRate + (sectorRate * 0.4));
				}
				else if (tripTime.equalsIgnoreCase("Off-Peak"))
				{
					adjustedSectorRate = (sectorRate - (sectorRate * 0.3));
				}
				else
				{
					adjustedSectorRate = sectorRate;
				}
				
				//Data entry menu for entering trips and breakdowns
				while (exitMenu.equalsIgnoreCase("X") == false)
				{
					System.out.println();
					System.out.println("Toll Road Data Entry Menu");
					System.out.println("--------------------------------------------------");
					System.out.println();
					System.out.println("A - Record Trip");
					System.out.println("B - Record Breakdown Incident");
					System.out.println("X - Exit");
					System.out.println();
					
					System.out.print("Enter Your Selection: ");
					menu = input.next();
					
					switch (menu.toUpperCase())
					{
						case "A":
							System.out.print("Enter Trip Date: ");
							tripDate = input.next();
							System.out.print("Enter Entry Point: ");
							entryPoint = input.nextInt();
							System.out.print("Enter Exit Point: ");
							exitPoint = input.nextInt();
							break;
						case "B":
							System.out.print("Enter Breakdown Incident Date: ");
							breakdownDate = input.next();
							System.out.print("Enter Sector Breakdown Occurred In: ");
							breakdownSector = input.nextInt();
							System.out.print("Enter Vehicle Recovery Cost: ");
							recoveryCost = input.nextInt();
							break;
						case "X":
							System.out.print("Exiting Data Entry Menu...");
							System.out.println();
							exitMenu = "X";
							break;
						default:
							System.out.print("Error...Enter a valid choice!");
							break;
					}
					
					//record and calculate trips and breakdowns
					if(menu.equalsIgnoreCase("A"))
					{
						tollCharge = Math.abs(exitPoint-entryPoint)* adjustedSectorRate;
						
						trip = String.format("- %s Trip on %s from sector %d to sector %d at rate $%.2f (toll charge: $%.2f)\n",
								tripTime, tripDate, entryPoint, exitPoint, adjustedSectorRate, tollCharge);
						
						recordTrip = recordTrip.concat(trip);
						totalTollCharge = totalTollCharge + tollCharge;		
					} 
					else if (menu.equalsIgnoreCase("B")) 
					{
						breakdown = String.format("- Breakdown on %s in sector %d (recovery cost: $%.2f)\n",
								breakdownDate, breakdownSector, recoveryCost);
						
						recordBreakdown = recordBreakdown.concat(breakdown);
						totalBreakdownCharge = totalBreakdownCharge + recoveryCost;
					}	
				}
				break;
			}
		}
		
		//Display results to the screen
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
		System.out.println("Toll Charges:");
		System.out.println();
		System.out.println(recordTrip);
		System.out.printf("(Toll charge total: $%.2f)\n", totalTollCharge);
		System.out.println();
		System.out.println("Breakdown charges:");
		System.out.println();
		System.out.println(recordBreakdown);
		System.out.printf("(Breakdown charge total: $%.2f)\n", totalBreakdownCharge);
		System.out.println();
		System.out.printf("Toll invoice total: %66.2f", (totalTollCharge + totalBreakdownCharge) );
		
	}
}
