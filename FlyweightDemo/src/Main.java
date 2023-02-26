public class Main {
    public static void main(String[] args) {
        //para criar o computador, instanciamos nossa fábrica ComputadorFactory
        ComputadorFactory computador =new ComputadorFactory(); //criação da nossa Factory

        Computador mac1 = ComputadorFactory.getComputador(8,500); //acessamos o método getcomputador
        Computador windows1 = ComputadorFactory.getComputador(2,256);
        Computador windows2 = ComputadorFactory.getComputador(2,256);
        Computador mac2 = ComputadorFactory.getComputador(8,500);

        //vamos printar cada pc criado
        System.out.println(mac1.toString());
        System.out.println(windows1.toString());
        System.out.println(windows2.toString());
        System.out.println(mac2.toString());
    }
}
