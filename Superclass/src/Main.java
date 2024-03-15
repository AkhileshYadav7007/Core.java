public class Main {
    public static void main(String[] args) {
       AyodhyaStation ayodhyaStation = new AyodhyaStation();
       System.out.println("Calling method using the superclass object: ");
       ayodhyaStation.location();
       ayodhyaStation.famousFor();
       System.out.println();


       Lucknow lucknow = new Lucknow();
       AyodhyaDam ayodhyaDam = new AyodhyaDam();
       Bikapur bikapur = new Bikapur();
       System.out.println("Calling method using the subclass object: ");
       lucknow.location();
       lucknow.famousFor();

       ayodhyaDam.location();
       ayodhyaDam.famousFor();

       bikapur.location();
       bikapur.famousFor();
    }
}