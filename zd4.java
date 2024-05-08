import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zd4 {
    public static void main(String[] args)throws IOException {
        File file1 = new File("C:\\Users\\Asus\\text4.txt");
        File file2 = new File("C:\\Users\\Asus\\text4.1.txt");
        FileWriter fwr = new FileWriter(file2);
        BufferedReader fread = new BufferedReader(new FileReader(file1));
        Pattern patt = Pattern.compile("((\\W*)([_.,;:!?])(\\w*))|((^[A-Z]{2})([a-zA-Z]*)([A-Z]{2}$))|((^[А-Я]{2})([а-яА-Я]*)([А-Я]{2}$))");
        fwr.write("ВЫВОД\n\n");
        while (fread.ready()){
            String s = fread.readLine();
            String[] mas = s.split("\\s+");
            for (int i = 0; i < mas.length; i++){
                Matcher matc = patt.matcher(mas[i]);
                while (matc.find()){
                    fwr.write(mas[i] + "\n");
                }
            }
        }
        fwr.flush();
        fwr.close();
    }
}
