<h1>Lista de Clientes</h1>
<table class="table">
    <tr>
        <th>Código</th>
        <th>Nome</th>
        <th>Email</th>
        <th colspan="2">Ações</th>
    </tr>
    <?php
    foreach ($clients as $client) {
    ?>
        <tr>
            <td>
                <?= $client["idClient"] ?>
            </td>
            <td>
                <?= $client["name"] ?>
            </td>
            <td>
                <?= $client["email"] ?>
            </td>
            <td>
                <a href="<?=base_url("admin/clients/{$client['idClient']}")?>">Ver detalhes</a>
            </td>
            <td>
                <a class="btn btn-warning" href="<?=base_url("admin/clients/update/{$client['idClient']}")?>">Alterar</a>   
         </td>            
         <td>
                <a class="btn btn-danger" href="<?=base_url("admin/clients/delete/{$client['idClient']}")?>">Deletar</a>   
         </td>
        </tr>
    <?php
    }
    ?>
</table>
<h1>
        Pesquisar
    </h1>
    <form action="<?= base_url('Admin/clients/resultado')?>" method="POST">
        <label for="search">Nome</label>
        <input type="text" class="form-control" name="search" id="search">
        <button type="submit" class="btn btn-primary">Pesquisar</button>
    </form>