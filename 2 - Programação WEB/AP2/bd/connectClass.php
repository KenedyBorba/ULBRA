<?php

class connectClass
{

    var $conn;

    public function openConnect()
    {
        $servername = 'localhost';
        $username = 'root';
        $password = '';
        $dbname = 'ap2';
        $this->conn = new mysqli($servername, $username, $password, $dbname);
    }

    public function getConn()
    {
        return $this->conn;
    }
}
?>