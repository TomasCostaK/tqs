import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;

@ExtendWith(MockitoExtension.class)
public class ValueTest {

    @BeforeEach
    void setup(){
    }

    @Mock
    private IStockMarket marketMock;

    @InjectMocks
    StocksPortfolio portfolio;

    @Test
    public void test_total_value(){
        //expectations
        Mockito.when(marketMock.getPrice("NTFL")).thenReturn(2.0);
        Mockito.when(marketMock.getPrice("NBA")).thenReturn(3.0);

        //do test
        portfolio.addStock(new Stock("NTFL",2));
        portfolio.addStock(new Stock("NBA",3));

        double result = portfolio.getTotalValue();

        assertThat(result, is(13.0));
    }

}
