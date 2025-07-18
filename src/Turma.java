import java.util.ArrayList;

public class Turma {
    private String nome;
    private String professor;
    private int totalVagas;
    private String horario;
    // ver se eu vou usar boolean msm
    private boolean formaDeAvaliacao;
    private Disciplina disciplina;
    private ArrayList<Aluno> matriculados;
    private String sala;

    //ainda nao entendi direito como funciona nao ter todos no construtor
    public Turma(String nome, String professor, int totalVagas, String horario, Disciplina disciplina){
        this.nome = nome;
        this.professor = professor;
        this.totalVagas = totalVagas;
        this.horario = horario;
        this.disciplina = disciplina;
    }
    //adicionar logica nos setters
    //terminar
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getProfessor(){
        return this.professor;
    }
    public void setProfessor(String professor){
        this.professor = professor;
    }
    public int getTotalVagas(){
        return this.totalVagas;
    }
    public  void setTotalVagas(int totalVagas){
        this.totalVagas = totalVagas;
    }
    public String getHorario(){
        return this.horario;
    }
    public void setHorario(String horario){
        this.horario = horario;
    }
    public boolean getFormaAvaliacao(){
        return this.formaDeAvaliacao;
    }

    public void matricularAluno(Aluno aluno){
        int check =0;
        if(this.matriculados.isEmpty()){
            this.matriculados.add(aluno);
        }
        else{
            if (this.totalVagas <= this.matriculados.size()){
                System.out.println("Nao foi possivel matricular o aluno, a turma esta cheia!");
            }
            else{
                for(Aluno i : this.matriculados) {
                    if(i.getMatricula().equals(aluno.getMatricula())){
                        check = 1;
                        break;
                    }
                }
                if (check == 0){
                    this.matriculados.add(aluno);
                }
                else{
                    System.out.println("ja existe um aluno matriculado!");
                }
            }

        }
    }
    // criar metodo para retirar aluno
}


