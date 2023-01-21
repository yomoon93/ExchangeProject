# The Stock Brokerage
You have been charged with building the back-end to a stock-brokerage system. Users send their requests through a GUI (not actually implemented - but pretend it has been), which sends requests to your system. Your system then handles that request, doing whatever needs to be done.

The GUI has been written assuming certain functionality, so you'll be provided with an interface you need to implement. Similarly, you will be provided a stock exchange interface, which will provide you the ability to send requests (orders) to stock exchanges.

This project will happen in two parts: design and implementation.

## Part One
In the first part (this morning), you will work with your team to produce a design for your system. You should think about what classes need to exist, and what their responsibilities should be. Pay special attention to the flow of data through your program, and to the things that your program is required to do. What methods should your Account class have? What types exist in your program? Get ready to explain your design to the class, too. DO NOT WRITE CODE DURING THIS PHASE. You will not be able to use it later.

You will have access to the interfaces in this stage, and you should read them and understand what needs to be done. You should not write code.

## Part Two
In the second part (the afternoon), you will work implementing some of these classes. I'm not necessarily expecting you to complete everything, but you should work on implementing your systems as best you can. Use your design to hasten this along, and _divide work between your team_. You will have access to a bitbucket repository for your team, and you should make use of branches and pull requests to work on _different parts of your system_. Remember: tests.

Do not change either of the interfaces (StockExchange or StockBrokerage).
## REQUIREMENTS:
- The user should be able to create a Trader profile. Trader profiles have an ID number and a name.

- A Trader profile can have multiple Accounts associated with it. Accounts have a cash balance, a portfolio of stocks they own, and can be used to make Trades. An Account also has a type - BASIC or PRO.

- The user should be able to add a Trade to their Account. They should specify which StockExchange (by its three letter code) they want to trade on, and which stock (ticker) they wish to trade, and how many, at what price. An order has a SIDE - whether they're buying or selling.

- The trades in your system will be different from the orders in the stock exchanges that you'll be using. You'll need your system to remember which trades refer to which stock exchange and which order number on that exchange.

- Your system should check whether a given Trade is allowed. A Trade is allowed if: it is for a stock exchange that exists, the ticker code exists on that exchange, the account has enough money available (for buy orders) or is not selling stock the account doesn't have (for sell orders.)

- The user should be able to cancel trades that haven't been filled yet.

- Outstanding trades should take away from the AVAILABLE cash balance, but not take away from their actual balance until they have been completed.

- The user should be able to get their current portfolio for a given Account. They should also be able to get their balance, both available or real.

- Initially, you should ensure that the status of the Account and all of its outstanding Trades are checked whenever a request about that Account, or one of its Trades, is made. (See Optional Extras)

- You need to be able to add a new stock exchange to your stock brokerage - i.e. if the Bath Stock Exchange has just opened for business, you should be able to provide the exchangeName "BSE" and a corresponding StockExchange object. Users should now be able to trade on that exchange.

## OPTIONAL EXTRAS:
- Allow a PRO Account to short sell - e.g. sell stock that they do not own. This should lead to a negative quantity in their portfolio.

- Make sure your classes are _thread-safe_ - and then use threads to automatically poll the StockExchange associated with an order and update your brokerage's Trade data accordingly.

## SIMPLIFYING ASSUMPTIONS:
- Assume that all money is in whole numbers (e.g. price of $100 a share, or there's $100000 in your account - not $10.23.)

- Trades can only be completely filled (i.e. if you place an order for 10 AAPL, you can only have 0 or 10 of them, not fewer.)

- The ticker code for a stock is the same everywhere, and two stocks having the same ticker code means they're the same. (E.g. "ULVR" is the same stock on every exchange, and if two exchanges have the stock "ULVR", they refer to the same company.)

## OTHER NOTES:
- Do NOT write code during the first part of the exercise.

- Do NOT implement the StockExchange interface. You should mock it during your tests.

- You SHOULD be implementing the StockBrokerage interface, and this should be where the bulk of your functionality lies. Call your version [TeamName]Brokerage.

- At the very beginning, you should work together to create the method _stubs_ for any classes you decide to make. Then, you should push that to master, then assign certain bits of functionality to each person to complete.

- Each person should work on their own _feature branch_ based on what part of the functionality they're implementing.

- You are a team! Which means you can ask each other for help. Make sure you're all on the same page about how things should work.

- Once you have completed some functionality, create a pull request to merge your branch into master. You should NOT accept/merge your own pull requests - ask a teammate to do it.

- Try to make sure everyone has at least one opportunity to review a pull request. You should look through your colleague's code, and provide comments based on what they have done. Accept the PR only if you think it's complete and there are no changes that need to be made. Be constructive! (Also: make sure they have sufficient tests.)

- If you get a merge conflict with your pull requests, ask me.

- Every class you write should have tests. Remember to use mocking.

- You do NOT need to implement an interface of any description for this. If you want to run your code to make it work, you MAY make a BrokerageApplication class with a main method for testing.

- I will be acting as your customer, so if you have questions about the requirements, contact me. If you have questions about the instructions, check this document FIRST.