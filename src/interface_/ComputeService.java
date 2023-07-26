package interface_;//[ 김찬영  2023-07-24 오후 01:36:54 ]

import java.util.Scanner;

public class ComputeService implements Compute{
	
	public void disp() {}
	
	public void menu() {
		Scanner scan = new Scanner(System.in);
		Compute com = null; // 이렇게 인터페이스 잡아줌. 밑에서 오류나서 이렇게 널로 초기화해줌.
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("******************");
			System.out.println(" 	1. 합");
			System.out.println(" 	2. 차");
			System.out.println(" 	3. 곱");
			System.out.println(" 	4. 몫");
			System.out.println(" 	5. 종료");
			System.out.println("******************");
			System.out.println("   번호 : ");
			num = scan.nextInt();
			
			if(num==5) break;
			if(num==1) {
				//Sum sum = new Sum(); // 이렇게 1대1관계로 잡는거 안좋아한다. 결합도 100%
				com = new Sum();//부모 = 자식
			}else if(num==2) {
				com = new Sub();
			}else if(num==3) {
				com = new Mul();
			}else if(num==4) {
				com = new Div();
			}else {
				System.out.println("1~5번까지만 번호를 허용합니다.");
				continue;
			}
			com.disp();
			 // 자식 클래스 안에 .disp()에 계산식이 들어있음. 
		} //while	
	}// menu()
// 1.합 2.차 3.곱 4.몫 5. 종료 번호:


}
