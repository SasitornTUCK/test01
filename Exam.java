// public class Exam {
//     public static void printStars(int number){ 
//        int i,j;
//        for(i=1;i<=number;i++){
//            for(j=1;j<=i;j++){
//                System.out.print("x");
//             }
//           System.out.println();
//         }
//     }
//     public static void main(String args[]){ 
//         int number = 10; 
//         printStars(number); 
//     } 
// }


// public class Exam{  
//     public static void printStars(int number){  
//         for (int i=0; i<number; i++){ 
//             for (int j=number-i; j>1; j--){ 
//                 System.out.print("0"); 
//             }  
//             for (int j=0; j<=i; j++ ){ 
//                 System.out.print("x"); 
//             } 
//             System.out.println(""); 
//         } 
//     } 
//     public static void main(String args[]){ 
//         int number = 10; 
//         printStars(number); 
//     } 
// }

public class Exam{  
    public static void printStars(int number){  
        for (int i=0; i<number; i++){ 
            for (int j=number-i; j>1; j--){ 
                System.out.print("0"); 
            }  
            for (int j=0; j<=i; j++ ){ 
                System.out.print("x"); 
            } 
            for (int j=number; j>=i-1;j--){ 
                System.out.print("0"); 
            }  
            System.out.println(); 
        } 
    } 
    public static void main(String args[]){ 
        int number = 10; 
        printStars(number); 
    } 
}