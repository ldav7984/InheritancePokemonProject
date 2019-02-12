package pokemon.view;

import javax.swing.*;
import pokemon.controller.PokedexController;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PokedexPanel extends JPanel
{
	private SpringLayout appLayout;
	private PokedexController appController;
	
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
	
	public PokedexPanel(PokedexController app)
	{
		super();
		this.appController = app;
		this.appLayout = new SpringLayout();
		
		healthField = new JTextField("0");
		attackField = new JTextField("0");
		enhancementField = new JTextField("0");
		numberField = new JTextField("0");
		nameField = new JTextField("");
		evolveField = new JTextField("false");
		
		healthLabel = new JLabel("Health Points");
		attackLabel = new JLabel("Attack Points");
		enhancementLabel = new JLabel("Enhancement Modifier");
		numberLabel = new JLabel("Number");
		nameLabel = new JLabel("Name");
		evolveLabel = new JLabel("Can Evolve");
		
		setupPanel();
		setupLayout();
		//setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension(800, 600));
		this.setBackground(Color.BLUE);
		
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
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, attackPointsText, 153, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, attackPointsText, 22, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.WEST, healthPointsText, 0, SpringLayout.WEST, attackPointsText);
		appLayout.putConstraint(SpringLayout.SOUTH, healthPointsText, -6, SpringLayout.NORTH, attackPointsText);
		appLayout.putConstraint(SpringLayout.NORTH, enhancementModifierText, 16, SpringLayout.SOUTH, attackPointsText);
		appLayout.putConstraint(SpringLayout.WEST, enhancementModifierText, 22, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.WEST, numberText, 0, SpringLayout.WEST, healthPointsText);
		appLayout.putConstraint(SpringLayout.SOUTH, numberText, -6, SpringLayout.NORTH, healthPointsText);
		appLayout.putConstraint(SpringLayout.SOUTH, nameText, -6, SpringLayout.NORTH, numberText);
		appLayout.putConstraint(SpringLayout.EAST, nameText, 0, SpringLayout.EAST, healthPointsText);
		appLayout.putConstraint(SpringLayout.NORTH, canEvolveText, 11, SpringLayout.SOUTH, enhancementModifierText);
		appLayout.putConstraint(SpringLayout.WEST, canEvolveText, 0, SpringLayout.WEST, healthPointsText);
		appLayout.putConstraint(SpringLayout.WEST, numberText, 0, SpringLayout.WEST, healthPointsText);
		appLayout.putConstraint(SpringLayout.SOUTH, numberText, -6, SpringLayout.NORTH, healthPointsText);
		appLayout.putConstraint(SpringLayout.NORTH, enhancementModifierText, 16, SpringLayout.SOUTH, attackPointsText);
		appLayout.putConstraint(SpringLayout.WEST, enhancementModifierText, 22, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, nameText, -6, SpringLayout.NORTH, numberText);
		appLayout.putConstraint(SpringLayout.EAST, nameText, 0, SpringLayout.EAST, healthPointsText);
		appLayout.putConstraint(SpringLayout.NORTH, canEvolveText, 11, SpringLayout.SOUTH, enhancementModifierText);
		appLayout.putConstraint(SpringLayout.WEST, canEvolveText, 0, SpringLayout.WEST, healthPointsText);
		
	}
	
}
