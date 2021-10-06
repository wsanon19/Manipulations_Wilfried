
 <?php
$mt1=$_GET['mt1'];
$mt2=$_GET['mt2'];
$mt3=$_GET['mt3'];

$params = array( 'math'  => $mt1,    'Pc' => $mt2,    'SVT' => $mt3 );

$clientSOAP = new SoapClient("http://localhost:8686/?wsdl");
// $param= new stdClass();
// $param->mt1=$mt1;
// $param->mt2=$mt2;
// $param->mt3=$mt3;
$res=$clientSOAP->__soapCall("average", array($params));
 

?>
<html>
<title>PHP Average </title>
<form action="phpclient.php" method="get">
 <label for="name">Nom : </label><input type="text" name="name" > </input> <br>
 <label for="math">Maths : </label><input type="text" name="mt1" > </input> <br>
 <label for="PC">PC : </label><input type="text" name="mt2"> </input> <br>
 <label for="SVT">SVT : </label><input type="text" name="mt3"> </input> <br>
 <input type="submit" value="Moyenne">
 </form>
 <?php 
 echo $_GET['name'] . "<br>";
 echo $mt1 . "<br>" . $mt2 . "<br>" . $mt3 . "<br>";
 echo "Moyenne Generale de : " .  $res->return ; ?>
 </html>

