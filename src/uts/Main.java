package uts;

public class Main {

    static void tampilkan(Mahasiswa[] data) {
        System.out.println("======================================================");
        System.out.printf("%-20s %-12s %-6s %-8s\n", "Nama", "NPM", "Nilai", "Ranking");
        System.out.println("======================================================");

        for (Mahasiswa m : data) {
            System.out.printf("%-20s %-12s %-6d %-8d\n",
                    m.nama, m.npm, m.nilai, m.ranking);
        }
        System.out.println();
    }

    static Mahasiswa[] copy(Mahasiswa[] data) {
        Mahasiswa[] hasil = new Mahasiswa[data.length];
        for (int i = 0; i < data.length; i++) {
            hasil[i] = new Mahasiswa(
                    data[i].nama,
                    data[i].npm,
                    data[i].nilai,
                    data[i].ranking
            );
        }
        return hasil;
    }

    public static void main(String[] args) {

        Mahasiswa[] data = {
            new Mahasiswa("Farhan Maulana", "2302011101", 82, 7),
            new Mahasiswa("Zahra Khairunnisa", "2302011102", 91, 2),
            new Mahasiswa("Dito Ramadhan", "2302011103", 75, 11),
            new Mahasiswa("Anisa Putri", "2302011104", 88, 4),
            new Mahasiswa("Salma Salsabila", "2302011105", 94, 1),
            new Mahasiswa("Vina Oktaviani", "2302011106", 79, 9),
            new Mahasiswa("Bagas Wicaksono", "2302011107", 85, 6),
            new Mahasiswa("Luthfi Hakim", "2302011108", 73, 13),
            new Mahasiswa("Nanda Permata", "2302011109", 87, 5),
            new Mahasiswa("Rafi Prasetyo", "2302011110", 90, 3),
            new Mahasiswa("Salsabila Azzahra", "2302011111", 77, 10),
            new Mahasiswa("Yoga Saputro", "2302011112", 70, 14),
            new Mahasiswa("Intan Puspita", "2302011113", 83, 8),
            new Mahasiswa("Gilang Pratama", "2302011114", 74, 12),
            new Mahasiswa("Taufik Hidayat", "2302011115", 68, 15)
        };

        System.out.println("DATA AWAL:");
        tampilkan(data);

        BubbleSort.sort(copy(data));
        InsertionSort.sort(copy(data));
        SelectionSort.sort(copy(data));
    }
}