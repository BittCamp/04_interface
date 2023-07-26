package interface_;//[ 김찬영  2023-07-24 오후 01:36:54 ]

//public class InterMain implements InterA , InterB {  // class InterMain implements InterA 이렇게 하면 부모꺼 오버라이딩 해야되나.. 안할려면 오류나서 abstract 클래스로 선언해야함.
public class InterMain implements InterC{  // 이렇게도 가능하다. 	InterC 가 4개 추상메소드를 다 가지기 때문에.
	public void aa() {}
	public void bb() {}

	public void cc() {}
	public void dd() {}	
	
	public static void main(String[] args) {
		
	}
}
