<?php
$_fp = fopen("php://stdin", "r");
$mealCost = fgets($_fp);
$tipPercent = fgets($_fp);
$taxPercent = fgets($_fp);

$totalCost = $mealCost+($mealCost*($tipPercent+$taxPercent)/100);

echo "The total meal cost is ", round($totalCost), " dollars.";
?>
