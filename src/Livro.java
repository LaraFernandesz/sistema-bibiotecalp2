public class Livro {
    //1.Atributos(caracteristicas, estado do objeto)
    //2.Construtor(Manua de instruçoes para criar um obeto)
    private String titulo;
    private String autor;
    private int ano;

    public Livro(String titulo, String autor, int ano){
        setTitulo(titulo);
        setAutor(autor);
        setAno(ano);
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        int ano_atual = 2025;
        if(ano > ano_atual){
            System.out.println("Erro: ano invalido.");
        }else{
            this.ano = ano;
        }

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if(titulo == ""){
            System.out.println("Erro: titulo invalido");
        }else {
            this.titulo = titulo;
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if(autor == ""){
            System.out.println("Erro: autor invalido");
        }else {
            this.titulo = titulo;
        }
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ano=" + ano +
                '}';
    }
}