
public class Array05 {

	public static void main(String[] args) {
		// 2차원 배열의 초기값 설정
		
		int score[][] = new int[][] {{8,9,3},
									{90,73,81},
									{50,9,80}};
		int data[][] = {{90,50,60},
						{50,50,60},
						{98,80,70},
						{80,90,50}};
		String title[]= {"국어","영어","수학","총점","평균"};
		//확장된 반목문
		//	데이터 타입의 변수 :	배열, 컬렉션
		for(String t: title) {
			System.out.print(t+"\t");
		}
		System.out.println();
		for(int i=0; i<data.length; i++) {//행
			
			int tot=0;
			for(int j=0; j<data[i].length; j++) {//열
				System.out.print(data[i][j]+"\t");
				tot += data[i][j];
			}
			int ave = tot/3;
						
			System.out.print(tot+"\t"+ave);
			System.out.println();
		}
	}

}
