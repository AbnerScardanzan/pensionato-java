public class Quartos {
    private int[] quartos;

    public Quartos(int quantidade){
        this.quartos = new int[quantidade];
    }

    public int[] getQuartos(){
        return quartos;
    }

    public void setQuarto(int pos, int valor) {
        if (pos >= 0 && pos < quartos.length) {
            this.quartos[pos] = valor;
        }
    }
}   
