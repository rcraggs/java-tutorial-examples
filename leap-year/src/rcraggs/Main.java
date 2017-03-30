package rcraggs;

public class Main {

	private static final String THAT_IS_A_LEAP_YEAR = "That is a leap year";
	private static final String THAT_IS_NOT_LEAP_YEAR = "That is not leap year";

	public static void main(String[] args) {

		int year = 2000;
		
		String result = "";
		
		boolean isYearDivisibleBy4 = year % 4 == 0;
		boolean isYearDivisibleBy400 = year % 400 == 0;
		boolean isYearDivisibleBy100 = year % 100 == 0;
		
		if (isYearDivisibleBy4) {
			if (isYearDivisibleBy400) {				
				result = THAT_IS_A_LEAP_YEAR;
				
			}else if (isYearDivisibleBy100) {				
				result = THAT_IS_NOT_LEAP_YEAR;
				
			} else {				
				result = THAT_IS_A_LEAP_YEAR;
				
			}
		} else {
			result = THAT_IS_NOT_LEAP_YEAR;
		}
		
		System.out.println(result);
	}
}
