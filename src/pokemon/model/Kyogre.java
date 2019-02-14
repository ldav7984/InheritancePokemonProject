package pokemon.model;

public class Kyogre extends Pokemon implements Water
{
	public Kyogre()
	{
		super(45, "Kyogre");
	}
	
	public Kyogre(String  name)
	{
		super(45, name);
	}
	
	public Kyogre(int num, String name)
	{
		super(num, name);
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
