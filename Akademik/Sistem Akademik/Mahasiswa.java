import java.util.Scanner;

class Mahasiswa {
	int npm;
	int semester;

	Akademik akad = new Akademik();
	DosenWali wali = new DosenWali();

	void perwalian() {
		Scanner input = new Scanner (System.in);

		System.out.println(" ");
		System.out.println("======================================");
		System.out.println("             PERMOHONAN KRS           ");	
		System.out.println("======================================");
		System.out.println(" ");
		System.out.println("Silahkan Masukkan NPM ");
		System.out.println(" ");
		System.out.print("NPM [15111186-189]: "); 
		npm = input.nextInt();
		System.out.println(" ");
		System.out.println("Checking.......");
		System.out.println(" ");
	
		if (npm == 15111186) {
			System.out.println("Nama 		: Annisa Prinayanti");
			System.out.println("NPM 		: 15111186");
			System.out.println("Tunggakan 	: Rp 0");
			System.out.println("IP  		: 3,66 ");
			System.out.println(" ");
			System.out.print(" Masukkan Kode Semester [1/2] :  ");
			semester = input.nextInt();

			if (semester == 1) {
				akad.krs1();
				akad.tambahMatkul();
				akad.tunggu();
				wali.setuju1();
				akad.penambahanMatkul();
			}

			else if (semester == 2){
				akad.krs2();
				akad.tambahMatkul();
				akad.tunggu();
				wali.setuju2();
				akad.penambahanMatkul();
			}

			else {
				System.out.println("Pilih Semester Dengan Benar....");
				perwalian();
			}
		}

		else if (npm == 15111187) {
			System.out.println("Nama 		: Ratna Asih");
			System.out.println("NPM 		: 15111187");
			System.out.println("Tunggakan 	: Rp 0");
			System.out.println("IP  		: 3,00 ");
			System.out.println(" ");
			System.out.print(" Masukkan Kode Semester [1/2] :  ");
			semester = input.nextInt();

			if (semester == 1) {
				akad.krs1();
				akad.tunggu();
				wali.setuju1();
			}

			else if (semester == 2){
				akad.krs2();
				akad.tunggu();
				wali.setuju2();
			}

			else {
				System.out.println("Pilih Semester Dengan Benar....");
				perwalian();
			}
		}	

		else if (npm == 15111188){
			System.out.println("Nama 		: Ghina Nurul Ardhiani ");
			System.out.println("NPM 		: 15111188");
			System.out.println("Tunggakan 	: Rp 750,000");
			System.out.println("IP  		: 3,00 ");
			System.out.println(" ");
			System.out.println("Silahkan Melakukan Pembayaran Terlebih Dahulu...... ");
		}

		else if (npm == 15111189){
			System.out.println("Nama 		: Ade Supriyadi ");
			System.out.println("NPM 		: 15111189");
			System.out.println("Tunggakan 	: Rp 0");
			System.out.println("IP  		: 2,50 ");
			System.out.println(" ");
			System.out.println("Anda Tidak Bisa Mengambil Mata Kuliah...!!!! ");
			System.out.println("Silahkan Perbaiki Dahulu Nilai-Nilai Anda Disemester Sebelumnya");
		}

		else {
			System.out.println("NPM : " +npm );
			System.out.println("Tidak Terdaftar.... Pastikan NPM Dengan Benar !!!");
			perwalian();
		}
	}	
}