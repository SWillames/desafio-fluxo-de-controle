import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner terminal = new Scanner(System.in);
    System.out.println("Digite o primeiro parâmetro");
    int parametroUm = terminal.nextInt();
    terminal.nextLine();
    System.out.println("Digite o segundo parâmetro");
    int parametroDois = terminal.nextInt();
    terminal.nextLine();

    try {
      contar(parametroUm, parametroDois);
    } catch (InputMismatchException erro1) {
      System.err.println("Não é permitido inserir letras, informe apenas números inteiros!");
      terminal.nextLine();
    } catch (ParametrosInvalidosException erro2) {
      System.out.println(erro2.getMessage());
    }
  }


    static void contar(int parametroOne, int parametroTwo) throws ParametrosInvalidosException{
      if(parametroOne > parametroTwo) {
        throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
      }

      int total = parametroTwo - parametroOne;

      for(int i = 1; i <= total; i++) {
        System.out.println("imprimindo o numero "+ i);
      }
    }
  }
