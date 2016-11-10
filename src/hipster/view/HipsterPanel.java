package hipster.view;

import java.awt.Color;

import javax.swing.*;

import hipster.controller.HipsterController;

public class HipsterPanel extends JPanel
{
	private HipsterController baseController;
	private JButton myButton;
	private JComboBox dropDown;
	private JLabel wordsLabel;
	private SpringLayout baseLayout;
	
	public HipsterPanel(HipsterController baseController)
	{
		this.baseController = baseController;
		myButton = new JButton("Click Here");
		wordsLabel = new JLabel("Words");
		baseLayout = new SpringLayout();
		dropDown = new JComboBox(baseController.getWords());
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.LIGHT_GRAY);
		this.add(myButton);
		this.add(wordsLabel);
		this.add(dropDown);
	}
	private void setupLayout()
	{
		
	}
	private void setupListeners()
	{
		
	}
}
