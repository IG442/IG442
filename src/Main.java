import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static class Student {
        private String name;
        private int group;
        private int course;
        private List<Integer> grades;

        public Student(String name, int group, int course, List<Integer> grades) {
            this.name = name;
            this.group = group;
            this.course = course;
            this.grades = new ArrayList<>(grades);
        }

        public String getName() {
            return name;
        }

        public int getGroup() {
            return group;
        }

        public int getCourse() {
            return course;
        }

        public List<Integer> getGrades() {
            return new ArrayList<>(grades);
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setGroup(int group) {
            this.group = group;
        }

        public void setCourse(int course) {
            this.course = course;
        }

        public void setGrades(List<Integer> grades) {
            this.grades = new ArrayList<>(grades);
        }

        public double getAverageGrade() {
            if (grades.isEmpty()) return 0.0;
            return grades.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Student student = (Student) obj;
            return group == student.group &&
                    course == student.course &&
                    Objects.equals(name, student.name) &&
                    Objects.equals(grades, student.grades);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, group, course, grades);
        }

        @Override
        public String toString() {
            return "{ФИО " + name + ", Группа " + group + ", Курс " + course + ", Оценки " + grades + ", Средний бал " + String.format("%.2f", getAverageGrade()) + "}";
        }
    }

    public static void removeLowPerformers(Set<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3.0) {
                iterator.remove();
            }
        }
    }

    public static void promoteStudents(Set<Student> students) {
        for (Student student : students) {
            if (student.getAverageGrade() >= 3.0) {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

    public static void printStudents(Set<Student> students, int course) {
        System.out.println("Студенты на курсе " + course + ":");
        boolean found = false;
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println("- " + student.getName());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Нет студентов на данном курсе.");
        }
    }

    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("Иванов Иван Иванович", 101, 2, Arrays.asList(4, 5, 3, 2)));
        students.add(new Student("Петров Петр Петрович", 102, 3, Arrays.asList(5, 5, 4, 4)));
        students.add(new Student("Сидоров Сидор Сидорович", 103, 1, Arrays.asList(2, 2, 1, 3)));
        students.add(new Student("Аннова Анна Ивановна", 104, 2, Arrays.asList(3, 4, 4, 3)));

        System.out.println("Исходный список студентов:");
        for (Student s : students) {
            System.out.println(s);
        }

        removeLowPerformers(students);
        System.out.println("\nПосле удаления студентов со средним баллом < 3:");
        for (Student s : students) {
            System.out.println(s);
        }

        promoteStudents(students);
        System.out.println("\nПосле перевода на следующий курс:");
        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println();
        printStudents(students, 1);
        printStudents(students, 3);
        printStudents(students, 4);

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "+7-111-222-3333");
        phoneBook.add("Иванов", "+7-222-333-4444");
        phoneBook.add("Петров", "+7-555-666-7777");
        phoneBook.add("Сидоров", "+7-888-999-0000");

        System.out.println("Номера для Иванова: " + phoneBook.get("Иванов"));
        System.out.println("Номера для Петрова: " + phoneBook.get("Петров"));
        System.out.println("Номера для Сидорова: " + phoneBook.get("Сидоров"));
        System.out.println("Номера для неизвестной фамилии (Смирнов): " + phoneBook.get("Смирнов"));

        System.out.println("\nВесь справочник: " + phoneBook);
    }

    public static class PhoneBook {
        private Map<String, List<String>> phoneBook;

        public PhoneBook() {
            this.phoneBook = new HashMap<>();
        }

        public void add(String surname, String phone) {
            phoneBook.computeIfAbsent(surname, k -> new ArrayList<>()).add(phone);
        }

        public List<String> get(String surname) {
            return phoneBook.getOrDefault(surname, new ArrayList<>());
        }

        @Override
        public String toString() {
            return phoneBook.toString();
        }
    }
}