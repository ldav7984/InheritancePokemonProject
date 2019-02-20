package pokemon.controller;

import javax.swing.JOptionPane;

import java.util.ArrayList;
import pokemon.model.*;
import pokemon.view.PokedexFrame;
import pokemon.view.PokedexPanel;

public class PokedexController 
{
	private ArrayList<Pokemon> pokemonList;
	private PokedexFrame appFrame;
	
	public PokedexController()
	{
		pokemonList = new ArrayList<Pokemon>();
		addPokemon();
		appFrame = new PokedexFrame(this);
	}
	
	public void addPokemon()
	{
		pokemonList.add(new Kyogre());
		pokemonList.add(new Vaporeon());
		pokemonList.add(new Espurr());
		pokemonList.add(new Gardevoir());
		pokemonList.add(new Mimikyu());
	}

	public void start()
	{
		
	}
	
	public ArrayList<Pokemon> getPokemonList()
	{
		return pokemonList;
	}
	
	public PokedexFrame getFrame()
	{
		return appFrame;
	}
	
	public void updatePokemon(int index, String [] data)
	{
		if(data.length == 5)
		{
			Pokemon current = pokemonList.get(index);
			current.setAttackPoints(Integer.parseInt(data[0]));
			current.setEnhancementModifier(Double.parseDouble(data[1]));
			current.setHealthPoints(Integer.parseInt(data[2]));
			current.setName(data[3]);
			current.setCanEvolve(Boolean.parseBoolean(data[4]));
		}
	}
	
	public String[] buildPokedexText()
	{
		String [] names = new String [pokemonList.size()];
		for(int index = 0; index < pokemonList.size(); index++)
		{
			names[index] = pokemonList.get(index).getName();
		}
		return names;
	}
	
	public boolean isDouble(String maybeDouble)
	{
		boolean isValid = false; //default value
		try
		{
			Double.parseDouble(maybeDouble); //try to parse the input into a double
			isValid = true;
		}
		catch (NumberFormatException error) //if it can't parse, it allows user to try again
		{
			JOptionPane.showMessageDialog(null, "You need to type in a decimal number and not press cancel.");
		}
		return isValid;
	}
	
	public boolean isInt(String maybeInt)
	{
		boolean isValid = false; //default
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You need to type in a whole number and not press cancel.");
		}
		return isValid;
	}
	
	
	
	
}
