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
		
		setupPanel();
		setupLayout();
		//setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
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
		
	}
	
}
