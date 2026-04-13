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
 // Part d
    public ArrayList<Student> getTopStudents(int threshold) {
        ArrayList<Student> result = new ArrayList<Student>();

        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getMarks() >= threshold) {
                result.add(studentList.get(i));
            }
        }

        return result;
    }
 // Part e
    public boolean hasDuplicateNames() {
        for (int i = 0; i < studentList.size(); i++) {
            for (int j = i + 1; j < studentList.size(); j++) {
                if (studentList.get(i).getName().equals(studentList.get(j).getName())) {
                    return true;
                }
            }
        }

        return false;
    }
  // Part f
    public boolean isSorted() {
        for (int i = 0; i < studentList.size() - 1; i++) {
            if (studentList.get(i).getMarks() > studentList.get(i + 1).getMarks()) {
                return false;
            }
        }

        return true;
    }

    // Part g
    public int countImprovingPairs() {
        int count = 0;

        for (int i = 1; i < studentList.size(); i++) {
            if (studentList.get(i).getMarks() > studentList.get(i - 1).getMarks()) {
                count++;
            }
        }

        return count;
    }
}
public class MiniProject {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<Student>();

        list.add(new Student("Ali", 70));
        list.add(new Student("Sara", 85));
        list.add(new Student("Omar", 60));
        list.add(new Student("Lina", 90));
        list.add(new Student("Ali", 50));
        list.add(new Student("Maya", 78));
        list.add(new Student("Zaid", 88));
        list.add(new Student("Noor", 95));
        list.add(new Student("Khalid", 40));
        list.add(new Student("Hana", 82));

        StudentAnalyzer analyzer = new StudentAnalyzer(list);

        System.out.println(analyzer.countAbove(75));

        analyzer.removeFailing(50);
        System.out.println(list.size());

        Student top = analyzer.findTopStudent();
        System.out.println(top.getName());

        ArrayList<Student> topStudents = analyzer.getTopStudents(80);
        System.out.println(topStudents.size());

        System.out.println(analyzer.hasDuplicateNames());

        System.out.println(analyzer.isSorted());

        System.out.println(analyzer.countImprovingPairs());
    }
}
