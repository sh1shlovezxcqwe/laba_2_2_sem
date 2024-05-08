import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zd3 {
    public static void main(String[] args) throws IOException{
        File file1 = new File("C:\\Users\\Asus\\text3.txt");
        BufferedReader read = new BufferedReader(new FileReader(file1));
        FileWriter fwr = new FileWriter(file1,true);
        String[] mas1 = {"аб", "бв", "вг", "гд", "де", "её", "ёж", "жз", "зи", "ий", "йк", "кл", "лм",
                "мн", "но", "оп", "пр", "рс", "ст", "ту", "уф", "фх", "хц", "цч", "чш", "шщ", "щъ", "ъы", "ыь", "ьэ", "эю", "юя",
                "АБ", "БВ", "ВГ", "ГД", "ДЕ", "ЕЁ", "ЁЖ", "ЖЗ", "ЗИ", "ИЙ", "ЙК", "КЛ", "ЛМ",
                "МН", "НО", "ОП", "ПР", "РС", "СТ", "ТУ", "УФ", "ФХ", "ХЦ", "ЦЧ", "ЧШ", "ШЩ", "ЩЪ", "ЪЫ", "ЫЬ", "ЬЭ", "ЭЮ", "ЮЯ",
                "Аб", "Бв", "Вг", "Гд", "Де", "Её", "Ёж", "Жз", "Зи", "Ий", "Йк", "Кл", "Лм",
                "Мн", "Но", "Оп", "Пр", "Рс", "Ст", "Ту", "Уф", "Фх", "Хц", "Цч", "Чш", "Шщ", "Щъ", "Ъы", "Ыь", "Ьэ", "Эю", "Юя"};
        fwr.write("\n\nВЫВОД\n\n");
        while (read.ready()){
            String s = read.readLine();
            String[] mas = s.split("\\s+");
            for (int i = 0; i < mas.length; i++){
                for (int j = 0; j < mas1.length; j ++) {
                    Pattern patt = Pattern.compile(poz(mas1, j));
                    Matcher matc = patt.matcher(mas[i]);
                    while (matc.find()) {
                        fwr.write(mas[i] + "\n");
                    }
                }
            }
        }
        fwr.flush();
        fwr.close();
    }
    public static String poz(String [] mas, int i){
        return mas[i];
    }
}
