package sekolah;

public class main {
    public static void main(String[] args) {
        Person person = new Person("Budi Santoso", "Jalan Merdeka No. 123", "08123456789", "budi.santoso@example.com");
        Student student = new Student("Siti Aminah", "Jalan Mawar No. 45", "08234567890", "siti.aminah@example.com", Student.SENIOR);
        MyDate dateHired = new MyDate(2020, 1, 15);
        Employee employee = new Employee("Agus Prasetyo", "Jalan Kenanga No. 67", "08345678901", "agus.prasetyo@example.com", "Office 101", 50000, dateHired);
        Faculty faculty = new Faculty("Dr. Rina Permata", "Jalan Melati No. 89", "08456789012", "rina.permata@example.com", "Office 202", 75000, dateHired, "9am-5pm", "Professor");
        Staff staff = new Staff("Dewi Lestari", "Jalan Anggrek No. 101", "08567890123", "dewi.lestari@example.com", "Office 303", 40000, dateHired, "Administrator");

        // Menampilkan informasi dari setiap objek
        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
