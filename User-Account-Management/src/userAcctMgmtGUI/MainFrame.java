package userAcctMgmtGUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import userAcctMgmt.userAccountBag;

public class MainFrame extends JFrame {
	
	
	public MainFrame(String title) {
		super(title);	
		
		// SET LAYOUT
		setLayout(new GridBagLayout());
		
		// CREATE COMPONENTS
		JButton signIn = new JButton("Sign In");
		JButton signUp = new JButton("Sign Up");
		
		JLabel userName = new JLabel("User Name: ");
		JLabel passWord = new JLabel("Password: ");
		
		JTextField userNameField = new JTextField(10);
		JTextField passWordField = new JTextField(10);
		
		//ADD COMPONENTS TO PANE
	    GridBagConstraints gc = new GridBagConstraints();
		
		gc.anchor = GridBagConstraints.LINE_END;
        gc.weightx = 0.5;
		gc.weighty = 0.5;
	
		gc.gridx = 1;
		gc.gridy = 0;
		add(userName, gc);
		
		gc.gridx = 1;
		gc.gridy = 1;
		add(passWord, gc);
		
		gc.anchor = GridBagConstraints.LINE_START;
		gc.gridx = 2;
		gc.gridy = 0;
		add(userNameField, gc);
		
		gc.gridx = 2;
		gc.gridy = 1;
		add(passWordField, gc);
		
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.weighty = 10;
		gc.weightx = 0.5;
		gc.gridx = 1;
		gc.gridy = 2;
		add(signIn, gc);
		
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.weighty = 10;
		gc.weightx = 0.5;
		gc.gridx = 2;
		gc.gridy = 2;
		add(signUp, gc);
		
	    
	    // ADD BEHAVIOR
		signIn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// USERNAME AND PASSWORD VALIDATION
				String userName = userNameField.getText();
				String passWord = passWordField.getText();
				
				try {
					userAccountBag acctBag = new userAccountBag();
					
					if(acctBag.searchAccount(userName, passWord) == false) {
						// FAILURE
						JOptionPane.showMessageDialog(null,"             Failure");
					} else {
						// DISPLAY SUCCESS
						JOptionPane.showMessageDialog(null,"             Success");
					}
					
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
				
			}
		});
		
		
		signUp.addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
				// GO TO SIGN UP SCREEN
            	JFrame signUpPage = new SignUpPage("User Account Management System - Sign Up");
				signUpPage.setSize(400, 350);
				signUpPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				signUpPage.setVisible(true);
				
			}
			
		});
		
	}
	
}
