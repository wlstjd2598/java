package basic02_api;

import java.util.Arrays;

public class StringTest {

	public static void main(String[] args) {
		String name = "홍길동";
		String name2 = "홍길동";
		
		String addr = new String("Seoul 강남구 역삼동(DONG)");
		String addr2 = new String("서울시 강남구 역삼동(dong)");
		
		// == : 같은가
		
		if(name == name2) {
			System.out.println("name과 name2는 같다");
		}else {
			System.out.println("name과 name2는 다르다");
		}
		if(addr == addr2) {
			System.out.println("addr과 addr2는 같다");
		}else {
			System.out.println("addr과 addr2는 다르다");
		}
		
		String addr3 = addr2;
		if(addr2 ==addr3) {
			System.out.println("addr2와 addr3는 같다");
			}else {
				System.out.println("addr2와 addr3는 다르다");
			}
		
		//equals() : 객체내의 값을 비교해준다.(대소문자 비교해준다.)
		
		boolean boo = addr.equals(addr2); // addr2.equals(addr)이랑 같음
		if(boo)	{
			System.out.println("addr과 addr2는 같다...");
			
		}else {
			System.out.println("addr과 addr2는 다르다...");
		}
		// equalsIgnoreCase() : 객체내의 값을 비교해주는데 대소문자는 구별하지 않는다.
		if(addr.equalsIgnoreCase(addr2)) {
			System.out.println("addr과 addr2는 같다");
		}else {
			System.out.println("addr과 addr2는 다르다");
		}
		
		String str = "A";
		str = str + "B";
		String str2 = str + 100;
		
		System.out.println("charAt()->"+ addr.charAt(5)); //index위치의 문자를 변환
		 addr = addr.concat(name);
		System.out.println("concat()->" + addr);
		
		
		
		String txt = "Hello!";
		byte txtCode[] = txt.getBytes();
		System.out.println(Arrays.toString(txtCode));
		
		int idx = addr.indexOf("강"); //addr : 서울시 강남구 역삼동(DONG) 홍길동
		System.out.println("indexOf->"+idx);
		System.out.println("lastIndexof->"+ addr.lastIndexOf("강"));//
		System.out.println("indexOf->" + addr.indexOf("강", 5)); //index 5부터 강이란 글자 찾기(못찾으면 -1)
		System.out.println("repeat->" + addr.repeat(3));
		
		addr = addr.replaceAll("강남구", "GangNamGu");
		System.out.println("replaceAll->"+ addr);
		
		String tel ="010-1234-5678";
		String telsplit[] = tel.split("-");
		System.out.print(Arrays.toString(telsplit));
		// addr -> Seoul GangNamGu 역삼동(DONG)홍길동
		// substring : 문자열에서 일부의 문자열을 얻을 떄
		String sub1 = addr.substring(6, 15); //index 6부터 14까지
		System.out.println("substring(int, int)->"+ sub1);
		String sub2 = addr.substring(20);//index20 부터 끝까지
		System.out.println("substring(int)->"+ sub2);
		
		System.out.println("lower->"+ addr.toLowerCase());//소문자로 출력
		System.out.println("upper->"+ addr.toUpperCase());//대문자로 출력
		
		// 
		String x = String.valueOf(5.3);
		System.out.println(x);
		
		char c[] = {'J','a','v','a'}; //"Java"
		System.out.println(c);
		System.out.println(String.valueOf(c));
		
		int d[] = {23, 45, 67, 88};
		System.out.println(d);
		
		String data = "		Test		 Programming	";
		System.out.println("data->"+ data.trim()+"?");//양쪽 공백을 없애줌
	}

}
