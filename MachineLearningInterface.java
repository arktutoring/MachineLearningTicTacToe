package main;

import java.awt.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Wed Mar 14 15:46:03 EDT 2018
 */



/**
 * @author Joseph Arakelian
 */
public class MachineLearningInterface extends JFrame {
	public MachineLearningInterface() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Joseph Arakelian
		lbl_instruct = new JLabel();
		dt_input = new JFormattedTextField();
		btn_check = new JButton();
		lbl_result = new JLabel();
		dt_result = new JLabel();

		//======== this ========
		Container contentPane = getContentPane();
		contentPane.setLayout(new GridLayout(3,3));

		//---- lbl_instruct ----
		lbl_instruct.setText("Enter Data String:");
		lbl_instruct.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lbl_instruct);
		contentPane.add(new JLabel());
		contentPane.add(dt_input);

		//---- btn_check ----
		btn_check.setText("Check");
		contentPane.add(btn_check);

		//---- lbl_result ----
		lbl_result.setText("Result:");
		lbl_result.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(lbl_result);

		//---- dt_result ----
		dt_result.setText("\"RESULT\"");
		contentPane.add(dt_result);
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Joseph Arakelian
	private JLabel lbl_instruct;
	private JFormattedTextField dt_input;
	private JButton btn_check;
	private JLabel lbl_result;
	private JLabel dt_result;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
	
	public static void main(String args[]) {
		MachineLearningInterface frame = new MachineLearningInterface();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
