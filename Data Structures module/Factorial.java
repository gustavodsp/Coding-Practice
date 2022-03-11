public class Factorial{

    public static int fac(int n){

            int fac=1;
            for (int i=n;i>=1;i--){
                fac = fac*i;
            }

            return fac;
    }

    public static int recFac(int n){
        if(n==0){
            return 1;
        }
        
        return n*recFac(n-1);
    }

    public static void main(String args[]){
        
        System.out.println("Factorial of 5 using loop: "+fac(5));
        
        System.out.println("Factorial of 5 using resursive method: "+recFac(5));
    }

}

