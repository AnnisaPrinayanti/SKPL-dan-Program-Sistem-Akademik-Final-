import java.util.Scanner;

class Menu{
	String keluar;

	Scanner input = new Scanner (System.in);

	CalonMahasiswa calon = new CalonMahasiswa();
	Mahasiswa mhs = new Mahasiswa();
	
	void pilihMenu() {

		System.out.println(" ");
		System.out.println("==================================================");
		System.out.println(" SISTEM AKADEMIK SEKOLAH TINGGI TEKNOLOGI BANDUNG ");	
		System.out.println("==================================================");
		System.out.println(" ");
		System.out.println ("MENU UTAMA "); 
		System.out.println(" ");
		System.out.println("1. Pendaftaran Mahasiswa Baru");
		System.out.println("2. Permohonan Rencana Studi Mahasiswa");
		System.out.println("3. Keluar");
		System.out.println(" ");
		System.out.print("Silahkan Masukkan Menu Yang Anda Pilih [1/2/3] : ");
		int pilih = input.nextInt();

		switch (pilih) {
			case 1: {

				calon.daftar();

				break;
			}

			case 2: {
				
				mhs.perwalian();

				break;
			}

			case 3: {
				Scanner input = new Scanner (System.in);

				System.out.println(" ");
				System.out.print("Anda Yakin Ingin Keluar? [y/t] : ");
				keluar = input.nextLine();

				if(keluar.equalsIgnoreCase("y")){
					System.out.println(" ");
					System.out.println("Anda Berhasil Keluar...");
				}

				else if (keluar.equalsIgnoreCase("t")){
					pilihMenu();
				}

				else {
					System.out.println(" ");
					System.out.println("Masukkan Pilihan Dengan Benar");
					pilihMenu();
				}

				break;
			}

			default: {
				System.out.println(" ");
				System.out.println("Silahkan Pilih Menu Dengan Benar....!!!");
				System.out.println(" ");
						
				pilihMenu();
			}
		}
	}
}