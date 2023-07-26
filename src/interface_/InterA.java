package interface_;

public  interface InterA {
	public static final String NAME = "홍길동";//상수 인터페이스는 틀이라서 new가 안된다.
	public int AGE = 25;// interface 안에선 final 안붙여도 무조건 상수로 친다.
	
	public abstract void aa();
	public void bb();	
	
}
