public class SistemaDesfazer {

    private String[] acoes;
    private int topo;

    public SistemaDesfazer(int capacidade) {
        acoes = new String[capacidade];
        topo = -1;
    }

    // Inserir ação
    public void inserirAcao(String acao) {
        if (topo == acoes.length - 1) {
            System.out.println("Erro: estrutura cheia. Não é possível inserir novas ações.");
            return;
        }

        topo++;
        acoes[topo] = acao;
        System.out.println("Ação adicionada: " + acao);
    }

    // Desfazer última ação
    public void desfazerAcao() {
        if (topo == -1) {
            System.out.println("Não há ações para desfazer.");
            return;
        }

        System.out.println("Ação desfeita: " + acoes[topo]);
        acoes[topo] = null;
        topo--;
    }

    // Listar ações disponíveis
    public void listarAcoes() {
        if (topo == -1) {
            System.out.println("Nenhuma ação registrada.");
            return;
        }

        System.out.println("\nAções disponíveis para desfazer:");

        for (int i = topo; i >= 0; i--) {
            System.out.println((topo - i + 1) + " - " + acoes[i]);
        }
    }

    public static void main(String[] args) {

        SistemaDesfazer sistema = new SistemaDesfazer(5);

        sistema.inserirAcao("Digitou texto");
        sistema.inserirAcao("Alterou título");
        sistema.inserirAcao("Inseriu imagem");

        sistema.listarAcoes();

        System.out.println("\nDesfazendo ações...");
        sistema.desfazerAcao();
        sistema.desfazerAcao();

        sistema.listarAcoes();

        System.out.println("\nDesfazendo restante...");
        sistema.desfazerAcao();
        sistema.desfazerAcao(); // teste sem ações

        sistema.inserirAcao("Nova ação");
        sistema.inserirAcao("Ação 2");
        sistema.inserirAcao("Ação 3");
        sistema.inserirAcao("Ação 4");
        sistema.inserirAcao("Ação 5");
        sistema.inserirAcao("Ação 6"); // teste estrutura cheia
    }
}