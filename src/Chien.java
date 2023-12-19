public class Chien extends  Animal{

    private String race;

    public Chien(String name, int age,String race) {
        super(name, age);
        this.race = race;
    }

    @Override
    public void makeSound() {

    }

    @Override
    public void move() {

    }

    @Override
    public void displayDetails() {

    }

    public  void aboie(){
        System.out.println("Waouw  Waouw  ");
    }

    public void rapporte(){
        System.out.println("Os");
    }


    @Override
    public String toString() {
        return "Chien{" +
                this.name + " " +
                this.age + " " +
                "race='" + race + '\'' +
                '}';
    }
}
