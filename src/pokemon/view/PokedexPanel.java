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
	
	private JTextField kyogreText;
	private JTextField vaporeonText;
	private JTextField espurrText;
	private JTextField gardevoirText;
	private JTextField mimikyuText;
	
	private JLabel kyogreLabel;
	private JLabel vaporeonLabel;
	private JLabel espurrLabel;
	private JLabel gardevoirLabel;
	private JLabel mimikyuLabel;
	
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
		
		this.add(kyogreText);
		this.add(vaporeonText);
		this.add(espurrText);
		this.add(gardevoirText);
		this.add(mimikyuText);
		
		this.add(kyogreLabel);
		this.add(vaporeonLabel);
		this.add(espurrLabel);
		this.add(gardevoirLabel);
		this.add(mimikyuLabel);
	}
	
	private void setupLayout()
	{
		
	}
	
}
