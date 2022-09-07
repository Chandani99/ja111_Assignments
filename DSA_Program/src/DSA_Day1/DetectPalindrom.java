package DSA_Day1;

import java.util.Scanner;

public class DetectPalindrom {

    public static void ispalindrom(String str){
        String str2="";
        for(int i=str.length()-1; i>=0; i--){
            str2+=str.charAt(i);
        }
        if(str.equals(str2)){
             System.out.println("Yes");
        }
        else{
             System.out.println("No");
        }
       
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.next();
        ispalindrom(str);
    }

}
