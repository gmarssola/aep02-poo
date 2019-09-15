package aep02.java;

import aep02.java.Avaliação;
import aep02.java.Aluno;

public class App{

  private static void exibirAvaliação(Avaliação avaliação){
    System.out.println("Prova: "+ avaliação.getAvaliação() + " // Dia: "+ data.getDate());
  }
  private static void exibirAluno(Aluno aluno){
    System.out.println("Aluno: "+ aluno.getMatrícula() + " // Nota: "+ aluno.getNota);
  }

  public static void main(String[] args) {

    Avaliação avaliação = new Avaliação1("Português","10/10/2010");
    Aluno aluno1 = new Aluno("João Jorge",'5.0');
    Aluno aluno2 = new Aluno("George Gustavo",'7.3');

    Avaliação avaliação = new Avaliação2("História","11/10/2010");
    Aluno aluno3 = new Aluno("Pedro Pedroso",'9.2');
    Aluno aluno4 = new Aluno("Lucas Leonardo",'3.8');

    exibirAvaliação(Avaliação1);
    exibirAluno(aluno1);
    exibirAluno(aluno2);

    exibirAvaliação(Avaliação2);
    exibirAluno(aluno3);
    exibirAluno(aluno4);
  }
}
