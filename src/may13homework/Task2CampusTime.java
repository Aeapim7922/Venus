package may13homework;

public class Task2CampusTime {
	public static void main(String[] args) {

		int time = 9;

		boolean isOpen = ((time >= 8) && (time <= 23));

		if (isOpen) {
			System.out.println("Open");

		} else {
			System.out.println("Closed");

		}

}
}
