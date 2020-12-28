<h1>Altera Cliente</h1>
<form action="?controller=clients&action=updateClientAction" method=POST enctype='multipart/form-data'>
    <div class="form-group">
        <div>
            <label for="idClient">ID:</label>
            <input type="text" class="form-control" name="idClient" value="<?=$arrayClient['idClient']?>" readonly="readonly">
        </div>
        <div>
            <label for="name">Nome:</label>
            <input type="text" class="form-control" name="name" value="<?=$arrayClient['name']?>">
        </div>
        <div>
            <label for="email">Email:</label>
            <input type="mail" class="form-control" name="email" value="<?=$arrayClient['email']?>">
        </div>
        <div>
            <label for="tel">Telefone:</label>
            <input type="text" class="form-control" name="phone" value="<?=$arrayClient['phone']?>">
        </div>
        <div>
            <label for="address">Endereço:</label>
            <input type="text" class="form-control" name="address" value="<?=$arrayClient['address']?>">
        </div>
        <br>
        <div>
            <label for="photo">Foto: (selecione uma imagem apenas se quiser alterar)</label>
            <input type="file" class="form-control" name="photo">
        </div>
        <br>
        <div>
            <img style="max-width: 100px; max-height: 100px" src="assets/img/clients/<?=$arrayClient['idClient']?>.jpg">
        </div>
        <br>
        <button type="submit" class="btn btn-success">Salvar</button>
    </div>
</form>
