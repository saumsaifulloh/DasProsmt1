//PERTANYAAN PERCOBAAN 1
1. Sebutkan dan tunjukkan masing-masing komponen perulangan FOR pada kode program Percobaan 1!
"int i = 1, i <= 10, i++"
2. Mengapa variabel tertinggi diinisialisasi 0 dan terendah diinisialisasi 100? Apa yang terjadi jika variabel tertinggi diinisialisasi 100 dan terendah diinisialisasi 0?
"inisialisasi awal (tertinggi = 0 dan terendah = 100) agar nilai tertinggi bisa diperbarui jika ditemukan nilai lebih besar dan nilai terendah bisa diperbarui jika ditemukan nilai terkecil"
3. Jelaskan fungsi dan alur kerja dari potongan kode berikut! 
  if (nilai > tertinggi) {
               tertinggi = nilai;
           }   
           if (nilai < terendah) {
               terendah = nilai;
           }
"berfungsi untuk menemukan nilai tertinggi dan terendah
   alur kerjanya: 
   * Sebelum perulangan dimulai, biasanya variabel tertinggi dan terendah sudah diinisialisasi terlebih dahulu
   * program akan menemukan nilai tertinggi dan terendah sesuai data terbaru yang di input
   * setelah perulangan berakhir nilai tertinggi dan terendah akan keluar" 
4. Modifikasi kode program sehingga terdapat perhitungan untuk menentukan berapa mahasiswa yang lulus dan yang tidak lulus berdasarkan batas kelulusan (nilai minimal 60). Tampilkan jumlah mahasiswa lulus dan tidak lulus setelah menampilkan nilai tertinggi dan terendah! "DONE"
5. Commit dan push kode program ke Github "DONE"

//PERTANYAAN PERCOBAAN 2
1. Pada potongan kode berikut, tentukan maksud dan kegunaan dari sintaks berikut:
if (nilai < 0 || nilai > 100) 
                System.out.println("Nilai tidak valid. Masukan lagi nilai yang valid!");
                continue;
a. nilai < 0 || nilai > 100  
"a. range 2 nilai 0 - 100 yang berfungsi untuk memvalidasi nilai yang di inputkan valid atau tidak"
b. continue 
"b. berlanjut tanpa henti jika di program tidak ditambahkan break"
2. Mengapa sintaks i++ dituliskan di akhir perulangan WHILE? Apa yang terjadi jika posisinya dituliskan di awal perulangan WHILE? 
"jika diawal maka program akan membaca 1+1 bukan 0+1"
3. Apabila jumlah mahasiswa yang dimasukkan adalah 19, berapa kali perulangan WHILE akan berjalan?
"19 kali"
4. Modifikasi kode program sehingga apabila terdapat mahasiswa yang mendapat nilai A, program menampilkan pesan tambahan "Bagus, pertahankan nilainya"! "DONE"
5. Commit dan push kode program ke Github "DONE"

//PERTANYAAN PERCOBAAN 3
1. Pada penggunaan DO-WHILE ini, apabila nama pelanggan yang dimasukkan pertama kali adalah “batal”, maka berapa kali perulangan dilakukan? "tidak ada perulangan"
2. Sebutkan kondisi berhenti yang digunakan pada perulangan DO-WHILE tersebut! "break"
3. Apa fungsi dari penggunaan nilai true pada kondisi DO-WHILE? 
"agar perulangan terus menerus sampai ada perintah lain"
4. Mengapa perulangan DO-WHILE tersebut tetap berjalan meskipun tidak ada komponen inisialisasi dan update? "karena dia menjalankan perintah terlebih daluhu dan memvalidasi data di akhir"