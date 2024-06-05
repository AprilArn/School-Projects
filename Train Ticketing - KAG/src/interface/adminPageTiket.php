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
        tiket.id_tiket,
        penumpang.nama_penumpang AS 'Nama Penumpang',
        penumpang.no_telp AS 'No. Telp',
        stasiun.nama_stasiun AS 'Stasiun Tujuan',
        kereta.nama_kereta AS 'Nama Kereta',
        kereta.kelas_kereta AS 'Kelas',
        jadwal.tanggal_berangkat AS 'Waktu Keberangkatan',
        jumlah_tiket AS 'Jumlah Tiket',
        jadwal.harga_tiket AS 'Harga/Tiket'
    FROM tiket
    JOIN penumpang ON tiket.no_telpFK = penumpang.no_telp
    JOIN stasiun ON tiket.id_stasiunFK = stasiun.id_stasiun
    JOIN kereta ON tiket.id_keretaFK = kereta.id_kereta
    JOIN jadwal ON tiket.id_jadwalFK = jadwal.id_jadwal";

$result = mysqli_query($conn, $sql);

if (!$result) {
    echo "Error: " . $sql . "<br>" . mysqli_error($conn);
}

?>

<!DOCTYPE html>
<html>

<head>
    <title>Tiket Kereta</title>
    <link rel="stylesheet" href="style/adminPageTiketStyle.css">
</head>

<body>
    <div class="container">
        <h1>Tiket Kereta</h1>
        <br>
        <p><b>Tiket Anda saat ini:</b></p>
        <table border=1>
            <tr>
                <th>Nama Penumpang</th>
                <th>No. Telp</th>
                <th>Stasiun Tujuan</th>
                <th>Nama Kereta</th>
                <th>Kelas</th>
                <th>Waktu Keberangkatan</th>
                <th>Jumlah Tiket</th>
                <th>Harga/Tiket</th>
                <th>Aksi</th>
            </tr>
            <?php
            while ($row = mysqli_fetch_assoc($result)) {
                echo "<tr>";
                echo "<td>" . $row['Nama Penumpang'] . "</td>";
                echo "<td>" . $row['No. Telp'] . "</td>";
                echo "<td>" . $row['Stasiun Tujuan'] . "</td>";
                echo "<td>" . $row['Nama Kereta'] . "</td>";
                echo "<td>" . $row['Kelas'] . "</td>";
                echo "<td>" . $row['Waktu Keberangkatan'] . "</td>";
                echo "<td>" . $row['Jumlah Tiket'] . "</td>";
                echo "<td>" . $row['Harga/Tiket'] . "</td>";
                echo "<td>
                      <button><a href='lihatTiket.php?action=delete&id=" . $row['id_tiket'] . "'>Delete</a></button>
                  </td>";
                echo "</tr>";
            }
            ?>
        </table>
    </div>
    <div class="print-button">
        <button onclick="window.location.href='adminPageUser.php'"><< Prev</button>
        <button onclick="window.location.href='../login/login.php'">Logout</button>
    </div>
</body>

</html>