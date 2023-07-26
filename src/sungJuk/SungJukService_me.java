package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukService_me implements SungJuk_me{
	
	@Override
	public void execute(ArrayList<SungJukDTO_me> arrayList) {}
	
	private ArrayList<SungJukDTO_me> arrayList = new ArrayList<SungJukDTO_me>();
	
	public void menu() {
	Scanner scan = new Scanner(System.in);
	SungJuk_me sungjuk = null;
		
	while(true) {
		System.out.println("***********");
		System.out.println("\t1.입력");
		System.out.println("\t2.출력");
		System.out.println("\t6.종료");
		System.out.println("***********");
		System.out.println("\t 입력하실 번호 :");
		int num = scan.nextInt();
		if(num == 6) break;
		if( num == 1) {
			sungjuk = new SungJukInsert_me();
			sungjuk.execute(arrayList);
		}else if(num == 2) {
			sungjuk = new SungJukList_me();
			sungjuk.execute(arrayList);
		}else {
			System.out.println(" 1 입력 2 출력 6 종료 中 택 1");
		}
		continue;
		}//while
	}


}

/*
 ***********
		1.입력
		2.출력
		6.종료
 ***********
		번호 : 
 */		