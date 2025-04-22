package sistema_biblioteca.domain;

import java.time.LocalDate;
import java.util.ArrayList;

public class Autor {
    private ArrayList<String> listaAutores = new ArrayList<>();

    public ArrayList<String> getListaAutores() {
        return listaAutores;
    }

    public void setListaAutores(ArrayList<String> listaAutores){
        this.listaAutores = listaAutores;
    }

    public void adicionarAutores(String str) {
        this.listaAutores.add(str);
        Autor obj = new Autor(nomeAutor,dataNascimentoAutor,idAutor);
        obj.nomeAutor = "Stephen King" ;
        //obj.dataNascimentoAutor = LocalDate.ofEpochDay  (1947-09-21);
        // Usar execeção para aumentar a range do dia
        obj.idAutor = 2220;

        this.listaAutores.add(str);
        Autor obj1 = new Autor(nomeAutor,dataNascimentoAutor,idAutor);
        obj1.nomeAutor = "J.K Rowling";
        obj1.dataNascimentoAutor = LocalDate.ofEpochDay(1965-07-31);
        obj1.idAutor = 2221;

        this.listaAutores.add(str);
        Autor obj2 = new Autor(nomeAutor,dataNascimentoAutor,idAutor);
        obj2.nomeAutor ="Machado de Assis";
        obj2.dataNascimentoAutor = LocalDate.ofEpochDay(1839-06-21);
        obj2.idAutor = 2222;
        
        }

       public Autor(String nomeAutor, LocalDate dataNascimentoAutor, Integer idAutor) {
        this.nomeAutor = nomeAutor;
        this.dataNascimentoAutor = dataNascimentoAutor;
        this.idAutor = idAutor;
      }
        private Integer idAutor;
        private String nomeAutor;
        private LocalDate dataNascimentoAutor;

        public String getNomeAutor () {
        return nomeAutor;
    }

        public void setNomeAutor (String nomeAutor){
        this.nomeAutor = nomeAutor;
    }

        public LocalDate getDataNascimentoAutor () {
        return dataNascimentoAutor;
    }

        public void setDataNascimentoAutor (LocalDate dataNascimentoAutor){
        this.dataNascimentoAutor = dataNascimentoAutor;
    }

        public Integer getIdAutor () {
        return idAutor;
    }

        public void setIdAutor (Integer idAutor){
        this.idAutor = idAutor;
    }
    }

