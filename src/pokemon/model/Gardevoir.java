package pokemon.model;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Gardevoir extends Pokemon implements Psychic, Fairy
{
	private ImageIcon pokemonIcon;
	
	public Gardevoir()
	{
		super(282, "Gardevoir");
	}
	
	public Gardevoir(String name)
	{
		super(282, name);
	}
	
	public Gardevoir(int number, String name)
	{
		super(number, name);
	}
	
	public int zenHeadbutt()
	{
		int times = (int) (Math.random() * 4);
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
		pokemonIcon = new ImageIcon(getClass().getResource("pokemon/view/images/gardevoir.png"));
		
		JOptionPane.showMessageDialog(null, "", "Gardevoir blasts you with power from the moon.",  JOptionPane.INFORMATION_MESSAGE, pokemonIcon);
	}
	
}
