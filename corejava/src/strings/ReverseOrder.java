package strings;

import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class ReverseOrder 
{ 
               public static void main(String[] args) 
         { 
                     System.out.print("Enter a Sentence : "); 
                     Scanner s=new Scanner(System.in); 
                     String a=s.nextLine(); 
                     Stack<String> sta=new Stack<>(); 
                     StringTokenizer st=new StringTokenizer(a); 
                           while(st.hasMoreTokens()) 
                                   { 
                                       sta.push((String) st.nextElement()); 
                                   } 
                                       System.out.println("\nOriginal string : " + a); 
                                       System.out.print("Reverse Order Words : "); 
                                             while(!sta.empty()) 
                                                     { 
                                                         System.out.print(sta.pop()); 
                                                         System.out.print(" "); 
                                                     } 
                                                         
            }                      
} 