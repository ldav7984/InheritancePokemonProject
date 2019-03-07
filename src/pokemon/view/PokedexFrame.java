package pokemon.view;

import javax.swing.JFrame;
import pokemon.controller.PokedexController;

public class PokedexFrame extends JFrame
{
	private PokedexController app;
	private PokedexPanel panel;
	
	public PokedexFrame(PokedexController app)
	{
		super();
		this.app = app;
		this.panel = new PokedexPanel(app);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(panel);
		
		this.setSize(600, 450);
		this.setTitle("Pokemon");
		this.setResizable(false);
		this.setVisible(true);
	}
}

	
