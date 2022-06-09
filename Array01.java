
public class Array01 {

	public static void main(String[] args) {
		// 배열 선언하기
		// 초기값
		// 정수 : 0
		// 실수 : 0.0
		// 논리 : false
		// char :
		// String : null
		int kor[] = new int[10]; //초기값 0
		int [] eng;
		
		eng = new int[5]; //초기값 0 int 니까
		int[] math;
		String[] name = new String[10];//초기값은 null
		System.out.println(kor);
		//System.out.println(math);
		System.out.println(name);
		
		//배열에 접근하기
		kor[2] = 85;
		kor[6] = 90;
		
		name[1] = "홍길동";
		
		//배열의 크기(길이) ; kor.length
		for(int idx=0; idx < kor.length; idx++) { //0,1,2,3,4,5,6,7,8,9까지 만들어짐
			System.out.println("kor[+idx+]="+ kor[idx]);
		}
		for(int i=0; i<name.length; i++) {
			System.out.println("name["+i+"]=" +name[i]);
		}
	}

}
