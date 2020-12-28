<!DOCTYPE html>
<html lang="pt-BR">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="<?=base_url('assets_adm/css/style.css')?>">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
    <title>Página</title>
</head>

<body>
    <header class="jumbotron">
        <h1>Área Administrativa</h1>
        <a href="<?=base_url('admin/logout')?>">Logout</a>
    </header>

    <div class="container">
        <section class="row">

            <nav class="col-md-3">
                <h2>Menu</h2><br>
                <a href="<?=base_url('admin')?>">Home</a><br>
                <a href="<?=base_url('admin/clients')?>">Lista de Clientes</a><br>
                <a href="<?=base_url('admin/clients/insert')?>">-Inserir Cliente</a><br>
                </br>
            </nav>



            <article class="col-md-9">