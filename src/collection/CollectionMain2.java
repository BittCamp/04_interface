package collection;//[ 김찬영  2023-07-24 오후 03:35:07 ]

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMain2 {
	public CollectionMain2(){
		ArrayList<String> list = new ArrayList(); // 부모 = 자식
		list.add("호랑이");
		list.add("사자");
		list.add("호랑이"); // 중복 허용 X , 순서 X 
		//list.add(25);
		//list.add(43.8);
		list.add("기린");
		list.add("코끼리"); 
		
		for(int i=0; i<list.size(); i++) {// list.size(); 항목크기 구하는것 배열.len
			System.out.println(list.get(i));
		}// for
		System.out.println("----------------");
		
		for(String str : list) { //<String> list 스트링타입
			System.out.println(str);
		}//for
	}
	
	public static void main(String[] args) {
		new CollectionMain2();
	}
}
