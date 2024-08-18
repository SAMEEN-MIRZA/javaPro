package myFirstPack;

public class firstClass {
 public static void main(String[] args) {
	
	String s1 = "sameen";
	String s2 = s1;
	s2=s2.substring(0,1);
	s2=s2.toUpperCase();
	String s3 = s1.substring(1);
	String s4 = s2+s3;
	System.out.println(s4);
	
	
}

}
