import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // ter certeza de que o codigo funciona em outro computador
        // verificar a versao do java utilizada
        // ter um metodo para criar um diretorio para as disciplinas
        Scanner leitor = new Scanner(System.in);
        ArrayList<Disciplina> listaDisciplinas = new ArrayList<>();
        Disciplina.iniciarDisciplina(listaDisciplinas);
        while (true){

            System.out.println("""
                    Qual modo deseja escolher?
                    1 - Modo aluno
                    2 - Modo Disciplina
                    3- Sair
                    """);
            Integer opcao = leitor.nextInt();
            if(opcao == 1){
                Menu.menuAluno(listaDisciplinas);
            }

            else if (opcao == 2) {
            Menu.menuDisciplina(listaDisciplinas);
            }
            else if(opcao == 3){
                System.out.println("Arquivando Suas disciplinas");
                for(Disciplina i : listaDisciplinas){
                    Disciplina.arquivarDisciplina(i);
                }
                break;
            }

        }
    }
}
