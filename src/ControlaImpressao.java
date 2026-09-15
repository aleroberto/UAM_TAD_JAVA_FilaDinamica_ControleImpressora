public class ControlaImpressao {

    public static void main(String[] args) {
        FilaDinamica filaDinamica = new FilaDinamica();

        filaDinamica.enqueue(1);
        filaDinamica.enqueue(2);
        filaDinamica.enqueue(3);

        System.out.println("Fila de impressao:");
        filaDinamica.print();
    }
}
