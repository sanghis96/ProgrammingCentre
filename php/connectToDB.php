<?php

$mysql_host = 'localhost';
$mysql_user = 'root';
$mysql_password = 'tiger';
$error_message = '<br><br><center><h2>Can not connect to Database!!!</h2></center><br><br>';

if(@mysql_connect($mysql_host,$mysql_user,$mysql_password) && @mysql_select_db('myDB'))
	;
else
	die($error_message);

?>