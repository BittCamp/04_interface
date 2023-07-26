package collection; //[ 김찬영  2023-07-25 오후 03:07:01 ]
public class PersonDTO implements Comparable<PersonDTO>{ // Comparable<PersonDTO> 이 가진 추상메소드를 다 쓰겠다.
	private String name;
	private int age;
	
	public PersonDTO() {
	}

	public PersonDTO(String name, int age) { // 소스->Constructor 유싱 필드하면 자동으로 생성됨.
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() { // 이름과 나이로 오버라이딩 바꿨음.
		return name+"\t"+age;
	}

	@Override
	public int compareTo(PersonDTO p) { //비교대상자(this)가 더 크면(<) -1, 같다면(==) 0, 작으면(>) 1을 반환시켜줍니다.
		// 나이로 오름차순
		/*if(this.age < p.age) return -1;
		else if(this.age > p.age) return 1;
		else return 0;*/
		/*
		 나이로 내림차순
		 */
		if(this.age < p.age) return 1;
		else if(this.age > p.age) return -1;
		else return 0;
		
	}
	
}
