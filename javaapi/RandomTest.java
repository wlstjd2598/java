package basic02_api;

import java.util.Scanner;
import java.util.StringTokenizer;

public class EmailCheckEx {

	public static void main(String[] args) {
		/*
		 실행
		 이메일=
		 아이디=
		 도메인=nate.com
		 다시하시겠습니까(y.예, n.아니요)? y
		 
		 이메일=
		 잘못된 이메일 주소입니다.		 
		 */
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("이메일을 입력하세요=");
			String email = scan.nextLine();
			// 1. @ 없는 이메일 존재 X, 2.  .이 있어야한다
			// 3. @와 .이 붙어있으면 안된다. 4. .@ 순서로 되면 안된다.
			//@의 유무를 확인할때 indexOf  함수 활용
			int atMark = email.indexOf("@"); //@위치 찾기
			int point = email.indexOf(".");
			if(atMark<3 || point<atMark || Math.abs(atMark-point)>2) {//잘못된 이메일 찾기
				System.out.println(email+"은 잘못된 메일입니다.");
			}else {// 정상적인 이메일
				// split(), substring, StringTokenizer 사용하기
				/*split 사용
				String emailSplit[] = email.split("@");
				System.out.println("아이디="+ emailSplit[0]);
				System.out.println("도메인="+ emailSplit[1]);
				*/
				//substring
				/*String id = email.substring(0, atMark);
				String domain = email.substring(atMark+1);
				System.out.println("id="+ id);
				System.out.println("domain="+domain);*/
				//StringTokenizer
				StringTokenizer emailObj = new StringTokenizer(email,"@");
				String id = emailObj.nextToken();
				String domain = emailObj.nextToken();
				System.out.println("아이디="+ id);
				System.out.println("도메인="+domain);
			}
			System.out.print("계속하시겠습니까(y:예, n:아니오)??");
			if(!scan.nextLine().equalsIgnoreCase("y")) {
				System.out.println("The End....");
				break;
			}
			
		}while(true);
	}

}
