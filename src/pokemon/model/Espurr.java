package pokemon.model;

public class Espurr extends Pokemon implements Psychic
{
	public Espurr()
	{
		super(114, "Espurr");
	}
	
	public Espurr(String name)
	{
		super(114, name);
	}
	
	public Espurr(int number, String name)
	{
		super(number, name);
	}
	
	public int zenHeadbutt()
	{
		int times = (int) (Math.random() * 5);
		return times;
	}
	
	public String rest()
	{
		String statement = "Espurr rested to restore its HP. It is breathing in... the cheamicals!";
		return statement;
	}

}
