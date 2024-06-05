<!DOCTYPE html>
<html>

<head>
    <title>Website Kereta Api</title>
    <link rel="stylesheet" type="text/css" href="style/homeStyles.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" integrity="sha512-xxxxxx" crossorigin="anonymous" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" integrity="sha384-xssvXNjB9x6ST2NR6KQw/XsS7+9tJtUgdqLao+Ldk6oVfMjITGYEJvHdG39Om0nn" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="https://kit.fontawesome.com/64d58efce2.js" crossorigin="anonymous"></script>
</head>

<body>
    <?php
    session_start();
    if ($_SESSION['status'] != 'Penumpang') {
        // jika bukan Penumpang, redirect ke halaman login
        header("Location: ../login/login.php");
    }
    $namaPenumpang = $_SESSION['nama'];
    ?>

    <div class="nav-container">
        <div class="logo">
            <p><a href="home.php">KAG</a></p>
        </div>
        <div class="right-links">
            <div class="profile">
                <div class="passenger-info">
                    <span class="passenger-name"><?php echo $_SESSION['nama']; ?></span>
                    <span class="login-status"><?php echo $_SESSION['status']; ?></span>
                    <button class="edit-profile-button" onclick="window.location.href='updatePenumpang.php'">Edit Profil</button>
                </div>
                <a href="../login/logout.php" class="logout-button"><i class="fas fa-sign-out-alt"></i></a>
            </div>
        </div>
    </div>

    <div class="content-container">
        <div class="container">
            <h1 class="center">Traversing Journeys, Carrying Dreams</h1>
        </div>
    </div>

    <div class="menu">
        <button class="ticket-view-button" onclick="window.location.href='lihatTiket.php'">Lihat Tiket</button>
        <button class="ticket-booking-button" onclick="window.location.href='buatTiket.php'">Pemesanan Tiket</button>
    </div>

    <footer>
        <div class="footer-container">
            <div class="footer-section">
                <h3>Tentang Kami</h3>
                <p>Situs Kereta Api Berbasis Online Terkini</p>
            </div>
            <div class="footer-section">
                <h3>Hubungi Kami</h3>
                <p>Email: kag.official@gmail.com</p>
                <p>Telepon: 84327909</p>
            </div>
            <div class="footer-section">
                <h3>Ikuti Kami</h3>
                <ul class="social-media-links">
                    <li><a href="#"><i class="fab fa-facebook-f"></i></a></li>
                    <li><a href="#"><i class="fab fa-twitter"></i></a></li>
                    <li><a href="#"><i class="fab fa-instagram"></i></a></li>
                </ul>
            </div>
        </div>
        <div class="footer-bottom">
            <p>Hak Cipta &copy; 2023 KAG. Dibuat oleh Kelompok 4</p>
        </div>
    </footer>
    </div>

</body>

</html>