package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public static void buildPhrase(char... chars) {
        String word = "";

        for(int a = 0; a < chars.length; ++a) {
            word = word + chars[a];
        }

        System.out.print(word);
    }

}
