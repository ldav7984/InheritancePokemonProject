package pokemon.model;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Nabstablook extends Pokemon implements Ghost
{
	private ImageIcon pokemonIcon;
	
	public Nabstablook()
	{
		super(0, "Nabstablook");
	}
	
	public Nabstablook(String name)
	{
		super(0, name);
	}
	
	public Nabstablook(int number, String name)
	{
		super(number, name);
	}
	
	public void curse()
	{
		pokemonIcon = new ImageIcon(getClass().getResource("/pokemon/view/images/nabstablook.png"));
		JOptionPane.showMessageDialog(null, "", "Text here", JOptionPane.INFORMATION_MESSAGE, pokemonIcon);
	}
	
	public String shadowBall()
	{
		String statement = "";
		return statement;
	}
	
	
}
