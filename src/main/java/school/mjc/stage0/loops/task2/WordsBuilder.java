package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        String word = "";
        int a=0;
        while(a<chars.length){
            word+=chars[a];
            a++;
        }
        System.out.print(word);
    }

}
