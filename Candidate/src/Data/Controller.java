package Data;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public List<Experience> experiences = new ArrayList<>();
    public List<Fresher> freshers = new ArrayList<>();
    public List<Intern> interns = new ArrayList<>();

    public void displayAll()
    {
        System.out.println("List of candidate:");
        System.out.println("===========EXPERIENCE CANDIDATE============");
        for (Experience object:experiences)
        {
            System.out.println(object.getFirstName()+" "+object.getLastName());
        }
        System.out.println("=========================================");
        System.out.println("==========FRESHER CANDIDATE==============");
        for (Fresher object:freshers)
        {
            System.out.println(object.getFirstName()+" "+object.getLastName());
        }
        System.out.println("=========================================");
        System.out.println("===========INTERN CANDIDATE==============");
        for (Intern object:interns)
        {
            System.out.println(object.getFirstName()+" "+object.getLastName());
        }
        System.out.println("=========================================");
    }
    public void found(String name,int cate)
    {
        switch (cate)
        {
            case 0:
                for (Experience object:experiences)
                {
                    String fullName = object.getFirstName()+object.getLastName();
                    if(fullName.contains(name)) System.out.println(object.toString());
                }
                break;
            case 1:
                for (Fresher object:freshers)
                {
                    String fullName = object.getFirstName()+object.getLastName();
                    if(fullName.contains(name)) System.out.println(object.toString());
                }
                break;
            case 2:
                for (Intern object:interns)
                {
                    String fullName = object.getFirstName()+object.getLastName();
                    if(fullName.contains(name)) System.out.println(object.toString());
                }
                break;

        }
    }
}
