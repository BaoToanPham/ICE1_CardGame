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
                    
            Card luckyCard = new Card();
            luckyCard.setValue(5);
            luckyCard.setSuit("Hearts");
            
            for (Card c: magicHand) {
                if(c.getValue() == luckyCard.getValue() && c.getSuit().equalsIgnoreCase(luckyCard.getSuit())){
                    System.out.print("Lucky card found!");
                    return;
                }
            }
            System.out.print("Lucky card didn't found");

        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
    }
    
}
