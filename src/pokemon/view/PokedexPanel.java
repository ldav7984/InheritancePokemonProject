package pokemon.view;

import javax.swing.*;
import pokemon.controller.PokedexController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public class PokedexPanel extends JPanel
{
	private SpringLayout appLayout;
	private PokedexController app;
	
	private JButton changeButton;
	private JButton saveButton;
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
	private ImageIcon pokemonIcon;
	
	public PokedexPanel(PokedexController app)
	{
		super();
	
		this.app = app;
		this.appLayout = new SpringLayout();
		
		this.pokemonIcon = new ImageIcon(getClass().getResource("/pokemon/view/images/kyogre.png"));
		
		changeButton = new JButton("Change");
		saveButton = new JButton("Save");
		
		pokedexDropdown = new JComboBox<String>();
		
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
		
		imageLabel = new JLabel("Pokemon", pokemonIcon, JLabel.CENTER);
		
		
		setupDropdown();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void sendDataToController()
	{
		int index = pokedexDropdown.getSelectedIndex();
		
		if(app.isInt(attackField.getText()) && app.isDouble(enhancementField.getText()) && app.isInt(healthField.getText()))
		{
			String [] data = new String[5];
			
			data[0] = attackField.getText();
			data[1] = enhancementField.getText();
			data[2] = healthField.getText();
			data[3] = nameField.getText();
			data[4] = evolveField.getText();
			
			app.updatePokemon(index, data);
			repaint();
		}
	}
	
	private void changeImageDisplay(String name)
	{
		String path = "/pokemon/view/images/";
		String defaultName = "kyogre";
		String extension = ".png";
		try
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + name.toLowerCase() + extension));
		}
		catch (NullPointerException missingFile)
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + defaultName + extension));
		}
		imageLabel.setIcon(pokemonIcon);
		repaint();
	}
	
	private void setupDropdown()
	{
		DefaultComboBoxModel<String> temp = new DefaultComboBoxModel<String>(app.buildPokedexText());
		pokedexDropdown.setModel(temp);
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.RED);
		this.setPreferredSize(new Dimension(600,450));
		this.setLayout(appLayout);
		
		this.add(changeButton);
		this.add(saveButton);
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
		
		nameField.setEditable(false);
		nameField.setEnabled(false);
		
		imageLabel.setVerticalTextPosition(JLabel.BOTTOM);
		imageLabel.setHorizontalTextPosition(JLabel.CENTER);
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.WEST, changeButton, 29, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, attackField, -40, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, pokedexDropdown, 0, SpringLayout.WEST, changeButton);
		appLayout.putConstraint(SpringLayout.NORTH, pokedexDropdown, 1, SpringLayout.NORTH, enhancementField);
		appLayout.putConstraint(SpringLayout.EAST, healthField, 0, SpringLayout.EAST, attackField);
		appLayout.putConstraint(SpringLayout.EAST, enhancementField, 0, SpringLayout.EAST, healthField);
		appLayout.putConstraint(SpringLayout.EAST, numberField, -40, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, attackField, 6, SpringLayout.SOUTH, numberField);
		appLayout.putConstraint(SpringLayout.SOUTH, nameField, -6, SpringLayout.NORTH, numberField);
		appLayout.putConstraint(SpringLayout.EAST, nameField, 0, SpringLayout.EAST, healthField);
		appLayout.putConstraint(SpringLayout.SOUTH, enhancementField, -6, SpringLayout.NORTH, evolveField);
		appLayout.putConstraint(SpringLayout.EAST, evolveField, 0, SpringLayout.EAST, healthField);
		appLayout.putConstraint(SpringLayout.WEST, attackField, 34, SpringLayout.EAST, attackLabel);
		appLayout.putConstraint(SpringLayout.WEST, enhancementField, 35, SpringLayout.EAST, enhancementLabel);
		appLayout.putConstraint(SpringLayout.WEST, numberField, 35, SpringLayout.EAST, numberLabel);
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 14, SpringLayout.SOUTH, numberLabel);
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 3, SpringLayout.NORTH, nameField);
		appLayout.putConstraint(SpringLayout.EAST, nameLabel, 0, SpringLayout.EAST, healthLabel);
		appLayout.putConstraint(SpringLayout.WEST, evolveField, 35, SpringLayout.EAST, evolveLabel);
		appLayout.putConstraint(SpringLayout.WEST, attackLabel, 0, SpringLayout.WEST, healthLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, numberField, -247, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, changeButton, -10, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, saveButton, 0, SpringLayout.NORTH, changeButton);
		appLayout.putConstraint(SpringLayout.WEST, saveButton, 6, SpringLayout.EAST, changeButton);
		appLayout.putConstraint(SpringLayout.NORTH, healthField, -3, SpringLayout.NORTH, healthLabel);
		appLayout.putConstraint(SpringLayout.WEST, healthField, 35, SpringLayout.EAST, healthLabel);
		appLayout.putConstraint(SpringLayout.EAST, healthLabel, -144, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, enhancementLabel, -149, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, enhancementLabel, 0, SpringLayout.EAST, healthLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, healthLabel, -15, SpringLayout.NORTH, enhancementLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, numberLabel, -252, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, numberLabel, 0, SpringLayout.EAST, healthLabel);
		appLayout.putConstraint(SpringLayout.NORTH, evolveField, -3, SpringLayout.NORTH, evolveLabel);
		appLayout.putConstraint(SpringLayout.NORTH, evolveLabel, 14, SpringLayout.SOUTH, enhancementLabel);
		appLayout.putConstraint(SpringLayout.EAST, evolveLabel, 0, SpringLayout.EAST, healthLabel);
		appLayout.putConstraint(SpringLayout.NORTH, imageLabel, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, imageLabel, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, imageLabel, 249, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, imageLabel, -14, SpringLayout.WEST, enhancementLabel);
		
		healthLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		attackLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		enhancementLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		numberLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		imageLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		nameLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		evolveLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
	}
	
	private void updateFields(int index)
	{
		String [] data = app.getPokeData(index);
		attackField.setText(data[0]);
		enhancementField.setText(data[1]);
		healthField.setText(data[2]);
		nameField.setText(data[3]);
		evolveField.setText(data[4]);
		numberField.setText(data[5]);
	}
	
	private void setupListeners()
	{
		changeButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				sendDataToController();
				repaint();
			}
		});
		pokedexDropdown.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				String name = pokedexDropdown.getSelectedItem().toString();
				updateFields(pokedexDropdown.getSelectedIndex());
				changeImageDisplay(name);
			}
		});
		saveButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				app.savePokedex();
			}
		});
	}
	
	
	
	
}
