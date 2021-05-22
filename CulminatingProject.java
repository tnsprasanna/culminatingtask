/**
 * Prasanna Thallapalli (662296) & Afreen Ahmed (637186)
 * July 25th, 2019
 * CandyLand Culminating Project Game!
 */
import java.util.Scanner; //import the Scanner class
public class CulminatingProject { //creating the class (named CulminatingProject)

    public static void main (String[] args) //create the main method
    {
        int points=0; //points variable to accumulate user's points until the end of game.
        title(points); //calling first method (title).
 
    }
    
    public static void title(int points) //from the main method, points variable is passed to each method to accumulate the total points
    {
        Scanner object = new Scanner (System.in); //create an object of the Scanner class
        System.out.println ("   ___  ___  __  __ ____   _  _ __     ___  __  __ ____  ");
        System.out.println ("  //   // \\\\ ||\\ || || \\\\  \\\\// ||    // \\\\ ||\\ || || \\\\ ");
        System.out.println (" ((    ||=|| ||\\\\|| ||  ))  )/  ||    ||=|| ||\\\\|| ||  ))");
        System.out.println ("  \\\\__ || || || \\|| ||_//  //   ||__| || || || \\|| ||_// ");
        
        System.out.println ("  ___  ___  ___  ___  ___.---------------.");
        System.out.println (".'\\__\\'\\__\\'\\__\\'\\__\\'\\__,`   .  ____ ___ \\");
        System.out.println ("|\\/ __\\/ __\\/ __\\/ __\\/ _:\\   |`.  \\  \\___ \\");
        System.out.println (" \\\\'\\__\\'\\__\\'\\__\\'\\__\\'\\_`.__|\"\"`. \\  \\___ \\");
        System.out.println ("  \\\\/ __\\/ __\\/ __\\/ __\\/ __:                \\");
        System.out.println ("   \\\\'\\__\\'\\__\\'\\__\\ \\__\\'\\_;-----------------`");
        System.out.println ("    \\\\/   \\/   \\/   \\/   \\/ :               hh|");
        System.out.println ("     \\|______________________;________________|");
        
            try { 
                Thread.sleep(1500); //The thread.sleep method is used to pause the execution of the next line of code for a certain amount of milliseconds.
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        System.out.println ("\n\nWelcome to CandyLand! Do YOU like CANDY? Do YOU wanna win some CANDY?"); //instructions and welcome screen
        System.out.println ("Well, this is the game for YOU! This game will include many puzzles \nfor you to solve. You'll get a specific candy based on your efforts throughout this game!");
        
        System.out.println ("\nAre you willing to take on the challenge? (y/n) ");
        char challenge = object.next().charAt(0);
        
        switch (challenge)
        {
            case 'y':
            case 'Y':
                screen2(points); //calls next method if they want to play the game
                break;
            case 'n':
            case 'N':
                System.exit(0); //exits program if user doesn't want to play
                break;
            default:
            {
                System.out.println ("Invalid entry, please try again.\n");
                title(points); //If user inputs any other character other than 'y' or 'n', then it calls this method again so they can input a valid entry.
            }
                
        }
        
    }
    
   public static void screen2(int points)
   {
       Scanner object = new Scanner (System.in); 
       try {
                Thread.sleep(1500);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

       System.out.println ("\n【G】【A】【M】【E】 【1】");

        //the magic 8 ball will randomly selects a Skittles colour
        
        System.out.println ("\nWelcome to the first game! You need to shake magic 8 ball to get a Skittle candy colour.\nBased on what colour you get, you will be awarded points.");
        
        System.out.println ("\nThis game is easy, enter 's' to shake the magic 8 ball.");
        char shake = object.next().charAt(0);
        
        switch (shake)
        {
            case 's':
            case 'S':
                
        int num = (int) (Math.random () * 10) + 1; //Math.random is used to generate a random number that corresponds to a Skittles candy colour which awards points. 
        System.out.println ("\nThe Magic 8 Ball Skittle Selector says: \n");
        if (num == 1)
        {
            System.out.println ("\nYou got red, you earn 2 points");
            points+=2; //adds 2 points to the user's total
        }
    
        else if (num == 2)
        {
            System.out.println ("\nYou got green, you earn 4 points");
            points+=4; //adds 4 points to the user's total
        }
            
        else if (num == 3)
        
            System.out.println ("\nYou got blue, you earn 0 points"); //earn no points if this option gets selected
        
            
        else if (num == 4)
        {
            System.out.println ("\nYou got purple, you earn 1 point");
            points++; //adds 1 points to the user's total
        }
            
        else 
        {
            System.out.println ("\nYou got yellow, you earn 10 points. This is the highest!");
            points+=10; //adds 10 points to the user's total
        }
        break;
        
        default:
        {
            System.out.println ("\nInvalid entry, please try again!");
            screen2(points); //If user inputs any other character other than 's' or 'S' then it calls this method again so they can input a valid entry.
            break;
        }
        }
        
        screen3(points); //calls the next method
            
   }
       
        public static void screen3(int points)
        {
            Scanner object = new Scanner (System.in);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

            System.out.println ("\n【G】【A】【M】【E】 【2】");
            
            System.out.println ("\nIn the second game, you have to solve a math question. What is 12÷2(1+5)? ");
            int question = object.nextInt();
            
            if (question==36)
            {
                System.out.println ("\nCorrect! You get 2 points!");
                //adds 2 points if the answer is correct
                points+=2;
            }

            else 
                System.out.println ("\nIncorrect.");
            //no points will be added if it's incorrect
            
            unscramble(points); //calls the next method
       
        }
        
        public static void unscramble(int points)
        {
           Scanner object = new Scanner (System.in);
           try {
                Thread.sleep(1500);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

           System.out.println ("\n【G】【A】【M】【E】 【3】");
           System.out.println ("\nThis is the third game, unscramble the following letters which will form a candy's name.");
           System.out.println ("\nThe letters are: iattkk "); //scrambled letters
           
           String word = object.nextLine();

           
           if (word.equalsIgnoreCase ("kitkat"))
           {
               System.out.println ("\nCorrect! You can go onto the next challenge. You get 2 points!\n");
               points+=2; //adds 2 points if the answer is correct
           }

           else

               System.out.println ("\nIncorrect.\n");
               //no points will be added if it's incorrect
           
           riddle(points); //calls the next method
        }
   
   
        public static void riddle(int points)
        {
            Scanner object = new Scanner (System.in);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

            System.out.println ("\n【G】【A】【M】【E】 【4】");
            System.out.println ("In the fourth game, you must answer a riddle to proceed! ");
            System.out.println ("RIDDLE: What candy has two female pronouns? ");
            String riddle = object.nextLine();
            
            //checks for uppercase and lowercase of the correct answer, as well as checking for the apostrophe in the word.
            if (riddle.equalsIgnoreCase ("Hershey's") || riddle.equalsIgnoreCase ("Hersheys") || riddle.equalsIgnoreCase ("Hershey"))
            {
                System.out.println ("\nCorrect, great job! You get 3 points!");
                points +=3; //adds 3 points if the answer is correct
            }

            else 
            
                System.out.println ("\nIncorrect.");
                //no points will be added if it's incorrect
            
                 end(points); //calls the next method (last one)
                
        }
        
        public static void end(int points)
        {
            System.out.println("\n. . . . . . . . . . . . . . . . ");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            
            System.out.println ("【THE】【END】");
            System.out.println ("\nCongratulations! You have earned " +points+ " point(s)!"); //adds up and outputs the user's total 
            
            
            //depending on the user's score, it will print a different candy prize.
            if (points==0)
                System.out.println ("\nSorry, you don't get any candy. Better luck next time! :-( ");
            else if (points>0 && points<=5)
                System.out.println ("\nYou get black licorice as your candy prize!");
            else if (points>5 && points<=10)
                System.out.println ("\nYou get candy corn as your candy prize!");
            else if (points>10 && points<=15)
                System.out.println ("\nYou get Twix as your candy prize!");
            else
                System.out.println ("\nYou get a life time supply of Lindor Chocolates! YAY! ");
            
                try {
                Thread.sleep(1500);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
                //balloon ascii art (since they completed the game!)
                System.out.println("\n        ,,,,,,,,,,,,,");
                System.out.println("    .;;;;;;;;;;;;;;;;;;;,.");
                System.out.println("  .;;;;;;;;;;;;;;;;;;;;;;;;,");
                System.out.println(".;;;;;;;;;;;;;;;;;;;;;;;;;;;;.");
                System.out.println(";;;;;@;;;;;;;;;;;;;;;;;;;;;;;;' .............");
                System.out.println(";;;;@@;;;;;;;;;;;;;;;;;;;;;;;;'.................");
                System.out.println(";;;;@@;;;;;;;;;;;;;;;;;;;;;;;;'...................");
                System.out.println("`;;;;@;;;;;;;;;;;;;;;@;;;;;;;'.....................");
                System.out.println(" `;;;;;;;;;;;;;;;;;;;@@;;;;;'..................;....");
                System.out.println("   `;;;;;;;;;;;;;;;;@@;;;;'....................;;...");
                System.out.println("     `;;;;;;;;;;;;;@;;;;'...;.................;;....");
                System.out.println("        `;;;;;;;;;;;;'   ...;;...............;.....");
                System.out.println("           `;;;;;;'        ...;;..................");
                System.out.println("              ;;              ..;...............");
                System.out.println("              `                  ............");
                System.out.println("             `                      ......");
                System.out.println("            `                         ..");
                System.out.println("           `                           '");
                System.out.println("          `                           '");
                System.out.println("         `                           '");
                System.out.println("        `                           `");
                System.out.println("        `                           `,");
                System.out.println("        `");
                System.out.println("         `");
                System.out.println("           `.");
                
            
        
        }
        
}