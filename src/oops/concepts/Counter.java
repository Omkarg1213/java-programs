package oops.concepts;

public class Counter {
int count1=0;
static int count2=0;
String name;

Counter()
{
	//this.count1 = count1;
	this.count1++;
	System.out.println(count1);
}

Counter(String name)
{
	//this.count2 = count2;
	this.count2++;
	System.out.println(count2+" "+name);
}

/*
 * void countDisplay() { System.out.println(count1+"\n"+count2); }
 */
}
