package sistema_biblioteca.service;

import sistema_biblioteca.domain.Livro;

import java.util.ArrayList;
import java.util.Scanner;

public class LivroService {


public void BuscarLivroPeloTitulo (Livro livros){
    System.out.println("Escreva o título do livro que deseja buscar.");
    Scanner scanner = new Scanner(System.in);
    String livroBuscado = scanner.nextLine();
    //buscar pelo titulo o livro na lista livros
}
    /*
    public void ListarTodosLivrosDisponiveis (Livro livros ) {

        for (Livro livro : livros) {
            if ( boolean disponibilidade){
                System.out.println("/n Os livros disponíveis são :" + livros);

            else{
                    System.out.println("Não há livros disponíveis no momento");
                }
            }
        }
        }
    */
public void ConsultarEmprestimosDeUmLivro (Livro livro){
//mostrar o registro de emprestimos e devoluções do livro
}
}
