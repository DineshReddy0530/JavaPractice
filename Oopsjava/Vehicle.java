
public class Vehicle {
    protected String name = "";
    protected String color="";
    private String model = "";
    private String company = "";
    private String engine = "800";
    public static int count = 0;

    public Vehicle(){
        count++;
    }

    public Vehicle(String name,String color, String model,String company,String engine){
        this.name = name;
        this.color = color;
        this.model = model;
        this.company = company;
        this.engine = engine;
        count++;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setColor(String peet){
        this.color = peet;
    }
    public void setModel(String foo){
        this.model = foo;
    }
    public void setCompany(String bar){
        this.company = bar;
    }
    public void setEngine(String engine){
        this.engine = engine;
    }
    public String getName() {
        return this.name;
    }
    public String getColor() {
        return this.color;
    }
    public String getModel() {
        return this.model;
    }
    public String getCompany() {
        return this.company;
    }
    private String getEngine(){
        return this.engine;
    }
    public int getSpeed(){
        String a = getEngine();
        if (a=="800"){
            return 90;
        }
        else{return 200;}
    }
    public String getInfo(){
        return "This is a Vehicle";
    }
}
