
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            GradeManager manager = new GradeManager(50); // capacity for 50 students

            int choice;
            do {
                System.out.println("\n===== Student Grade Management System =====");
                System.out.println("1. Add Student");
                System.out.println("2. Remove Student");
                System.out.println("3. Search Student by ID");
                System.out.println("4. Search Student by Name");
                System.out.println("5. Display All Students");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter student name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter number of subjects: ");
                        int n = sc.nextInt();
                        int[] marks = new int[n];
                        for (int i = 0; i < n; i++) {
                            System.out.print("Enter marks for subject " + (i + 1) + ": ");
                            marks[i] = sc.nextInt();
                        }
                        manager.addStudent(name, marks);
                        break;

                    case 2:
                        System.out.print("Enter student ID to remove: ");
                        int removeId = sc.nextInt();
                        manager.removeStudent(removeId);
                        break;

                    case 3:
                        System.out.print("Enter student ID to search: ");
                        int searchId = sc.nextInt();
                        Student s1 = manager.searchStudentById(searchId);
                        if (s1 != null) {
                            s1.displayInfo();
                        } else {
                            System.out.println("Student not found!");
                        }
                        break;

                    case 4:
                        System.out.print("Enter student name to search: ");
                        String searchName = sc.nextLine();
                        Student s2 = manager.searchStudentByName(searchName);
                        if (s2 != null) {
                            s2.displayInfo();
                        } else {
                            System.out.println("Student not found!");
                        }
                        break;

                    case 5:
                        manager.displayAllStudents();
                        break;

                    case 6:
                        System.out.println("Exiting program...");
                        break;

                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
            } while (choice != 6);

            sc.close();
        }
    }


