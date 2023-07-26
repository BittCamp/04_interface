package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class PersonSort {
	
	public static void main(String[] args) {
		String[] ar = {"orange","apple","banana","pear","peach","applemango"};
		
		System.out.print("정렬 전 = ");
		for(String data: ar) {
			System.out.print(data + " ");
		}
		System.out.println();
		
		Arrays.sort(ar); //Arrays 배열에 관련된 모든 메소드 가지고있음. 스테틱으로 선언되어있음. new시키지 않고 메소드에 접근가능함.
		
		System.out.print("정렬 후 = ");
		for(String data: ar) {
			System.out.print(data + " ");
		}
		System.out.println();
		System.out.println("---------------------------------");
		
		PersonDTO aa = new PersonDTO("홍길동",25);
		PersonDTO bb = new PersonDTO("프로도",40);
		PersonDTO cc = new PersonDTO("어피치",35);
		
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(aa);
		list.add(bb);
		list.add(cc);
		
		System.out.println("정렬 전");
		for( PersonDTO personDTO : list) { // 여기 담는 그릇은 PersonDTO만 담을게요. 라고 제네릭걸었다. 변수명은 클래스명과같게하되 소문자로
			System.out.println(personDTO); // 이렇게 하면 주소값으로만 떨어짐. 그런데 toString에 입력해주면 형식에 맞게 들어감.
			System.out.println(personDTO.getAge()+" "+personDTO.getName()); // 이렇게가 아니라 toString 오버라이딩 하면 편하다.
		}
		System.out.println();
		
		System.out.println("나이로 내림차순");
		Collections.sort(list); //< == 여기서 자동으로 정렬시키는기능함. sort 안에 Comparable 기능이 있음. 
								// 그래서 PersonDTO 안에 PersonDTO implements Comparable<PersonDTO> 이렇게 해준거임.
								//Collections 안에 sort 안에 Comparable이 있음.
								// Comparable을 안쓰면  list를 못씀.
		
		System.out.println("정렬 후 ");
		for(PersonDTO personDTO : list) {
			System.out.println(personDTO);// 16진수 주소값으로 나오게 하는게 원래 투스트링의 역할. personDTO=personDTO.toString 이 같은거다.
		}//for
		System.out.println();
		System.out.println("--------------------------");
		
		System.out.println("정렬 전");
		for( PersonDTO personDTO : list) { // 여기 담는 그릇은 PersonDTO만 담을게요. 라고 제네릭걸었다. 변수명은 클래스명과같게하되 소문자로
			System.out.println(personDTO); // 이렇게 하면 주소값으로만 떨어짐. 그런데 toString에 입력해주면 형식에 맞게 들어감.
			//System.out.println(personDTO.getAge()+" "+personDTO.getName()); // 이렇게가 아니라 toString 오버라이딩 하면 편하다.
		}
		System.out.println();
		
		System.out.println("이름으로 오름차순");
		Comparator<PersonDTO> com = new Comparator<PersonDTO>() { 
			@Override
			public int compare(PersonDTO p1, PersonDTO p2) { //구현
				//return p1.getName().compareTo(p2.getName()); //오름차순
				
				return p1.getName().compareTo(p2.getName()) * -1; // 오름차순을 내림차순으로 바꾸기
			}
		};
		
		Collections.sort(list,com);
		
		System.out.println("정렬 후");
		for( PersonDTO personDTO : list) { // 여기 담는 그릇은 PersonDTO만 담을게요. 라고 제네릭걸었다. 변수명은 클래스명과같게하되 소문자로
			System.out.println(personDTO); // 이렇게 하면 주소값으로만 떨어짐. 그런데 toString에 입력해주면 형식에 맞게 들어감.
			//System.out.println(personDTO.getAge()+" "+personDTO.getName()); // 이렇게가 아니라 toString 오버라이딩 하면 편하다.
		}
		System.out.println();
		
	}
}
