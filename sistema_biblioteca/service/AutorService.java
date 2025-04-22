package sistema_biblioteca.service;
import sistema_biblioteca.domain.Autor;

import java.util.Scanner;


public class AutorService {


        public void ListarOsAutores(Autor autor) {

        }
        public void BuscarLivrosPeloAutor(Autor autor){
             System.out.println("Escreva o nome do autor do livro que deseja buscar.");
             Scanner scanner = new Scanner(System.in);
             String autorBuscado = scanner.nextLine();
        }

        public void AdicionarAutor(Autor autor){
        //perguntar e coletar as informaçẽos do autor nome, ano de nascimento e idade e posteriormente adiciona-lo a lista de autores

        }
    }
