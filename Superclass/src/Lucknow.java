//Sub Class 1
public class Lucknow extends AyodhyaStation {
    @Override
    void location(){
        System.out.println("Lucknow is location in Uttar Pradesh, India");
    }
    @Override
    void famousFor(){
        System.out.println("Lucknow is famous for its scenic beauty and adventure sports");
    }
}
//Sub Class 2
class AyodhyaDam extends AyodhyaStation{
    @Override
    void location(){
        System.out.println("AyodhyaDam is located in Uttar Pradesh,India");

    }
    @Override
    void famousFor(){
        System.out.println("Ayodhya_Dam is famous place");

    }

}
//Sub Class 3
class Bikapur extends AyodhyaStation{
    @Override
    void location(){
        System.out.println("Bikapur is famous market in Ayodhya");
    }
    @Override
    void famousFor(){
        System.out.println("Bikapur is an Big market;");
    }

}