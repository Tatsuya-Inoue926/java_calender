
public class AppTest03 {

	public static void main(String[] args) {
		Calendar calendar = new Calendar();

		for (int year = 2015; year <= 2016; year++) {
			 for (int month = 1; month <= 12; month++) {
			 System.out.printf("%4d 年%2d 月の日数は%2d 日です¥n",
			 year, month, calendar.monthDays(year, month));
			 System.out.println();
			 }

		}

	}

}
