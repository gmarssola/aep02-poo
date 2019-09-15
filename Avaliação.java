package aep02.java;

public class Avaliação {

  private String avaliação;
  private Date data;

  public void Aluno(String novoAluno){
    Aluno = novoAluno;
  }
  public Avaliação(String avaliação, Date data){
    this.avaliação = avaliação;
    this.data = data;
  }
  public String getAvaliação(){
    return avaliação;
  }
  public Date getDate(){
    return data;
  }
}
