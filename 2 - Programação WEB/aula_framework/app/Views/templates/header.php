<!DOCTYPE html>
<html lang="pt-BR">

<head>
    <title>Página - <?=$title?></title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="<?=base_url('assets/css/style.css')?>">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>

<body>
    <header class="jumbotron mb-0">
        <h1>City Gallery</h1>
    </header>

    <div class="container">
        <section class="row">

            <nav class="col-md-3">
                <h2>Menu</h2>
                <a class="dropdown-item" href="<?=base_url('home')?>">Home</a>
                <a class="dropdown-item" href="<?=base_url('about')?>">Sobre</a>
                <a class="dropdown-item" href="<?=base_url('products')?>">Produtos e Serviços</a>
                <a class="dropdown-item" href="<?=base_url('contact')?>">Contato</a><br>
                </br>
                
                <h2>Clientes</h2>
                <a class="dropdown-item" href="?controller=clients&action=register">Cadastro</a>
                <a class="dropdown-item" href="?controller=clients&action=listClients">Lista de Clientes</a>
            </nav>



            <article class="col-md-9">