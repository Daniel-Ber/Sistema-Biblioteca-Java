import java.util.ArrayList;
public class Biblioteca {
    Biblioteca(){}
    
     protected ArrayList<Livro> livrosCadastrados = new ArrayList<>();
     protected ArrayList<Estudante> estudantesCadastrados = new ArrayList<>();

    public void cadastrarLivros(Livro objeto){
        livrosCadastrados.add(objeto);
    }
    public void cadastrarEstudantes(Estudante objeto){
        estudantesCadastrados.add(objeto);
    }

}
