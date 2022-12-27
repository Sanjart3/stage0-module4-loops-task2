package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int a=2;
        while (a<=printToInclusive){
            if (isprime(a)) {
                System.out.println(a);
            }
            a++;
        }
    }
    public boolean isprime(int num){
        if (num<1){
            return false;
        }else {
            for (int i=2;i<=Math.sqrt(num);i++){
                if (num%i==0) return false;
            }
            return true;
        }
    }
}
