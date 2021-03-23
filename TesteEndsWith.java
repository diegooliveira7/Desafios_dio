public class TesteEndsWith {
    public static void main(String[] args){
        String a = "bomdia";
        System.out.println("------------");
        System.out.println(a.endsWith("bomdia"));//Essa função serve para indentificar sufixos na frase
        for(int i = 0; i <= a.length(); i++){
            System.out.println(a.substring(i));//Nesse caso ele está recortando a string até chegar somente no final
        }
    }
}
