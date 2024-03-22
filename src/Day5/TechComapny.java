package Day5;

public class TechComapny {
	// TechCompany class representing generic properties of technology companies
	
	  String name;
	    String headquarters;

	    public TechComapny(String name, String headquarters) {
	        this.name = name;
	        this.headquarters = headquarters;
	    }

	    public void intro() {
	        System.out.println(name + " is a technology company headquartered in " + headquarters + ".");
	    }
	}

