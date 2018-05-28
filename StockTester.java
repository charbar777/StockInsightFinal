
public class StockTester 
{
	public static void main(String[] args)
	{
	Stock myStock = new Stock("FB");
	String myStockPrice = myStock.returnCurrentPrice();
	System.out.println(myStockPrice);
	}

}
