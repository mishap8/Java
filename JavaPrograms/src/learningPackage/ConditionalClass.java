package learningPackage;

public class ConditionalClass {

	public static String dayofWeek(int dayOfWeek) {

		String requestedDay = "";
		switch (dayOfWeek) {
		case 0:
			requestedDay = "Sunday";
			break;
		case 1:
			requestedDay = "Monday";
			break;
		case 2:
			requestedDay = "Tuesday";
			break;
		case 3:
			requestedDay = "Wednesday";
			break;
		case 4:
			requestedDay = "Thursday";
			break;
		case 5:
			requestedDay = "Friday";
			break;
		case 6:
			requestedDay = "Saturday";
			break;
		}
		return requestedDay;
	}

	public static boolean isWeekday(int dayOfWeek) {

		boolean weekDay = false;
		switch (dayOfWeek) {
		case 0:
			weekDay = false;
			break;
		case 1:
			weekDay = true;
			break;
		case 2:
			weekDay = true;
			break;
		case 3:
			weekDay = true;
			break;
		case 4:
			weekDay = true;
			break;
		case 5:
			weekDay = true;
			break;
		case 6:
			weekDay = false;
			break;
		}
		return weekDay;
	}

	public String noOfMonth(int noOfMonth) {

		String nameOfMonth = "";

		switch (noOfMonth) {
		case 1:
			nameOfMonth = "January";
			break;
		case 2:
			nameOfMonth = "Feburary";
			break;
		case 3:
			nameOfMonth = "March";
			break;
		case 4:
			nameOfMonth = "April";
			break;
		case 5:
			nameOfMonth = "May";
			break;
		case 6:
			nameOfMonth = "June";
			break;
		case 7:
			nameOfMonth = "July";
			break;
		case 8:
			nameOfMonth = "August";
			break;
		case 9:
			nameOfMonth = "September";
			break;
		case 10:
			nameOfMonth = "October";
			break;
		case 11:
			nameOfMonth = "November";
			break;
		case 12:
			nameOfMonth = "December";
			break;
		}
		return nameOfMonth;
	}

}
