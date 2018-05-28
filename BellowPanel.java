import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class BellowPanel extends JPanel
{
	  Image bg = new ImageIcon("sanFran.jpg").getImage();
	
	    public void paintComponent(Graphics g) 
	    {
	        g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
	    }
 
}
