public class Livro {

    //Atributos da classe
    private int id;
    private String autor;
    private String titulo ;
    private boolean disponibilidade;

    //Construtor do Objeto Livro
    Livro(int id , String autor , String titulo , boolean disponibilidade)
    {
            this.autor = autor;
            this.disponibilidade = disponibilidade;
            this.id = id;
            this.titulo = titulo;
    }

    //Metodos get e set para os atributos
    public void setDisponibilidade(boolean disponibilidade){
        this.disponibilidade = disponibilidade;
    }
    public boolean getDisponibilidade(){
        return disponibilidade;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public String  getAutor(){
        return autor;
    }

    public void exibirDetalhes(){
        if (disponibilidade == true){
            System.out.print("O livro que tem como título: "+titulo+", id : "+id+" e autor: "+autor+ "está disponível. ");
        }else
            if (disponibilidade == false){
            System.out.print("O livro que tem como título: "+titulo+", id : "+id+"e autor: "+autor+ "está indisponível. ");
        }
    }


}
