public class MemberGold extends Member implements CanGetDiskon, CanRequestCicilan {
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
        if (jarakTujuan < 7) {
            return 0;
        } else {
            return (jarakTujuan - 7) * 1000;
        }
    }

    @Override
    public double hitungCicilanPerBulan(double totalBelanja, int jumlahBulan) {
        if (totalBelanja > 5000000) {
            return totalBelanja / jumlahBulan;
        } else {
            return 0;
        }
    }

    @Override
    public void depositSaldo(int jumlahDeposit) {
        // GoldMember tidak bisa deposit
    }

    @Override
    public void tarikTunai(int jumlahTarikTunai) {
        // GoldMember tidak bisa tarik tunai
    }

    @Override
    public int cekSaldo() {
        return 0; // GoldMember tidak punya saldo
    }

    @Override
    public double hitungDiskon(double jumlahBelanja) {
        if (jumlahBelanja >= 500000 && jumlahBelanja < 1000000) {
            return 2;
        } else if (jumlahBelanja >= 1000000 && jumlahBelanja < 7000000) {
            return 4;
        } else if (jumlahBelanja >= 7000000) {
            return 6;
        } else {
            return 0;
        }
    }
}