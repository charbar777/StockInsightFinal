import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class StockInsightFrame extends JFrame
{
	private JLabel stockLabel;
	private JTextField stockField;
	private JButton button;
	private JLabel currentPriceLabel;
	private JPanel panel;
	private JPanel backgroundPanel;
	public static BackgroundPanel background;
	
	public static BackgroundPanel getBackgroundPanel()
	{
		return background;
	}
	public StockInsightFrame()
	{
		createBackground();
		createSearchBar();
		createButton();
		createPanel();
		setSize(1920,1080 );
		setTitle("Stock Insight");
		setFont(new Font("helvetica", 250, 250));
	}
	private void createBackground()
	{

	}
	
	private void createSearchBar()
	{
		stockLabel = new JLabel("Stock: ");
		stockLabel.setFont(new Font("helvetica", 250, 250));
		stockLabel.setForeground(Color.white);
		stockField = new JTextField();
		stockField.setFocusable(true);
		stockField.setPreferredSize(new Dimension(500,250));
		stockField.setText("ticker symbol");
		stockField.setFont(new Font("Serif", 75, 75));
		
	}
	private void createButton()
	{
		button = new JButton("Search");
		button.setPreferredSize(new Dimension(500,250));
		button.setFont(new Font("Serif", 75, 75));
		class SearchStockListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				Stock myStock = new Stock(stockField.getText());
				String myStockPrice = myStock.returnCurrentPrice();
				
				panel.removeAll();
				
				
				currentPriceLabel = new JLabel(myStockPrice);
				currentPriceLabel.setFont(new Font("Serif", 75, 75));
				currentPriceLabel.setForeground(Color.white);
				panel.add(currentPriceLabel);
				revalidate();
				repaint();
			}
		}
		button.addActionListener(new SearchStockListener());
	}
	private void createPanel()
	{
		panel = new AbovePanel();
		backgroundPanel = new BellowPanel();
		backgroundPanel.setLayout(new BorderLayout());
		panel.add(stockLabel);
		panel.add(stockField);
		panel.add(button);
		backgroundPanel.add(panel, BorderLayout.CENTER);
		add(backgroundPanel);
	}
}
