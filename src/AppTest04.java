
public class AppTest04 {

	public static void main(String[] args) {
		
		 int year = Integer.parseInt(args[0]);
		 int month = Integer.parseInt(args[1]);
		 Calendar calendar = new Calendar();
		 calendar.print(year, month);

	}

}
