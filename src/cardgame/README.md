# Card game

In this problem, you will implement logic that deals hands from a deck of
playing cards, as for a card game.

We've provided you with a class [`Card`](Card.java), which represents a single
card. While you do not have to understand it completely, read it over to gain
a basic understanding.

We've also provided you wiht a class [`Dealer`](Dealer.java). Your task is
to implement the method `deal()`, which deals cards from a shuffled deck into
hands. The number of hands (players in the card game) and cards in each hand
are passed as arguments. 

This method already contains logic that returns shuffled deck of cards as a list
of `Card` instances in a random order. You do not need to understand how it
works. Use this method to obtain a shuffled deck, and deal the cards to the
players from the deck.

The `Dealer.main()` method prints out the hands you've produces. You may use
this to inspect the output of your method.

