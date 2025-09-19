/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/* Name: Bao Toan Pham
   Student Number: 991783007
*/
package card;

import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random rd = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(1+ rd.nextInt(13));
            c.setSuit(Card.SUITS[rd.nextInt(4)]);
            magicHand[i] = c;
        }
        
            Scanner scan= new Scanner(System.in);
            System.out.print("Enter the value between 1 and 13: ");
            int cardValue = scan.nextInt();
            System.out.print("Enter the suit (Hearts, Diamonds, Spades, Clubs): ");
            String cardSuit = scan.nextLine();
            
            Card userCard = new Card();
            userCard.setValue(cardValue);
            userCard.setSuit(cardSuit);
            
            for (Card c: magicHand) {
                if(c.getValue() == userCard.getValue() && c.getSuit().equalsIgnoreCase(userCard.getSuit())){
                    System.out.print("Your card is in the magic hand of random cards");
                    return;
                }
            }
            System.out.print("Your card is not in the magic hand of random cards");

        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
    }
    
}
