public class MemberSilver extends Member implements CanGetDiskon {
    public int getPoin(){
        return this.poin;
    }
    
    @Override
    public void redeemPoin(int jumlahPoin) {
        this.poin -= jumlahPoin;
    }

    @Override
    public double hitungTotalBayar(double jumlahBelanja) {
        double diskon = hitungDiskon(jumlahBelanja);
        return jumlahBelanja - (jumlahBelanja * diskon / 100);
    }

    @Override
    public double hitungOngkir(int jarakTujuan) {
        if (jarakTujuan < 5) {
            return 0;
        } else {
            return (jarakTujuan - 5) * 1500;
        }
    }

    @Override
    public double hitungCicilanPerBulan(double totalBelanja, int jumlahBulan) {
        return 0; // SilverMember tidak bisa cicilan
    }

    @Override
    public void depositSaldo(int jumlahDeposit) {
        // SilverMember tidak bisa deposit
    }

    @Override
    public void tarikTunai(int jumlahTarikTunai) {
        // SilverMember tidak bisa tarik tunai
    }

    @Override
    public int cekSaldo() {
        return 0; // SilverMember tidak punya saldo
    }

    @Override
    public double hitungDiskon(double jumlahBelanja) {
        if (jumlahBelanja >= 500000 && jumlahBelanja < 1000000) {
            return 1;
        } else if (jumlahBelanja >= 1000000 && jumlahBelanja < 7000000) {
            return 3;
        } else if (jumlahBelanja >= 7000000) {
            return 5;
        } else {
            return 0;
        }
    }
}