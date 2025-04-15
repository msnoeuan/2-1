package W07p;

public class Student {
    // 속성 : 이름, 학번, 학과, 과목
    private String name;
    private String hb;
    private String dept;
    private String gwa;

    // 생성자
    public Student(String name, String hb, String dept, String gwa) {
        super();
        this.name = name;
        this.hb = hb;
        this.dept = dept;
        this.gwa = gwa;
    }

    // getter, setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHb() {
        return hb;
    }

    public void setHb(String hb) {
        this.hb = hb;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getGwa() {
        return gwa;
    }

    public void setGwa(String gwa) {
        this.gwa = gwa;
    }

    // toString()

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", hb='" + hb + '\'' + ", dept='" + dept + '\'' + ", gwa='" + gwa + '\'' + '}';
    }
}
