public class Computador {

    private int ram;
    private int hd;
    private int contador;

    public Computador(int ram, int hd) {
        this.ram = ram;
        this.hd = hd;
        contador++;
        //o contador sempre será acrescido quando chegar no construtor
        System.out.println("contador: " + contador);
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHd() {
        return hd;
    }

    public void setHd(int hd) {
        this.hd = hd;
    }

    //toString é um método da classe String, então vou sobrescrever para quando usar ter o retorno já formatado.
    @Override
    public String toString() {
        return "Computador{" +
                "ram=" + ram +
                ", hd=" + hd +
                '}';
        //quando for mostrar o que está sendo criado não precisa mostrar o contador
    }
}

/* toString evita que acesse essas informações da memória.
Ou seja, poderia aparecer algo como Computador@7cc3567be.
 */

