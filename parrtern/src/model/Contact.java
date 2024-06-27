package model;

public class Contact {
    int id;
    String mame;
    String firstName;
    String lastName;
    String group;
    String address;
    String phone;



    public Contact(int id, String mame, String firstName, String lastName, String group, String address, String phone) {
        this.id = id;
        this.mame = mame;
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.address = address;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return String.format("%-4d%-12s%-12s%-12s%-6s%-20s%s",id,mame,firstName,lastName,group,address,phone);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMame() {
        return mame;
    }

    public void setMame(String mame) {
        this.mame = mame;
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

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
