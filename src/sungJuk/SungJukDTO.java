package sungJuk;//[ 김찬영  2023-07-26 오후 12:33:09 ]ㄴ

public class SungJukDTO implements Comparable<SungJukDTO>{ //Comparable<SungJukDTO> 는 SungJukDTO를 가지고 sort하겠다.

	private int no;
	private String name;
	private int kor ,eng, math, tot;
	private double avg; 	//순서와 이름은 똑같이 잡는다. ~DTO.java , DB이 컬럼 , html
	
	public SungJukDTO(int no, String name, int kor, int eng, int math) {
		super();
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public void calc() {
		tot = kor+ eng + math;
		avg = tot/3;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	@Override  		// 원래는 클래스명@16진수주소값 이렇게인데. 오버라이딩해서 리턴값 변경함.
	public String toString() {
		return "\t"+no +"\t" 
			  +name +"\t"
			  +kor +"\t"
			  +eng +"\t"
			  +math +"\t"
			  +tot +"\t"
			  +avg;
	}
	@Override
	public int compareTo(SungJukDTO s) { //비교대상자(this)가 더 크면(<) -1, 같다면(==) 0, 작으면(>) 1을 반환시켜줍니다.
		if(this.tot < s.tot) return 1;
		else if(this.tot > s.tot) return -1;
		else return 0;
	}

}
