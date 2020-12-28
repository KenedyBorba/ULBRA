<h1>Insere Novo Arquivo cliente</h1>
<form class="form-group" method="POST" action="?controller=clients&action=uploadFilesClientAction&id=<?=$idClient?>" enctype="multipart/form-data">

        <label for="name">Arquivo: </label>
        <input type="file" class="form-control-file" name="file">
    <br>
    <button type="submit" class="btn btn btn-success">Salvar</button>

</form>