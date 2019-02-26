package pokemon.model;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Mimikyu extends Pokemon implements Fairy, Ghost
{
	private ImageIcon pokemonIcon;
	public Mimikyu()
	{
		super(778, "Mimikyu");
	}
	
	public Mimikyu(String name)
	{
		super(778, name);
	}
	
	public Mimikyu(int number, String name)
	{
		super(number, name);
	}
	
	public String dazzlingGleam()
	{
		String statement = "You are dazzled with mimikyu's cuteness.";
		return statement;
	}
	
	public void moonBlast()
	{
		pokemonIcon = new ImageIcon(getClass().getResource("pokemon/view/images/mimikyu.png"));
		JOptionPane.showMessageDialog(null, "", "Mimikyu blasts you with the light of the spooky moon.", JOptionPane.INFORMATION_MESSAGE, pokemonIcon);
	}
	
	public void curse()
	{
		pokemonIcon = new ImageIcon(getClass().getResource("pokemon/view/images/mimikyu.png"));
		JOptionPane.showMessageDialog(null, "", "Mimikyu curses you, your family, and your cow.", JOptionPane.INFORMATION_MESSAGE, pokemonIcon);
	}
	
	public String shadowBall()
	{
		String statement = "Mimikyu has totally ruined you with this overpowered move!";
		return statement;
	}
	
	
	
}
