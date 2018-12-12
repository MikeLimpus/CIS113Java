
import javax.swing.JFrame;

public class InteractiveDriver {

	public static void main(String[] args) {
		
		// Create a frame (window) object
		JFrame frame = new JFrame("Counter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Add the custom panel to the frame
		frame.getContentPane().add(new CounterPanel());
		
		// The following will scale the frame to its contents
		frame.pack();
		
		// Actually displays the frame to the screen
		frame.setVisible(true);
	}

}
