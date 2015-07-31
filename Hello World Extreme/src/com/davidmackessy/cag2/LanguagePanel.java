package com.davidmackessy.cag2;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class LanguagePanel extends JPanel {
	private JTextField txtLanguageType;
	private JTextField txtHelloMessage;

	/**
	 * Create the panel.
	 */
	public LanguagePanel() {
		setLayout(null); //specifies the layout
		
		JLabel lblHelloIn = new JLabel("Hello in:");
		lblHelloIn.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblHelloIn.setBackground(Color.WHITE);
		lblHelloIn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblHelloIn.setBounds(34, 24, 72, 14);
		add(lblHelloIn);
		
		txtLanguageType = new JTextField();
		txtLanguageType.setBorder(new LineBorder(Color.BLACK, 2, true));
		txtLanguageType.setEditable(false);
		txtLanguageType.setBounds(192, 24, 180, 36);
		add(txtLanguageType);
		txtLanguageType.setColumns(10);
		
		txtHelloMessage = new JTextField();
		txtHelloMessage.setBorder(new LineBorder(Color.DARK_GRAY, 2, true));
		txtHelloMessage.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtHelloMessage.setEditable(false);
		txtHelloMessage.setBounds(34, 71, 338, 90);
		add(txtHelloMessage);
		txtHelloMessage.setColumns(10);
		
		JButton Irish = new JButton("Irish");
		Irish.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		Irish.setBounds(34, 229, 100, 23);
		Irish.addActionListener(myActionListener);
		add(Irish);
		
		JButton Spanish = new JButton("Spanish");
		Spanish.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		Spanish.setBounds(159, 229, 100, 23);
		Spanish.addActionListener(myActionListener);
		add(Spanish);
		
		JButton French = new JButton("French");
		French.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		French.setBounds(270, 229, 100, 23);
		French.addActionListener(myActionListener);
		add(French);
		
		JButton Portuguese = new JButton("Portuguese");
		Portuguese.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		Portuguese.setBounds(34, 263, 100, 23);
		Portuguese.addActionListener(myActionListener);
		add(Portuguese);
		
		JButton Italian = new JButton("Italian");
		Italian.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		Italian.setBounds(159, 263, 100, 23);
		Italian.addActionListener(myActionListener);
		add(Italian);
		
		JButton English = new JButton("English"); //creates a button
		English.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		English.setBounds(270, 263, 100, 23);//sets dimension
		English.addActionListener(myActionListener);
		add(English);//adds button to panel
		
		JButton Chinese = new JButton("Chinese");
		Chinese.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		Chinese.setBounds(34, 195, 100, 23);
		Chinese.addActionListener(myActionListener);
		add(Chinese);
		
		JButton American = new JButton("American");
		American.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		American.setBounds(159, 195, 100, 23);
		American.addActionListener(myActionListener);
		add(American);
		
		JButton Klingon = new JButton("Klingon");
		Klingon.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		Klingon.setBounds(270, 195, 100, 23);
		Klingon.addActionListener(myActionListener);
		add(Klingon);
	}

	//below language panel constructor,
	//we're going to create our ActionListener
	
	private ActionListener myActionListener = new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub - creates a little reminder in the left column - TO DO
			//this is where the program will look when an event happens
			//in our case the event will be a button click
			if (event.getSource() instanceof JButton){				//this is where the code will go if it is a button clicked
				
				JButton buttonPressed = (JButton) event.getSource(); // casting: how to tell java to change it from an object to a button
				String buttonText = buttonPressed.getText();
				
				switch (buttonText){								//use switch statement to find which button was pressed
					case "English":		txtLanguageType.setText(buttonText);
										txtHelloMessage.setText("Hello");
										break;
					case "Irish": 		txtLanguageType.setText(buttonText);
										txtHelloMessage.setText("Dia duit");
										break;									
					case "Spanish": 	txtLanguageType.setText(buttonText);
										txtHelloMessage.setText("Hola");
										break;
					case "Portuguese": 	txtLanguageType.setText(buttonText);
										txtHelloMessage.setText("Olá");
										break;
					case "Italian": 	txtLanguageType.setText(buttonText);
										txtHelloMessage.setText("Ciao");
										break;
					case "French":		txtLanguageType.setText(buttonText);
										txtHelloMessage.setText("Bonjour"); 
										break;
					case "American":	txtLanguageType.setText(buttonText);
										txtHelloMessage.setText("Howdy Partner!");
										break;
					case "Klingon":		txtLanguageType.setText(buttonText);
										txtHelloMessage.setText("nuqNeh");
										break;
					case "Chinese":		txtLanguageType.setText(buttonText);
										txtHelloMessage.setText("Ni hao");
										break;
				
				
				}
			}
			
		}
		
	};
}

