package pokemon.model;

public class Kyogre extends Pokemon implements Water
{
	public Kyogre()
	{
		super(45, "Kyogre");
		this.setHealthPoints(105);
		this.setAttackPoints(25);
		this.setEnhancementModifier(2.0);
		this.setCanEvolve(false);
	}
	
	public Kyogre(String name)
	{
		super(45, name);
		this.setHealthPoints(105);
		this.setAttackPoints(25);
		this.setEnhancementModifier(2.0);
		this.setCanEvolve(false);
	}
	
	public Kyogre(int num, String name)
	{
		super(num, name);
		this.setHealthPoints(105);
		this.setAttackPoints(25);
		this.setEnhancementModifier(2.0);
		this.setCanEvolve(false);
	}
	
	public String splash()
	{
		String statement = "Kyogre used Splash! Kyogre's primal form has covered the world with water. Team Aqua has won.";
		return statement;
	}
	
	public void surf()
	{
		System.out.println("Where will Kyogre take you with Surf?");
	}
	
}
