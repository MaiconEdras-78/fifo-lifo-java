
public class Main {
    public static void main(String[] args) {
        System.out.println("=== FILA DE ATENDIMENTO (FIFO) ===");
        FilaAtendimento fila = new FilaAtendimento(5);
        fila.inserirPaciente("João");
        fila.inserirPaciente("Maria");
        fila.inserirPaciente("Carlos");
        fila.chamarPaciente();
        fila.inserirPaciente("Ana");
        fila.mostrarFila();
        fila.proximoPaciente();
        System.out.println("Vagas disponíveis: " + fila.vagasDisponiveis());
        System.out.println("\n=== PILHA DE PRATOS (LIFO) ===");
        PilhaPratos pilha = new PilhaPratos(5);
        pilha.empilharPrato(1);
        pilha.empilharPrato(2);
        pilha.empilharPrato(3);
        pilha.retirarPrato();
        pilha.mostrarPilha();
        if (!pilha.estaVazia()) {
            System.out.println("Topo da pilha: " + pilha.topo());
        }

        System.out.println("Espaço disponível: " + pilha.espacoDisponivel());
    }
}
