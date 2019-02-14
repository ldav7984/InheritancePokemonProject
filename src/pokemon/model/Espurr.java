package pokemon.model;

public class Espurr extends Pokemon implements Psychic
{
	public Espurr()
	{
		super(114, "Espurr");
		this.setHealthPoints(60);
		this.setAttackPoints(15);
		this.setEnhancementModifier(1.0);
		this.setCanEvolve(true);
	}
	
	public Espurr(String name)
	{
		super(114, name);
		this.setHealthPoints(60);
		this.setAttackPoints(15);
		this.setEnhancementModifier(1.0);
		this.setCanEvolve(true);
	}
	
	public Espurr(int number, String name)
	{
		super(number, name);
		this.setHealthPoints(60);
		this.setAttackPoints(15);
		this.setEnhancementModifier(1.0);
		this.setCanEvolve(true);
	}
	
	public int zenHeadbutt()
	{
		int times = (int) (Math.random() * 5);
		return times;
	}
	
	public String rest()
	{
		String statement = "Espurr rested to restore its HP.";
		return statement;
	}

}
