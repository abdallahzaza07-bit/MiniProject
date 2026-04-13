import java.util.ArrayList;

class Student {

    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int newMarks) {
        marks = newMarks;
    }
}

class StudentAnalyzer {

    private ArrayList<Student> studentList;

    public StudentAnalyzer(ArrayList<Student> list) {
        studentList = list;
    }

    // Part a
    public int countAbove(int threshold) {
        int count = 0;

        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getMarks() > threshold) {
                count++;
            }
        }

        return count;
    }
 // Part b
    public void removeFailing(int passMark) {
        for (int i = studentList.size() - 1; i >= 0; i--) {
            if (studentList.get(i).getMarks() < passMark) {
                studentList.remove(i);
            }
        }
    }
 // Part c
    public Student findTopStudent() {
        Student top = studentList.get(0);

        for (int i = 1; i < studentList.size(); i++) {
            if (studentList.get(i).getMarks() > top.getMarks()) {
                top = studentList.get(i);
            }
        }

        return top;
    }
