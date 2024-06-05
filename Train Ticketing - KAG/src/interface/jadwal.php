<?php
session_start();
error_reporting(E_ALL ^ E_NOTICE ^ E_DEPRECATED);

$conn = mysqli_connect('localhost', 'root', '', 'perkeretaan');

if (!$conn) {
    die("Koneksi ke database gagal: " . mysqli_connect_error());
}

if (isset($_POST['submit'])) {
    $no_telp = $_SESSION['no_telp'];
    $jumlah_tiket = $_POST['jumlah_tiket'];
    $id_jadwal = $_POST['id_jadwal'];

    // Jika id_jadwal == J1, masukkan data ke tabel tiket dengan id_keretaFK = K1, id_stasiunFK = S1, dan id_jadwalFK = J1
    if ($id_jadwal == "J1") {
        $sql = "INSERT INTO tiket (no_telpFK, id_keretaFK, id_jadwalFK, id_stasiunFK, jumlah_tiket)
                VALUES ('$no_telp', 'K1', '$id_jadwal', 'S1', $jumlah_tiket)";
        $result = mysqli_query($conn, $sql);

        if ($result) {
            echo '<script language="JavaScript">
                alert("Berhasil membuat tiket!");
                window.location = "lihatTiket.php";
            </script>';
        } else {
            echo '<script language="JavaScript">
                alert("Maaf, terjadi kesalahan saat mencoba membuat tiket.");
                window.location = "buatTiket.php";
            </script>';
        }
    }

    // Jika id_jadwal == J2, masukkan data ke tabel tiket dengan id_keretaFK = K2, id_stasiunFK = S2, dan id_jadwalFK = J2
    else if ($id_jadwal == "J2") {
        $sql = "INSERT INTO tiket (no_telpFK, id_keretaFK, id_jadwalFK, id_stasiunFK, jumlah_tiket)
                VALUES ('$no_telp', 'K2', '$id_jadwal', 'S2', $jumlah_tiket)";
        $result = mysqli_query($conn, $sql);

        if ($result) {
            echo '<script language="JavaScript">
                alert("Berhasil membuat tiket!");
                window.location = "lihatTiket.php";
            </script>';
        } else {
            echo '<script language="JavaScript">
                alert("Maaf, terjadi kesalahan saat mencoba membuat tiket.");
                window.location = "buatTiket.php";
            </script>';
        }
    }

    // Jika id_jadwal == J3
    else if ($id_jadwal == "J3") {
        $sql = "INSERT INTO tiket (no_telpFK, id_keretaFK, id_jadwalFK, id_stasiunFK, jumlah_tiket)
                VALUES ('$no_telp', 'K3', '$id_jadwal', 'S3', $jumlah_tiket)";
        $result = mysqli_query($conn, $sql);

        if ($result) {
            echo '<script language="JavaScript">
                alert("Berhasil membuat tiket!");
                window.location = "lihatTiket.php";
            </script>';
        } else {
            echo '<script language="JavaScript">
                alert("Maaf, terjadi kesalahan saat mencoba membuat tiket.");
                window.location = "buatTiket.php";
            </script>';
        }
    }

    // Jika id_jawdal == J4
    else if ($id_jadwal == "J4") {
        $sql = "INSERT INTO tiket (no_telpFK, id_keretaFK, id_jadwalFK, id_stasiunFK, jumlah_tiket)
                VALUES ('$no_telp', 'K4', '$id_jadwal', 'S4', $jumlah_tiket)";
        $result = mysqli_query($conn, $sql);

        if ($result) {
            echo '<script language="JavaScript">
                alert("Berhasil membuat tiket!");
                window.location = "lihatTiket.php";
            </script>';
        } else {
            echo '<script language="JavaScript">
                alert("Maaf, terjadi kesalahan saat mencoba membuat tiket.");
                window.location = "buatTiket.php";
            </script>';
        }
    }

    // Jika id_jadwal == J5
    else if ($id_jadwal == "J5") {
        $sql = "INSERT INTO tiket (no_telpFK, id_keretaFK, id_jadwalFK, id_stasiunFK, jumlah_tiket)
                VALUES ('$no_telp', 'K5', '$id_jadwal', 'S5', $jumlah_tiket)";
        $result = mysqli_query($conn, $sql);

        if ($result) {
            echo '<script language="JavaScript">
                alert("Berhasil membuat tiket!");
                window.location = "lihatTiket.php";
            </script>';
        } else {
            echo '<script language="JavaScript">
                alert("Maaf, terjadi kesalahan saat mencoba membuat tiket.");
                window.location = "buatTiket.php";
            </script>';
        }
    }

    // Jika id_jadwal == J6
    else if ($id_jadwal == "J6") {
        $sql = "INSERT INTO tiket (no_telpFK, id_keretaFK, id_jadwalFK, id_stasiunFK, jumlah_tiket)
                VALUES ('$no_telp', 'K1', '$id_jadwal', 'S5', $jumlah_tiket)";
        $result = mysqli_query($conn, $sql);

        if ($result) {
            echo '<script language="JavaScript">
                alert("Berhasil membuat tiket!");
                window.location = "lihatTiket.php";
            </script>';
        } else {
            echo '<script language="JavaScript">
                alert("Maaf, terjadi kesalahan saat mencoba membuat tiket.");
                window.location = "buatTiket.php";
            </script>';
        }
    }

    // Jika id_jadwal == J7
    else if ($id_jadwal == "J7") {
        $sql = "INSERT INTO tiket (no_telpFK, id_keretaFK, id_jadwalFK, id_stasiunFK, jumlah_tiket)
                VALUES ('$no_telp', 'K2', '$id_jadwal', 'S4', $jumlah_tiket)";
        $result = mysqli_query($conn, $sql);

        if ($result) {
            echo '<script language="JavaScript">
                alert("Berhasil membuat tiket!");
                window.location = "lihatTiket.php";
            </script>';
        } else {
            echo '<script language="JavaScript">
                alert("Maaf, terjadi kesalahan saat mencoba membuat tiket.");
                window.location = "buatTiket.php";
            </script>';
        }
    }

    // Jika id_jadwal == J8
    else if ($id_jadwal == "J8") {
        $sql = "INSERT INTO tiket (no_telpFK, id_keretaFK, id_jadwalFK, id_stasiunFK, jumlah_tiket)
                VALUES ('$no_telp', 'K3', '$id_jadwal', 'S3', $jumlah_tiket)";
        $result = mysqli_query($conn, $sql);

        if ($result) {
            echo '<script language="JavaScript">
                alert("Berhasil membuat tiket!");
                window.location = "lihatTiket.php";
            </script>';
        } else {
            echo '<script language="JavaScript">
                alert("Maaf, terjadi kesalahan saat mencoba membuat tiket.");
                window.location = "buatTiket.php";
            </script>';
        }
    }

    // Jika id_jadwal == J9
    else if ($id_jadwal == "J9") {
        $sql = "INSERT INTO tiket (no_telpFK, id_keretaFK, id_jadwalFK, id_stasiunFK, jumlah_tiket)
                VALUES ('$no_telp', 'K4', '$id_jadwal', 'S2', $jumlah_tiket)";
        $result = mysqli_query($conn, $sql);

        if ($result) {
            echo '<script language="JavaScript">
                alert("Berhasil membuat tiket!");
                window.location = "lihatTiket.php";
            </script>';
        } else {
            echo '<script language="JavaScript">
                alert("Maaf, terjadi kesalahan saat mencoba membuat tiket.");
                window.location = "buatTiket.php";
            </script>';
        }
    }
}
?>

<!DOCTYPE html>
<html>

<head>
    <title>Pilih Jadwal</title>
    <link rel="stylesheet" type="text/css" href="style/jadwalStyles.css">
</head>

<body>
    <h2>Pilih Jadwal Keberangkatan</h2>
    <form method="POST" action="<?php echo $_SERVER['PHP_SELF']; ?>">
        <table border=1>
            <tr>
                <th>ID Jadwal</th>
                <th>Stasiun Tujuan</th>
                <th>Nama Kereta</th>
                <th>Kelas</th>
                <th>WaktuKeberangkatan</th>
                <th>Harga Tiket/kursi (Rp.)</th>
            </tr>
            <?php
            $query =
                "SELECT
                    jadwal.id_jadwal AS 'ID Jadwal',
                    stasiun.nama_stasiun AS 'Stasiun Tujuan',
                    kereta.nama_kereta AS 'Nama Kereta',
                    kereta.kelas_kereta AS 'Kelas',
                    jadwal.tanggal_berangkat AS 'Waktu Keberangkatan',
                    jadwal.harga_tiket AS 'Harga Tiket/kursi (Rp.)'
                FROM jadwal
                JOIN stasiun ON jadwal.id_stasiunFK = stasiun.id_stasiun
                JOIN kereta ON jadwal.id_keretaFK = kereta.id_kereta";
            $result = mysqli_query($conn, $query);

            if (mysqli_num_rows($result) > 0) {
                while ($row = mysqli_fetch_assoc($result)) {
                    echo "<tr>";
                    echo "<td>" . $row['ID Jadwal'] . "</td>";
                    echo "<td>" . $row['Stasiun Tujuan'] . "</td>";
                    echo "<td>" . $row['Nama Kereta'] . "</td>";
                    echo "<td>" . $row['Kelas'] . "</td>";
                    echo "<td>" . $row['Waktu Keberangkatan'] . "</td>";
                    echo "<td>" . $row['Harga Tiket/kursi (Rp.)'] . "</td>";
                    echo "</tr>";
                }
            } else {
                echo "<tr><td colspan='5'>Tidak ada data jadwal</td></tr>";
            }
            ?>
        </table>
        <select name="id_jadwal" required>
            <option value="" disabled selected>Pilih Jadwal</option>
            <?php
            $query = "SELECT * FROM jadwal";
            $result = mysqli_query($conn, $query);

            if (mysqli_num_rows($result) > 0) {
                while ($row = mysqli_fetch_assoc($result)) {
                    echo "<option value='" . $row['id_jadwal'] . "'>" . $row['id_jadwal'] . "</option>";
                }
            } else {
                echo "<option value=''>Tidak ada data jadwal</option>";
            }
            ?>
        </select>
        <input type="number" name="jumlah_tiket" placeholder="Jumlah Tiket" required>

        <input type="submit" name="submit" value="Submit">
    </form>
</body>

</html>
