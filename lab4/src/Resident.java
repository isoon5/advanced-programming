public class Resident {
    private String name;

    public Resident(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        return this.name;
    }
}
