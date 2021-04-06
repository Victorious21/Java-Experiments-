import java.util.Arrays;

public class ArrayGameSimple {
    public static void main(String[] args) {
        int[] player1cards = new int[10], player2cards = new int[10];
        int cardWinP1 = 0, cardWinP2 = 0, cardTie = 0, drawP1CardWin = 0, drawP2CardWin = 0;

        //----------------------------------------------------------

        //Generates the card value
        for (int i = 0; i < player1cards.length; i++) {
            player1cards[i] = (int) (Math.random() * 9) + 1;
            player2cards[i] = (int) (Math.random() * 9) + 1;
        }

        //----------------------------------------------------------

        System.out.println("This is a 2-Player card game. ");

        //Card values of player 1 and player 2 are printed and the rest of the code is based on this
        System.out.println("Player 1 cards: " + Arrays.toString(player1cards));
        System.out.println("Player 2 cards: " + Arrays.toString(player2cards));

        //----------------------------------------------------------

        //Compares the card values of P1 to P2
        for (int j = 0; j < player1cards.length; j++) {
            if (player1cards[j] < player2cards[j]) {
                cardWinP2++;
            } else if (player1cards[j] > player2cards[j]) {
                cardWinP1++;
            }

            //In an instance of a tie "draw 3 cards" and the best of 3 will decide the winner
            if (player1cards[j] == player2cards[j]) {
                cardTie++;
                System.out.println("There is a tie at the position where the value is: " + player1cards[j]);

                //In case of a tie - Draw Array
                int[] p1Draw = new int[3];
                int[] p2Draw = new int[3];

                //Giving values into the Array
                for (int l = 0; l < 3; l++) {
                    p1Draw[l] = (int) (Math.random() * 10);
                    p2Draw[l] = (int) (Math.random() * 10);
                }

                System.out.println("Player 1 draws 3 cards: " + Arrays.toString(p1Draw));
                System.out.println("Player 2 draws 3 cards: " + Arrays.toString(p2Draw));

                boolean stillTied = true;

                //Compares the values of each number in the +3 array
                while (stillTied) {
                    for (int p = 0; p < p1Draw.length; p++) {
                        //If p1 is greater than p2
                        if (p1Draw[p] > p2Draw[p]) {
                            drawP1CardWin++;
                        }
                        //If p2 is greater than p1
                        else if (p2Draw[p] > p1Draw[p]) {
                            drawP2CardWin++;
                        }

                        //In case of another tie (currently not working as intended:tm:)
                        else if (p1Draw[p] == p2Draw[p]) {
                            System.out.println("Another tie, each player draws 3 more cards");

                            //In case of another tie - Making a new Array
                            int[] p1DrawTie = new int[3];
                            int[] p2DrawTie = new int[3];

                            //Giving values into the new Array
                            for (int t = 0; t < 3; t++) {
                                p1DrawTie[t] = (int) (Math.random() * 10);
                                p2DrawTie[t] = (int) (Math.random() * 10);
                            }

                            System.out.println("Player 1 draws 3 cards: " + Arrays.toString(p1DrawTie));
                            System.out.println("Player 2 draws 3 cards: " + Arrays.toString(p2DrawTie));

                            for (int g = 0; g < p1DrawTie.length; g++) {
                                //If p1 is greater than p2
                                if (p1DrawTie[g] > p2DrawTie[g]) {
                                    drawP1CardWin++;
                                }
                                //If p2 is greater than p1
                                else if (p2DrawTie[g] > p1DrawTie[g]) {
                                    drawP2CardWin++;
                                }
                                stillTied = false;
                            }
                        }
                    }
                    //Prints the winner of the draw
                    if (drawP1CardWin > drawP2CardWin) {
                        System.out.println("Player 1 wins the draw!");
                        break;
                    }
                    else if (drawP2CardWin > drawP1CardWin) {
                        System.out.println("Player 2 wins the draw!");
                        break;
                    }
                }
            }
        }
        //Score Summary
        if (cardWinP1 > cardWinP2)
            System.out.println("Player 1 wins the set! \n Score Summary: \n -Total amount of ties: " + cardTie + " \n -Player 1 wins: " + cardWinP1 + " \n -Player 2 wins: " + cardWinP2);
        else if (cardWinP2 > cardWinP1)
            System.out.println("Player 2 wins the set! \n Score Summary: \n -Total amount of ties: " + cardTie + " \n -Player 1 wins: " + cardWinP1 + " \n -Player 2 wins: " + cardWinP2);
        else
            System.out.println("Set ends in a tie!");
    }
}
