import org.mockito.Mockito;
import java.util.ArrayList;

public class StocksPortfolio {
    private String name;
    private ArrayList<Stock> stocks;
    IStockMarket market = Mockito.mock( IStockMarket.class);

    public IStockMarket getMarketService(){
        return market;
    }

    public void setMarketService(IStockMarket stockMarket){
        this.market = stockMarket;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getTotalValue(){
        Double total = 0.0;
        for (Stock s : stocks){
            total += market.getPrice(s.getName());
        }
        return total;
    }

    public void addStock(Stock e){
        stocks.add(e);
    }
}
