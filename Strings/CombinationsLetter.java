package Strings;

public class CombinationsLetter {
    public static void printSS(String s,int index,String ss){
        if(index==s.length()){
            System.out.println(ss+" ");
            return;
        }
          printSS(s,index+1,ss);
        printSS(s,index+1,ss+s.charAt(index));
    }
    
    public static void main(String[] args){
        String s="abc";
        int n=s.length();
        printSS(s,0,"");
    }
}
