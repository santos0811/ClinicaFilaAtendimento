public class FilaPacientes {

    private NoPaciente inicio;
    private NoPaciente fim;

    // Inserir paciente no final
    public void adicionarPaciente(Paciente paciente) {

        NoPaciente novo = new NoPaciente(paciente);

        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            fim.proximo = novo;
            fim = novo;
        }

        System.out.println("Paciente adicionado!");
    }

    // Mostrar fila
    public void mostrarFila() {

        if (inicio == null) {
            System.out.println("Fila vazia.");
            return;
        }

        NoPaciente atual = inicio;

        while (atual != null) {
            System.out.println(atual.paciente);
            atual = atual.proximo;
        }
    }

    // Remover primeiro paciente
    public void chamarPrimeiro() {

        if (inicio == null) {
            System.out.println("Fila vazia.");
            return;
        }

        System.out.println("Chamando: " + inicio.paciente.nome);

        inicio = inicio.proximo;

        if (inicio == null) {
            fim = null;
        }
    }

    // Buscar paciente pelo nome
    public void buscarPaciente(String nome) {

        NoPaciente atual = inicio;

        while (atual != null) {

            if (atual.paciente.nome.equalsIgnoreCase(nome)) {
                System.out.println("Paciente encontrado:");
                System.out.println(atual.paciente);
                return;
            }

            atual = atual.proximo;
        }

        System.out.println("Paciente não encontrado.");
    }

    // Remover paciente pelo nome
    public void removerPaciente(String nome) {

        if (inicio == null) {
            System.out.println("Fila vazia.");
            return;
        }

        // Se for o primeiro
        if (inicio.paciente.nome.equalsIgnoreCase(nome)) {
            inicio = inicio.proximo;

            if (inicio == null) {
                fim = null;
            }

            System.out.println("Paciente removido.");
            return;
        }

        NoPaciente atual = inicio;

        while (atual.proximo != null) {

            if (atual.proximo.paciente.nome.equalsIgnoreCase(nome)) {

                atual.proximo = atual.proximo.proximo;

                if (atual.proximo == null) {
                    fim = atual;
                }

                System.out.println("Paciente removido.");
                return;
            }

            atual = atual.proximo;
        }

        System.out.println("Paciente não encontrado.");
    }

    // Inserir prioritário
    public void inserirPrioritario(Paciente paciente, int posicao) {

        NoPaciente novo = new NoPaciente(paciente);

        if (posicao <= 0 || inicio == null) {
            novo.proximo = inicio;
            inicio = novo;

            if (fim == null) {
                fim = novo;
            }

            return;
        }

        NoPaciente atual = inicio;
        int contador = 0;

        while (atual.proximo != null && contador < posicao - 1) {
            atual = atual.proximo;
            contador++;
        }

        novo.proximo = atual.proximo;
        atual.proximo = novo;

        if (novo.proximo == null) {
            fim = novo;
        }
    }
}