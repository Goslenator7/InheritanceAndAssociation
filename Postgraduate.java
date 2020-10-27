public class Postgraduate extends Student {

    private String formerDegree;

    public Postgraduate(String name, String address, int age, int matricNumber, String formerDegree) {
        super(name, address, age, matricNumber);
        setFormerDegree(formerDegree);
    }

    public String getDetails() {
        String output;

        output = super.getDetails()+"Former School: "+getFormerDegree();
        return output;
    }

    public String getFormerDegree() {
        return this.formerDegree;
    }

    public void setFormerDegree(String formerDegree) {
        this.formerDegree = formerDegree;
    }
}
