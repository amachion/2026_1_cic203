import java.util.Scanner;

public class TesteExpressao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite sua expressao:");
        String expressao = sc.nextLine();
        PilhaChar p = new PilhaChar(20);
        boolean erro = false;
        for (int i=0; i<expressao.length() && !erro; i++) {
            if (expressao.charAt(i) == '(') 
                p.empilha('(');
            else if (expressao.charAt(i) == ')'){
                if (!p.pilhaVazia())
                    p.desempilha();
                else 
                    erro = true;
            }
        }
        if (erro || !p.pilhaVazia())
            System.out.println("expressso incorreta");
        else 
            System.out.println("expressao correta");
    }
}
