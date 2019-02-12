package pokemon.model;

public class Espurr extends Pokemon implements Psychic
{
	public Espurr(int number, String name)
	{
		super(number, name);
	}
	
	public int zenHeadbutt()
	{
		int times = 4;
		return times;
	}
	
	public String rest()
	{
		String statement = "Espurr rested to restore its HP.";
		return statement;
	}

}
