package Data;

import java.util.Date;

public class Experience extends Candidates {
    int expYear;
    String proSkill;

    public Experience(String id, String firstName, String lastName, int birthDay, String address, String phone, String email, int candiType, int expYear, String proSkill) {
        super(id, firstName, lastName, birthDay, address, phone, email, candiType);
        this.expYear = expYear;
        this.proSkill = proSkill;
    }


    public int getExpYear() {
        return expYear;
    }

    public void setExpYear(int expYear) {
        this.expYear = expYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return firstName+" "+lastName + " | "+birthDay+" | "+address +" | "+email+" | "+"0";
    }
}
