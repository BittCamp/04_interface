package collection;//[ 김찬영  2023-07-24 오후 03:47:57 ]

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {
	
	public SetMain() {
		Set<String> set = new HashSet<String>();
		set.add("호랑이");
		set.add("사자");
		set.add("호랑이"); //반복되는건 들어가지 않는다.
		set.add("기린");
		set.add("코끼리");  
		
		Iterator it = set.iterator(); // 메소드를 이용하여 생성. 접근지정자.
		while(it.hasNext()) {
			System.out.println(it.next());
		}//while 
	}
	
	public static void main(String[] args) {
		new SetMain();
	}


}
