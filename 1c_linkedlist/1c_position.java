package list1;
import java.util.LinkedList;
public class e9 {
public static void main(String []args) {
	LinkedList<String> l4 = new LinkedList<>();
	l4.add("Red");
	l4.add("green");
	l4.add("Blue");
	l4.add("violet");
	l4.add("Orange");
	l4.add("white");
	//display elements
	String e1=l4.get(0);
	String e2=l4.get(1);
	String e3=l4.get(2);
	String e4=l4.get(3);
	String e5=l4.get(4);
	String e6=l4.get(5);
	System.out.println("display: "+e1+","+e2+","+ e3+","+ e4+","+e5+","+e6);
}
}
