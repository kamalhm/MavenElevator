Feature : Emergency
    Scenario : Pengguna akan memanggil bantuan dari luar elevator
        Given saya telah menekan tombol emergency call
        When elevator bermasalah
        Then petugas akan mendapat panggilan dari elevator yang bermasalah
