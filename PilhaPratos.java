
public class PilhaPratos {
    private int[] pratos;
    private int topo;

    public PilhaPratos(int capacidade) {
        this.pratos = new int[capacidade];
        this.topo = -1;
    }

    public void empilharPrato(int numero) {
        if (this.estaCheia()) {
            System.out.println("Pilha cheia!");
        } else {
            ++this.topo;
            this.pratos[this.topo] = numero;
            System.out.println("Prato " + numero + " empilhado.");
        }
    }

    public void retirarPrato() {
        if (this.estaVazia()) {
            System.out.println("Pilha vazia!");
        } else {
            int var10001 = this.pratos[this.topo];
            System.out.println("Prato retirado: " + var10001);
            --this.topo;
        }
    }

    public void mostrarPilha() {
        if (this.estaVazia()) {
            System.out.println("Pilha vazia!");
        } else {
            System.out.println("Pilha de pratos:");

            for(int i = this.topo; i >= 0; --i) {
                int var10001 = this.pratos[i];
                System.out.println("Prato " + var10001);
            }

        }
    }

    public int topo() {
        if (this.estaVazia()) {
            throw new IllegalStateException("Pilha vazia!");
        } else {
            return this.pratos[this.topo];
        }
    }

    public int espacoDisponivel() {
        return this.pratos.length - (this.topo + 1);
    }

    public boolean estaVazia() {
        return this.topo == -1;
    }

    public boolean estaCheia() {
        return this.topo == this.pratos.length - 1;
    }
}
