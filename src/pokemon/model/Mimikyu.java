package pokemon.model;

public class Mimikyu extends Pokemon implements Fairy, Ghost
{
	public Mimikyu(int number, String name)
	{
		super(number, name);
	}
	
	public String dazzlingGleam()
	{
		String statement = "";
		return statement;
	}
	
	public void moonBlast()
	{
		System.out.println("You are blasted with the light of the spooky moon.");
	}
	
	public void curse()
	{
		System.out.println("Mimikyu curses you, your family, and your cow.");
	}
	
	public String shadowBall()
	{
		String statement = "Mimikyu has totally ruined you with this overpowered move!";
		return statement;
	}
	
	
	
}
