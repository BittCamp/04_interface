package sungJuk;//[ 김찬영  2023-07-26 오후 12:33:09 ]ㄴ

import java.util.ArrayList;

public class SungJukList implements SungJuk {
    public void execute(ArrayList<SungJukDTO> arrayList) {
        System.out.println("\t번호\t이름\t국어\t영어\t수학\t총점\t평균");
        
        for(SungJukDTO sungjukDTO: arrayList) {
        	System.out.println(sungjukDTO);
        }
    }
}