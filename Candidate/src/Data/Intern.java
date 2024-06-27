package Data;

import java.util.Date;

public class Intern extends Candidates {
    String majors;
    int semester;
    String university;

    public Intern(String id, String firstName, String lastName, int birthDay, String address, String phone, String email, int candiType, String majors, int semester, String university) {
        super(id, firstName, lastName, birthDay, address, phone, email, candiType);
        this.majors = majors;
        this.semester = semester;
        this.university = university;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return firstName+" "+lastName + " | "+birthDay+" | "+address +" | "+email+" | "+"2";
    }
}
