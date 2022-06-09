import java.util.Calendar;
import java.util.Scanner;

public class CalendarEx2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for(;;) {
		System.out.println("년도=");
		int year = scan.nextInt();
		System.out.print("월=");
		int month =scan.nextInt();
		
		if(month>=1 && month<=12) {
			
				System.out.printf("\t\t%d년 %d월\n", year, month);
				System.out.println("일\t월\t화\t수\t목\t금\t토");
		
				Calendar date = Calendar.getInstance();
				date.set(year, month-1, 1);
		
				int week = date.get(Calendar.DAY_OF_WEEK);//요일 구하기
				
				//마지막날
				// 30: 4,6,9,11
				// 31: 1,3,5,7,8,10,12
				
				int lastDay = 31;
				switch(month) {
				case 4:
				case 6:
				case 9:
				case 11: lastDay = 30;
				break;
				case 2: //2월
					// 년도가 4의 배수이고 100으로 나눠지지 않을 떄 윤년
					// 년도가 400의 배수이면 윤년
					if(year%4==0 && year%100!=0 ||year%400==0) {
						lastDay = 29;
					}else {
						lastDay =28;
					}		
				}
				//달력출력
				//공백
				for(int space=1;space<week; space++) {
					System.out.print("\t");
				}
				//날짜
				for(int day =1;day<=lastDay; day++) {
					System.out.print(day+"\t");
					if( (week-1+day)%7==0) {
						System.out.println();
					}
				}
				System.out.println();
		}else {
			System.out.println("월을 잘못입력했습니다.");
		}
		}
	}
}