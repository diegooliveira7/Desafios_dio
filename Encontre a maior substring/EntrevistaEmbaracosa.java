import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntrevistaEmbaracosa {

    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String nextWord;

        while((nextWord = in.readLine()) != null){//Essa parte pode lançar uma excessão
            boolean find = false;
            for(int i=0; i <= nextWord.length() - 1; i++) {
                if( nextWord.substring(0, i).endsWith(nextWord.substring(i)) ) {//Ele está separando uma substring e comparando com as 
                    System.out.println(nextWord.substring(0, i));
                    find = true;
                }
            }
            if(!find) 
              System.out.println(nextWord);
        }
    }
}
