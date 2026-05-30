public class Paciente {

    String nome;
    int idade;
    String especialidade;

    public Paciente(String nome, int idade, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                " | Idade: " + idade +
                " | Especialidade: " + especialidade;
    }
}