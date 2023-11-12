public class App {

    public static void main(String[] args) {
            // Contoh penggunaan polimorfisme
            Member regulerMember = new MemberReguler();
            Member silverMember = new MemberSilver();
            Member goldMember = new MemberGold();
            Member platinumMember = new MemberPlatinum();

            double jumlahBayar1 = regulerMember.hitungTotalBayar(7440000);
            double jumlahBayar2 = silverMember.hitungTotalBayar(550000);
            double jumlahBayar3 = goldMember.hitungTotalBayar(2000000);
            double jumlahBayar4 = platinumMember.hitungTotalBayar(8000000);


            System.out.println("Total bayar member reguler :" +jumlahBayar1);
            System.out.println("Total bayar member silver :" +jumlahBayar2);
            System.out.println("Total bayar member gold :" +jumlahBayar3);
            System.out.println("Total bayar member platinum :" +jumlahBayar4);
           


    }

}
