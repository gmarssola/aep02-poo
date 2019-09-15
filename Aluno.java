package aep02,java;

public class Aluno
{
	private String matrícula;
	private double nota;

	public Aluno(String matrícula, double nota)
	{
		this.matrícula = matrícula;
		if (nota <= 10 && nota >= 0) {
			this.nota = nota;
		}
		else {
			throw new RuntimeException("A nota do aluno deve ser de 0 à 10!");
		}
	}
	public String getMatrícula() {
		return matrícula;
	}
	public double getNota() {
		return nota;
	}
}
