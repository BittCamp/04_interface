package sungJuk;

public class SungJukDTO_me {

	private int no;
	private String name;
	private int korea;
	private int math;
	private int english;
	private int total;
	private int average;
	public static int count;
	

	

	public SungJukDTO_me(int no, String name, int korea, int math, int english,int total,int average) {
		super();
		this.no = no;
		this.name = name;
		this.korea = korea;
		this.math = math;
		this.english = english;
		this.total = total;
		this.average = average;
	}

	public void calc() {
		SungJukDTO_me dto = new SungJukDTO_me(no, name, korea, math, english, total, average);
		total = korea + math+ english ;
		average = total/3;
		System.out.println(" 총점은 "+ total + "\t평균은 "+ average   ); 
		dto.setTotal(total);
		dto.setAverage(average);
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

	public int getKorea() {
		return korea;
	}

	public void setKorea(int korea) {
		this.korea = korea;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getAverage() {
		return average;
	}

	public void setAverage(int average) {
		this.average = average;
	}

}
