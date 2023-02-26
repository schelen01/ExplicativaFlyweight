import java.util.HashMap;
import java.util.Map;

public class ComputadorFactory {
    //essa classe terá um único atributo que será uma lista com chave e valor
    private static Map<String, Computador> flyweight =new HashMap<>();
    //é String porque o id é uma String, e o objeto é o computador

    //faço a verificação para saber se esse objeto já existe na lista ou não
    //Se já existir ele não criará um novo objeto
    public static Computador getComputador(int ram, int hd) {
        //declarar o id, para ser o identificador da lista
        String id = "id" + ram + ":" + hd;
        System.out.println(id);

        //fazer a validação para verificar através do Flyweight se NÃO tem o id
        if (!flyweight.containsKey(id)) {
            //criará um pc novo
            Computador computador = new Computador(ram, hd); //vai isntanciar o novo pc
            flyweight.put(id, new Computador(ram, hd)); // vai inserir no Map
            System.out.println("Novo computador criado");
            return flyweight.get(id);
        }
        System.out.println("Computador já existente");
        return flyweight.get(id);
    }


}

/* Flyweight é um recurso que permite verificar se um objeto já é existente ou não.
Caso já seja existente não teria porque criar um novo objeto igual, evitando duplicidades e consumo de memória.
 */