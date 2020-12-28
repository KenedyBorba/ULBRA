<?php

session_start();
require_once("config/config.php");

if (!isset($_GET['controller'])) {
    require_once('controllers/MainController.php');
    $Main = new MainController();
    $Main->index();
} else {
    switch ($_REQUEST['controller']) {
        case 'main':
            require_once("controllers/MainController.php");
            $Main = new MainController();
            
            if (!isset($_GET['action'])) {
                $Main->index();
            } else {
                switch ($_REQUEST['action']) {
                    case 'index':
                        $Main->index();
                    break;
                    case 'login':
                        $Main->login();
                    break;
                    case 'logout':
                        $Main->logout();
                    break;
                }
            }
        break;

        case 'users':
            require_once("controllers/UsersController.php");
            $User = new UsersController();

            if (!isset($_GET['action'])) {
                $User->index();
            } else {
                switch ($_REQUEST['action']) {
                    case 'validatelogin':
                        $User->validateLogin();
                    break;
                }
            }
        break;

        case 'clients':
            require_once("controllers/ClientsController.php");
            $Client = new ClientsController();

            if (!isset($_GET['action'])) {
                $Client->index();
            } else {
                switch ($_REQUEST['action']) {
                    case 'listclients':
                        $Client->listClients();
                    break;
                }
            }
        break;
    }
}
