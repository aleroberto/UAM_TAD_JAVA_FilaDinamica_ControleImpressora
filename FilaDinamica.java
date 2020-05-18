public class FilaDinamica {
	No inicio;
	No fim;

	public FilaDinamica() {
		this.inicio = null;
		this.fim = null;
	}

	void print() {
		if (isEmpty()) {
			System.out.println("vazia");
		} else {
			No auxiliar = inicio;
			while (auxiliar != null) {
				System.out.println(auxiliar.getDado());
				auxiliar = auxiliar.getProxNo();
			}
		}
	}

	boolean isEmpty() {
		return (inicio == null);
	}

	public void enqueue(int dado) {
		No novoNo = new No(dado);
		if (inicio == null) {
			inicio = novoNo;
			fim = novoNo;
		} else {
			fim.setProxNo(novoNo);
			fim = novoNo;
		}

	}

}
