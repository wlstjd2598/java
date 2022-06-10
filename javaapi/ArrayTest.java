package basic02_api;

import java.util.Arrays;
import java.util.Collections;

public class ArraysTest {

	public static void main(String[] args) {
		// Array클래스 : 배열을 이용해 처리한다.
		
		int data[]= {85, 23, 53, 64, 34, 62, 56, 99, 12, 21};
		int data3[] = {85, 23, 53, 34, 64, 62, 56, 99, 12, 21};
		//toString()
		
		System.out.println(Arrays.toString(data));
		
		//Arrays.sort(data); //오름차순 정렬
		//Arrays.sort(data,2,6); //index2 부터 6 전까지 오름차순
		//내림차순
		Integer data2[]= {85, 23, 53, 64, 34, 62, 56, 99, 12, 21};
		Arrays.sort(data2, Collections.reverseOrder());
		System.out.println("정렬후" +Arrays.toString(data2));
		
		//배열의 복사
		int copy[] = Arrays.copyOfRange(data, 2, 6);
		System.out.println("copy="+Arrays.toString(copy));
		
		System.out.println(Arrays.equals(data,data3));
	}

}
