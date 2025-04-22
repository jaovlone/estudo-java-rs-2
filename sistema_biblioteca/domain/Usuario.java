package sistema_biblioteca.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
private List<String> usuarios = new ArrayList<>();

    public List<String> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<String> usuarios) {
        this.usuarios = usuarios;
    }
    public void AdicionarUsuarios(String utr) {
        this.usuarios.add(utr);
        Usuario obj = new Usuario(nomeUser,dataNascimentoUser,emailUser,idUser);
        obj.nomeUser ="João Victor";
        obj.dataNascimentoUser = LocalDate.ofEpochDay(2006-12-12);
        obj.emailUser ="jvictorbs06@gmail.com";
        obj.idUser = 3000;

        this.usuarios.add(utr);
        Usuario obj1 = new Usuario(nomeUser,dataNascimentoUser,emailUser,idUser);
        obj1.nomeUser ="Gabriel";
        obj1.dataNascimentoUser = LocalDate.ofEpochDay(2007-01-30);
        obj1.emailUser ="gabrielbrabo1@gmail.com";
        obj1.idUser = 3001;

        this.usuarios.add(utr);
        Usuario obj2 = new Usuario(nomeUser,dataNascimentoUser,emailUser,idUser);
        obj2.nomeUser ="Alessandro";
        obj2.dataNascimentoUser = LocalDate.ofEpochDay(1974-04-08);
        obj2.emailUser ="alessandro.teixeira@gmail.com";
        obj2.idUser = 3002;

    }

    private Integer idUser;
    private String nomeUser;
    private LocalDate dataNascimentoUser;
    private String emailUser;

    public Usuario (String nomeUser, LocalDate dataNascimentoUser ,String emailUser, Integer idUser){
        this.nomeUser = nomeUser;
        this.dataNascimentoUser = dataNascimentoUser;
        this.emailUser = emailUser;
        this.idUser = idUser;
    }

    public String getNomeUser() {
        return nomeUser;
    }

    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }

    public LocalDate getDataNascimentoUser() {
        return dataNascimentoUser;
    }

    public void setDataNascimentoUser(LocalDate dataNascimentoUser) {
        this.dataNascimentoUser = dataNascimentoUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }
}
