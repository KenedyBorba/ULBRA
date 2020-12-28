<?php

    class ClientsModel{
        
        var $result;

        function __construct(){
            require_once("bd/ConnectClass.php");
        }

        public function listClients(){
            $Oconn = new ConnectClass();
            $Oconn -> openConnect();
            $conn = $Oconn -> getConn();

            $sql = 'SELECT * FROM clients';
            
            $this -> result = $conn -> query($sql);
        }

        public function getConsult()
        {
            return $this -> result;
        }
    }


?>