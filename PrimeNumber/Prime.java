package PrimeNumber;

public class Prime {
    public static void main(String[] args) {
        //Set limit to reach at that point
        int limit = 100;
        for (int i = 2; i <=limit ; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    static boolean isPrime(int num){
        //Checlking wether the nummber is prime
        if(num <=1) {
            return false;
        }
        for (int i = 2; i <Math.sqrt(num);i++){
            if(num%2 ==0){
                return false;
            }
        }
        return  true;
          }
}
