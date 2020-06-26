// NAME: 
// DATE:
// DESC: 

public class RPG {

// YouTube Link: https://www.youtube.com/watch?v=5qUQT9Z1wDE

    public static void main (String[] args) {
        
        final static String VERSION = "2020-SU-V0.9";
        final static boolean DEBUG = true;

        Character char1 = new Character("Stanwyck", 5, 5, 10, 0);
        Character char2 = new Character("Mindy", 10, 5, 5, 0);
        
        System.out.println(char1);
        System.out.println();
        System.out.println(char2);
        
        System.out.println();
        
        char1.attack(char2);
        char2.attack(char1);
        
        if (DEBUG) {
            System.out.println("**********************************");
            System.out.println(char1);
            System.out.println();
            System.out.println(char2);
            System.out.println("**********************************");
        }
        
        
        System.out.println();
        System.out.println("GAME OVER MAN!");
        
    }
    
}
