<h1>Lista de Clientes</h1>
<table class="table">
    <tr>
        <th>Código</th>
        <th>Nome</th>
        <th>Email</th>
        <th>Endereço</th>
        <th>Telefone</th>
    </tr>
    <?php
    foreach ($arrayClients as $client) {
        echo("
        <tr>
        <td>
            {$client['idClient']}
        </td>
        <td>
            {$client['name']}
        </td>
        <td>
            {$client['email']}
        </td>
        <td>
            {$client['phone']}
        </td>
        <td>
            {$client['address']}
        </td>
        <td>
            <a class='btn btn-warning' href='?controller=clients&action=uploadClient&id={$client['idClient']}'>
                Editar
            </a>
        </td>
        <td>
            <a class='btn btn-danger' href='?controller=clients&action=deleteClient&id={$client['idClient']}'>
                Deletar
            </a>
        </td>
        ");

            if (is_file("assets/img/clients/{$client['idClient']}.jpg")) {
                echo("
                    <td>
                        <a href'assets/img/clients/{$client['idClient']}.jpg'>
                            <img style='max-width: 100px; max-height: 100px;' src='assets/img/clients/{$client['idClient']}.jpg'>
                        </a>
                        <br>
                        <a href='?controller=clients&action=listFilesClient&id={$client['idClient']}'>Arquivos</a>
                    </td>
                ");
            }else{
                echo("
                <td>
                    Sem foto 2 <br>
                    <a href='?controller=clients&action=listFilesClient&id={$client['idClient']}'>Arquivos</a>
                </td>
            ");
            }
    echo("
    </tr>
    ");
    }
    ?>
</table>