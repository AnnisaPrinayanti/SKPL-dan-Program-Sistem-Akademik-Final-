import java.util.Scanner;

class Keuangan {
	int jumlah;

	Scanner input = new Scanner (System.in);

	void bayar1() {
		System.out.println(" ");
		System.out.println("Berikut Rincian Biaya Yang Harus Anda Bayar :");
		System.out.println(" ");
		System.out.println("1. Biaya Pendaftaran 	: Rp 250.000");
		System.out.println("2. Biaya Tes 		: Rp 500.000");
		System.out.println("---------------------------------------------");
		System.out.println("   Total 		: Rp 750.000");
		System.out.println(" ");
		System.out.println("Silahkan Melakukan Pembayaran Ke No.Rekening dibawah ini :");
		System.out.println("BCA : 8822405281");
		System.out.println(" ");
	}

	void bayar2() {
		System.out.println(" ");
		System.out.println("Berikut Rincian Biaya Yang Harus Anda Bayar :");
		System.out.println(" ");
		System.out.println("1. Biaya Ospek 				: Rp 250.000");
		System.out.println("2. Biaya Pembuatan Almamater 		: Rp 500.000");
		System.out.println("3. Biaya SPP Pertama 			: Rp 750.000");
		System.out.println("4. Biaya SPB pertama 			: Rp 350.000");
		System.out.println("--------------------------------------------------------");
		System.out.println("   Total 				: Rp 1.850.000");
		System.out.println(" ");
		System.out.println("Silahkan Melakukan Pembayaran Ke No.Rekening dibawah ini :");
		System.out.println("BCA : 8822405281");
		System.out.println(" ");
	}

	void cekBayar() {
		System.out.print("********KONFIRMASI PEMBAYARAN********");
		System.out.println(" ");
		System.out.println(" ");
		System.out.print("Jumlah Transfer : ");
		jumlah = input.nextInt();

		if(jumlah == 750000) {
			System.out.println(" ");
			System.out.println("Transaksi Berhasil....!!!!");
		}

		else if(jumlah == 1850000){
			System.out.println(" ");
			System.out.println("Transaksi Berhasil....!!!!");
		}

		else{
			System.out.println(" ");
			System.out.println("Transaksi Gagal....!!!!");
			System.out.println("Silahkan Lakukan Kembali Transaksi Anda");
			System.out.println(" ");
			cekBayar();
		}
	}
}