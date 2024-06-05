<?php
session_start();
error_reporting(E_ALL ^ E_NOTICE ^ E_DEPRECATED);

$conn = mysqli_connect('localhost', 'root', '', 'perkeretaan');

if (!$conn) {
    die("Koneksi ke database gagal: " . mysqli_connect_error());
}

if (isset($_GET['action']) && $_GET['action'] == 'delete' && isset($_GET['id'])) {
    $id_tiket = $_GET['id'];

    $deleteSql = "DELETE FROM tiket WHERE id_tiket = $id_tiket";
    $deleteResult = mysqli_query($conn, $deleteSql);

    if ($deleteResult) {
        echo '<script language="JavaScript">
                alert("Data tiket berhasil dihapus!");
                window.location.href = "lihatTiket.php";
            </script>';
    } else {
        echo '<script language="JavaScript">
                alert("Gagal menghapus data tiket: ' . mysqli_error($conn) . '");
                window.location.href = "lihatTiket.php";
            </script>';
    }
}

$sql =
    "SELECT
        username AS 'Username',
        nama AS 'Nama',
        status AS 'Status'
    FROM users";

$result = mysqli_query($conn, $sql);

if (!$result) {
    echo "Error: " . $sql . "<br>" . mysqli_error($conn);
}

?>

<!DOCTYPE html>
<html>

<head>
    <title>Data Pengguna</title>
    <link rel="stylesheet" href="style/adminPageUserStyles.css">
</head>

<body>
    <div class="container">
        <h1>Data Pengguna</h1>
        <br>
        <table border="1">
            <tr>
                <th>Username</th>
                <th>Nama</th>
                <th>Status</th>
            </tr>
            <?php
            while ($row = mysqli_fetch_assoc($result)) {
                echo "<tr>";
                echo "<td>" . $row['Username'] . "</td>";
                echo "<td>" . $row['Nama'] . "</td>";
                echo "<td>" . $row['Status'] . "</td>";
                echo "</tr>";
            }
            ?>
        </table>
    </div>
    <div class="next-button">
        <button onclick="window.location.href='../login/login.php'">Logout</button>
        <button onclick="window.location.href='adminPageTiket.php'">Next >></button>
    </div>
</body>

</html>