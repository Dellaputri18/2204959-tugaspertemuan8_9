package sekolah;

// Kelas MyDate (untuk representasi tanggal)
class MyDate {
    private int tahun;
    private int bulan;
    private int hari;
    
    public MyDate(int tahun, int bulan, int hari) {
        this.tahun = tahun;
        this.bulan = bulan;
        this.hari = hari;
    }
    
    public int getYear() {
        return tahun;
    }
    
    public int getMonth() {
        return bulan;
    }
    
    public int getDay() {
        return hari;
    }
    
    @Override
    public String toString() {
        return tahun + "-" + bulan + "-" + hari;
    }
}

// Kelas Person (Superclass)
class Person {
    private String nama;
    private String alamat;
    private String telepon;
    private String email;
    
    public Person(String nama, String alamat, String telepon, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        this.email = email;
    }
    
    public String getName() {
        return nama;
    }
    
    public String getAddress() {
        return alamat;
    }
    
    public String getPhoneNumber() {
        return telepon;
    }
    
    public String getEmail() {
        return email;
    }
    
    @Override
    public String toString() {
        return "Person: " + nama;
    }
}

// Kelas Student (Subclass dari Person)
class Student extends Person {
    public static final String MB1 = "Mahasiswa Baru";
    public static final String MB2 = "Mahasiswa Baru tahun kedua";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";
    
    private String status;
    
    public Student(String nama, String alamat, String telepon, String email, String status) {
        super(nama, alamat, telepon, email);
        this.status = status;
    }
    
    public String getClassStatus() {
        return status;
    }
    
    @Override
    public String toString() {
        return "Student: " + getName();
    }
}

// Kelas Employee (Subclass dari Person)
class Employee extends Person {
    private String office;
    private double salary;
    private MyDate dateHired;
    
    public Employee(String nama, String alamat, String telepon, String email, String office, double salary, MyDate dateHired) {
        super(nama, alamat, telepon, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }
    
    public String getOffice() {
        return office;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public MyDate getDateHired() {
        return dateHired;
    }
    
    @Override
    public String toString() {
        return "Employee: " + getName();
    }
}

// Kelas Faculty (Subclass dari Employee)
class Faculty extends Employee {
    private String officeHours;
    private String rank;
    
    public Faculty(String nama, String alamat, String telepon, String email, String office, double salary, MyDate dateHired, String officeHours, String rank) {
        super(nama, alamat, telepon, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }
    
    public String getOfficeHours() {
        return officeHours;
    }
    
    public String getRank() {
        return rank;
    }
    
    @Override
    public String toString() {
        return "Faculty: " + getName();
    }
}

// Kelas Staff (Subclass dari Employee)
class Staff extends Employee {
    private String title;
    
    public Staff(String nama, String alamat, String telepon, String email, String office, double salary, MyDate dateHired, String title) {
        super(nama, alamat, telepon, email, office, salary, dateHired);
        this.title = title;
    }
    
    public String getTitle() {
        return title;
    }
    
    @Override
    public String toString() {
        return "Staff: " + getName();
    }
}
