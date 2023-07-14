public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Kitty",5,"white");
        System.out.println(animal);
        Animal animal1 = new Animal("Mur",6,"black");
        System.out.println(animal1);
        animal1.method();

        Cow cow = new Cow("Mu Mu",100,"Ala","Murka",800000);
        System.out.println(cow);
        cow.method();
        cow.met();







    }
}