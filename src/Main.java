import java.io.File;

public class Main {

    public static void main(String args[]) {
        File carpeta = new File("C:\\Users\\dimat\\eclipse-workspace\\BookMap");
        // File carpeta = new File(".");
        if (!carpeta.exists()) {
            System.out.println(args[0] + " NO file.");
            return;
        }
        imprimeArbol(carpeta, "");
    }

    public static void imprimeArbol(File carpeta, String tabulador) {
        File contenido[] = carpeta.listFiles();
        if (contenido != null) {
            for (int i = 0; i < contenido.length; i++)
                if (contenido[i].isDirectory()) {
                    System.out.println(tabulador + "|-" + contenido[i].getName());
                    imprimeArbol(contenido[i], tabulador + "|  ");
                } else {
                    System.out.println(tabulador + "+-" + contenido[i].getName().toString());
                }
        }
    }
}