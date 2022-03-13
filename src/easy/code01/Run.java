
public class Run {

    public static void main(String[] args) {
        Resoult2 resoult2=new Resoult2();
        Resoult1 resoult1=new Resoult1();

        int r2 = resoult2.romanToInt("III");
        int r1 = resoult1.romanToInt("III");

        System.out.println("r1=="+r2);
        System.out.println("r2=="+r2);
    }
}
