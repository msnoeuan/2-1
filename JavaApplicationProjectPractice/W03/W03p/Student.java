package W03p;

public class Student extends Person implements PrintInterface {
    private int stuId;
    private String jeongong;

    Student() {}
    Student(String name, String addr, String phone, int stuId, String jeongong) {
        super(name, addr, phone);
        this.stuId = stuId;
        this.jeongong = jeongong;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getJeongong() {
        return jeongong;
    }

    public void setJeongong(String jeongong) {
        this.jeongong = jeongong;
    }

    @Override
    public void print() {
        System.out.println("===학생 정보===");
        System.out.println("학생 이름 : " + getName());
        System.out.println("학생 주소 : " + getAddr());
        System.out.println("학생 연락처 : " + getPhone());
        System.out.println("학생 학번 : " + getStuId());
        System.out.println("학생 전공 : " + getJeongong());
    }
}
