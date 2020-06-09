// Dave Ghidiu
// Demo for multidimensional arrays

import java.util.Scanner;

public class Arrays2D {
    
    public static void main (String[] args) {
        
        System.out.println("START DEMO\n");
        Scanner scanner = new Scanner(System.in);
        
        // int[] arr = {1, 2, 3};
        // System.out.println("arr = " + arr);
        // System.out.println("arr[0] = " + arr[0]);
        
        // // System.out.println();
        
        // // int[][] arr2d = {
        // //                   {1, 2, 3},
        // //                   {4, 5, 6},
        // //                   {7, 8, 9},
        // //                   {10, 11, 12}
        // //                 };
        
        // // System.out.println("arr2d = " + arr2d);
        // // System.out.println("arr2d[0] = " + arr2d[0]);
        // // System.out.println("arr2d[1][2] = " + arr2d[1][2]);
        

        
        
        // System.out.println(grades[0][0]);
        // System.out.println(grades[0][1]);
        // System.out.println(grades[0][2]);


        int grades[][] = new int[4][3];
        
        for (int i = 0; i < grades.length; i++) {
        
            System.out.println("Enter grades for Student #" + (i + 1));
        
            for (int j = 0; j < grades[i].length; j++) {
                
                System.out.println("Enter grade #" + (j+1) + ":");
                grades[i][j] = scanner.nextInt();
                
            }
            
            System.out.println();
            System.out.println("-----------------------");
            System.out.println();

        }
        
        System.out.println(grades[2][2]);



        
        System.out.println("\nGAME OVER MAN!");
        
        
    }
    
}




