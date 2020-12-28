<?php
session_start();

$requestMethod = $_SERVER['REQUEST_METHOD']; //get,post, pu, delete
$local = $_SERVER['SCRIPT_NAME']; // pw ..... index.php
$uri = $_SERVER['PHP_SELF']; //pw ..... index.php/xxx/123
$rout = str_replace($local, '', $uri); // /xxx/123/a

$uriSegments = explode('/', $rout);
if (isset($uriSegments[1])) {
    $controller = $uriSegments[1];
    switch ($controller) {
        case 'contacts':
            require_once('controllers/ContactsController.php');
            $Contacts = new ContactsController();
            switch ($requestMethod) {
                case 'GET':
                    if (isset($uriSegments[2]) && $uriSegments[2] != '') {
                        $Contacts->listContact($uriSegments[2]);
                    } else {
                        $Contacts->listContacts();
                    }
                break;
                case 'POST':
                    $Contacts->insertContact();
                break;
                case 'PUT':
                    $Contacts->updateContact($uriSegments[2]);
                break;
                case 'DELETE':
                    $Contacts->deleteContact($uriSegments[2]);
                break;
            }
        break;

        case 'users':
            require_once('controllers/UsersController.php');
            $users = new UsersController();
            switch ($requestMethod) {
                case 'GET':
                    if (isset($uriSegments[2]) && $uriSegments[2] == 'login') {
                        if (!isset($uriSegments[3]) || $uriSegments[3] = '') {
                            $users->login();
                        }
                    }
                break;
                break;
            }
    }
}

?>