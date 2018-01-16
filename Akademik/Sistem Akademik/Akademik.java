import java.util.Scanner;

class Akademik{

	String matkul1, matkul2, tambah;

	Scanner input = new Scanner (System.in);

	void jadwalOspek() {
		System.out.println(" ");
		System.out.println(" JADWAL OSPEK MAHASISWA BARU STT BANDUNG 2018/2019");
		System.out.println(" ");
		System.out.println(" Kamis 25 Januari 2018 pukul 19.00 : Menggunakan baju hitam putih ");
		System.out.println(" Jumat 26 Januari 2018 pukul 19.00 : Menggunakan baju STTB");
		System.out.println(" Sabtu 27 Januari 2018 pukul 18.00 : Menggunakan baju olahraga");
		System.out.println(" ");
		System.out.println(" Note : ");
		System.out.println(" Untuk baju STTB bisa diambil dikampus hari Rabu 24 Januari 2018 pukul 14.00");
		System.out.println(" ");
	}

	void krs1(){
		System.out.println(" ");
		System.out.println("---------------------------------------------------------------");
		System.out.println(" SEKOLAH 	|  KRS SEMESTER GANJIL 2017/2018 ");	
		System.out.println(" TINGGI		|  Jurusan	: TEKNIK INFORMATIKA ");
		System.out.println(" TEKNOLOGI 	|  Kelas	: TIF 15 Karyawan ");
		System.out.println(" BANDUNG 	|  Bagian	: Mahasiswa");
		System.out.println("---------------------------------------------------------------");
		System.out.println(" 	RENCANA STUDI SEMESETERAN	   		|  1  |");
		System.out.println("---------------------------------------------------------------");
		System.out.println("No |         NAMA MATA KULIAH 			| DOSEN | SKS |");
		System.out.println("---------------------------------------------------------------");	
		System.out.println(" 1 | Pemrograman Web II 			|	|  3  |");
		System.out.println(" 2 | Intelegensi Buatan 			|	|  3  |");
		System.out.println(" 3 | Object Oriented Analysis and Design 	|	|  3  |");
		System.out.println(" 4 | Interaksi Manusia & Komputer		|	|  2  |");
		System.out.println(" 5 | Teknik Kompilasi			 	|	|  3  |");
		System.out.println(" 6 | Teori Graph				|	|  3  |");
		System.out.println(" 7 | Object Oriented Programming I 	 	|	|  3  |");
		System.out.println("---------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------");
		System.out.println(" 	PERSETUJUAN RENCANA STUDI	   		|  2  |");
		System.out.println("---------------------------------------------------------------");
		System.out.println("Nama Dosen Wali : Naseer, S.Kom, MT.");
		System.out.println("Keterangan      : Belum Menyetujui");
		System.out.println("---------------------------------------------------------------");
		System.out.println(" ");
	}

	void krs2(){
		System.out.println(" ");
		System.out.println("---------------------------------------------------------------");
		System.out.println(" SEKOLAH 	|  KRS SEMESTER GANJIL 2017/2018 ");	
		System.out.println(" TINGGI		|  Jurusan	: TEKNIK INFORMATIKA ");
		System.out.println(" TEKNOLOGI 	|  Kelas	: TIF 14 Karyawan ");
		System.out.println(" BANDUNG 	|  Bagian	: Mahasiswa");
		System.out.println("---------------------------------------------------------------");
		System.out.println(" 	RENCANA STUDI SEMESETERAN	   		|  1  |");
		System.out.println("---------------------------------------------------------------");
		System.out.println("No |         NAMA MATA KULIAH 			| DOSEN | SKS |");
		System.out.println("---------------------------------------------------------------");	
		System.out.println(" 1 | Internet & E-Commerce			|	|  3  |");
		System.out.println(" 2 | Etika Profesi 				|	|  2  |");
		System.out.println(" 3 | Sistem Informasi Enterprise 		|	|  3  |");
		System.out.println(" 4 | Object Oriented Programming II		|	|  3  |");
		System.out.println(" 5 | Mobile Programming			 	|	|  3  |");
		System.out.println(" 6 | Basis Data Terdistribusi			|	|  3  |");
		System.out.println(" 7 | Multimedia & Animasi 	 		|	|  3  |");
		System.out.println("---------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------");
		System.out.println(" 	PERSETUJUAN RENCANA STUDI	   		|  2  |");
		System.out.println("---------------------------------------------------------------");
		System.out.println("Nama Dosen Wali : Naseer, S.Kom, MT.");
		System.out.println("Keterangan      : Belum Menyetujui");
		System.out.println("---------------------------------------------------------------");
		System.out.println(" ");
	}

	void tambahMatkul() {
		System.out.println(" ");
		System.out.print("Anda Ingin Menambah Mata Kuliah? (y/t) : ");
		tambah = input.nextLine();
		
		if(tambah.equalsIgnoreCase("y")){
			System.out.println(" ");
			System.out.println("Daftar Mata Kuliah Yang Boleh Ditambahkan");
			System.out.println("1. Sistem Mikroprosessor (3 SKS)");
			System.out.println("2. Sistem Informatika Geografis (3 SKS)");
			System.out.println("3. Sistem Pakar (2 SKS)");
			System.out.println(" ");
			System.out.println("Masukkan Mata Kuliah Yang Ingin Ditambahkan :");
			System.out.print("1. ");
			matkul1 = input.nextLine();

			if(matkul1.equalsIgnoreCase("sistem Mikroprosessor")) {
				System.out.println(" ");
				System.out.println("Jumlah Mata Kuliah : 8");
				System.out.println("Jumlah SKS         : 23");
			}

			else if(matkul1.equalsIgnoreCase("Sistem Informatika Geografis")) {
				System.out.println(" ");
				System.out.println("Jumlah Mata Kuliah : 8");
				System.out.println("Jumlah SKS         : 23");
			}

			else if(matkul1.equalsIgnoreCase("Sistem Pakar")) {
				System.out.println(" ");
				System.out.println("Jumlah Mata Kuliah : 8");
				System.out.println("Jumlah SKS         : 22");
			}

			else {
				System.out.println(" ");
				System.out.println("Masukkan Pilihan Mata Kuliah Dengan Benar");
				tambahMatkul();
			}
		}

		else if (tambah.equalsIgnoreCase("t")){
			System.out.println(" ");
			System.out.println("Jumlah Mata Kuliah : 7");
			System.out.println("Jumlah SKS         : 20");
		}

		else {
			System.out.println(" ");
			System.out.println("Masukkan Pilihan Dengan Benar");
			tambahMatkul();
		}
	}

	void tunggu() {
		System.out.println(" ");
		System.out.println("Menunggu Persetujuan...... ");
		System.out.println(" ");
		System.out.println("Permohonan KRS anda telah disetujui...... ");
	}

	void penambahanMatkul() {
		System.out.println("---------------------------------------------------------------");
		System.out.println(" 	PENAMBAHAN RENCANA STUDI	   		|  3  |");
		System.out.println("---------------------------------------------------------------");
		System.out.println(" " +matkul1);
		System.out.println("---------------------------------------------------------------");
	}
}