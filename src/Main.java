import java.io.File;

public class Main {

    public static void main(String args[]) {
        File file = new File("C:\\Users\\dimat\\eclipse-workspace\\BookMap");
        if (!file.exists()) {
            System.out.println(args[0] + " No file.");
            return;
        }
        PrintCatalog(file, "");
    }

    public static void PrintCatalog(File file, String tabulation) {
        File content[] = file.listFiles();
        if (content != null) {
            for (int i = 0; i < content.length; i++)
                if (content[i].isDirectory()) {
                    System.out.println(tabulation + "|-" + content[i].getName());
                    PrintCatalog(content[i], tabulation + "|  ");
                } else {
                    System.out.println(tabulation + "+-" + content[i].getName().toString());
                }
        }
    }
}