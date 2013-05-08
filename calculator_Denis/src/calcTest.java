import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.UIManager;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.RowSpec;




public class calcTest {

	//window
	 JFrame frame;
	//display window
	JTextField textField = new JTextField();
	//number inputs
	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btn4 = new JButton("4");
	JButton btn5 = new JButton("5");
	JButton btn6 = new JButton("6");
	JButton btn7 = new JButton("7");
	JButton btn8 = new JButton("8");
	JButton btn9 = new JButton("9");
	JButton btn0 = new JButton("0");
	JButton btnDecimal = new JButton(".");
	//operators
	JButton btnMultiply = new JButton("*");
	JButton btnDivide = new JButton("/");
	JButton btnMinus = new JButton("-");
	JButton btnAdd = new JButton("+");
	JButton btnNegative = new JButton("+/-");
	JButton btnEquals = new JButton("=");
	JButton btnClear = new JButton("C");
	JButton btnBackspace = new JButton("<---");
	
	String strNum2 = "";
	String strNum = "";
	String operator;
	float numOne = 0f;
	float numTwo = 0f;
	float result = 0f;
	int calcType = 0;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calcTest window = new calcTest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calcTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		
		
		ListenForKeys lForKeys = new ListenForKeys();
		btn1.setBounds(72, 129, 39, 23);
		
		btn1.addActionListener(lForKeys);
		btn2.setBounds(116, 129, 39, 23);
		btn2.addActionListener(lForKeys);
		btn3.setBounds(160, 129, 39, 23);
		btn3.addActionListener(lForKeys);
		btn4.setBounds(72, 157, 39, 23);
		btn4.addActionListener(lForKeys);
		btn5.setBounds(116, 157, 39, 23);
		btn5.addActionListener(lForKeys);
		btn6.setBounds(163, 157, 39, 23);
		btn6.addActionListener(lForKeys);
		btn7.setBounds(72, 185, 39, 23);
		btn7.addActionListener(lForKeys);
		btn8.setBounds(116, 185, 39, 23);
		btn8.addActionListener(lForKeys);
		btn9.setBounds(163, 185, 39, 23);
		btn9.addActionListener(lForKeys);
		btn0.setBounds(116, 213, 39, 23);
		btn0.addActionListener(lForKeys);
		btnDecimal.setBounds(127, 241, 37, 23);
		btnDecimal.addActionListener(lForKeys);
		btnMultiply.setBounds(207, 185, 39, 23);
		
		btnMultiply.addActionListener(lForKeys);
		btnAdd.setBounds(206, 129, 41, 23);
		btnAdd.addActionListener(lForKeys);
		btnDivide.setBounds(208, 213, 37, 23);
		btnDivide.addActionListener(lForKeys);
		btnMinus.setBounds(208, 157, 37, 23);
		btnMinus.addActionListener(lForKeys);
		btnEquals.setBounds(160, 213, 41, 23);
		btnEquals.addActionListener(lForKeys);
		btnClear.setBounds(72, 213, 39, 23);
		btnClear.addActionListener(lForKeys);
		textField.setBounds(72, 69, 175, 55);
		
		//Start display screen properties
		textField.setForeground(new Color(0, 0, 0));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Impact", Font.PLAIN, 19));
		textField.setEditable(false);
		textField.setBackground(new Color(220, 220, 220));
		textField.setColumns(10);
		frame = new JFrame();
		frame.getContentPane().setForeground(UIManager.getColor("Button.disabledShadow"));
		frame.getContentPane().setBackground(UIManager.getColor("Button.shadow"));
		frame.setBounds(100, 100, 319, 348);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//End display screen properties
		
		
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnMinus.setVerticalAlignment(SwingConstants.TOP);
		btnMinus.setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(textField);
		frame.getContentPane().add(btn1);
		frame.getContentPane().add(btn2);
		frame.getContentPane().add(btn3);
		frame.getContentPane().add(btnAdd);
		frame.getContentPane().add(btn4);
		frame.getContentPane().add(btn5);
		frame.getContentPane().add(btn6);
		frame.getContentPane().add(btnMinus);
		frame.getContentPane().add(btn7);
		frame.getContentPane().add(btn8);
		frame.getContentPane().add(btn9);
		frame.getContentPane().add(btnMultiply);
		btnNegative.setBounds(72, 241, 49, 23);
		frame.getContentPane().add(btnNegative);
		frame.getContentPane().add(btnDecimal);
		btnBackspace.setBounds(170, 241, 77, 23);
		frame.getContentPane().add(btnBackspace);
		frame.getContentPane().add(btnClear);
		frame.getContentPane().add(btn0);
		frame.getContentPane().add(btnEquals);
		frame.getContentPane().add(btnDivide);
		
		/**
		 * end populating the screen with components
		 */
	}	private class ListenForKeys implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == btn1){
				
				textField.setText("1");
		           strNum+=textField.getText();
		           textField.setText(strNum);	

				
			}else if(e.getSource() == btn2){
				textField.setText("2");
		           strNum+=textField.getText();
		           textField.setText(strNum);
			}else if(e.getSource() == btn3){
				textField.setText("3");
		           strNum+=textField.getText();
		           textField.setText(strNum);
			}else if(e.getSource() == btn4){
				textField.setText("4");
		           strNum+=textField.getText();
		           textField.setText(strNum);
			}else if(e.getSource() == btn5){
				textField.setText("5");
		           strNum+=textField.getText();
		           textField.setText(strNum);
			}else if(e.getSource() == btn6){
				textField.setText("6");
		           strNum+=textField.getText();
		           textField.setText(strNum);
			}else if(e.getSource() == btn7){
				textField.setText("7");
		           strNum+=textField.getText();
		           textField.setText(strNum);
			}else if(e.getSource() == btn8){
				textField.setText("8");
		           strNum+=textField.getText();
		           textField.setText(strNum);
			}else if(e.getSource() == btn9){
				textField.setText("9");
		           strNum+=textField.getText();
		           textField.setText(strNum);
			}else if(e.getSource() == btn0){
				textField.setText("0");
		           strNum+=textField.getText();
		           textField.setText(strNum);
			}else if(e.getSource() == btnDecimal){
				textField.setText(".");
		           strNum+=textField.getText();
		           textField.setText(strNum);
		           
			}else if(e.getSource() == btnAdd){
				 
		        	//parse first string to float
		           numOne = Float.parseFloat(strNum);
		           //set text to +
		           textField.setText("+");
		           //get the text again after the +
		           strNum +=textField.getText();
		           //set the got text to string again
		           textField.setText(strNum);
		           //go to switch operation for 1
		           calcType=1;//addition 
		           
			}else if(e.getSource() == btnDivide){
				//parse first string to float
		           numOne = Float.parseFloat(strNum);
		           //set text to +
		           textField.setText("/");
		           //get the text again after the +
		           strNum +=textField.getText();
		           //set the got text to string again
		           textField.setText(strNum);
		           //go to switch operation for 1
		           calcType=4;//division
		           
			}else if(e.getSource() == btnMinus){
				//parse first string to float
		           numOne = Float.parseFloat(strNum);
		           //set text to +
		           textField.setText("-");
		           //get the text again after the +
		           strNum +=textField.getText();
		           //set the got text to string again
		           textField.setText(strNum);
		           //go to switch operation for 1
		           calcType=2;//subtraction 
		           
			}else if(e.getSource() == btnMultiply){
				//parse first string to float
		           numOne = Float.parseFloat(strNum);
		           //set text to +
		           textField.setText("*");
		           //get the text again after the +
		           strNum +=textField.getText();
		           //set the got text to string again
		           textField.setText(strNum);
		           //go to switch operation for 1
		           calcType=3;//multiplication
			}else if(e.getSource() == btnClear){
				numOne = 0f;
				 textField.setText("");
				 strNum = "";
			}
			
			else if(e.getSource()==btnEquals) {
		        
		            textField.setText("=");
		               strNum += textField.getText();
		               textField.setText(strNum);
		               btn1.setEnabled(false); 
			//where the math is calculated
			 switch(calcType) {
	            case 1: {
	            	   //string array add = nothing
	                   String[] addition = null;
	                   //remove the + sign from the second string
	                   addition = strNum.split("\\+");
	                   //get rid of the = sign and parse the second string to num2 value
	                   numTwo = Float.parseFloat(addition[1].replace("=",""));
	                   //do the math
	                result= numOne+numTwo;
	                //output the result
	                textField.setText(strNum+Float.toString(result));
	                break;
	            }
	            case 2: {
	            	//string array add = nothing
	                   String[] subtraction = null;
	                   //remove the + sign from the second string
	                   subtraction = strNum.split("\\-");
	                   //get rid of the = sign and parse the second string to num2 value
	                   numTwo = Float.parseFloat(subtraction[1].replace("=",""));
	                   //do the math
	                result= numOne-numTwo;
	                //output the result
	                textField.setText(strNum+ " " + Float.toString(result));
	                break;
	            }
	            case 3: {
	            	//string array add = nothing
	                   String[] multiplication = null;
	                   //remove the + sign from the second string
	                   multiplication = strNum.split("\\*");
	                   //get rid of the = sign and parse the second string to num2 value
	                   numTwo = Float.parseFloat(multiplication[1].replace("=",""));
	                   //do the math
	                result= numOne * numTwo;
	                //output the result
	                textField.setText(strNum+ " " + Float.toString(result));
	                break;
	            }
	            case 4: {
	            	//string array add = nothing
	                   String[] division = null;
	                   //remove the + sign from the second string
	                   division = strNum.split("\\/");
	                   //get rid of the = sign and parse the second string to num2 value
	                   numTwo = Float.parseFloat(division[1].replace("=",""));
	                   //do the math
	                result= numOne / numTwo;
	                //output the result
	                textField.setText(strNum+ " " + Float.toString(result));
	                break;
	           }
	            
	            }
		}	
	}
}
}
	
