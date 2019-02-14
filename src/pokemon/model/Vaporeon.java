package pokemon.model;

public class Vaporeon extends Pokemon implements Water
{
	public Vaporeon()
	{
		super(134, "Vaporeon");
		this.setHealthPoints(89);
		this.setAttackPoints(20);
		this.setEnhancementModifier(1.0);
		this.setCanEvolve(false);
	}
	
	public Vaporeon(String name)
	{
		super(134, name);
		this.setHealthPoints(89);
		this.setAttackPoints(20);
		this.setEnhancementModifier(1.0);
		this.setCanEvolve(false);
	}
	
	public Vaporeon(int number, String name)
	{
		super(number, name);
		this.setHealthPoints(89);
		this.setAttackPoints(20);
		this.setEnhancementModifier(1.0);
		this.setCanEvolve(false);
	}
	
	public String splash()
	{
		String statement = "Vaporeon used Splash! ...It didn't do anything.";
		return statement;
	}
	
	public void surf()
	{
		System.out.println("Vaporeon is using surf to travel the seas!");
	}
	
}
