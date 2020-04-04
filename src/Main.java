public class Main {
    public static void main(String[] args) {
        StaffManagement staffManagement= new StaffManagement();

        staffManagement.inputStaff();
        staffManagement.buildMaleList();
        staffManagement.buildFemaleList();
        staffManagement.buildOutput();
        staffManagement.displayOutputList();
    }
}
