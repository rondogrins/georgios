import java.awt.EventQueue;


public class Main {
//This launches the program, but the try catch was added automatically by the gui designer, necessary?
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calcDoc window = new calcDoc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
