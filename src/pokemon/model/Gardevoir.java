package pokemon.model;

public class Gardevoir extends Pokemon implements Psychic, Fairy
{
	public Gardevoir()
	{
		super(282, "Wally");
	}
	
	public Gardevoir(String name)
	{
		super(282, name);
	}
	
	public Gardevoir(int number, String name)
	{
		super(number, name);
	}
	
	public int zenHeadbutt()
	{
		int times = 1;
		return times;
	}

	public String rest()
	{
		String statement = "Gardevoir takes a turn to get some beauty rest.";
		return statement;
	}
	
	public String dazzlingGleam()
	{
		String statement = "Gardevoir wowed its oppenent with its dazzling beauty.";
		return statement;
		
	}
	
	public void moonBlast()
	{
		System.out.println("Gardevoir blasts you with power from the moon.");
	}
	
}
