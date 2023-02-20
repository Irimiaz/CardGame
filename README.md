# CardGame

Initially, I made a class for each card in the game and divided them into categories (Environment, Heroes, Minions). I used the abstract class basicCard to put in place all the common features of these cards. For each packet, I created several abstract classes to override the special attack of each card.

I created the CardConvert class with the convert function to convert the cards from CardInput into the type of card it should be, based on the name of the card. I created the DeleteCard class with the delete function to delete all cards from an array that have life equal to 0. In the Table package, I created the table class in which I kept all the relevant data about each match (such as the decks and the cards in the players' hands, the cards on the board, the currentTurn, each player's hand, each player's heroes.

In class myMain all the actions will take place. Once the players have a card in their hand, shuffled deck, empty table and hand equal to 1, the orders will start to appear. The two players take turns and depending on the name of the commands, the program will enter the "if" of the respective command. At the start of every turn, the hero's health is checked to be more than 0, and if not, only debug actions will work.

Once a hero dies, I will have to reset the decks, the table, the hand and the cards from the players' hands, to prepare a new game. It is important that the deck is not modified during a match, therefore it will be re-instantiated before each match.
