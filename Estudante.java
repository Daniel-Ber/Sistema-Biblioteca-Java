public class Estudante {
    //Atributos da classe
    private String nome;
    private String matricula;//Por de fato não ser um valor , acho melhor deixar como String
    //Construtor do objeto
    Estudante(String nome , String matricula){
        this.matricula = matricula;
        this.nome = nome;
    }
    //Metodos get e set
   public void setNome(String nome){
        this.nome = nome;
   }
   public String getNome(){
        return nome;
   }
   public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
   public String getMatricula() {
        return matricula;
    }
   public void exibirDetalhes(){
        System.out.print("O nome do estudante: "+nome+" e a Matricula : "+matricula);
    }
}
