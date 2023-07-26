package collection;//[ 김찬영  2023-07-24 오후 03:34:55 ]

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMain {
	public CollectionMain(){//Collection은 인터페이스클래스 <- 실체없으.
		Collection coll = new ArrayList(); // 부모 = 자식 . 인터페이스는 뉴가 안된다. 그래서 다른 클래스로 잡았다.
		coll.add("호랑이");
		coll.add("사자");
		coll.add("호랑이"); // 중복 허용 , 순서
		coll.add(25);
		coll.add(43.8);
		coll.add("기린");
		coll.add("코끼리"); 
		
		Iterator it = coll.iterator(); // Iterator 는 지휘봉.막대라고 보면된다.인퍼페이스라 생성이 안되니까 메소드를 이용하여 생성.
		
		//it.hasNext(); // 만약에 항목이 있으면 T, 없으면 F
		//it.next(); // 현재 위치에서 항목을 꺼내 저장하고, 다음 항목으로 이동.
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}//while - 항목없을때까지 반복
	}//기본생성자 생성.
	
	public static void main(String[] args) {
		new CollectionMain();
	}
}
