package codexio;

public class Student_14 {
    static int studentCount;

    private String firstName;
    private  String lastName;
    private int course;
    private  String spec;
    private String university;
    private String email;
    private int telephone;

    public Student_14(String firstName, String lastName, int course, String spec, String university, String email, int telephone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.spec = spec;
        this.university = university;
        this.email = email;
        this.telephone = telephone;
        studentCount += 1;
    }
    public Student_14(String firstName, int course, String spec, String university, String email, int telephone) {
        this.firstName = firstName;
        this.course = course;
        this.spec = spec;
        this.university = university;
        this.email = email;
        this.telephone = telephone;
        studentCount += 1;
    }
    public Student_14(String firstName,String email, int telephone) {
        this.firstName = firstName;
        this.email = email;
        this.telephone = telephone;
        studentCount += 1;
    }

    public Student_14() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public void printStudent(){
        System.out.println(firstName+" "+email+" "+telephone);
    }

   }
