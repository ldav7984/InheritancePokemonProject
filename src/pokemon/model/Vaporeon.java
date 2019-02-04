package pokemon.model;

public class Vaporeon extends Pokemon implements Water
{
	public Vaporeon(int number, String name)
	{
		super(number, name);
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
