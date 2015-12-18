
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import javax.swing.UIManager.*;
 public class Game
 {
 public static void main( String[] args )
 {
 
 try {
				for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
					if ("Nimbus".equals(info.getName())) {
						UIManager.setLookAndFeel(info.getClassName());
						break;
					}
				}
			} catch (Exception e) {
				// If Nimbus is not available, you can set the GUI to another look and feel.
	}
 GameFrame gf = new GameFrame();// create LabelFrame
 gf.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
 gf.setSize(300,300);
 //cf.setPreferredSize( new Dimension(200,250) );
 gf.setResizable(false);
 gf.setLocation(500,50);
 //cf.setMaximumSize(new Dimension(200,250));
 gf.setVisible(true);// display frame
 } // end main
}
