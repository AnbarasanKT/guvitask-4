public class HashMapStudent {

    public static class StudentGrades {
        private HashMap<String, Integer> grades;

        public StudentGrades() {
            grades = new HashMapStudent<>();
        }

        public void addStudent(String name, int grade) {
            grades.put(name, grade);
        }

        public void removeStudent(String name) {
            grades.remove(name);
        }

        public Integer getGrade(String name) {
            return grades.get(name);
        }


    }
}
