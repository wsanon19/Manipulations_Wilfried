
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService (targetNamespace = "www.polyschool.fr")
public class monServiceTest {

    @WebMethod (operationName = "average")
    public double Moyenne(@WebParam (name = "math") double a ,@WebParam (name = "Pc")double b,@WebParam (name = "SVT")double c){
//        double moy = 0 ;
//        for (int i = 0; i<_elv.getNote().length;i++){
//            moy =+ _elv.getNote()[i];
//        }
//        moy = moy / _elv.getNote().length;
        return (a+b+c)/3 ;
    }




}
