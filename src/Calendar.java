
public class Calendar {
	
	int wd;
	
	public int weekDay(int year, int month, int day) {
		if( month == 1 || month == 2) {
			year = year -1;
			month = month + 12;
			wd = (int)((year + (int)(year/4)- (int)(year/100) + (int) (year / 400) + (int)((2.6 * month) + 1.6) + day)) % 7;	
		}else {
			wd = (int)((year + (int)(year/4)- (int)(year/100) + (int) (year / 400) + (int)((2.6 * month) + 1.6) + day)) % 7;
		}
		return wd;
	}
	
	public boolean isLeapYear(int year) {
		if (year % 4 == 0) {
            if ((year % 100) == 0) {
                if ((year % 400) == 0) {
                    return true;	// うるう年
                }
            } else {
                return true;	// うるう年
            }
        }
		return false;
	}
	
	public int monthDays(int year, int month) {
		if((!isLeapYear(year)) && month == 2) {
			return 28;
		}else if ((isLeapYear(year)) && month == 2) {
			return 29;
		}else if(month == 4 || month == 6 || month == 9 || month == 11) {
			return 30;
		}else {
			return 31;
		}
	}
	
	public void print(int year, int month) {
		System.out.println(year + "年" + month + "月" + "のカレンダー");
		System.out.println("---------------------");
		System.out.println(" 日 月 火 水 木 金 土 ");
		System.out.println("---------------------");
		
		for(int i = 0; i < weekDay(year, month, 1); i++) {
			if(weekDay(year, month, 1)== 0) {
				System.out.println("");
			}else {
				System.out.print("    ");
			}
		}
		
		for( int i = 1; i < monthDays(year, month)+ 1; i++) {
			
			System.out.printf("%3d ", i);
			if(weekDay(year, month, i) == 6) {
				System.out.println();
			}
		}
		//System.out.println(weekDay(year, month, 1));
		
	}

}
