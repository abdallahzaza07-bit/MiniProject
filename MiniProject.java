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
