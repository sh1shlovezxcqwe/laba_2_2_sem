import java.io.*;
import java.lang.*;
public class zd1 {

    public static void main(String[] args)throws IOException {
        File file1 = new File("C:\\Users\\Asus\\text1.txt");
        FileWriter fwr = new FileWriter(file1, true);
        BufferedReader buf = new BufferedReader(new FileReader(file1));
        String str1 = buf.readLine();
        String[] mas = str1.replace(" ", "").split("");
        String bukva = buf.readLine();
        String slovo = buf.readLine();
        String s = ((str1.replace("]", "")).replace("[", "")).replace(",", "");
        String str = s.replace(" ", "");
        int count = 0;
        for (int j = 0; j < str1.length(); j++) {
            for (int k = 0; k < str.length(); k++){
                if (str1.charAt(j) == str.charAt(k)) {
                    count++;
                }
            }
        }
        boolean fl = true;
        for (int g = 0; g < str.length(); g++) {
            if ((str.contains("он")) || (str.contains("но"))) {
                fl = true;
            } else {
                fl = false;
            }
        }
        boolean daSkolkoMozhno = true;
        for (int h = 0; h < str.length() - 1; h++) {
            if (str.charAt(h) == str.charAt(h + 1)) {
                daSkolkoMozhno = true;
                break;
            } else {
                daSkolkoMozhno = false;
            }
        }
        fwr.write("\n\nВЫВОД\n\n");
        int kolProbelov = s.length() - s.replace(" ", "").length();
        fwr.write("а) Количество пробелов равняется " + kolProbelov+"\n");
        if (s.contains(bukva)) {
            fwr.write("б) Буква " + bukva + " входит в данную последовательность\n");
        } else {
            fwr.write("б) Буква " + bukva + " не входит в данную последовательность\n");
        }
        if (count >= slovo.length()) {
            fwr.write("в) Все буквы из слова " + slovo + " содержатся в исходной последовательности\n");
        } else {
            fwr.write("в) Не все буквы из слова " + slovo + " содержатся в исходной последовательности\n");
        }
        if (fl == true) {
            fwr.write("г) Последовательность содержит соседствующие буквы о и н\n");
        } else if (fl == false) {
            fwr.write("г) Последовательность не содержит соседствующие буквы о и н\n");
        }
        if (daSkolkoMozhno == true) {
            fwr.write("д) Последовательность содержит соседствующие одинаковые буквы\n");
        } else if (daSkolkoMozhno == false) {
            fwr.write("д) Последовательность не содержит соседствующие одинаковые буквы\n");
        }
        boolean trip = true;
        for (int i = 2; i < mas.length - 2; i++){
            for (int j = i + 1; j < mas.length - 1; j++){
                if(mas[j] == mas[j + 1] & mas[i] == mas[i + 1]){
                    fwr.write("е) Такие натуральные числа существуют\n");
                    break;
                }
                else{
                    trip = false;
                }
            }
        }
        if (trip == false){
            fwr.write("е) Таких натуральных чисел не существуют\n");
        }
        fwr.flush();
        fwr.close();
    }
}
