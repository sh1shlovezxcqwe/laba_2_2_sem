import java.io.*;

public class zd5 {
    public static void main(String[] args)throws IOException {
        File file1 = new File("C:\\Users\\Asus\\text5.1.txt");
        File file2 = new File("C:\\Users\\Asus\\text5.2.txt");
        FileWriter fwr = new FileWriter(file2, true);
        BufferedReader fread = new BufferedReader(new FileReader(file1));
        String line = fread.readLine();
        String[] mas = line.split("\\.\\s+");
        for (int i = 0; i < mas.length; i ++){
            String[] mas1 = mas[i].split(" ");
            for (int j = 0; j < mas1.length; j++){
                if (mas1[j].length() <= 3 && mas1.length >= 5) {
                    fwr.write(" " + mas[i]+".");
                    break;
                }
            }
        }
        fwr.flush();
        fwr.close();
    }
}
