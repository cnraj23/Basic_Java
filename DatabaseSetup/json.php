<?php 
// db to json

header('Content-type:application/json');
mysql_connect('85.10.205.173:3306','tester321','pass@123') or die(mysql_error());
mysql_select_db('testing321');
$select = mysql_query('SELECT * FROM MyTest2');
$rows = array();
while($row = mysql_fetch_array($select)) 
{
$rows[] = array('id'=>$row['id'],'first'=>$row['first'],'last'=>$row['last'],'email'=>$row['email'],'pass'=>$row['pass']);
}
echo json_encode($rows);

?>