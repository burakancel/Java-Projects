public class Main {

    public static void main(String[] args) {
        Fighter f1 = new Fighter("Burak",10,100,100,30,50);
        Fighter f2 = new Fighter("Mahmut",20,85,85,40,50);

        Match match = new Match(f1,f2,100,85);
        match.run();
    }
}
