package Day6;

public class CharacterSeparating {
public static void main(String[] args) {
	String s = "Omkarg232$%^&";
	
	StringBuffer special_characters = new StringBuffer();
	StringBuffer digit = new StringBuffer();
	StringBuffer letter = new StringBuffer();
	
	for(int i = 0; i < s.length(); i++ )
	{
		Character currentChar = s.charAt(i);
		//System.out.println(currentChar.toString());
		
		if(Character.isDigit(currentChar)) { 
		  digit.append(currentChar).append(" ");
		  //System.out.print(currentChar); 
		  }
		  
		  if(Character.isLetter(currentChar)) { 
		  letter.append(currentChar).append(" ");
		 // System.out.print(currentChar); 
		  }
		 
		if(!Character.isLetterOrDigit(currentChar))
		{
			special_characters.append(currentChar).append(" ");
			//System.out.print(currentChar);
		}
		//System.out.print("");
	}
	System.out.println("Special_characters: "+special_characters);
	System.out.println("Digits: "+digit);
	System.out.println("Letter: "+letter);
}
}
