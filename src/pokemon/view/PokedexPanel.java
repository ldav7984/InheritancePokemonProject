package pokemon.view;

import javax.swing.*;
import pokemon.controller.PokedexController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PokedexPanel extends JPanel
{
	private SpringLayout appLayout;
	private PokedexController app;
	
	private JButton changeButton;
	private JComboBox pokedexDropdown;
	
	private JTextField healthField;
	private JTextField attackField;
	private JTextField enhancementField;
	private JTextField numberField;
	private JTextField nameField;
	private JTextField evolveField;
	
	private JLabel healthLabel;
	private JLabel attackLabel;
	private JLabel enhancementLabel;
	private JLabel numberLabel;
	private JLabel nameLabel;
	private JLabel evolveLabel;
	
	private JLabel imageLabel;
	
	public PokedexPanel(PokedexController app)
	{
		super();
		this.app = app;
		this.appLayout = new SpringLayout();
		
		changeButton = new JButton("Change");
		pokedexDropdown = new JComboBox(); //stub
		
		healthField = new JTextField("0");
		attackField = new JTextField("0");
		enhancementField = new JTextField("0");
		numberField = new JTextField("0");
		nameField = new JTextField("Pokemon");
		evolveField = new JTextField("false");
		
		healthLabel = new JLabel("Health Points:");
		attackLabel = new JLabel("Attack Points:");
		enhancementLabel = new JLabel("Enhancement Level:");
		numberLabel = new JLabel("Number:");
		nameLabel = new JLabel("Name:");
		evolveLabel = new JLabel("Can Evolve:");
		imageLabel = new JLabel("pokemon image");
		
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		
		this.add(changeButton);
		this.add(pokedexDropdown);
		
		this.add(healthField);
		this.add(attackField);
		this.add(enhancementField);
		this.add(numberField);
		this.add(nameField);
		this.add(evolveField);
		
		this.add(healthLabel);
		this.add(attackLabel);
		this.add(enhancementLabel);
		this.add(numberLabel);
		this.add(nameLabel);
		this.add(evolveLabel);
		
		this.add(imageLabel);
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.WEST, healthField, 348, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.WEST, attackField, 0, SpringLayout.WEST, healthField);
		appLayout.putConstraint(SpringLayout.NORTH, enhancementField, 13, SpringLayout.SOUTH, healthField);
		appLayout.putConstraint(SpringLayout.WEST, enhancementField, 0, SpringLayout.WEST, healthField);
		appLayout.putConstraint(SpringLayout.WEST, numberField, 0, SpringLayout.WEST, healthField);
		appLayout.putConstraint(SpringLayout.WEST, nameField, 0, SpringLayout.WEST, healthField);
		appLayout.putConstraint(SpringLayout.NORTH, attackField, 5, SpringLayout.SOUTH, nameField);
		appLayout.putConstraint(SpringLayout.NORTH, evolveField, 51, SpringLayout.SOUTH, enhancementField);
		appLayout.putConstraint(SpringLayout.WEST, evolveField, 0, SpringLayout.WEST, healthField);
		appLayout.putConstraint(SpringLayout.WEST, attackLabel, 211, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, attackLabel, -49, SpringLayout.WEST, healthField);
		appLayout.putConstraint(SpringLayout.NORTH, healthLabel, 23, SpringLayout.SOUTH, attackLabel);
		appLayout.putConstraint(SpringLayout.EAST, healthLabel, 0, SpringLayout.EAST, attackLabel);
		appLayout.putConstraint(SpringLayout.NORTH, healthField, -5, SpringLayout.NORTH, attackLabel);
		appLayout.putConstraint(SpringLayout.EAST, enhancementLabel, -49, SpringLayout.WEST, numberField);
		appLayout.putConstraint(SpringLayout.NORTH, numberField, -5, SpringLayout.NORTH, enhancementLabel);
		appLayout.putConstraint(SpringLayout.WEST, numberLabel, 245, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, numberLabel, -233, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, numberLabel, -49, SpringLayout.WEST, attackField);
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 16, SpringLayout.SOUTH, numberLabel);
		appLayout.putConstraint(SpringLayout.NORTH, numberLabel, 6, SpringLayout.SOUTH, nameLabel);
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 259, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, nameLabel, -151, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, nameField, -5, SpringLayout.NORTH, nameLabel);
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, evolveLabel, 199, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, enhancementLabel, -16, SpringLayout.NORTH, evolveLabel);
		appLayout.putConstraint(SpringLayout.WEST, evolveLabel, 227, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, evolveLabel, 0, SpringLayout.EAST, healthLabel);
		appLayout.putConstraint(SpringLayout.WEST, enhancementLabel, 48, SpringLayout.EAST, imageLabel);
		appLayout.putConstraint(SpringLayout.NORTH, imageLabel, 0, SpringLayout.NORTH, numberField);
		appLayout.putConstraint(SpringLayout.WEST, imageLabel, 26, SpringLayout.WEST, this);
	}
	
	private void setupListeners()
	{
		changeButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				
			}
		});
	}
	
	
}
