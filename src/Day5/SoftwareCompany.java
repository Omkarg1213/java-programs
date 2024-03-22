package Day5;

public class SoftwareCompany extends TechComapny{
	/*
	 * String softwareType;
	 * 
	 * public SoftwareCompany(String name, String headquarters, String softwareType)
	 * { super(name, headquarters); this.softwareType = softwareType; }
	 * 
	 * public void develop() { System.out.println(name + " develops " + softwareType
	 * + " software."); }
	 */
	
	  String softwareType;

	    public SoftwareCompany(String name, String headquarters, String softwareType) {
	        super(name, headquarters); // Call superclass constructor to initialize inherited fields
	        this.softwareType = softwareType;
	    }

	    public void develop() {
	        System.out.println(name + " develops " + softwareType + " software.");
	    }

	    // Method overriding: overriding the intro method inherited from TechCompany
	    @Override
	    public void intro() {
	        System.out.println(name + " is a software company headquartered in " + headquarters + ".");
	    }
}
