public class Main {

    public static void main(String[] args) {

        FilaPacientes fila = new FilaPacientes();

        Paciente p1 = new Paciente("Joao", 25, "Clinico");
        Paciente p2 = new Paciente("Maria", 40, "Cardiologista");
        Paciente p3 = new Paciente("Carlos", 60, "Ortopedista");

        fila.adicionarPaciente(p1);
        fila.adicionarPaciente(p2);
        fila.adicionarPaciente(p3);

        System.out.println("\nFILA:");
        fila.mostrarFila();

        System.out.println("\nBUSCAR:");
        fila.buscarPaciente("Maria");

        System.out.println("\nREMOVER:");
        fila.removerPaciente("Joao");

        System.out.println("\nFILA:");
        fila.mostrarFila();

        System.out.println("\nPRIORITARIO:");
        Paciente prioritario = new Paciente("Ana", 70, "Neurologista");

        fila.inserirPrioritario(prioritario, 1);

        fila.mostrarFila();

        System.out.println("\nCHAMAR PRIMEIRO:");
        fila.chamarPrimeiro();

        System.out.println("\nFILA FINAL:");
        fila.mostrarFila();
    }
}