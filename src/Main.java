import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "C:/Users/gui_m/IdeaProjects/ArquivNomes/Nomes.txt";
        String path2 = "C://Users/gui_m/IdeaProjects/ArquivNomes/Sobrenomes.txt";

        Arquivos.leitor(path);

        Arquivos.leitor(path2);




    }
}
