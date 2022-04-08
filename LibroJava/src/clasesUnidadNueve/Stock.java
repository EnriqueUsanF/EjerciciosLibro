package clasesUnidadNueve;

public class Stock {
	public String symbol;     
	public String name;   
	public double previousClosingPrice;
	public double currentPrice;

	public Stock(String newSymbol, String newName) {
		symbol = newSymbol;
		name = newName;
	}

	public double getChangePercent() {
		return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
	}
}
