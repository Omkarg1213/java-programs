package Day5;

public class Test {
	public static void main(String[] args) {
        // Create an instance of HardwareCompany
		HardwareComapny hardwareCompany = new HardwareComapny("XYZ Hardware", "New York", "Computer hardware");
        hardwareCompany.intro();   // Inherits from TechCompany
        hardwareCompany.produce(); // Inherits from HardwareCompany

        // Create an instance of SoftwareCompany
        SoftwareCompany softwareCompany = new SoftwareCompany("ABC Software", "San Francisco", "Business software");
        softwareCompany.intro();   // Inherits from TechCompany
        softwareCompany.develop(); // Defined in SoftwareCompany
    }
}
