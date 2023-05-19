
public class AppTest02 {

	public static void main(String[] args) {
		
			 int[] years = {1900, 2000, 2001, 2002, 2003, 2004};
			 Calendar calendar = new Calendar();
			 for (int year : years) {
			 if (calendar.isLeapYear(year)) {
			 System.out.println(year + "年はうるう年");
			 } else {
			 System.out.println(year + "年はうるう年ではない");
			 }
		 }


	}

}
