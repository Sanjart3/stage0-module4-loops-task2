package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        for(int a = 2; a <= printToInclusive; ++a) {
            if (this.isprime(a)) {
                System.out.println(a);
            }
        }

    }

    public boolean isprime(int num) {
        if (num < 1) {
            return false;
        } else {
            for(int i = 2; (double)i <= Math.sqrt((double)num); ++i) {
                if (num % i == 0) {
                    return false;
                }
            }

            return true;
        }
    }
}
