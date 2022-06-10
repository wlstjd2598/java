package basic02_api;

public class StringBufferTest {

	public static void main(String[] args) {
		// String : 연산이 적은 데이터 스레드(동기화) 가능
		// StringBuffer : 연산이 많고 스레드(동기화) 가능
		// StringBuilder : 연산이 많고 동기화를 고려하지 않을떄
		
		//StringBuffer sb = new StringBuffer(30); 30바이트 확보
		StringBuffer sb = new StringBuffer("JAVA Programing Test........");
		
		sb.append("잘되냐?"); //마지막에 문자 추가, append 끝에다가 뭘 추가하는 단어
		sb.insert(4, "(자바)"); //insert는 삽입
		//문자열을 지우기 
		//JAVA(자바) Programing Test........잘되냐?
		sb.delete(5, 10);
		System.out.println(sb);
		
//		sb.reverse();
	//	System.out.println(sb); //글씨를 거꾸로 부터 출력시켜줌
		//확보한 메모리 확인
		System.out.println("capacity->"+ sb.capacity());
		
		StringBuffer first = new StringBuffer("Test");
		StringBuffer second = new StringBuffer("JAVA");
		
		//equals
		// compareTo() : 문자와 문자를 비교하여 정수를 리턴해준다.
		int result = first.compareTo(second);
		int result2 = second.compareTo(first);
		System.out.println("result->"+ result+", result2->"+result2);
		
		// 결과가 0: 두 객체의 데이터는 같다
		// 양수 : 왼쪽객체의 데이터가 크다.
		// 음수 : 왼쪽객체의 데이터가 작다.
	}

}
