package sistema_biblioteca.service;

import sistema_biblioteca.domain.Usuario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UsuarioService {
    private List<Usuario> usuarios = new ArrayList<>();

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void adicionarUsuario(String nomeUser, LocalDate dataNascimentoUser, String emailUser, Integer idUser) {
        Usuario usuario = new Usuario(nomeUser, dataNascimentoUser, emailUser, idUser);
        usuario.setNomeUser(nomeUser);
        usuario.setDataNascimentoUser(dataNascimentoUser);
        usuario.setEmailUser(emailUser);
        usuario.setIdUser(idUser);
    }


    public void ConsultarEmprestimosDoUsuario(Usuario usuario) {
//mostrar todos emprestimos realizados do livro
    }

}
