package collection;//[ 김찬영  2023-07-25 오후 03:07:01 ]

import java.util.ArrayList;

public class PersonMain {
	
	public ArrayList<PersonDTO> init() {
		PersonDTO aa = new PersonDTO("홍길동",25);
		PersonDTO bb = new PersonDTO("어피치",28);
		PersonDTO cc = new PersonDTO("프로도",33);
		
		ArrayList<PersonDTO> list = new ArrayList();
		list.add(aa);
		list.add(bb);
		list.add(cc);
		list.remove(0); //리무브도 가능하다.
		
		return list;
	}

	public static void main(String[] args) {
		// init() 호출 하시오.
		// 홍길동 25
		// 어피치 28
		// 프로도 33
		PersonMain personMain = new PersonMain();
		
		ArrayList<PersonDTO> list = personMain.init(); //호출
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		//System.out.println(list.get(2));
		
		System.out.println();
		System.out.println(list.get(0).getName() +"\t" + list.get(0).getAge() );
		System.out.println(list.get(1).getName() +"\t" + list.get(1).getAge() );
		//System.out.println(list.get(2).getName() +"\t" + list.get(2).getAge() );
		System.out.println();		
		
		for(PersonDTO dto : list) { // ArrayList안에 타입이 PersonDTO 타입임.
			System.out.println(dto.getName()+"\t" + dto.getAge());
		}
	}
}
