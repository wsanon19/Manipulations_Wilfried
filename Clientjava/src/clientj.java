import fr.polyschool.MonServiceTest;
import fr.polyschool.MonServiceTestService;

public class clientj {

    public static void main(String[] args) {
        MonServiceTest stub = new MonServiceTestService().getMonServiceTestPort();

        System.out.println("La moyenne de sophie est :" + stub.average(10,18,19));

    }

}
