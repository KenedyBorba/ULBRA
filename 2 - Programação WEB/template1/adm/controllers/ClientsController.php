<?php

class ClientsController{

    var $ClientModel;
    
    public function __construct(){
        if(!isset($_SESSION["login"])){
            header("Location:index.php?controller=main&action=login");
        }else{
            require_once("models/ClientsModel.php");
            $this -> ClientModel = new ClientsModel();
        }
    }

    public function listClients() {
        $this -> ClientModel -> getClients();
        $result = $this -> ClientModel -> getConsult();

        $arrayClients = array();

        while($line = $result->fetch_assoc()){
            array_push($arrayClients,$line);
        }
        require_once('views/templates/header.php');
        require_once('views/clients/listClients.php');
        require_once('views/templates/footer.php');
    }

    public function insertClient() {
        require_once('views/templates/header.php');
        require_once('views/clients/insertClient.php');
        require_once('views/templates/footer.php');
    }

    public function insertClientAction() {
        $arrayClient['name'] = $_POST['name'];
        $arrayClient['email'] = $_POST['email'];
        $arrayClient['phone'] = $_POST['phone'];
        $arrayClient['address'] = $_POST['address'];

        $this -> ClientModel -> insertClient($arrayClient);
        $idClient = $this -> ClientModel -> getConsult();


    if(isset($_FILES["photo"])){

        $foto_temp = $_FILES["photo"]["tmp_name"];	//pega o caminho temporário do arquivo
        $foto_name = $_FILES["photo"]["name"];		//pega o nome

        $extensao = str_replace('.','',strrchr($foto_name, '.')); //strtolower(end(explode('.', $foto_name))); //seleciona a extenção da imagem
        $max_width = 600; //define largura máxima
        $max_height = 600; //define altura míxima

        // Carrega a imagem 
        $img = null;

        //Transforma a imagem em JPG
        if ($extensao == 'jpg' || $extensao == 'jpeg') { 
            $img = imagecreatefromjpeg($foto_temp);
        } else if ($extensao == 'png') { 
            $img = imagecreatefrompng($foto_temp);
        } else if ($extensao == 'gif') { 
            $img = imagecreatefromgif($foto_temp); 
        }  else     
            $img = imagecreatefromjpeg($foto_temp); 

        // Se a imagem foi carregada com sucesso, testa o tamanho da mesma
        if ($img) { 
            // Pega o tamanho da imagem e calcula proporção de resize 
            $width  = imagesx($img); 
            $height = imagesy($img); 
            $scale  = min($max_width/$width, $max_height/$height); 
            // Se a imagem é maior que o permitido, encolhe ela! 
            if ($scale < 1) { 
                $new_width = floor($scale*$width); 
                $new_height = floor($scale*$height);
                // Cria uma imagem temporária 
                $tmp_img = imagecreatetruecolor($new_width, $new_height);
                // Copia e resize a imagem velha na nova     
                imagecopyresampled($tmp_img, $img, 0, 0, 0, 0, 
                                $new_width, $new_height, $width, $height);  
                imagedestroy($img); 
                $img = $tmp_img; 
            }           
        }

        //cria imagem no diretório @imagejpeg($img,"diretorio/".$id_noticia) se já tiver com este nome vai substituir
        imagejpeg($img, "assets/img/clients/{$idClient}.jpg"); 

    }

        mkdir("assets/img/clients/{$idClient}.jpg");

        $this -> listClients();

        header('Location:index.php?controller=clients&action=listClients');
    }

    public function updateClient($idClient)
    {
        $this -> ClientModel -> getClient($idClient);
        $result = $this -> ClientModel -> getConsult();

        if($arrayClient = $result->fetch_assoc()){
            require_once('views/templates/header.php');
            require_once('views/clients/updateClient.php');
            require_once('views/templates/footer.php');

        }
    }

    public function updateClientAction()
    {
        $arrayClient['idClient'] = $_POST["idClient"];
        $arrayClient['name'] = $_POST['name'];
        $arrayClient['email'] = $_POST['email'];
        $arrayClient['phone'] = $_POST['phone'];
        $arrayClient['address'] = $_POST['address'];

        $this -> ClientModel -> updateClient($arrayClient);

        if($_FILES["photo"]["name"] != ""){
            $idClient = $arrayClient["idClient"];
            $foto_temp = $_FILES["photo"]["tmp_name"];	//pega o caminho temporário do arquivo
            $foto_name = $_FILES["photo"]["name"];		//pega o nome
    
            $extensao = str_replace('.','',strrchr($foto_name, '.')); //strtolower(end(explode('.', $foto_name))); //seleciona a extenção da imagem
            $max_width = 600; //define largura máxima
            $max_height = 600; //define altura míxima
    
            // Carrega a imagem 
            $img = null;
    
            //Transforma a imagem em JPG
            if ($extensao == 'jpg' || $extensao == 'jpeg') { 
                $img = imagecreatefromjpeg($foto_temp);
            } else if ($extensao == 'png') { 
                $img = imagecreatefrompng($foto_temp);
            } else if ($extensao == 'gif') { 
                $img = imagecreatefromgif($foto_temp); 
            }  else     
                $img = imagecreatefromjpeg($foto_temp); 
    
            // Se a imagem foi carregada com sucesso, testa o tamanho da mesma
            if ($img) { 
                // Pega o tamanho da imagem e calcula proporção de resize 
                $width  = imagesx($img); 
                $height = imagesy($img); 
                $scale  = min($max_width/$width, $max_height/$height); 
                // Se a imagem é maior que o permitido, encolhe ela! 
                if ($scale < 1) { 
                    $new_width = floor($scale*$width); 
                    $new_height = floor($scale*$height);
                    // Cria uma imagem temporária 
                    $tmp_img = imagecreatetruecolor($new_width, $new_height);
                    // Copia e resize a imagem velha na nova     
                    imagecopyresampled($tmp_img, $img, 0, 0, 0, 0, 
                                    $new_width, $new_height, $width, $height);  
                    imagedestroy($img); 
                    $img = $tmp_img; 
                }           
            }
    
            //cria imagem no diretório @imagejpeg($img,"diretorio/".$id_noticia) se já tiver com este nome vai substituir
            imagejpeg($img, "assets/img/clients/{$idClient}.jpg"); 
    
        }

        $this -> listClients();
        //header('Location:index.php?controller=clients&action=listClients');


    }

    public function deleteClient($idClient)
    {
        $this -> ClientModel -> deleteClient($idClient);
        $linkPhoto = "assets/img/clients/{$idClient}.jpg";
        if(file_exists($linkPhoto)){
            unlink($linkPhoto);
        }
        $dir = ("assets/files/clients/{$idClient}");
        $this -> delTree($dir);
        $this -> listClients();
    }

    public function listFilesClient($idClient)
    {
        require_once("views/header.php");
        require_once("views/clients/files/listFilesClient.php");
        require_once("views/footer.php");
    }

    public function uploadFilesClient($idClient)
    {
        require_once("views/header.php");
        require_once("views/clients/files/uploadFilesClient.php");
        require_once("views/footer.php");
    }

    public function uploadFilesClientAction($idClient)
    {
        //obtendo info dos arquivos
        $name = $_FILES['file']['name'];
        $tempName = $_FILES['file']['tpm_name'];
        $type = $_FILES['file']['type'];

        //Movendo arquivos do upload
        $file = $tempName;
        $location = "assets/files/clients/{$idClient}/{$name}";
        move_uploaded_file($file, $location);
        $this -> listFilesClient($idClient);
    }

    public function deleteFilesClient($idClient)
    {
        $file = $_GET['file'];

        unlink("assets/files/clients/{$idClient}/{$file}");
        $this -> listFilesClient($idClient);
    }

    function delTree($dir) {
        $files = array_diff(scandir($dir), array('.', '..'));
        foreach ($files as $file) {
            (is_dir("{$dir}/{$file}")) ? $this -> delTree("{$dir}/{$file}") : unlink("{$dir}/{$file}");
        }
        return rmdir($dir);
    }
}

?>