package pokemon.model;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Kyogre extends Pokemon implements Water
{
	private ImageIcon pokemonIcon;
	
	public Kyogre()
	{
		super(45, "Kyogre");
	}
	
	public Kyogre(String name)
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
		pokemonIcon = new ImageIcon(getClass().getResource("pokemon/view/images/kyogre.png"));
		JOptionPane.showMessageDialog(null, "", "Where will Kyogre take you with Surf?", JOptionPane.INFORMATION_MESSAGE, pokemonIcon);
	}
	
}
