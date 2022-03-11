public class PrimeNumbers{
    
    //Recursive solution to check if the number is prime
    public static boolean recursivePrime(int number, int check){ 

        if(number%check==0){ //Checking if the number has any other divisor
            return false; //If it has, number is not prime
        }
        if(check*2>=number){ //Checking the condition to finish the recursion
            return true; // If it hasn't any other division and recursion is finished, number is prime
        }
        return recursivePrime(number, check+1); //Calling self method passing the next integer to check
    }

    public static boolean recursivePrime(int number){
        return recursivePrime(number,2); //Method necessary to hide the parameter check=2 required 
    }


    //Iterative solution to check if the number is prime
    public static boolean iterativePrime(int number){
        for(int i=2;i*2<number;i++){ //Iterating through the numbers until the half of the target(enough to check if number is prime or not)
            if(number%i==0){
                return false; //If any of them is divisor of target number, it is not prime
            }
        }
        return true; //If the other return wasn't called, it means target number doesn't have any divisor, so it is prime
    }

    public static void main(String args[]){
        int[] numbers = {3,5,34,56,71,113,139,234}; //Array of numbers to be checked

        //Demonstration of iterative solution
        for(int i=0;i<numbers.length;i++){
            if(iterativePrime(numbers[i])){
                System.out.println("According to iterative solution, the number "+numbers[i]+" is Prime");
            }
            else{
                System.out.println("According to iterative solution, the number "+numbers[i]+" is not Prime");
            }
        }

        System.out.println("---------------------------------------------------------------------------");

        //Demonstration of recursive solution
        for(int i=0;i<numbers.length;i++){
            if(recursivePrime(numbers[i])){
                System.out.println("According to recursive solution, the number "+numbers[i]+" is Prime");
            }
            else{
                System.out.println("According to recursive solution, the number "+numbers[i]+" is not Prime");
            }
        }

    }


}