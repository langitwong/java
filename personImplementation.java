package belajar.data;

public class personImplementation implements person{

    public String name;
    personImplementation(String name){
        this.name = name;
    }

    @Override
    public void sayHello(String name) {
        System.out.println("Hello, " + this.name + " i'm " + name);
    }

    @Override
    public void greetings() {
        System.out.println("Hello, neighbour i'm " + name);
    }

    @Override
    public void haloDunia(String name) {
        System.out.println("Hello, " + this.name + " i'm " + name + " and halo dunia");
    }
}
