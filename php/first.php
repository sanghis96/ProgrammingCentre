<?php
echo "<h2>PHP is Fun!</h2>";
echo "Hello world!<br>";
echo "I'm about to learn PHP!<br>";
echo "This ", "string ", "was ", "made ", "with multiple parameters.";

$txt1 = "Learn PHP";
$txt2 = "W3Schools.com";
$x = 5;
$y = 4;

echo "<h2>$txt1</h2>";
echo 'Study PHP at <a href="http://www.w3schools.com">' . $txt2 . '</a><br>';	//   php includes html tags also
echo $x + $y;
echo "<br><br>";

$num1 = 10;
$num2 = 20;
if($num1 == $num2)
	echo "<br>Two numbers are equal<br><br>";
else if($num1 < $num2)
	echo "<br>Num2 is greater than Num1<br><br>";
else
	echo "<br>Two numbers are not equal<br><br>";

//    Logical operators are and/&&,	or/||,	xor,  !

function sum($x, $y) 
{
    $z = $x + $y;
    return $z;
}
echo "5 + 10 = " . sum(5, 10) . "<br>";			//   . is a concatination operator
echo "7 + 13 = " . sum(7, 13) . "<br>";
echo "2 + 4 = " . sum(2, 4) . "<br>";

// Indexed Array
$cars = array("Volvo", "BMW", "Toyota");
echo "<br>I like " . $cars[0] . ", " . $cars[1] . " and " . $cars[2] . ".<br>";
$cars[3] = "Mercedes";
print_r($cars);
echo "<br>" . count($cars);

// Associative Arrays
$age = array("Peter"=>"35", "Ben"=>"37", "Joe"=>"43");
echo "<br><br>Peter is " . $age['Peter'] . " years old.<br>";
foreach($age as $x => $x_value) 
{
    echo "Key=" . $x . ", Value=" . $x_value;
    echo "<br>";
}

//Multidimensional Arraiys
$students = array(array('Mark',15,46),
	              array('John',13,65),
	              array('Tom',14,56));
for($i=0; $i<3; $i++)
{	
	echo "<br>";
	for($j=0; $j<3; $j++)
		echo $students[$i][$j] . "  ";
}

// Sort Functions For Arrays
sort($cars);    // sort arrays in ascending order
rsort($cars);   // sort arrays in descending order
asort($age);   // sort associative arrays in ascending order, according to the value
ksort($age);   // sort associative arrays in ascending order, according to the key
arsort($age);  // sort associative arrays in descending order, according to the value
krsort($age);  // sort associative arrays in descending order, according to the key

//  Switch case
$number = 156;
switch($number)
{
	case 1:echo "<br><br>Number is One";
		   break;
	case 2:echo "<br><br>Number is Two";
		   break;
	case 3:echo "<br><br>Number is Three";
		   break;
	default:echo "<br><br>Number not found";
}

//  Date and time
$date = date('d-m-y D');
echo '<br><br>' . $date . '<br>';
$time = date('H:i:s');		//  h for 12 hours, H for 24 hours
echo $time . '<br>';

//	Bramching
echo "<hr>";
include 'phpForm1.php';
echo "<hr>";

echo "<br><br>";
echo $_SERVER['PHP_SELF'];
echo "<br>";
echo $_SERVER['SERVER_NAME'];
echo "<br>";
echo $_SERVER['HTTP_HOST'];
echo "<br>";
echo $_SERVER['HTTP_REFERER'];
echo "<br>";
echo $_SERVER['HTTP_USER_AGENT'];
echo "<br>";
echo $_SERVER['SCRIPT_NAME'];
	
?>