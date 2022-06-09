import java.util.Scanner;

public class ArrayEx01 {

	public static void main(String[] args) {
		/*
		 실행결과
		 국어점수 =80
		 영어점수=90
		 수학점수=80
		 총점=250 
		 
		 */
		Scanner scan = new Scanner(System.in);
		
		//제목을 배열에 저장하기
		String title[] = {"국어","영어", "수학","물리"};
		int score[] = new int[title.length]; //과목의 점수 저장
		
		for(int i=0; i<title.length; i++) { //i=0,1,2,3
			System.out.print(title[i]+"점수=");
			score[i] = scan.nextInt();
		}
		//총점 구하기
		int tot=0;
		for(int i=0; i<score.length;i++) {
			tot += score[i];
		}
		//평균구하기
		int ave = tot / title.length; //평균 = 총점/과목수
		
		System.out.println("총점=" + tot);
		System.out.println("평균=" + ave);
	}

}
