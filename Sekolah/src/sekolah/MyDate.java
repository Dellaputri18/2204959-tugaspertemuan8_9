package sekolah;

// Kelas MyDate (untuk representasi tanggal)
class MyDate {
    private int year;
    private int month;
    private int day;
    
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    public int getYear() {
        return year;
    }
    
    public int getMonth() {
        return month;
    }
    
    public int getDay() {
        return day;
    }
    
    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}

// Kelas Person (Superclass)
class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String email;
    
    public Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    
    public String getName() {
        return name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public String getEmail() {
        return email;
    }
    
    @Override
    public String toString() {
        return "Person: " + name;
    }
}

// Kelas Student (Subclass dari Person)
class Student extends Person {
    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";
    
    private String classStatus;
    
    public Student(String name, String address, String phoneNumber, String email, String classStatus) {
        super(name, address, phoneNumber, email);
        this.classStatus = classStatus;
    }
    
    public String getClassStatus() {
        return classStatus;
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
    
    public Employee(String name, String address, String phoneNumber, String email, String office, double salary, MyDate dateHired) {
        super(name, address, phoneNumber, email);
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
    
    public Faculty(String name, String address, String phoneNumber, String email, String office, double salary, MyDate dateHired, String officeHours, String rank) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
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
    
    public Staff(String name, String address, String phoneNumber, String email, String office, double salary, MyDate dateHired, String title) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
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
