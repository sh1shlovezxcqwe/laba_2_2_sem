import java.io.*;

public class zadanye12 {
    private static String normalizeAddress(String address) {
        String[] house = {" д ", "дом."};
        for (String abb : house) {
            address = address.replaceAll("(?i)" + abb, "д.");
        }
        String[] apartment = {"кв ", "квартира."};
        for (String abb : apartment) {
            address = address.replaceAll("(?i)" + abb, "кв.");
        }
        String[] region = {"обл.", "обл "};
        for (String abb : region) {
            address = address.replaceAll("(?i)" + abb, "кр.");
        }
        String[] city = {"город ", "гор.", "г "};
        for (String abb : city) {
            address = address.replaceAll("(?i)" + abb, "г.");
        }
        if (address.contains("д.") && !address.contains("кв.")) {
            address += " FALSE";
        }
        return address;
    }

    private static String normalizePhone(String phone) {
        phone = phone.replaceAll("[\\s-()]", "");

        if (phone.startsWith("8")) {
            phone = "+7" + phone.substring(1);
        } else if (phone.startsWith("7")) {
            phone = "+7" + phone.substring(1);
        } else if (!phone.startsWith("+")) {
            phone = "+7" + phone;
        }
        StringBuilder sb = new StringBuilder(phone + " ");
        sb.insert(2,"(");sb.insert(6,")");sb.insert(10,"-");sb.insert(13,"-");
        phone = String.valueOf(sb);
        if (phone.replaceAll("\\D", "").length() < 10) {
            phone = "FALSE";
        }
        return phone;
    }

    public static void main(String[] args) throws IOException {
        File file1 = new File("C:\\Users\\Asus\\text12.txt");
        FileWriter fwr = new FileWriter(file1, true);
        BufferedReader fread = new BufferedReader(new FileReader(file1));
        StringBuilder s = new StringBuilder();
        String[] addresses = new String[0];
        while(fread.ready()){
            s.append(fread.readLine()).append(System.lineSeparator());
            addresses = String.valueOf(s).split("\n");
        }
        for (String address : addresses) {
            String[] parts = address.split("телефон");
            String normalizedAddress = normalizeAddress(parts[0].trim());
            String normalizedPhone = normalizePhone(parts[0].trim());
            fwr.write("\n\nВывод\n");
            fwr.write(normalizedAddress + " телефон " + normalizedPhone + "\n");
        }
        fwr.flush();
        fwr.close();
    }
}
