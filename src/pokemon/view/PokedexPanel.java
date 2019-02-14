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
	private ImageIcon pokemonIcon;
	
	public PokedexPanel(PokedexController app)
	{
		super();
	
		this.app = app;
		this.appLayout = new SpringLayout();
		
		this.pokemonIcon = new ImageIcon(getClass().getResource("/pokemon/view/images/team mystic.png"));
		
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
		
		imageLabel = new JLabel("Pokemon", pokemonIcon, JLabel.CENTER);
		
		
		setupDropdown();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void sentDataToController()
	{
		int index = pokedexDropdown.getSelectedIndex();
		
		if(app.isInt(attackField.getText()) && app.isDouble(enhancementField.getText()) && app.isInt(healthField.getText()))
		{
			String [] data = new String[5];
			
			data[0] = healthField.getText();
			data[1] = attackField.getText();
			data[2] = enhancementField.getText();
			data[3] = numberField.getText();
			data[4] = nameField.getText();
			data[5] = evolveField.getText();
			
			app.updatePokemon(index, data);
		}
	}
	
	private void changeImageDisplay(String name)
	{
		String path = "/pokemon/view/images/";
		String defaultName = "team mystic";
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
		setBackground(Color.RED);
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
		imageLabel.setVerticalTextPosition(JLabel.BOTTOM);
		imageLabel.setHorizontalTextPosition(JLabel.CENTER);
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.WEST, enhancementField, 398, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.NORTH, pokedexDropdown, 195, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, enhancementLabel, 951, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, enhancementLabel, -553, SpringLayout.WEST, enhancementField);
		appLayout.putConstraint(SpringLayout.NORTH, healthField, 8, SpringLayout.SOUTH, attackField);
		appLayout.putConstraint(SpringLayout.NORTH, attackField, 15, SpringLayout.SOUTH, numberField);
		appLayout.putConstraint(SpringLayout.NORTH, numberField, 6, SpringLayout.SOUTH, nameField);
		appLayout.putConstraint(SpringLayout.EAST, nameField, -31, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, enhancementField, -16, SpringLayout.NORTH, evolveField);
		appLayout.putConstraint(SpringLayout.NORTH, evolveField, 0, SpringLayout.NORTH, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.NORTH, healthLabel, 4, SpringLayout.NORTH, healthField);
		appLayout.putConstraint(SpringLayout.EAST, healthLabel, -51, SpringLayout.WEST, healthField);
		appLayout.putConstraint(SpringLayout.WEST, attackLabel, 240, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, attackLabel, -151, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, attackField, 51, SpringLayout.EAST, attackLabel);
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 4, SpringLayout.NORTH, attackField);
		appLayout.putConstraint(SpringLayout.NORTH, enhancementLabel, 4, SpringLayout.NORTH, enhancementField);
		appLayout.putConstraint(SpringLayout.NORTH, numberLabel, 4, SpringLayout.NORTH, numberField);
		appLayout.putConstraint(SpringLayout.WEST, numberLabel, 278, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, numberLabel, -151, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, numberField, 51, SpringLayout.EAST, numberLabel);
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 4, SpringLayout.NORTH, nameField);
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 295, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, nameLabel, -51, SpringLayout.WEST, nameField);
		appLayout.putConstraint(SpringLayout.NORTH, evolveLabel, 4, SpringLayout.NORTH, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.WEST, evolveField, 51, SpringLayout.EAST, evolveLabel);
		appLayout.putConstraint(SpringLayout.WEST, evolveLabel, 160, SpringLayout.EAST, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.EAST, evolveLabel, -151, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, nameField, 5, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, imageLabel, 26, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.WEST, changeButton, 64, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, changeButton, -10, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.WEST, pokedexDropdown, 53, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, healthField, -81, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, imageLabel, -122, SpringLayout.SOUTH, this);
		healthLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		attackLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		enhancementLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		numberLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		imageLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		nameLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		evolveLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
	}
	
	private void setupListeners()
	{
		changeButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				
			}
		});
		
		pokedexDropdown.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				String name = pokedexDropdown.getSelectedItem().toString();
				changeImageDisplay(name);
			}
		});
	}
	
	
	
	
}
