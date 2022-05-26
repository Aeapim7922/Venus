package may13homework;

public class task1salaryCaculator {
	
		public static void main(String[] args) {

			int hourlyRate = 50;
			int  weeklyHours = 45;
			int stateTaxRate = 6;
			int federalTaxRate = 26;
			
			int salaryBeforeTax = hourlyRate * weeklyHours * 52;
			int stateTax = salaryBeforeTax * stateTaxRate/100;
			int federalTax = salaryBeforeTax * federalTaxRate/100;
			int totalTax = stateTax + federalTax;
			int salaryAfterTax = salaryBeforeTax - federalTax - stateTax;
			
			
			
			System.out.println("Gross Pay is: " + salaryBeforeTax);
			System.out.println("Federal Tax is: " + federalTax);
			System.out.println("State Tax is: " + stateTax);
			System.out.println("Total Tax is: " + totalTax);
			System.out.println("Net Income is: " + salaryAfterTax);

		}

	}




