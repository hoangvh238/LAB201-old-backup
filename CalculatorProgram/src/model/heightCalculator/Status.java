package model.heightCalculator;

public class Status {
    enum status{
        UnderStandard , Standard, OverWeight, Fat,VeryFat
    }
    public String checkStatus(double value)
    {
        if(value<19)return status.UnderStandard.toString();
        else if(value<25)return status.Standard.toString();
        else if(value<30)return status.OverWeight.toString();
        else if(value<40)return status.Fat.toString();
        else  return status.VeryFat.toString();
    }
}
