import java.util.Map;

public interface StockBrokerage {
    // -- You will be implementing this interface --
    // Call your class [YourTeamName]Brokerage

    // There are two account types: BASIC and PRO
    enum AccountType {BASIC, PRO}

    // This exception is thrown if an account can't be created
    class CantCreateAccountException extends RuntimeException { }

    // This exception is thrown if a trade is invalid
    class CantMakeTradeException extends RuntimeException {}

    // Creates a new trader; returns their ID number.
    int createTrader(String name);

    // Gets a trader's name given their id
    String getTraderName(int traderID);

    // Gets a trader's account ids given their id
    int[] getTraderAccounts(int traderID);

    // Creates an account; returns the new account id number
    // If the account can't be created, throws a CantCreateAccountException
    int createAccount(int traderID, AccountType type, int startingBalance);

    // Returns the current cash balance of an account
    int getBalance(int accountID);

    // Attempts to make a trade - returns the order ID of the Trade
    // NOTE: Your brokerage's trade IDs will be different to the order IDs provided by the exchanges
    // Throws a CantMakeTradeException if it is unable to do so
    int makeTrade(int accountID, String exchangeName, String ticker, int price, int quantity, String side);

    // Returns whether the trade has been filled on the exchange or not
    boolean tradeFilled(int tradeID);

    // Cancels a trade given a trade ID - returns true if it could be cancelled, and false if not.
    boolean cancelTrade(int tradeID);

    // Returns the number of each stock currently held by an account
    // NOTE: buying 10 APPL from the NYSE and 10 APPL from the LSE means you have 20 AAPL.
    Map<String, Integer> currentHoldings(int accountID);

    // Returns the current available cash balance of an account
    // The available balance is the total amount of cash minus the value of outstanding buy orders
    int getAvailableBalance(int accountID);

    // This adds a new stock exchange that can be ordered on
    boolean addStockExchange(String exchangeName, StockExchange exchange);
}
