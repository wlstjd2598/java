import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		/*
		 화폐(동전) 수 구하기
		 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 
		  
		  실행
		  금액=254535
		  50000원 5장
		  1000원 4장
		  500원 1개
		  10원 3개
		  5원 1개
		 
		 */
		Scanner data = new Scanner(System.in);
		
		
		do {
			System.out.print("금액="); //금액 입력
			int money = data.nextInt();
			
			//화폐 계산과 출력
			int won = 50000;
			int next = 5; //다음 화폐를 만들떄 사용할 데이터
			
			while(money>0) {
			int count = money / won; //5만원 짜리 화폐의 갯수
			//출력
			if(count>0) {
				System.out.print(won+"원"+count);
				String danwi = (won>=1000)?"장":"개";
				System.out.println(danwi);
			}
			//남은 금액 계산하기
			money -= count*won;
			//다음화폐단위 만들기(만원)
			won = won / next; 
			//다음에 나눌 값을 구한다.
			if(next==5) {
				next=2;
			}else {
				next =5;
			}
			
			
			}
			///////////////////
			System.out.print("계속하시겠습니까?? (1.예, 2. 아니요)");
						
			if(data.nextInt() !=1)
				break;
		}while(true);
		
		System.out.println("프로그램이 종료되었습니다.");
	}
	}


