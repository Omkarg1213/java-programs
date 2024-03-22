package Day5;

public class BankTest 
{

public static void main(String[] args)
   {
	    //Bank b = new Bank();
		SBI b2 = new SBI();
		ICICI b1 = new ICICI(null, null);
		SBI b21 = new SBI(null, null);
		Canara b3 = new Canara(null, null);
		
		String ICICI = b1.toKnowRateOfInterst("6%");
		String SBI = b2.toKnowRateOfInterst("7%");
		String Canara = b3.toKnowRateOfInterst("8%");
		
		b3.setuser_pin("omkarg2003");
		String up = b3.getuser_pin();
		System.out.println(up);
		
		b3.setAdhar_card_no("5655-4047-0039");
		String acn = b3.Adhar_card_no();
		System.out.println(acn);
		
		System.out.print((b1.acc_no = "20180252") +" "+ (b1.acc_holder_name = "DhanaShree \n"));
		System.out.printf("Rate of Interst of %s is: %s \n\n",b1.getClass().getSimpleName(),ICICI);
		
		System.out.print((b2.acc_no = "20180253")+ " " + (b2.acc_holder_name = "Prathik \n"));
		System.out.printf("Rate of Interst of %s is: %S \n\n",b2.getClass().getSimpleName(),SBI);
		
		System.out.println((b3.acc_no = "20180254")+" "+(b3.acc_holder_name = "Prashanthi"));
		System.out.printf("Rate of Interst of %s is: %S \n\n",b3.getClass().getSimpleName(),Canara);
		
		b2.setpassword("omkarg2003");
		String pw =b2.getpassword();
		
		System.out.println(pw);
		
		b1.display();
}
}
