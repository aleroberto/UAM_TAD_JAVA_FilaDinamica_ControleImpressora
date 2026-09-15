public class No {

    private int dado;
    private No proxNo;

    public No(int dado) {
        this.dado = dado;
        this.proxNo = null;
    }



    public int getDado() {
        return this.dado;
    }

    public No getProxNo() {
        return this.proxNo;
    }

    public void setProxNo(No proxNo) {
        this.proxNo = proxNo;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }
}