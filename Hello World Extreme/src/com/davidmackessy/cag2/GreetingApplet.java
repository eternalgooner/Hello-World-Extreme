package com.davidmackessy.cag2;

import javax.swing.JApplet;
import javax.swing.SwingUtilities;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.BorderLayout;

public class GreetingApplet extends JApplet {

	/**
	 * Create the applet.
	 */
	public GreetingApplet() {
		LanguagePanel langPanel = new LanguagePanel();
		langPanel.setBackground(new Color(224, 255, 255));
		
		setContentPane(langPanel);
		langPanel.setLayout(null);
	}
	
		//method used to kick off the applet, called upon when it's loaded
	public void init(){
		try{
			SwingUtilities.invokeAndWait(new Runnable(){
				public void run(){
					new GreetingApplet();
				}
			});
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
