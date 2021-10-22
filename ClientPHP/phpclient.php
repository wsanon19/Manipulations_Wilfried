
 <?php
$mt1=$_GET['tyype'];

 $param = file_get_contents("http://localhost:9999/mesapi/produits/search/findByProduitType?type=$mt1");

?>
<html>
<title>PHP Average </title>
<form action="phpclient.php" method="get">
 <label for="tyype">Type : </label><input type="text" name="tyype" > </input> <br>
 <input type="submit" value="AUTRES">
 </form>
 <?php 
 echo "Le element de types $mt1 sont : $param <br/>";
 ?>

 </html>

