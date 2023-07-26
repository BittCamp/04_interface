package interface_;//[ 김찬영  2023-07-24 오후 01:36:54 ]

public class ComputeMain {
	
	public static void main(String[] args) {
		
		ComputeService cs = new ComputeService();
		cs.menu();  //호출
		System.out.println("프로그램종료");
	}
}
