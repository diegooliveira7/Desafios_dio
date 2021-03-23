import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestesBufferedReader001 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] args) throws IOException{
        String a, b = "";
        a = in.readLine();//Quando eu chamo aqui é quando se chama uma linha 
        b = in.readLine();//Aqui também
        System.out.println(a);//Aqui somente mostra 
        System.out.println(b);//Aqui somente mostra
        System.out.println(a.length());//Aqui mostra a quantidade
    }
}
