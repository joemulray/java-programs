public class SimpleClass
{
   private String phrase;
	
   public SimpleClass()
   {
		phrase = "Hello World";
   }
	
   public SimpleClass(String word)
   {
		phrase = word;
   }
	
   public String getPhrase()
   {
		return phrase;
   }
	
   public void setPhrase(String word)
   {
		phrase = word;
   }
	
   public String toString()
   {
		return "Phrase: " + phrase;
   }
}
