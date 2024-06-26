import java.io.*;
import java.util.HashMap;

import static java.lang.String.valueOf;

public class xd6 {
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\Asus\\text6.txt";
        HashMap<String, Teacher> teachers = new HashMap<>();
        FileWriter fwr = new FileWriter("C:\\Users\\Asus\\text6.txt", true);

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(";");
                String teacherName = fields[0];
                String subjectName = fields[1];
                String group = fields[2];
                int debtors = Integer.parseInt(fields[3]);

                Teacher teacher = teachers.get(teacherName);
                if (teacher == null) {
                    teacher = new Teacher(teacherName);
                    teachers.put(teacherName, teacher);
                }

                Subject subject = new Subject(subjectName, group, debtors);
                teacher.addSubject(subject);
            }
        } catch (IOException e) {
            System.err.println("Trable =(: " + e.getMessage());
        }

        for (Teacher teacher : teachers.values()) {
            fwr.write("\n" + valueOf(teacher)+"\n");
            fwr.write("\n" + "По итогу должников: " + teacher.getTotalDebtors() + "\n");
        }
        fwr.flush();
        fwr.close();
    }
}

class Teacher {
    private String name;
    private HashMap<String, Subject> subjects;
    private int totalDebtors;

    public Teacher(String name) {
        this.name = name;
        this.subjects = new HashMap<>();
        this.totalDebtors = 0;
    }

    public void addSubject(Subject subject) {
        this.subjects.put(subject.getSubjectName(), subject);
        this.totalDebtors += subject.getDebtors();
    }

    public int getTotalDebtors() {
        return totalDebtors;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(": ");
        for (Subject subject : subjects.values()) {
            sb.append(subject.toString()).append("; ");
        }
        return sb.toString();
    }
}

class Subject {
    private String subjectName;
    private String group;
    private int debtors;

    public Subject(String subjectName, String group, int debtors) {
        this.subjectName = subjectName;
        this.group = group;
        this.debtors = debtors;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getDebtors() {
        return debtors;
    }

    @Override
    public String toString() {
        return subjectName + " " + group + " " + debtors + " должников";
    }
}
