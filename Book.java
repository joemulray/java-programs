/**Joseph Mulray
Homework pg 187 #2
January 2nd 2015
*/

public class Book
{
		private String title;
		private String author;
		private String publisher;
		private int copiesSold;

	public Book()
	{
		title="unknown";
	  	author="unknown";
	  	publisher="unknown";
	  	copiesSold=0;

	}

	  public void Book(String t, String a, String p, int c)
	  	{
	  	title=t;
	  	author=a;
	  	publisher=p;
	  	copiesSold=c;
	  	}
	  public void settitle(String t)
	  {
	  	title = t;
	  }
	  public String gettitle()
	  {
	  	return title;
	  }
	  public void setauthor(String a)
	  {
	  	author = a;
	  }
	  public String getauthor()
	  {
	  	return author;
	  }
	  public void setpublisher(String p)
	  {
	  	publisher = p;
	  }
	  	  public String getpublisher()
	  {
	  	return publisher;
	  }
	  public void setcopiesSold(int c)
	  {
	  	copiesSold = c;
	  }
	  	  public int getcopiesSold()
	  {
	  	return copiesSold;
	  }
}