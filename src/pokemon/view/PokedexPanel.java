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
	
	private JTextField healthPointsText;
	private JTextField attackPointsText;
	private JTextField enhancementModifierText;
	private JTextField numberText;
	private JTextField nameText;
	private JTextField canEvolveText;
	
	private JLabel healthPointsLabel;
	private JLabel attackPointsLabel;
	private JLabel enhancementModifierLabel;
	private JLabel numberLabel;
	private JLabel nameLabel;
	private JLabel canEvolveLabel;
	
	public PokedexPanel(PokedexController app)
	{
		super();
		this.appController = app;
		appLayout = new SpringLayout();
		
		healthPointsText = new JTextField("", 50);
		attackPointsText = new JTextField("", 50);
		
		enhancementModifierText = new JTextField("", 50);
		
		numberText = new JTextField("", 50);
		nameText = new JTextField("", 50);
		numberText = new JTextField("", 50);
		canEvolveText = new JTextField("", 50);
		nameText = new JTextField("", 50);
		canEvolveText = new JTextField("", 50);
		
		setupPanel();
		setupLayout();
		//setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension(800, 600));
		this.setBackground(Color.BLUE);
		
		this.add(healthPointsText);
		this.add(attackPointsText);
		this.add(enhancementModifierText);
		this.add(numberText);
		this.add(nameText);
		this.add(canEvolveText);
		
		this.add(healthPointsLabel);
		this.add(attackPointsLabel);
		this.add(enhancementModifierLabel);
		this.add(numberLabel);
		this.add(nameLabel);
		this.add(canEvolveLabel);
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
