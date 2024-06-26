import java.io.*;

public class zd9 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("C:\\Users\\Asus\\text9.txt");
        FileWriter fwr = new FileWriter(file1, true);
        BufferedReader fread = new BufferedReader(new FileReader(file1));
        BufferedReader fread2 = new BufferedReader(new FileReader(file1));
        int c = 0;
        while (fread2.ready()) {
            fread2.readLine();
            c ++;
        }
        String[][] array = new String[c][13];
        int i = 0;
        while(fread.ready()) {
            String line = fread.readLine();
            String[] mas = line.split(";");
            array[i][0] = mas[0];
            array[i][1] = mas[1];
            array[i][2] = mas[2];
            array[i][3] = mas[3];
            array[i][4] = mas[4];
            array[i][5] = mas[5];
            array[i][6] = mas[6];
            array[i][7] = mas[7];
            array[i][8] = mas[8];
            array[i][9] = mas[9];
            array[i][10] = mas[10];
            array[i][11] = mas[11];
            array[i][12] = mas[12];
            i++;
        }
        fwr.write("\n\nВЫВОД\n\n");
        double financingSum = 0; // сумма финансирования проектов, удовлетворяющих условиям
        double equipmentCostSum = 0; // сумма стоимости оборудования проектов, удовлетворяющих условиям
        int count = 0; // количество проектов, удовлетворяющих условиям
        for (int j = 0; j < c; j++) {
            double financing = Double.parseDouble(array[j][7]);
            double equipmentCost = Double.parseDouble(array[j][9]);
            int researchers = Integer.parseInt(array[j][3]);
            int youngResearchers = Integer.parseInt(array[j][4]);
            int students = Integer.parseInt(array[j][5]);
            int postgraduates = Integer.parseInt(array[j][6]);

            if (financing > 0.5 && equipmentCost > 1 && youngResearchers > researchers/2 && students >= 1 && postgraduates >= 2) {
                String leaderName = array[j][2];
                fwr.write("ФИО руководителя проекта: " + leaderName+ "\n");
                financingSum += financing;
                equipmentCostSum += equipmentCost;
                count++;
            }
        }
        fwr.write("Количество проектов, удовлетворяющих условиям: " + count+ "\n");
        fwr.write("Сумма финансирования проектов, удовлетворяющих условиям: " + financingSum+ "\n");
        fwr.write("Сумма стоимости оборудования проектов, удовлетворяющих условиям: " + equipmentCostSum+ "\n");
        fwr.flush();
        fwr.close();
    }
}
