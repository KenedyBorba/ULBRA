<?php
namespace App\Controllers;

use CodeIgniter\Controller;

class Site extends Controller{

    public function index()
    {
        $this -> view('home');
    }

    public function view($page = 'home')
    {
        $data['title'] = ucfirst($page);
        $data['user'] = "Nome do Usuário";        

        echo view('templates/header',$data);
        echo view('pages/'.$page , $data);
        echo view('templates/footer', $data);
    }

}