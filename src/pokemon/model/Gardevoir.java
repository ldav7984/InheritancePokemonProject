package pokemon.model;

public class Gardevoir extends Pokemon implements Psychic, Fairy
{
	public Gardevoir()
	{
		super(282, "Gardevoir");
		this.setHealthPoints(95);
		this.setAttackPoints(18);
		this.setEnhancementModifier(1.5);
		this.setCanEvolve(true);
	}
	
	public Gardevoir(String name)
	{
		super(282, name);
		this.setHealthPoints(95);
		this.setAttackPoints(18);
		this.setEnhancementModifier(1.5);
		this.setCanEvolve(true);
	}
	
	public Gardevoir(int number, String name)
	{
		super(number, name);
		this.setHealthPoints(95);
		this.setAttackPoints(18);
		this.setEnhancementModifier(1.5);
		this.setCanEvolve(true);
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
