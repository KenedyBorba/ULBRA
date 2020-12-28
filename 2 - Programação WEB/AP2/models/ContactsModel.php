<?php

class ContactsModel
{

    var $result;
    var $conn;

    function __construct()
    {
        require_once("bd/ConnectClass.php");
        $Oconn = new ConnectClass();
        $Oconn->openConnect();
        $this->conn = $Oconn->getConn();
    }

    public function getContacts()
    {
        $sql = 'SELECT * FROM contacts';
        $this->result = $this->conn->query($sql);
    }

    public function insertContact($arrayContact)
    {
        $sql = "
                INSERT INTO contacts
                    (name, message, email)
                VALUES(
                    '{$arrayContact['name']}',
                    '{$arrayContact['message']}',
                    '{$arrayContact['email']}'
                )
            ";

        $this->conn->query($sql);
        $this->result = $this->conn->insert_id;
    }

    public function getContact($idContact)
    {
        $sql = "
                SELECT * FROM contacts
                WHERE idContact = {$idContact}
            ";
        $this->result = $this->conn->query($sql);
    }

    public function updateContact($arrayContact)
    {
        $sql = "
                UPDATE contacts
                    set
                        name='{$arrayContact['name']}',
                        email='{$arrayContact['email']}',
                        message='{$arrayContact['message']}'
                    where
                        idContact={$arrayContact['idContact']}
            ";
        $this->conn->query($sql);
    }

    public function deleteContact($idContact)
    {
        $sql = "
                DELETE FROM contacts
                    where
                    idContact = {$idContact}
            ";
        $this->conn->query($sql);
    }


    public function getConsult()
    {
        return $this->result;
    }
}
?>