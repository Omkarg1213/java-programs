package Day5;

public class HardwareComapny extends TechComapny{
	 String productType;

		
		  public HardwareComapny(String name, String headquarters, String productType)
		  { 
		  super(name, headquarters); 
		  this.productType = productType; 
		  }
		 

	    public void produce() {
	        System.out.println(name + " specializes in producing " + productType + " hardware.");
	    }
	}

