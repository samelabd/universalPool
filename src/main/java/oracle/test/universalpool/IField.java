package oracle.test.universalpool;

public interface IField{
	public static final String stringF = "";
	String stringF1 = "";
	
	String m1(Object ar1,Object ar2);
	default String m2(Object ar1,Object ar2) {
	System.out.println("222222222222222222");
	m1("mmmm", 6666);
	return "8888";
	}
	
	
}