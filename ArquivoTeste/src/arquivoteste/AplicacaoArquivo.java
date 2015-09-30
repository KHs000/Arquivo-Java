

package arquivoteste;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Felipe Rabelo
 */
public class AplicacaoArquivo {
    private String texto;
    private String [] arquivoTexto;
    private int posicao;
    File arquivo;

    public AplicacaoArquivo(String texto) {
        this.arquivo = new File("C:\\Users\\Felipe Rabelo\\Documents\\texto.txt");
        this.texto = texto;
    }
    
    public AplicacaoArquivo () {
        
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }
    
    public void Cria () throws IOException {
        if (arquivo.exists() == false)
            arquivo.createNewFile();
    }
    
    public void Escreve () throws IOException {
        if (arquivo.canWrite() == true) {
            try (FileWriter x = new FileWriter(arquivo)) {
                x.write(texto);
                x.close();
            }
        }
        else
            System.out.println("Não foi possível escrever no arquivo...");
    }
    
    public void Ler () throws FileNotFoundException {
        if (arquivo.canRead() == true) {
            try (FileReader b = new FileReader(arquivo)) {
                BufferedReader c = new BufferedReader(b);
                String conteudo = c.readLine();
                b.close();
                System.out.println("Conteúdo do arquivo: " + conteudo);
            }
            catch (IOException e) {
                e.getMessage();
            }
        }
    }
    
    public void Altera () throws IOException {
        if (arquivo.canWrite() == true) {
            try (FileWriter fw = new FileWriter( arquivo, true )) {
                fw.write(texto);
                fw.close();
            }
            catch (IOException e) {
                e.getMessage();
            }
        }
    }
    
    public void Deletar () {
        arquivo.delete();
    }
}
