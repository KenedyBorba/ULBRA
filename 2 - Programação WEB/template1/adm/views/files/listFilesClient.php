<h1>Arquivos do cliente</h1>
<br>
<form method="POST" action="?controller=clients&action=uploadFilesClients&id=<?=$idClient?>">
    <button type="submit" class="btn btn-success">Inserir novo arquivo</button>
</form>
<br>
<?php
    //abre o diretório a ser manipulado
    $diretorio = opendir("assets/files/clients/".$idClient);
    //loop pelos arquivos do diretório para listarmos os mesmos
    while (($arquivo = readdir($diretorio)) != ""){
        //elimina a leitura dos arquivos de diretorio
        if($arquivo != '.' && $arquivo != '..' && $arquivo != 'Thumbs.db'){
            //seleciona a extenção do arquivo
            $extensao = str_replace('.', '', strrchr($arquivo, '.'));
            ?>
            <a href="assets/files/clients/<?=$idClient?>/<?$arquivo?>">

                <?php 
                    if($extensao == 'png' || $extensao == 'jpg' || $extensao == 'jpeg' || $extensao == 'gif' || $extensao == 'bmp'){
                ?>
                    <img src="assets/files/clients/<?=$idClient?>/<?=$arquivo?>" height="200px">
                <?php
                }else {
                    echo $arquivo;
                }
                ?>
            </a>
            <a href="?controller=clients&action=deleteFilesClient&id=<?=$idClient?>&file=<?=$arquivo?>">
                Deletar
            </a>
            <br>
            <?php
        }
    }

    //fecha o diretório
    $diretorio = closedir($diretorio);
    echo $diretorio;
    ?>