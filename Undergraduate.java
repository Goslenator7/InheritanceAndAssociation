public class Undergraduate extends Student {

    private String formerSchool;

    public Undergraduate(String name, String address, int age, int matricNumber, String formerSchool) {
        super(name, address, age, matricNumber);
        setFormerSchool(formerSchool);
    }

    public String getDetails() {
        String output;

        output = super.getDetails()+"Former School: "+getFormerSchool();
        return output;
    }

    //public void displayDetails() {
      //  String details = getDetails();
    //}

    public String getFormerSchool() {
        return formerSchool;
    }

    public void setFormerSchool(String formerSchool) {
        this.formerSchool = formerSchool;
    }
}
