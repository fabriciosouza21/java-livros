package item24;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

public class item24 {
    static void main() {
        IO.println("Imte 34: Favor static member classes over nonstatic");

        Map<String, Long> livros =Map.of("romance",1L, "ficção",3L, "aventura",10L);

        // retornar o objeto KeySet que é uma view para as chave do mapa,
        // alterações feitas no Set refletirão no mapa e vice-versa.
        // esse é o padrão adapter, por que KeySet funcina como uma view do mapa, permitindo que você trabalhe com as chaves do mapa como se fossem um conjunto.
        Set<String> genero = livros.keySet();

        // é uma classe estática, que não esta ligada a uma instancia do mapa
        // funciona como uma classe auxiliar.
        AbstractMap.SimpleEntry<String, Long> romance = new AbstractMap.SimpleEntry<>("romance", 1L);

        IO.println("Genero: " + genero);
        IO.println("Romance: " + romance);



    }
}
