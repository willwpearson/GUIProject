package gui.view;

import javax.swing.JPanel;
import gui.controller.GUIAppController;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SpringLayout;

public class GUIPanel extends JPanel
{
	private GUIAppController appController;
	private JButton firstButton;
	private SpringLayout appLayout;
	
	public GUIPanel(GUIAppController appController)
	{
		super();
		this.appController = appController;
		firstButton = new JButton("Click on the button");
		appLayout = new SpringLayout();
				
		setupPanel();
		setupLayout();
	}
	
	/**
	 * Used to add all components to the screen and install a layout manager.
	 * Also set color xD
	 */
	private void setupPanel()
	{
		this.setBackground(Color.DARK_GRAY);
		this.setLayout(appLayout);
		this.add(firstButton);
	}
	
	/**
	 * Used to hold the constraint positioning for SpringLayout.
	 * AKA a giant dumping ground for all the xxxx.putConstraint(....) lines.
	 */
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, firstButton, 127, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, firstButton, -139, SpringLayout.EAST, this);
	}
	
	private void setupListeners()
	{
		
	}
}
