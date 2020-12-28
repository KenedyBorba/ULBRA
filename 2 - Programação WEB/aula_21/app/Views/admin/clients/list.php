<h1>Lista de Clientes</h1>
<table class="table">
    <tr>
        <th>Código</th>
        <th>Nome</th>
        <th>Email</th>
        <th colspan="2">Ações</th>
        <th colspan="2">Pesquisar<a href="<?=base_url("admin/clients/resultado/{$client['search']}")?>" method=POST enctype='multipart/form-data'>
        <label for="busca">Nome</label>
        <input type="text" name="busca" id="busca">
        <button type="submit">Pesquisar</button>
</th>
    </tr>
    <?php
    foreach ($search as $search) {
    ?>
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