class Student {
    private int id;
    private String name;
    private int[] marks;
    private double average;
    private char grade;
    private static int idCounter = 1;

    public Student(String name, int[] marks) {
        this.id = idCounter++;
        this.name = name;
        this.marks = marks;
        calculateAverage();
        calculateGrade();
    }

    private void calculateAverage() {
        int sum = 0;
        for (int i=0; i< marks.length; i++) sum += marks[i];
        average = (double) sum / marks.length;
    }

    private void calculateGrade() {
        if (average >= 90) grade = 'A';
        else if (average >= 75) grade = 'B';
        else if (average >= 60) grade = 'C';
        else if (average >= 40) grade = 'D';
        else grade = 'F';
    }

    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name +
                ", Average: " + average + ", Grade: " + grade);
    }
}
