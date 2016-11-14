package hipster.view;

import java.awt.Color;
import java.awt.event.*;
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
		dropDown = new JComboBox(baseController.getHipsters());
		
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
		baseLayout.putConstraint(SpringLayout.EAST, wordsLabel, -265, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, myButton, -5, SpringLayout.NORTH, wordsLabel);
		baseLayout.putConstraint(SpringLayout.WEST, myButton, 6, SpringLayout.EAST, wordsLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, wordsLabel, -28, SpringLayout.NORTH, dropDown);
		baseLayout.putConstraint(SpringLayout.NORTH, dropDown, 159, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, dropDown, 136, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, dropDown, -142, SpringLayout.EAST, this);
	}
	private void setupListeners()
	{
		dropDown.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				String selectedText = baseController.getHipsters()[dropDown.getSelectedIndex()].toString();
				wordsLabel.setText(selectedText);
			}
		});
	}
}
