
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService (targetNamespace = "www.polyschool.fr")
public class monServiceTest {

    @WebMethod (operationName = "average")
    public double Moyenne(@WebParam (name = "math") double a ,@WebParam (name = "Pc")double b,@WebParam (name = "SVT")double c){
        return (a+b+c)/3 ;
    }




}
