
public class AppTest01 {

	public static void main(String[] args) {
		
		 int year = Integer.parseInt(args[0]);
		 int month = Integer.parseInt(args[1]);
		 int day = Integer.parseInt(args[2]);
		 
		 Calendar calendar = new Calendar();
		 
		 int wd = calendar.weekDay(year, month, day);
		 String[] s = {"日", "月", "火", "水", "木", "金", "土"};
		 System.out.printf("%d 年%d 月%d 日は%s 曜日です。",
		 year, month, day, s[wd]);

	}

}
