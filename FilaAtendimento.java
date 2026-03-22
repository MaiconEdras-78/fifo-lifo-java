
public class FilaAtendimento {
    private final String[] pacientes;
    private int inicio;
    private int fim;
    private int tamanho;

    public FilaAtendimento(int capacidade) {
        this.pacientes = new String[capacidade];
        this.inicio = 0;
        this.fim = 0;
        this.tamanho = 0;
    }

    public void inserirPaciente(String nome) {
        if (this.estaCheia()) {
            System.out.println("Fila cheia!");
        } else {
            this.pacientes[this.fim] = nome;
            this.fim = (this.fim + 1) % this.pacientes.length;
            ++this.tamanho;
            System.out.println("Paciente " + nome + " entrou na fila.");
        }
    }

    public void chamarPaciente() {
        if (this.estaVazia()) {
            System.out.println("Fila vazia.");
        } else {
            String var10001 = this.pacientes[this.inicio];
            System.out.println("Paciente chamado: " + var10001);
            this.inicio = (this.inicio + 1) % this.pacientes.length;
            --this.tamanho;
        }
    }

    public void mostrarFila() {
        if (this.estaVazia()) {
            System.out.println("Fila vazia.");
        } else {
            System.out.println("Fila atual:");

            for(int i = 0; i < this.tamanho; ++i) {
                int pos = (this.inicio + i) % this.pacientes.length;
                System.out.println(this.pacientes[pos]);
            }

        }
    }

    public void proximoPaciente() {
        if (this.estaVazia()) {
            System.out.println("Fila vazia.");
        } else {
            String var10001 = this.pacientes[this.inicio];
            System.out.println("Próximo paciente: " + var10001);
        }
    }

    public int vagasDisponiveis() {
        return this.pacientes.length - this.tamanho;
    }

    public boolean estaVazia() {
        return this.tamanho == 0;
    }

    public boolean estaCheia() {
        return this.tamanho == this.pacientes.length;
    }
}
