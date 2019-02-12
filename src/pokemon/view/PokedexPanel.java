package pokemon.view;

import javax.swing.*;
import pokemon.controller.PokedexController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;

public class PokedexPanel extends JPanel
{
	private SpringLayout appLayout;
	private PokedexController app;
	
	private JButton changeButton;
	private JComboBox<String> pokedexDropdown;
	
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
		pokedexDropdown = new JComboBox<String>(); //stub
		
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
		
		setupDropdown();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupDropdown()
	{
		DefaultComboBoxModel<String> temp = new DefaultComboBoxModel<String>(app.buildPokedexText());
		pokedexDropdown.setModel(temp);
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		setBackground(Color.RED);
		
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
		healthLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		attackLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		enhancementLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		numberLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		imageLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		nameLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		evolveLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		appLayout.putConstraint(SpringLayout.NORTH, healthField, 8, SpringLayout.SOUTH, attackField);
		appLayout.putConstraint(SpringLayout.NORTH, attackField, 15, SpringLayout.SOUTH, numberField);
		appLayout.putConstraint(SpringLayout.NORTH, nameField, 5, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, evolveField, 198, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, enhancementField, -16, SpringLayout.NORTH, evolveField);
		appLayout.putConstraint(SpringLayout.EAST, healthLabel, -51, SpringLayout.WEST, healthField);
		appLayout.putConstraint(SpringLayout.WEST, attackLabel, -7, SpringLayout.WEST, healthLabel);
		appLayout.putConstraint(SpringLayout.EAST, attackLabel, 0, SpringLayout.EAST, healthLabel);
		appLayout.putConstraint(SpringLayout.NORTH, healthLabel, 15, SpringLayout.SOUTH, attackLabel);
		appLayout.putConstraint(SpringLayout.EAST, enhancementLabel, 0, SpringLayout.EAST, healthLabel);
		appLayout.putConstraint(SpringLayout.WEST, numberLabel, 230, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, numberLabel, -233, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, numberLabel, 0, SpringLayout.EAST, healthLabel);
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 16, SpringLayout.SOUTH, numberLabel);
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 247, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, nameLabel, 0, SpringLayout.EAST, healthLabel);
		appLayout.putConstraint(SpringLayout.NORTH, numberLabel, 6, SpringLayout.SOUTH, nameLabel);
		appLayout.putConstraint(SpringLayout.WEST, evolveLabel, 112, SpringLayout.EAST, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.EAST, evolveLabel, 0, SpringLayout.EAST, healthLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, enhancementLabel, -23, SpringLayout.NORTH, evolveLabel);
		appLayout.putConstraint(SpringLayout.WEST, enhancementLabel, 16, SpringLayout.EAST, imageLabel);
		appLayout.putConstraint(SpringLayout.NORTH, numberField, 6, SpringLayout.SOUTH, nameField);
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, imageLabel, 26, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.WEST, changeButton, 64, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, changeButton, -10, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.WEST, pokedexDropdown, 53, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, healthField, -81, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, attackField, 0, SpringLayout.WEST, healthField);
		appLayout.putConstraint(SpringLayout.WEST, enhancementField, 0, SpringLayout.WEST, healthField);
		appLayout.putConstraint(SpringLayout.WEST, numberField, 0, SpringLayout.WEST, healthField);
		appLayout.putConstraint(SpringLayout.WEST, nameField, 0, SpringLayout.WEST, healthField);
		appLayout.putConstraint(SpringLayout.WEST, evolveField, 0, SpringLayout.WEST, healthField);
		appLayout.putConstraint(SpringLayout.SOUTH, evolveLabel, 0, SpringLayout.SOUTH, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.SOUTH, imageLabel, -122, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, pokedexDropdown, 17, SpringLayout.SOUTH, imageLabel);
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
