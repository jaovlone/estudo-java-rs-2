package sistema_biblioteca.domain;

import java.time.LocalDate;
import java.util.ArrayList;

public class Livro {
    private ArrayList<String> livros = new ArrayList<>();

    public ArrayList<String> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<String> livros) {
        this.livros = livros;
    }
    public void AdicionarLivros(String ltr){
        this.livros.add(ltr);
        Livro obj = new Livro(titulo,nomeDoAutor,disponibilidade,dataCadastro,dataAtualizacao,idBook);
        obj.titulo ="O iluminado";
        obj.nomeDoAutor = "Stephen King";
        obj.disponibilidade = true;
        obj.dataCadastro = LocalDate.ofEpochDay(2025-04-22);
        obj.dataAtualizacao = LocalDate.now();
        obj.idBook = 1000;

        Livro obj1 = new Livro(titulo,nomeDoAutor,disponibilidade,dataCadastro,dataAtualizacao,idBook);
        obj1.titulo ="Harry Potter e a pedra filosofal";
        obj1.nomeDoAutor ="J.K Rowling";
        obj1.disponibilidade = true;
        obj1.dataCadastro = LocalDate.ofEpochDay(2025-04-22);
        obj1.dataAtualizacao = LocalDate.now();
        obj1.idBook = 1001;

        Livro obj2 = new Livro(titulo,nomeDoAutor,disponibilidade,dataCadastro,dataAtualizacao,idBook);
        obj2.titulo ="Dom Casmuro";
        obj2.nomeDoAutor = "Machado de Assis";
        obj2.disponibilidade = true;
        obj2.dataCadastro = LocalDate.ofEpochDay(2025-04-22);
        obj2.dataAtualizacao = LocalDate.now();
        obj2.idBook =1002;

        Livro obj3 = new Livro(titulo,nomeDoAutor,disponibilidade,dataCadastro,dataAtualizacao,idBook);
        obj3.titulo ="Doutor Sono";
        obj3.nomeDoAutor = "Stephen King";
        obj3.disponibilidade = true;
        obj3.dataCadastro = LocalDate.ofEpochDay(2025-04-22);
        obj3.dataAtualizacao = LocalDate.now();
        obj3.idBook = 1003;
    }

    private Integer idBook;
    private String titulo;
    private String nomeDoAutor;
    private Boolean disponibilidade;
    private LocalDate dataCadastro;
    private LocalDate dataAtualizacao;

    public Livro (String titulo, String nomeDoAutor, Boolean disponibilidade,LocalDate dataCadastro , LocalDate dataAtualizacao,Integer idBook){
        this.titulo = titulo;
        this.nomeDoAutor = nomeDoAutor;
        this.disponibilidade = disponibilidade;
        this.dataCadastro = dataCadastro;
        this.dataAtualizacao = dataAtualizacao;
        this.idBook = idBook;
    }
    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNomeDoAutor() {
        return nomeDoAutor;
    }

    public void setNomeDoAutor(String nomeDoAutor) {
        this.nomeDoAutor = nomeDoAutor;
    }

    public Boolean getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(Boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(LocalDate dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }
    public Integer getIdBook() {
        return idBook;
    }

    public void setIdBook(Integer idBook) {
        this.idBook = idBook;
    }
}
