import java.util.*;   
class Palindrome 
{  
   public static void main(String args[])  
   {  
      String work = ""; // Objects of String class  
      Scanner in = new Scanner(System.in);   
      System.out.println("Enter a string to check if it is a palindrome");  
      work = in.nextLine(); 
      int l = 0;
      int r = work.length() - 1; 
      while( r > l )
      {
         if(work.charAt(l++) != work.charAt(r--))
         {
            System.out.println("Entered string isn't a palindrome.");  
            return;
         }
      }
      System.out.println("Entered string is a palindrome."); 
 
 }
}  