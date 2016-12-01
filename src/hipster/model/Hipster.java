package hipster.model;

public class Hipster
{
	private String name;
	private int hipsterRank;
	
	public Hipster(String name)
	{
		this.name = name;
	}
	
	public String toString()
	{
		String description = "My name is" + name;
		description += ", and her/his/other hipster rank is: " + hipsterRank;

		return description;
	}
	
	public void calculateHipsterRank()
	{
		hipsterRank = (int)(Math.random() * 10);
	}
	
	public void calculateHipsterRank(int Scale)
	{
		hipsterRank = (int) (Math.random() * Scale);
	}
	public void calculateHipsterRank(int Scale, int shift)
	{
		hipsterRank = (int) ((Math.random() * Scale) + shift);
	}
	
	public int getHipsterRank()
	{
		return hipsterRank;
	}
}
