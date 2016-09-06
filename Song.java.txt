public class Song
{
	private String title;
	private String artist;

	public Song(String title, String artist)
	{
		this.title = title;
		this.artist = artist;
	}

	public String toString()
	{
		return title + " by " + artist + "\n";
	}
}