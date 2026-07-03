public class GradeManager {
    private Student[] students;
    private int count;
    private final int MAX_STUDENTS;

    // Constructor
    public GradeManager(int maxStudents) {
        this.MAX_STUDENTS = maxStudents;
        students = new Student[MAX_STUDENTS];
        count = 0;
    }

    // Add a new student
    public void addStudent(String name, int[] marks) {
        if (count < MAX_STUDENTS) {
            students[count] = new Student(name, marks);
            count++;
            System.out.println("Student added successfully!");
        } else {
            System.out.println("Cannot add more students. Limit reached!");
        }
    }

    // Remove student by ID
    public void removeStudent(int id) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (students[i].getId() == id) {
                // Shift remaining students left
                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[count - 1] = null; // Clear last slot
                count--;
                found = true;
                System.out.println("Student removed successfully!");
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found!");
        }
    }

    // Search student by ID
    public Student searchStudentById(int id) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId() == id) {
                return students[i];
            }
        }
        return null;
    }

    // Search student by Name
    public Student searchStudentByName(String name) {
        for (int i = 0; i < count; i++) {
            if (students[i].getName().equalsIgnoreCase(name)) {
                return students[i];
            }
        }
        return null;
    }


    public void displayAllStudents() {
        if (count == 0) {
            System.out.println("No students to display.");
            return;
        }
        for (int i = 0; i < count; i++) {
            students[i].displayInfo();
        }
    }
}
