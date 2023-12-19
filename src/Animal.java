public abstract class Animal {

        protected String name;
        protected int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal() {
    }

    public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public abstract void makeSound();
        public abstract void move();
        public abstract void displayDetails();


    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", age=" + age ;
    }
}
