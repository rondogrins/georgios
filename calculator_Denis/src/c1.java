//components added manually
//less lines of code, but harder to plan final appearance of calculator

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class c1 extends JFrame implements ActionListener {
    
    JButton btn1 = new JButton("1");
    JButton btn2 = new JButton("2");
    JButton btn3 = new JButton("3");
    JButton btnAdd = new JButton("+");  
       
    JButton btn4 = new JButton("4");
    JButton btn5 = new JButton("5"); 
    JButton btn6 = new JButton("6");
    JButton btnMinus = new JButton("-");
    
    JButton btn7 = new JButton("7");
    JButton btn8 = new JButton("8");
    JButton btn9 = new JButton("9");
    JButton btnMultiply = new JButton("*");
    
    JButton btn0 = new JButton("0");
	JButton btnDivide = new JButton("/");
	JButton btnEquals = new JButton("=");
	JButton btnClear = new JButton("C");
    TextField textField=new TextField(15);

    String strNum2 = "";  
	String strNum = "";
	String operator;
	float numOne = 0f;
	float numTwo = 0f;
	float result = 0f;
	int calcType = 0;
    
    public c1() {
        
        JFrame frame = new JFrame("CALCULATOR");
        frame.setSize(320,320);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());
        
        JPanel numPanel = new JPanel();
        JPanel labelPanel = new JPanel();
        labelPanel.setBackground(Color.WHITE);
        numPanel.setLayout(new GridLayout(4,4));
        labelPanel.setLayout(new FlowLayout());
    	
        ListenForKeys lForKeys = new ListenForKeys();
        
        //add buttons to panel and assign listeners
        numPanel.add(btn1);
        numPanel.add(btn2);
        numPanel.add(btn3);
        numPanel.add(btnAdd);
		btn1.addActionListener(lForKeys);
		btn2.addActionListener(lForKeys);
		btn3.addActionListener(lForKeys);
		btnAdd.addActionListener(lForKeys);
		
		numPanel.add(btn4);
        numPanel.add(btn5);
        numPanel.add(btn6);
        numPanel.add(btnMinus);
        btn4.addActionListener(lForKeys);
		btn5.addActionListener(lForKeys);
		btn6.addActionListener(lForKeys);
		btnMinus.addActionListener(lForKeys);
		
        numPanel.add(btn7);
        numPanel.add(btn8);
        numPanel.add(btn9);
        numPanel.add(btnDivide);
        btn7.addActionListener(lForKeys);
		btn8.addActionListener(lForKeys);
		btn9.addActionListener(lForKeys);
		btnDivide.addActionListener(lForKeys);
       
		numPanel.add(btnClear);
        numPanel.add(btn0);
        numPanel.add(btnEquals);
        numPanel.add(btnMultiply);
        btnMultiply.addActionListener(lForKeys);
        btn0.addActionListener(lForKeys);
        btnClear.addActionListener(lForKeys);
        btnEquals.addActionListener(lForKeys);

        //set colours

        btnAdd.setBackground(Color.BLACK);
        btnAdd.setForeground(Color.WHITE);
        btnMinus.setBackground(Color.BLACK);
        btnMinus.setForeground(Color.WHITE);
        btnDivide.setBackground(Color.BLACK);
        btnDivide.setForeground(Color.WHITE);
        btnClear.setBackground(Color.BLACK);
        btnClear.setForeground(Color.WHITE);
        btnEquals.setBackground(Color.BLACK);
        btnEquals.setForeground(Color.WHITE);
        btnMultiply.setBackground(Color.BLACK);
        btnMultiply.setForeground(Color.WHITE);
        
        labelPanel.add(textField);
        textField.setEditable(false);
        
        frame.add(numPanel,BorderLayout.CENTER);
        frame.add(labelPanel,BorderLayout.NORTH);
        
    }
    	private class ListenForKeys implements ActionListener{
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
    		            btnClear.setBackground(Color.BLACK);
    					
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
			            btnDivide.setEnabled(false);
			            btnMultiply.setEnabled(false);
			            btnEquals.setEnabled(false);
			            btnClear.setBackground(Color.GREEN);
        }
        else { textField.setText("invalid input"); }
    }
    
    }
    	
    	//eclipse inserted this
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}

}

    