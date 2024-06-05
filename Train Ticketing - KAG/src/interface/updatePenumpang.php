<?php
session_start();
if ($_SESSION['status'] != 'Penumpang') {
    // jika bukan Penumpang, redirect ke halaman login
    header("Location: ../login/login.php");
}

// Mengubah nama pengguna
if (isset($_POST['edit_nama'])) {
    $newNama = $_POST['new_nama'];
    
    // Update nama pengguna di database
    $conn = mysqli_connect('localhost', 'root', '', 'perkeretaan');
    if (!$conn) {
        die("Koneksi ke database gagal: " . mysqli_connect_error());
    }

    $username = $_SESSION['username'];
    $updateSql = "UPDATE users SET nama = '$newNama' WHERE username = '$username'";
    $updateResult = mysqli_query($conn, $updateSql);

    if ($updateResult) {
        $_SESSION['nama'] = $newNama;
        echo '<script language="JavaScript">
                alert("Nama berhasil diubah!");
                window.location.href = "home.php";
            </script>';
    } else {
        echo '<script language="JavaScript">
                alert("Gagal mengubah nama: ' . mysqli_error($conn) . '");
                window.location.href = "home.php";
            </script>';
    }
}
?>

<!DOCTYPE html>
<html>

<head>
    <title>home</title>
    <link rel="stylesheet" type="text/css" href="style/updatePenumpangStyle.css">
</head>

<body>
    <h2>Selamat datang,<br></h2>
    <h1><?php echo $_SESSION['nama']; ?></h1>
    <p>Ini adalah halaman edit Profile.</p>
    <br>
    <br>
    <form method="POST" action="<?php echo $_SERVER['PHP_SELF']; ?>">
        <label for="new_nama">Edit Nama:</label>
        <input type="text" name="new_nama" id="new_nama" value="<?php echo $_SESSION['nama']; ?>">
        <div class="button-container">
            <button class="cancel-button" type="button" onclick="window.location.href='home.php'">Batal</button>
            <button type="submit" name="edit_nama">Simpan</button>
        </div>
    </form>
</body>

</html>
