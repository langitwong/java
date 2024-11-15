package belajar.data;

public class mainApp {
    public static void main(String[] args) {
        personImplementation person = new personImplementation("Jack Molen");
        personImplementationChild person2 = new personImplementationChild("Oscar Riffs");

//      Parent
        person.sayHello("Ellijah Brown");
        person.greetings();
        person.haloDunia("Jeemal Tyson");

//      Child
        person2.sayHello("Ellijah Brown");
        person2.greetings();
        person.haloDunia("Jeemal Tyson");

    }
}
