import java.util.LinkedList;
import java.util.Queue;

public class StaffManagement {
    LinkedList<Staff> staffList = new LinkedList<>();
    LinkedList<Staff> output =new LinkedList<>();

    public void inputStaff(){
        Staff staff1 = new Staff("Linh1",1991,"Nu");
        staffList.addLast(staff1);
        Staff staff2 = new Staff("Linh2",1992,"Nam");
        staffList.addLast(staff2);
        Staff staff3 = new Staff("Linh3",1993,"Nu");
        staffList.addLast(staff3);
        Staff staff4 = new Staff("Linh4",1994,"Nam");
        staffList.addLast(staff4);
        Staff staff5 = new Staff("Linh5",1995,"Nu");
        staffList.addLast(staff5);
        Staff staff6 = new Staff("Linh6",1996,"Nam");
        staffList.addLast(staff6);
    }

    public void displayOriginalList(){
        for (int i = 0; i < staffList.size(); i++) {
            staffList.get(i).displayStaff();
        }
    }

    Queue<Staff> male = new LinkedList<>();
    public void buildMaleList(){
        int staffListSize = staffList.size();
        for (int index = 0; index < staffListSize; index++) {
            if (staffList.get(index).getGender().equals("Nam")){
                male.add(staffList.get(index));
            }
        }
    }

    Queue<Staff> female = new LinkedList<>();
    public void buildFemaleList(){
        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i).getGender().equals("Nu")){
                female.add(staffList.get(i));
            }
        }
    }

    public void buildOutput(){
        int maleSize = male.size();
        int femaleSize = female.size();

        for (int i = 0; i < femaleSize; i++) {
            output.push(female.remove());
        }
        for (int i = 0; i < maleSize; i++) {
            output.push(male.remove());
        }
    }

    public void displayOutputList(){
        for (int i = output.size()-1; i >=0 ; i--) {
            output.get(i).displayStaff();
        }
    }
}
