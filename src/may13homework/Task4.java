package may13homework;

public class Task4 {

	public static void main(String[] args) {

		double salaryInput = 130000;
		char married = 'A';
		int salaryAfterTax;
		int taxRate = 0;

		if (salaryInput >= 130000) {
			taxRate = 35;
			salaryAfterTax =(int) (salaryInput -  (salaryInput * taxRate / 100));

		} else if (salaryInput >= 100000 && salaryInput < 130000) {
			taxRate = 30;
			salaryAfterTax = (int) (salaryInput -  (salaryInput * taxRate / 100));

		} else if (salaryInput >= 80000 && salaryInput < 100000) {
			taxRate = 25;
			salaryAfterTax = (int) (salaryInput -  (salaryInput * taxRate / 100));

		} else {
			taxRate = 20;
			salaryAfterTax = (int) (salaryInput -  (salaryInput * taxRate / 100));
		}

		if (married == 'Y') {
			taxRate -= 5;
			salaryAfterTax = (int) (salaryInput -  (salaryInput * taxRate / 100));
		}

		System.out.println("Your Salary is " + salaryAfterTax);

	}

}


