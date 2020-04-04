public class Staff {
    private String name;
    private int birthYear;
    private String gender;

    public Staff() {
    }

    public Staff(String name, int birthYear, String gender) {
        this.name = name;
        this.birthYear = birthYear;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void displayStaff(){
        System.out.printf("%-10s%-10d%-10s\n",this.name, this.birthYear, this.gender);
    }
}
