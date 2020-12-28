<h1>Lista de Clientes</h1>
<table class="table">
    <tr>
        <th>Código</th>
        <th>Nome</th>
        <th>Email</th>
        <th>Ações</th>
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
                <a href="<?=base_url("clients/{$client['idClient']}")?>">Ver detalhes</a>
            </td>
        </tr>
    <?php
    }
    ?>
</table>