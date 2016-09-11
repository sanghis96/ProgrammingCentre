<?php
$handle = fopen ("php://stdin","r");
$i = 4;
$d = 4.0;
$s = "HackerRank ";

// Read and save an integer, double, and String to your variables.
$myI = fgets($handle);
$myD = fgets($handle);
$myS = fgets($handle);

// Print the sum of both integer variables on a new line.
echo $i + $myI;

// Print the sum of the double variables on a new line.
echo "\n" , number_format((float)$d+$myD, 1, '.', '');

// Concatenate and print the String variables on a new line
// The 's' variable above should be printed first.
echo "\n$s$myS";

fclose($handle);
?>
