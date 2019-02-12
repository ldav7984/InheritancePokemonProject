package pokemon.model;

public class Kyogre extends Pokemon implements Water
{
	public Kyogre(int number, String name)
	{
		super(number, name);
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
