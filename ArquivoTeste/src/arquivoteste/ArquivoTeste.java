

package arquivoteste;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Felipe Rabelo
 */
public class ArquivoTeste {

    public static void main(String[] args) throws IOException {
        Scanner ent = new Scanner (System.in);
        String texto;
        int posicao, entrada;
        
        System.out.println("Digite um texto qualquer:");
        texto = ent.nextLine();
        AplicacaoArquivo obj1 = new AplicacaoArquivo(texto);
        obj1.Cria();
        obj1.Escreve();
        obj1.Ler();
        System.out.println("Adicionar texto: ");
        texto = ent.nextLine();
        obj1.setTexto(texto);
        obj1.Altera();
        obj1.Ler();
        System.out.println("Deseja deletar o arquivo? (0 - Não / 1 - Sim)");
        entrada = ent.nextInt();
        if (entrada == 0) {
            System.out.println("Ok...");
        }
        else {
            obj1.Deletar();
        }
    }
    
}
