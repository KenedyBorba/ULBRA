<h1>Alterar cliente</h1>
<form action="<?=base_url("admin/clients/update-action/{$client['idClient']}")?>" method=POST enctype='multipart/form-data'>
    <div class="form-group">
        <div>
            <label for="name">Id Cliente:</label>
            <input type="text" class="form-control" name="idClient" value="<?=$client['idClient']?>" readonly="readonly">
        </div>
        <div>
            <label for="name">Nome:</label>
            <input type="text" class="form-control" name="name" value="<?=$client['name']?>">
        </div>
        <div>
            <label for="email">Email:</label>
            <input type="mail" class="form-control" name="email" value="<?=$client['email']?>">
        </div>
        <div>
            <label for="tel">Telefone:</label>
            <input type="text" class="form-control" name="phone" value="<?=$client['phone']?>">
        </div>
        <div>
            <label for="end">Endereço:</label>
            <input type="text" class="form-control" name="address" value="<?=$client['address']?>">
        </div>
        <br>
 
        <br>
        <button type="submit" class="btn btn-success">Salvar</button>
    </div>
</form>