import java.util.Scanner;

class CalonMahasiswa {
	public String nikMhs, namaMhs, ttlMhs, alamatMhs, tlpMhs, jurusan, namaAyah, ttlAyah, alamatAyah, tlpAyah, namaIbu, ttlIbu, alamatIbu, tlpIbu, simpan;
	public int a, b, c, d, e;

	Scanner input = new Scanner (System.in);

	Keuangan uang = new Keuangan();
	Akademik akad = new Akademik();

	void daftar() {
		System.out.println(" ");
		System.out.println("================================================");
		System.out.println("      FORMULIR PENDAFTARAN MAHASISWA BARU  ");	
		System.out.println("        SEKOLAH TINGGI TEKNOLOGI BANDUNG   ");
		System.out.println("================================================");
		System.out.println(" ");
		System.out.println("A. Data Pribadi");
		System.out.println(" ");
		System.out.print("NIK [4 digit terakhir] 	: ");
		nikMhs = input.nextLine();
		System.out.print("Nama Lengkap 		: ");
		namaMhs = input.nextLine();
		System.out.print("Tempat Tanggal Lahir 	: ");
		ttlMhs = input.nextLine();
		System.out.print("Alamat 			: ");
		alamatMhs = input.nextLine();
		System.out.print("No Tlp 			: ");
		tlpMhs = input.nextLine();
		System.out.print("Jurusan Yang Diambil 	: ");
		jurusan = input.nextLine();
		System.out.println(" ");
		System.out.println("B. Data Ayah Kandung");
		System.out.println(" ");
		System.out.print("Nama Lengkap 		: "); 
		namaAyah = input.nextLine();
		System.out.print("Tempat Tanggal Lahir 	: ");
		ttlAyah = input.nextLine();
		System.out.print("Alamat 			: ");
		alamatAyah = input.nextLine();
		System.out.print("No Tlp 			: ");
		tlpAyah = input.nextLine();
		System.out.println(" ");
		System.out.println("C. Data Ibu Kandung");
		System.out.println(" ");
		System.out.print("Nama Lengkap 		: ");
		namaIbu = input.nextLine();
		System.out.print("Tempat Tanggal Lahir 	: ");
		ttlIbu = input.nextLine();
		System.out.print("Alamat 			: ");
		alamatIbu = input.nextLine();
		System.out.print ("No Tlp 			: ");
		tlpIbu = input.nextLine();
		System.out.println(" ");
		System.out.print("Anda Ingin Menyimpan Data? (y/t) : ");
		simpan = input.nextLine();

		if(simpan.equalsIgnoreCase("y")){
			System.out.println(" ");
			System.out.println("Data Berhasil Disimpan...");
			System.out.println("No.Registrasi : 1018" +nikMhs);
			
			uang.bayar1();
			uang.cekBayar();
			tes();
		}

		else if (simpan.equalsIgnoreCase("t")){
			daftar();
		}

		else {
			System.out.println(" ");
			System.out.println("Masukkan Pilihan Dengan Benar");
			daftar();
		}
	}

	void tes() {
		System.out.println(" ");
		System.out.println("Silahkan Ikuti Tes Berikut Ini Untuk Seleksi Penerimaan Mahasiswa Baru STTB !!!");
		System.out.println(" ");
		System.out.println("Note : ");
		System.out.println("Hanya yang bisa mendapat nilai 100 yang akan diterima...");
		System.out.println("Kerjakanlah dengan sebaik-baiknya...!!!");
		System.out.println(" ");
		System.out.println("	SELAMAT MENGERJAKAN......");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("***************** TES MASUK SEKOLAH TINGGI TEKNOLOGI BANDUNG *****************");
		System.out.println(" ");
		System.out.println("Jawablah pertanyaan berikut dengan [1/2/3/4]");
		System.out.println(" ");
		System.out.println("Untuk soal nomor 1-2 ");
		System.out.println("pilihlah kata yang merupakan pasangan paling sesuai untuk mengisi titik-titik.");
		System.out.println(" ");
		System.out.println("A. MAKAN:LAPAR = LAMPU: ");
		System.out.println("   1. Padang");
		System.out.println("   2. Terang");
		System.out.println("   3. Pijar");
		System.out.println("   4. Gelap");
		System.out.println(" ");
		System.out.print(" Jawab : ");
		a = input.nextInt();
		System.out.println(" ");
		System.out.println("B. KEUNTUNGAN:PENJUALAN = KEMASYHURAN: ");
		System.out.println("   1. Pembelian");
		System.out.println("   2. Keberanian");
		System.out.println("   3. Penipuan");
		System.out.println("   4. Jenderal");
		System.out.println(" ");
		System.out.print(" Jawab : ");
		b = input.nextInt();
		System.out.println(" ");
		System.out.println("Untuk soal nomor 3-4");
		System.out.println("pilihlah pasangan kata yang hubungannya sama atau dekat");
		System.out.println(" ");
		System.out.println("C. PESAWAT TERBANG:KABIN ");
		System.out.println("   1. Laci : Meja");
		System.out.println("   2. Gedung : Eskalator ");
		System.out.println("   3. Rumah : Ruangan ");
		System.out.println("   4. Roda : Kursi");
		System.out.println(" ");
		System.out.print(" Jawab : ");
		c = input.nextInt();
		System.out.println(" ");
		System.out.println("D. MENDOBRAK:MASUK ");
		System.out.println("   1. Merampok : Uang");
		System.out.println("   2. Telepon : Telegram ");
		System.out.println("   3. Mengaduk : Semen ");
		System.out.println("   4. Menyela : Bicara ");
		System.out.println(" ");
		System.out.print(" Jawab : ");
		d = input.nextInt();
		System.out.println(" ");
		System.out.println("Untuk soal nomor 5");
		System.out.println("pilihlah alternatif jawaban yang bermakna sama atau saling mendekati");
		System.out.println(" ");
		System.out.println("E. KREASI ");
		System.out.println("   1. Kemampuan berfikir");
		System.out.println("   2. Rencana ");
		System.out.println("   3. Kepandaian menari ");
		System.out.println("   4. Ciptaan");
		System.out.println(" ");
		System.out.print(" Jawab : ");
		e = input.nextInt();

		if ((a == 4) && (b == 2) && (c == 3) && (d == 4) && (e == 4)) {

			System.out.println(" ");
			System.out.println("SELAMAT ANDA LULUS....");

			uang.bayar2();
			uang.cekBayar();
			ktm();
			akad.jadwalOspek();
		}

		else {
			System.out.println(" ");
			System.out.println("ANDA TIDAK LULUS....");
			System.out.println("Silahkan Bisa Daftar Kembali Tahun Depan...");
		}
	}

	void ktm() {
		System.out.println(" ");
		System.out.println(" Anda Telah Resmi Menjadi Mahasiswa STT Bandung");
		System.out.println(" Berikut KTM dan Jadwal Ospek....");
		System.out.println(" ");
		System.out.println("=====================================");
		System.out.println("SEKOLAH TINGGI TEKNOLOGI BANDUNG");
		System.out.println(" ");
		System.out.println("     KARTU TANDA MAHASISWA    ");
		System.out.println(" ");
		System.out.println("Nama Lengkap    : " +namaMhs);
		System.out.println("Tanggal Lahir   : " +ttlMhs);
		System.out.println("NPM		: 18111" +nikMhs);
		System.out.println("jurusan 	: "+jurusan);
		System.out.println("=====================================");
	}
}