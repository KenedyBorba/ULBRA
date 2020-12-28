<?php

class ContactsController
{

    var $ContactModel;
    var $UserController;

    public function __construct()
    {

        require_once("models/ContactsModel.php");
        $this->ContactModel = new ContactsModel();
        require_once("controllers/UsersController.php");
        $this->UserController = new UsersController();
    }

    public function listContacts()
    {
        if ($this->UserController->isAdmin()) {
            $this->ContactModel->getContacts();
            $result = $this->ContactModel->getConsult();

            $arrayContacts = array();

            while ($line = $result->fetch_assoc()) {
                array_push($arrayContacts, $line);
            }

            header('Content-Type: application/json');
            echo json_encode($arrayContacts);
        } else {
            header('Content-Type: application/json');
            echo json_encode('{"access":"denied"}');
        }
    }

    public function listContact($idContact)
    {

        $this->ContactModel->getContact($idContact);
        $result = $this->ContactModel->getConsult();

        $arrayContacts = array();

        while ($line = $result->fetch_assoc()) {
            array_push($arrayContacts, $line);
        }

        header('Content-Type: application/json');
        echo json_encode($arrayContacts);
    }


    public function insertContact()
    {
        $contact = json_decode(file_get_contents('php://input'));

        $arrayContact['name'] = $contact->name;
        $arrayContact['email'] = $contact->email;
        $arrayContact['message'] = $contact->message;

        $this->ContactModel->insertContact($arrayContact);
        $idContact = $this->ContactModel->getconsult();

        header('Content-Type: application/json');
        echo ('{"result":"true"}');
    }

    public function updateContact($idContact)
    {

        $contact = json_decode(file_get_contents('php://input'));

        $arrayContact['idContact'] = $idContact;
        //$arrayContact['idContact'] = $contact -> idContact;
        $arrayContact['name'] = $contact->name;
        $arrayContact['email'] = $contact->email;
        $arrayContact['message'] = $contact->message;

        $this->ContactModel->updateContact($arrayContact);

        header('Content-Type: application/json');
        echo ('{"result":"true"}');
    }

    public function deleteContact($idContact)
    {
        $this->ContactModel->deleteContact($idContact);
        
        header('Content-Type: application/json');
        echo ('{"result":"true"}');
    }
}
?>