import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Biblioteca {

    //private Livro[] acervo;
    //private int livrosNoAcervo;
    private List<Livro> acervo;
    private List<Usuario> listaUsuarios;

    public Biblioteca(){
        //acervo = new Livro[5];
        //livrosNoAcervo = 0;
        acervo = new ArrayList<>();
        listaUsuarios = new ArrayList<>();

    }
    public void cadastrarLivro(Livro livro){
        acervo.add(livro);
        System.out.println("Livro " + livro.getTitulo() + " adicionando no acervo.");
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroEncontrado = null;
        for(Livro l : this.acervo){
            if(l.getTitulo().equalsIgnoreCase(titulo)){
                return l;
            }
        }
        return null;
    }

    //public void cadastrarLivro(Livro livro){
    //if(livrosNoAcervo < acervo.length){
    //acervo[livrosNoAcervo] = livro;
    //System.out.println("Livro " + livro.getTitulo() + " adicionado no acervo.");
    //livrosNoAcervo++;
    //}else {
    //System.out.println("Acervo lotado!");
    //}



public static void main(String[] args) {
    Biblioteca biblioteca = new Biblioteca();
    Livro l = new Livro("Java como Programar", "Deitel", 2014);
    biblioteca.cadastrarLivro(l);
    biblioteca.cadastrarLivro(l);
    biblioteca.cadastrarLivro(l);
    biblioteca.cadastrarLivro(l);
    biblioteca.cadastrarLivro(l);
    biblioteca.cadastrarLivro(l);
}
}
