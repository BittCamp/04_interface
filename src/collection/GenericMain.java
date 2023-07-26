package collection;//[ 김찬영  2023-07-24 오후 02:51:14 ]

class GenericTest<T>{
	T a;
	
	public void setA(T a) {
		this.a = a;
	}
	public T getA() {
		return a;
	}
}
//---------------------
public class GenericMain {
	public static void main(String[] args) {
		GenericTest<String> aa = new GenericTest<String>();
		aa.setA("홍길동");
		System.out.println(aa.getA());
		//aa.setA(25); error
		GenericTest<Integer> bb = new GenericTest<Integer>();
		bb.setA(25);
		System.out.println(bb.getA());
	}	
}
