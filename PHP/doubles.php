<?php

$p = 0.1;

 for ($limit = 10; $limit <= 100000000; $limit *= 10) {
    $s = 0;
    for ($i = 0; $i < $limit; $i++) {
        $s += $p;
    }
    echo("limit: $limit --> $s\r\n");
 }
 
?>