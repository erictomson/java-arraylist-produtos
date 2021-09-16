// Precisamos melhorar a nossa venda do centro da cida.
// Para isso, vamos implementar um sistema em Java que consiga cadastrar,
// retirar e reapresentar os produtos.
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Criar a ArraList
        List<String> listaDaLoja = new ArrayList<>();

        // Adicionar a lista de produtos
        // 01 - Laranja
        // 02 - Mamão
        // 03 - Biscoito
        // 04 - Pururuca seca
        // 05 - Pasta de dentes
        listaDaLoja.add("Laranja");
        listaDaLoja.add("Mamão");
        listaDaLoja.add("Biscoito");
        listaDaLoja.add("Pururuca Seca");
        listaDaLoja.add("Pasta de dentes");

        // Agora precisamos remover 02 itens da lista aleatoriamente,
        // pois eles não serã cadastrados na primeira checagem
        listaDaLoja.remove(1);
        listaDaLoja.remove(2);

        // Mostre uma forma de apresentarmos todos os itens que foram cadastrados
        // e removidos até o atual momento
        for(String valorPesquisado:listaDaLoja) {
            System.out.println(valorPesquisado);
        }

    }
}
