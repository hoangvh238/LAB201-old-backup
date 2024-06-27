package Data;

import java.util.Date;

public class Fresher extends Candidates{
   String graTime;
   String rankGra;
   String university;

    public Fresher(String id, String firstName, String lastName, int birthDay, String address, String phone, String email, int candiType, String graTime, String rankGra, String university) {
        super(id, firstName, lastName, birthDay, address, phone, email, candiType);
        this.graTime = graTime;
        this.rankGra = rankGra;
        this.university = university;
    }


    public String getGraTime() {
        return graTime;
    }

    public void setGraTime(String graTime) {
        this.graTime = graTime;
    }

    public String getRankGra() {
        return rankGra;
    }

    public void setRankGra(String rankGra) {
        this.rankGra = rankGra;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return firstName+" "+lastName + " | "+birthDay+" | "+address +" | "+email+" | "+"1";
    }
}
