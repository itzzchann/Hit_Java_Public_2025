package Tool;

public class Data {
    Student students[] = new Student[100];
    private int size;

    public void addStu(Student s) {
        if (size < students.length) {
            students[size++] = s;
        } else {
            System.out.println("Danh sách đã full");
        }
    }

    public void show() {
        System.out.printf("%-15s%-10s%-20s%-10s%-10s%-12s%-10s%-10s\n",
                "Tên", "Tuổi", "Địa chỉ", "TX1", "TX2", "KTHP", "GPA", "Nghỉ");
        System.out.println("--------------------------------------------------------------------------------------------");

        for (Student s : students) {
            if (s != null) {
                System.out.printf("%-15s%-10d%-20s%-10.2f%-10.2f%-12.2f%-10.2f%-10d\n",
                        s.getName(), s.getBirthday(), s.getAdd(),
                        s.getTx1(), s.getTx2(), s.getKthp(), s.getGpa(), s.getMisclas());
            }
        }
    }

    public void fixStu(String name, Student S) {
        for (int i = 0; i < size; i++) {
            if (students[i].getName().equalsIgnoreCase(name)) {
                students[i] = S;
                System.out.println("Đã sửa sinh viên.");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên.");
    }

    public void deleteStu(String name) {
        for (int i = 0; i < size; i++) {
            if (students[i].getName().equalsIgnoreCase(name)) {
                for (int j = i; j < size - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[--size] = null;
                System.out.println("Đã xóa sinh viên.");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên.");
    }

    public void sortByGpa() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (students[i].getGpa() < students[j].getGpa()) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
    }

    public void sortByAge() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (students[i].getBirthday() > students[j].getBirthday()) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
    }

    public void sortByAbsent() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (students[i].getMisclas() < students[j].getMisclas()) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
    }
}
