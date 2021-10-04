public class SingletonExample {

    private static SingletonExample myInstance = null;

    private SingletonExample() {
        System.out.println("Constructor for singleton has been called.............");
    }

    public static SingletonExample getInstance() {
        if(myInstance == null) {
            System.out.println("instance does not exist, creating it now...........");
            myInstance = new SingletonExample();

            return myInstance;
        }
        else {
            System.out.println("Instance already exists.................");
            return myInstance;
        }
    }
}
