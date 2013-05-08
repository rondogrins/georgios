import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.LayoutStyle.ComponentPlacement;

public class calcDoc {

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
	JButton btnEquals = new JButton("=");
	JButton btnClear = new JButton("C");
	
	String strNum2 = "";  
	String strNum = "";
	String operator;
	float numOne = 0f;
	float numTwo = 0f;
	float result = 0f;
	int calcType = 0;
	
	//why initialize?? 
	public calcDoc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//this was done automatically in the design tab
		//But the action listeners were added by me.
		//Tell each component where to go and tell it to 
		//go to lForKeys method each time it is clicked.
		ListenForKeys lForKeys = new ListenForKeys();
		btn1.addActionListener(lForKeys);
		btn2.addActionListener(lForKeys);
		btn3.addActionListener(lForKeys);
		btn4.addActionListener(lForKeys);
		btn5.addActionListener(lForKeys);
		btn6.addActionListener(lForKeys);
		btn7.addActionListener(lForKeys);
		btn8.addActionListener(lForKeys);
		btn9.addActionListener(lForKeys);
		btn0.addActionListener(lForKeys);
		btnDecimal.addActionListener(lForKeys);
		btnMultiply.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnMultiply.setForeground(new Color(255, 255, 255));
		btnMultiply.setBackground(new Color(0, 0, 0));
		
		btnMultiply.addActionListener(lForKeys);   
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAdd.setForeground(new Color(255, 255, 255));
		btnAdd.setBackground(new Color(0, 0, 0));
		btnAdd.addActionListener(lForKeys);
		btnDivide.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnDivide.setForeground(new Color(255, 255, 255));
		btnDivide.setBackground(new Color(0, 0, 0));
		btnDivide.addActionListener(lForKeys);
		btnMinus.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnMinus.setForeground(new Color(255, 255, 255));
		btnMinus.addActionListener(lForKeys);
		btnEquals.addActionListener(lForKeys);
		btnClear.addActionListener(lForKeys);
		btnDecimal.setEnabled(false);
		btnDecimal.setVisible(false);
		
		//Start display screen properties
		textField.setForeground(new Color(0, 0, 0));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Impact", Font.PLAIN, 19));
		textField.setEditable(false);
		textField.setBackground(new Color(204, 204, 204));
		textField.setColumns(10);
		frame = new JFrame("Calculator by Denis");
		frame.setResizable(false);
		frame.getContentPane().setEnabled(false);
		frame.getContentPane().setForeground(UIManager.getColor("Button.disabledShadow"));
		frame.getContentPane().setBackground(new Color(153, 153, 255));
		frame.setBounds(100, 100, 302, 334);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//End display screen properties

		/**
		 * add components to window
		 */
		btnMinus.setVerticalAlignment(SwingConstants.TOP);
		btnMinus.setBackground(new Color(0, 0, 0));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(51)
							.addComponent(btn4)
							.addGap(5)
							.addComponent(btn5)
							.addGap(6)
							.addComponent(btn6)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnMinus, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(51)
							.addComponent(btn7)
							.addGap(5)
							.addComponent(btn8)
							.addGap(6)
							.addComponent(btn9)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnMultiply))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(51)
							.addComponent(btnClear)
							.addGap(5)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btnDecimal, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btn0, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(5)
							.addComponent(btnEquals)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnDivide, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(51)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btn1)
									.addGap(5)
									.addComponent(btn2)
									.addGap(5)
									.addComponent(btn3)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(btnAdd)))))
					.addGap(59))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(46)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btn1)
						.addComponent(btn2)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(btn3)
							.addComponent(btnAdd)))
					.addGap(7)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btn4)
						.addComponent(btn5)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(btn6)
							.addComponent(btnMinus)))
					.addGap(8)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btn7)
						.addComponent(btn8)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(btn9)
							.addComponent(btnMultiply)))
					.addGap(8)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnClear)
						.addComponent(btn0)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnEquals)
							.addComponent(btnDivide)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnDecimal)
					.addGap(50))
		);
		frame.getContentPane().setLayout(groupLayout);
		/**
		 * end populating the screen with components
		 */
		
	}	private class ListenForKeys implements ActionListener{
		public void actionPerformed(ActionEvent e){
			//give the buttons functionality
			if(e.getSource() == btn1){
					//if btn1 is clicked then set the text in the textField to 1
					textField.setText("1");
					//variable strNum stores everything that is entered to textfield
		           	strNum+=textField.getText();
		           	//necessary to keep the 
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
		        if(strNum.contains(".")){
		        	textField.setText(""); 
		        }else if(Float.toString(numOne).contains(".")){
//		        textField.setText(".");
		        strNum += ".";
//		        strNum +=textField.getText();
		        textField.setText(strNum); 
		        }else
		        	strNum += ".";
			}else if(e.getSource() == btnAdd){
					//parse first string to float and store it to a variable
		           	numOne = Float.parseFloat(strNum);
		           	//add + symbol to the display
		           	textField.setText("+");
		           	//get the numbers the user inputs
		           	strNum +=textField.getText();
		           	//keep the whole equation on the display throughout
		           	textField.setText(strNum);
		           	//go to switch operation for 1
		           	calcType=1;//addition 
		           
			}else if(e.getSource() == btnDivide){
					numOne = Float.parseFloat(strNum);
					textField.setText("/");
					strNum +=textField.getText();
					textField.setText(strNum);
					calcType=4;//division
		           
			}else if(e.getSource() == btnMinus){
		           	numOne = Float.parseFloat(strNum);
		           	textField.setText("-");
		           	strNum +=textField.getText();
		           	textField.setText(strNum);
		           	calcType=2;//subtraction 
		           
			}else if(e.getSource() == btnMultiply){
			        numOne = Float.parseFloat(strNum);
			        textField.setText("*");
			        strNum +=textField.getText();
			        textField.setText(strNum);
			        calcType=3;//multiplication
			        
			}else if(e.getSource() == btnClear){
					//clear the screen and the memory of the calculation
					numOne = 0f;
					textField.setText("");
					strNum = "";
					btn0.setEnabled(true);
		            btn1.setEnabled(true);
		            btn2.setEnabled(true);
		            btn3.setEnabled(true);
		            btn4.setEnabled(true);
		            btn5.setEnabled(true);
		            btn6.setEnabled(true);
		            btn7.setEnabled(true);
		            btn8.setEnabled(true);
		            btn9.setEnabled(true);
		            btnAdd.setEnabled(true);
		            btnMinus.setEnabled(true);
		            btnMultiply.setEnabled(true);
		            btnDivide.setEnabled(true);
		            btnEquals.setEnabled(true);
		            
					
			}else if(e.getSource()==btnEquals) {
			        textField.setText("=");
			        strNum += textField.getText();
			        textField.setText(strNum);
			
			 switch(calcType) {
	            case 1: {
	            		//string array addition
	            		//have to use an array to access the split command to get rid of unrecognized operators
		                String[] addition = null;
		                //remove the + sign from the second string
		                addition = strNum.split("\\+");
		                //get rid of the = sign so that when you parse the second string to num2 value it makes sense as a float
		                numTwo = Float.parseFloat(addition[1].replace("=",""));
		                //do the math depending on the operator the user clicked
		                result= numOne+numTwo;
		                //output the result
		                textField.setText(strNum+Float.toString(result));
		                break;
	            }
	            case 2: {
		                String[] subtraction = null;
		                subtraction = strNum.split("\\-");
		                numTwo = Float.parseFloat(subtraction[1].replace("=",""));
		                result= numOne-numTwo;
		                textField.setText(strNum+ " " + Float.toString(result));
		                break;
	            }
	            case 3: {
		                String[] multiplication = null;
		                multiplication = strNum.split("\\*");
		                numTwo = Float.parseFloat(multiplication[1].replace("=",""));
		                result= numOne * numTwo;
		                textField.setText(strNum+ " " + Float.toString(result));
		                break;
	            }
	            case 4: {
	            
		                String[] division = null;
		                division = strNum.split("\\/");
		                numTwo = Float.parseFloat(division[1].replace("=",""));
		                result= numOne / numTwo;
		                textField.setText(strNum+ " " + Float.toString(result));
		                break;
	            	}
	           }//end switch
				 //disable all buttons until user 
				  	btn0.setEnabled(false);
		            btn1.setEnabled(false);
		            btn2.setEnabled(false);
		            btn3.setEnabled(false);
		            btn4.setEnabled(false);
		            btn5.setEnabled(false);
		            btn6.setEnabled(false); 
		            btn7.setEnabled(false);
		            btn8.setEnabled(false);
		            btn9.setEnabled(false);
		            btnAdd.setEnabled(false);
		            btnMinus.setEnabled(false);
		            btnMultiply.setEnabled(false);
		            btnDivide.setEnabled(false);
		            btnEquals.setEnabled(false);
		            
			}//end if else equals
		}//end actionPerformed
	}
}
	


