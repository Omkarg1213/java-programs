package Day7;

import java.util.ArrayList;
import java.util.Collections;

public class ToSortCollection {
public static void main(String[] args) {
	ArrayList<Integer> a = new ArrayList<Integer>();
	a.add(45);
	a.add(23);
	a.add(53);
	a.add(13);
	a.add(99);
	a.add(69);
	
	System.err.println(a);
	
	Collections.sort(a);
	System.out.println(a);
}
}
