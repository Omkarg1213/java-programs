package Day9;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Predicate<String> p = (domain) -> domain.endsWith(".com"); 
      
      System.out.println(p.test("www.omkarg9731@gmail.com"));
      System.out.println(p.test("www.Rahul8546@gmail.com"));
      System.out.println(p.test("www.amzon.in"));
      
      Predicate<String> p1 = (alphabet) -> alphabet.isEmpty();
      
      System.out.println(p.test(""));
      System.out.println(p.test(" "));
	}

}
