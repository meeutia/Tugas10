public class MemberPlatinum extends Member implements CanGetDiskon, CanRequestCicilan, CanDeposit {
    public int getPoin(){
        return this.poin;
    }

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
        if (jarakTujuan < 10) {
            return 0;
        } else {
            return (jarakTujuan - 10) * 1000;
        }
    }

    @Override
    public double hitungCicilanPerBulan(double totalBelanja, int jumlahBulan) {
        if (totalBelanja > 2500000) {
            return totalBelanja / jumlahBulan;
        } else {
            return 0;
        }
    }

    @Override
    public void depositSaldo(int jumlahDeposit) {
        // Implementasi deposit untuk PlatinumMember
        this.totalBelanja += jumlahDeposit;
    }

    @Override
    public void tarikTunai(int jumlahTarikTunai) {
        // Implementasi tarik tunai untuk PlatinumMember
        if (jumlahTarikTunai <= totalBelanja) {
            totalBelanja -= jumlahTarikTunai;
        } else {
            System.out.println("Saldo tidak mencukupi.");
        }
    }

    @Override
    public int cekSaldo() {
        return (int) totalBelanja;
    }

    @Override
    public double hitungDiskon(double jumlahBelanja) {
        if (jumlahBelanja >= 500000 && jumlahBelanja < 1000000) {
            return 3;
        } else if (jumlahBelanja >= 1000000 && jumlahBelanja < 7000000) {
            return 5;
        } else if (jumlahBelanja >= 7000000 && jumlahBelanja < 10000000) {
            return 7;
        } else if (jumlahBelanja >= 10000000) {
            return 9;
        } else {
            return 0;
        }
    }
}
