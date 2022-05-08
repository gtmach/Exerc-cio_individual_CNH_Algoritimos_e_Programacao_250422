import java.util.InputMismatchException; //importa exception que pode ocorrer no codigo, ao entrar com dados em formato incorreto
import java.util.Scanner; //importa o scanner para receber entradas

public class cnh { //inicia classe
    public static void main(String[] args) { //inicia o metodo main
        try { // inicia o try para tentar pegar e tratar alguma possivel exepction
            System.out.println("Verifique se voce foi aprovado no teste de condutor"); //explica o que deve ser feito

            Scanner sc = new Scanner(System.in); //inicia o scanner

            System.out.print("Foi aprovado no exame psicotecnico? <s/n>: "); //texto para entrada
            String psicotecnico = sc.nextLine(); //salva entrada na variavel psicotecnico

            System.out.print("Foi aprovado no exame de legislacao? <s/n>: "); //texto para entrada
            String legislacao = sc.nextLine(); //salva entrada na variavel legislacao

            System.out.print("Foi aprovado no exame de direcao? <s/n>: "); //texto para entrada
            String direcao = sc.nextLine(); //salva entrada na variavel direcao

            if (psicotecnico.equals("s") && legislacao.equals("s")  && direcao.equals("s")) System.out.println("Voce foi aprovado"); //teste logico para verificar se todos foram "s"
            else if (psicotecnico.equals("n") || legislacao.equals("n")  || direcao.equals("n")) System.out.println("Voce nao foi aprovado"); //teste logicos para verificar se algum for "n"
            else { //else caso seja digitado outra letra ou frase fora destas opcoes
                System.out.println("Opcao invalida. Tente novamente."); //retorna esta reposta
                System.out.println("\n"); //pula linha
                cnh.main(args); //executa novamente o metodo main ao solicitar "tente novamente"
            }
        } catch (InputMismatchException ex) { //trata esta excesao, caso nao seja digitado uma int
            System.out.println("\n"); //pula linha
            System.err.println("Opcao invalida. Tente novamente."); //retorna texto em formato de erro
            System.err.println("Erro: InputMismatchException"); //retorna o texto em formato de erro
            System.out.println("\n"); //pula linha
            cnh.main(args); //executa o metodo main novamente, impedindo a finalizacao e permitimdo nova resposta
        }
    }
}