# Blackjack Project

# Description
This project simulates a blackjack game using the java functional command line, through various classes, including abstract and enum classes. To play the game, the user will be prompted to enter their name in to the terminal. Then, the program dealer will deal cards to the user and itself, with one of their cards not visible to the user(player) of the program. It will also prompt the user, depending on the total value of their cards, to hit or stay. If, the user scores a perfect 21, the terminal will automatically display "Blackjack, you win" to the terminal. If the user decides to 'stay', the program will display the hidden card of the dealer and display the winner of the round.

 Each class has their own functionalities (methods), however some of the classes like the abstract hand class needed a few methods instantiated through the BlacjackHand class since it is unable to perform such a behavior on it's own.

As you can see, I needed to abstract attributes from other classes into the BlackjackApp class to invoke behaviors. For example, I had to instantiate the dealer and player classes to have them perform a particular behavior at different times throughout the program. 

#Technologies Used
Java, eclipse, OOP

# Lessons Learned
This project solidified my understanding the functions of the foreach loop, parameter passing, and polymorphism. Object-oriented Programming is becoming less foreign to me after coding a project such as this one. I did not understand the differences between the for loop and the foreach loop until I had to use each of them in this program. Now, I understand that with a for loop, the indices can be skipped over by setting 'int i' to any index within the collection that is being iterated through. Where as, the foreach loop will start at index 0 (no matter what) and proceed the iteration through the given collection from there. 

I still find polymorphism hard to comprehend. What I understand from it so far is that a method from a super class can be called from the subclass, but that simple understanding lead to issues with how to properly encapsulate each class. I know that I could encapsulate this program to ensure that my code is not repeated as much. I will have to tackle this project again, once I have a better understanding of how a super class works with it's subclasses.
