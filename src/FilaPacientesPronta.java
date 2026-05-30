import java.util.LinkedList;

public class FilaPacientesPronta {

    LinkedList<Paciente> fila = new LinkedList<>();

    // Adicionar paciente
    public void adicionarPaciente(Paciente paciente) {
        fila.add(paciente);
    }

    // Mostrar fila
    public void mostrarFila() {

        if (fila.isEmpty()) {
            System.out.println("Fila vazia.");
            return;
        }

        for (Paciente p : fila) {
            System.out.println(p);
        }
    }

    // Chamar primeiro
    public void chamarPrimeiro() {

        if (fila.isEmpty()) {
            System.out.println("Fila vazia.");
            return;
        }

        Paciente p = fila.removeFirst();

        System.out.println("Chamando: " + p.nome);
    }

    // Buscar paciente
    public void buscarPaciente(String nome) {

        for (Paciente p : fila) {

            if (p.nome.equalsIgnoreCase(nome)) {
                System.out.println("Encontrado:");
                System.out.println(p);
                return;
            }
        }

        System.out.println("Paciente não encontrado.");
    }

    // Remover paciente
    public void removerPaciente(String nome) {

        for (Paciente p : fila) {

            if (p.nome.equalsIgnoreCase(nome)) {
                fila.remove(p);
                System.out.println("Paciente removido.");
                return;
            }
        }

        System.out.println("Paciente não encontrado.");
    }

    // Inserir prioritário
    public void inserirPrioritario(Paciente paciente, int posicao) {

        if (posicao < 0 || posicao > fila.size()) {
            fila.addFirst(paciente);
        } else {
            fila.add(posicao, paciente);
        }
    }
}