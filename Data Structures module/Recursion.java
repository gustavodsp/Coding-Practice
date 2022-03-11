public class Recursion{

    //SLIDES RECURSION

    public static int power(int i, int j){
        if(j==0){
            return 1;
        }
        else if(j==1){
                return i;
        }
        
        return i*power(i,j-1);

    }

    public static boolean palindrome(String s){
        if(s.length()<=1){
            return true;
        }
        else if(s.charAt(0)==s.charAt(s.length()-1)){
            return palindrome(s.substring(1, s.length()-1));
        }
        else{
            return false;
        }
    }

    public static String reverse(String s){
        if(s.length()<=1){
            return s;
        }

        return s.charAt(s.length()-1)+reverse(s.substring(0,s.length()-1));
    }
    
    //LAB RECURSION

    public static int countHi(String s){

        if(s.length()<=1){
            return 0;
        }
        else{
            if(s.substring(0,2).equalsIgnoreCase("hi")) {
                return 1+countHi(s.substring(2,s.length()));
            }
            else{
                return countHi(s.substring(1, s.length()));
            }
        }

    }

    public static String xRemove(String s){
        if(s.length()<=1){
            if(s.charAt(0)=='x'){
                return "";
            }
            else{
                return s;
            }
        }
        else{
            if(s.charAt(0)=='x'){
                return xRemove(s.substring(1, s.length()));
            }
            else{
                return s.charAt(0)+xRemove(s.substring(1, s.length()));
            }
        }
    }

    public static boolean next10times(int[] n, int index){
        if(index==n.length-1){
            return false;
        }
        if(n[index]*10==n[index+1]){
            return true;
        }
        else{
            return next10times(n, index+1);
        }
           
    }

    public static String xToEnd(String s){

        

    }

    public static int sumDigits(int n){

        if(n<1){
            return 0;
        }

        return n%10+sumDigits(n/10);

    }

    public static String xToY(String s){

        if(s.length()<=1){
            if(s.charAt(0)=='x'){
                return "y";
            }
            else{
                return s;
            }
        }
        else{
            if(s.charAt(0)=='x'){
                return "y"+xToY(s.substring(1, s.length()));
            }
            else{
                return s.charAt(0)+xToY(s.substring(1, s.length()));
            }
        }

    }

    public static String cleanString(String s){



    }


    public static void main(String args[]){

        // System.out.println(power(2,3)); //8

        // System.out.println(palindrome("madam")); //true

        // System.out.println(reverse("gustavo")); //ovatsug

        // System.out.println(xRemove("xaxado")); //aado

        // System.out.println(countHi("hi a hiq shi")); //3

        // int n[] = new int[]{10,20,30,300,40}; 
        // System.out.println(next10times(n, 0)); //true

        // System.out.println(sumDigits(1269)); //18
        
        // System.out.println(xToY("coxinha")); //coyinha

    
    }
    
}