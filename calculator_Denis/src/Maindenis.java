import java.awt.EventQueue;


public class Maindenis {
//This launches the program, but the try catch was added automatically by the gui designer, necessary?
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					denisCalculator window = new denisCalculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
