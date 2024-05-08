import java.io.*;

public class zd2 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("C:\\Users\\Asus\\text2.txt");
        FileWriter fwr = new FileWriter(file1);
        double a;
        double res;
        for (double i = 1; i<=9;i++){
            for (double j =1; j<=9;j++) {
                res = j / i;
                a = res*10;
                res = a/10;
                fwr.write(j + "/" + i + "=" + String.format("%.4f",res)+ " " );
            }
            fwr.write("\n\n");
        }
        fwr.flush();
        fwr.close();
    }
}
