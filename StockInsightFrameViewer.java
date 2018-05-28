import javax.swing.JFrame;

public class StockInsightFrameViewer 
{
	public static void main(String[] args)
	{
		JFrame frame = new StockInsightFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setContentPane(StockInsightFrame.getBackgroundPanel());
		frame.setResizable(true);
	}
}
