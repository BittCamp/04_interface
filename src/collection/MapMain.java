package collection;//[ 김찬영  2023-07-25 오후 02:15:11 ]

import java.util.HashMap;
import java.util.Map;

public class MapMain {
	
	public MapMain() {
		Map<String,String> map = new HashMap<String,String>(); 
		// Map 클래스 추상메소드가 20몇개 있다. implements못한다. 
		// 추상 20개 다안쓰면 오류난다.
		// 그래서 다른 클래스 써야한다. HashMap이란게 대신 상속해준다.
		//스프링단계에서 정말많이씀.
		map.put("book101", "백설공주");
		map.put("book201", "인어공주");
		map.put("book102", "백설공주"); //Value 중복 허용
		map.put("book301", "피오나"); 
		map.put("book101", "엄지공주"); //Key 중복 허용
		
		System.out.println(map.get("book101"));
		System.out.println(map.get("book102"));
		System.out.println(map.get("book501")); //null
	}
	
	public static void main(String[] args) {
		new MapMain();
	}
}
