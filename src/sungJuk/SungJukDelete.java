package sungJuk;//[ 김찬영  2023-07-26 오후 12:33:00 ]

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SungJukDelete implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("삭제할 이름 입력 : ");
		String name = scan.next();
		int sw = 0;
		/* error = java.util.ConcurrentModificationException
		  for( SungJukDTO sungJukDTO : arrayList ) {
			if( sungJukDTO.getName().equals(name)) {
				sw = 1;
				arrayList.remove(sungJukDTO);
			} //if
		
		}//for
		*/
		Iterator<SungJukDTO> it = arrayList.iterator(); // 메소드를 이용하여 생성.
		while(it.hasNext()) { //다음이 없을떄 까지 반복.
			SungJukDTO dto = it.next(); //현재 위치에 항목을 꺼내서 보관 하고 다음으로 이동.
			if(dto.getName().equals(name)) {
				sw = 1;
				it.remove(); //  아까 저장한 곳의 항목을 제거.  it.next()가 반환하는 항목을 제거.현재 위치를 지우는게 아니라 아까 반환해 놨던거를 지우는거.
			}
		}
		if(sw ==0 )
			System.out.println("회원의 정보가 없습니다.");
		else
			System.out.println("삭제 완료");
		
	}

}
