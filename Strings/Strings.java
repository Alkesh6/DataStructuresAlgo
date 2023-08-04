package Strings;

public class Strings {
    public static boolean isPalindrome(String s){
        int n = s.length();
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }

    public static float getPath(String s){
        int x=0;
        int y=0;

        for(int i=0;i<s.length();i++){
            char dir = s.charAt(i);
            if (dir == 'N') {
                y++;
            }
            else if(dir == 'S'){
                y--;
            }
            else if(dir == 'W'){
                x--;
            }
            else{
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)(Math.sqrt(X2+Y2));
    }
    public static void main(String[] args) {
        Strings s1 = new Strings();
        // String str = "racecar";
        // System.out.println(s1.isPalindrome(str));
        String path = "NSW";
        System.out.println(s1.getPath(path));
    }
    
}
