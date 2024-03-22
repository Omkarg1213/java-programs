package Day6;
import Day7.studntGovt.studentGovt;
public class ImplementingStudentGvt {
public static void main(String[] args) {
	GFGCgovt gfgc = new GFGCgovt("Rahulla");
	GFGCgovt gfgc1 = new GFGCgovt("Mohana",45);
	
	gfgc.academics();
	gfgc1.eventsAndActivities();
	
	String sp = gfgc.school_president;
	System.out.println(sp);
}
}