package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int a=0;
        if (multiplyByAndToInclusive!=0){
            while(a<=Math.abs(multiplyByAndToInclusive)){
                System.out.println(a*multiplyByAndToInclusive);
                a++;
            }
        }
    }
}
