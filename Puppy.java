public class Puppy {
    int puppyage;
    public Puppy(String name){
        System.out.println("Dog's name is " + name);
    }

    public void setPuppyage(int age){
        puppyage = age;
    }

    public int getPuppyage() {
        System.out.println("Dog's age is " + puppyage);
        return puppyage;
    }

    public static void main(String[] args){
        HelloWorld myHello = new HelloWorld();
        Puppy mypuppy = new Puppy("tommy");
        mypuppy.setPuppyage(4);
        mypuppy.getPuppyage();
        System.out.println(mypuppy.puppyage);
    }
}
