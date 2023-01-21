import java.util.List;

public interface StockExchange {
    // -- You are NOT implementing this interface. --
    // You should mock it in your tests instead.

    enum Side {BUY, SELL}

    // Returns the three letter name of the exchange
    String getExchangeCode();

    // A record that stores data associated with an order.
    record Order(int id, String ticker, Side side, int quantity, int price, boolean filled) {}

    // An Exception for invalid orders being placed
    class InvalidOrderException extends RuntimeException {}

    // Returns true if a stock exists on this exchange, and false otherwise.
    boolean stockExists(String ticker);

    // The order method will return the order_id if the order can be made
    // It will throw an InvalidOrderException if the order can't be placed
    int placeOrder(String ticker, Side side, int quantity, int price);

    // Returns true if the order has been filled
    // Returns false otherwise
    boolean isFilled(int orderID);

    // Returns true if the order has been cancelled
    // Returns false if it can't be (i.e. it's already been filled.)
    boolean cancelOrder(int orderID);

    // Returns the Order associated with the orderID
    Order getOrder(int orderID);

    // This returns every order associated with a given ticker (e.g. stock) on this exchange.
    List<Order> getOrderBook(String ticker);
}
