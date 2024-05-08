import java.io.*;
import java.text.DecimalFormat;

public class zd7 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("C:\\Users\\Asus\\text7.txt");
        FileWriter fwr = new FileWriter(file1, true);
        fwr.write("Постанвка задачи\n\nx >= -3 & x <= 3; x += 0.5\nесли x < 0, то f(x)=abs(pow(x, 2) - 1)\nиначе f(x) = exp(x)\n\nВЫВОД ДАННЫХ\n\nПеременная f\s\sЗначение f(x)\n\n");
        for (double x=-3; x <= 3; x+= 0.5){
            DecimalFormat dec = new DecimalFormat("#.#");
            if (x < 0){
                double f = Math.abs(Math.pow(x, 2) - 1);
                fwr.write("f(" + x + ")     =     " + dec.format(f) + "\n");
            }else if (x >=0){
                double f = Math.exp(x);
                fwr.write("f(" + x + ")      =     " + dec.format(f) + "\n");
            }
        }
        fwr.flush();
        fwr.close();
    }
}
