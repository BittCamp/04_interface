package sungJuk;

import java.util.ArrayList;

public class SungJukList_me implements SungJuk_me {
    public void execute(ArrayList<SungJukDTO_me> arrayList) {
        System.out.println("\t번호\t이름\t국어\t영어\t수학\t총점\t평균");
        for (SungJukDTO_me sungJukDTO : arrayList) {
            System.out.println(
                    "\t" + sungJukDTO.getNo()
                    + "\t" + sungJukDTO.getName()
                    + "\t" + sungJukDTO.getKorea()
                    + "\t" + sungJukDTO.getEnglish()
                    + "\t" + sungJukDTO.getMath()
                    + "\t" + sungJukDTO.getTotal()
                    + "\t" + sungJukDTO.getAverage()
            );
        }
    }
}