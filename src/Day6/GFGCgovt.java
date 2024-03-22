package Day6;
import Day7.studntGovt.studentGovt;
public class GFGCgovt implements studentGovt{
	String academic_minister;
	String eventsAndActivities_minister;
	int no_of_ministries ;
	GFGCgovt(String academic_minister)
	{
		this.academic_minister = academic_minister;
	}
	
	GFGCgovt(String eventsAndActivitiesminister,int no_of_ministries)
	{
		eventsAndActivities_minister = eventsAndActivitiesminister;
		this.no_of_ministries = no_of_ministries;
	}
	@Override
	public void academics() {
		// TODO Auto-generated method stub
		System.out.println(academic_minister+" Oversees academic affairs and student academic support services");
	}

	@Override
	public void eventsAndActivities() {
		// TODO Auto-generated method stub
		System.out.println(eventsAndActivities_minister+" Plans and organizes school events, social activities, and extracurricular programs");
	}
}
