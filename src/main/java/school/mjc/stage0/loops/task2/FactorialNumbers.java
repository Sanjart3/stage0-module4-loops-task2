package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int multi = 1;
        int incr = 1;
        while(incr<=printToInclusive){
            multi=multi*incr;
            System.out.println(multi);
            multi++;
        }
    }
}
