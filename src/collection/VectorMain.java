package collection;//[ 김찬영  2023-07-25 오후 05:07:59 ]

import java.util.Iterator;
import java.util.Vector;

public class VectorMain {

	public VectorMain() {
		Vector<String> v = new Vector<String>();
		System.out.println("백터 크기 = "+ v.size()); // 항목 개수, 0
		System.out.println("백터 용량 = "+ v.capacity()); // 담을수 있는 용량. 10개
		System.out.println();
		
		for(int i =1; i<=10; i++) {
			v.add(i+""); //이러면 문자열로 들어감.
		}
		
		
		for(int i =0; i<10; i++) {
			System.out.print(v.get(i)+ "   ");
		}
		System.out.println();
		System.out.println("백터 크기 = "+ v.size()); // 항목 개수, 0
		System.out.println("백터 용량 = "+ v.capacity()); // 담을수 있는 용량. 10개
		System.out.println();
		
		System.out.println("항목 1개 추가");
		v.add("5"); //중복허용.
		
		for(int i =0; i<v.size(); i++) {
			System.out.print(v.get(i)+ "   ");
		}//for
		System.out.println();
		System.out.println("백터 크기 = "+ v.size()); // 항목 개수, 0
		System.out.println("백터 용량 = "+ v.capacity()); // 담을수 있는 용량. 10개
		System.out.println();
		
		System.out.println("마지막 항목 삭제");
		// v.remove("5"); - 앞에있는 "5"가 제거
		v.remove(10); // 10번째 인덱스 가 제거됨.
		
		Iterator<String> it = v.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		new VectorMain();
		// 자주 쓰이진 않음
	}
}
