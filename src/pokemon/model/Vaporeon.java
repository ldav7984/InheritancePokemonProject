package pokemon.model;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Vaporeon extends Pokemon implements Water
{
	private ImageIcon pokemonIcon;
	public Vaporeon()
	{
		super(134, "Vaporeon");
	}
	
	public Vaporeon(String name)
	{
		super(134, name);
	}
	
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
		pokemonIcon = new ImageIcon(getClass().getResource("/pokemon/view/images/vaporeon.png"));
		JOptionPane.showMessageDialog(null, "", "Vaporeon is using surf to travel the seas!", JOptionPane.INFORMATION_MESSAGE, pokemonIcon);
	}
	
}
