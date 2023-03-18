package az.orient.task;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("I ifadeni daxil edin :");
        String strFirst = sc.nextLine();
        System.out.println("II ifadeni daxil edin :");
        String strSecond = sc.nextLine();
        if(isAnagram(strFirst,strSecond)){
            System.out.println("ANAGRAM-DIR");
        }else{
            System.out.println("ANAGRAM DEYILDIR");
            return;
        }
    }
    protected static boolean isAnagram(String strFirst , String strSecond){
        int strFirstLen = strFirst.length();
        int strSecondLen = strSecond.length();
        if(strFirstLen!=strSecondLen){
            System.out.println("Daxil edilen sozlerin herfleri sayi beraber deyildir!");
            return false;
        }
        char[] strFirstToCharArray = strFirst.toCharArray();
        //listen -> 'l' 'i' 's' 't' 'e' 'n'
        char[] strSecondToCharArray = strSecond.toCharArray();
        //silent -> sort -> 's' 'i' 'l' 'e' 'n' 't'
        Arrays.sort(strFirstToCharArray);
        //listen -> sort -> 'e' 'i' 'l' 'n' 's' 't'
        Arrays.sort(strSecondToCharArray);
        //silent -> sort -> 'e' 'i' 'l' 'n' 's' 't'
        for(int i = 0 ; i<strFirstLen; i++){
            if(strFirstToCharArray[i]!=strSecondToCharArray[i]){
                return false;
            }
        }
        return true;

    }
}
