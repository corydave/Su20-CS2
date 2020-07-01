import java.util.ArrayList;
import java.util.Collections;


public class InterfaceDemo {

	public static void main(String[] args) {

		CPoint a = new CPoint(5, 1);
		CPoint b = new CPoint(5, 4);
		
		ArrayList<CPoint> list = new ArrayList<CPoint>();
		
		list.add(a);
		list.add(b);
		
		System.out.println(list);
		Collections.sort(list);		
		System.out.println(list);
		
//		System.out.println(a);
//		System.out.println(b);
		
	}

}
