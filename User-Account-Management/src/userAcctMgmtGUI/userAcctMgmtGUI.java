package userAcctMgmtGUI;

import javax.swing.*;


public class userAcctMgmtGUI {


	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame mainFrame;
				try {
					mainFrame = new MainFrame("User Account Management System");
					mainFrame.setSize(300, 350);
					mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					mainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});

   }

}
