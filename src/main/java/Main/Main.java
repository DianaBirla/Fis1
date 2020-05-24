package Main;
import java.awt.EventQueue;
import Login.*;
public class Main {
	private static LoginInterface frame=new LoginInterface();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new LoginInterface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
