import java.util.*;
public class GuesserGame {
    public static void main(String[] args){
        Umpire umpire=new Umpire();
        umpire.umpireCalling();
    }
}
class GuessNumber{
    int guesserNumber;
    int guessNumber(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number from 1 to 10");
        guesserNumber=sc.nextInt();
        if(guesserNumber>=1 & guesserNumber<=10)
            return guesserNumber;
        else{
            System.out.println("guess the number again,the number "+guesserNumber+" you guessed is out of range");
            return guessNumber();
        }
    }
}
class Umpire{
    int guesserNumber;
    int player1;
    int player2;
    int player3;
   void compare(){
//        if(guesserNumber==player1&&guesserNumber==player2){
//            System.out.println("Player1 and Player2 are won");
//        }
       label1:if(guesserNumber==player1){
            if(guesserNumber==player2){
                if(guesserNumber==player3){
                    System.out.println("All are won");
                    break label1;
                }
                System.out.println("Player1 and Player2 are won");
                break label1;
            }else if(guesserNumber==player3){
                System.out.println("Player1 and Player3 have won");
                break label1;
            }
            System.out.println("Player1 has won");
        } else label2: if(guesserNumber==player2){
                if(guesserNumber==player3){
                    System.out.println("Player2 and Player3 have won");
                    break label2;
                }
                System.out.println("Player2 has won");
        }else if (guesserNumber==player3){
        System.out.println("Player3 has won");
        }else{
       System.out.println("All of the Players have lost");
        }
    }
    public void umpireCalling(){
       System.out.println("Guesser Guess the Number:");
       GuessNumber g=new GuessNumber();
       guesserNumber=g.guessNumber();
       System.out.println("Player1 guess the Number");
       GuessNumber player1=new GuessNumber();
       this.player1=player1.guessNumber();
       System.out.println("Player2 guess the Number");
       GuessNumber player2=new GuessNumber();
       this.player2=player2.guessNumber();
       System.out.println("Player3 guess the Number");
       GuessNumber player3=new GuessNumber();
       this.player3=player3.guessNumber();
       compare();
    }
}
