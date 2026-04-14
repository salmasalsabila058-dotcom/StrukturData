class Mahasiswa {
    String nama;
    String npm;
    int nilai;
    int rankingAwal;
    int rankingAkhir;

    public Mahasiswa(String nama, String npm, int nilai, int rankingAwal) {
        this.nama = nama;
        this.npm = npm;
        this.nilai = nilai;
        this.rankingAwal = rankingAwal;
        this.rankingAkhir = 0;
    }

    public void setRankingAkhir(int rankingAkhir) {
        this.rankingAkhir = rankingAkhir;
    }

    public void tampilDataAwal() {
        System.out.printf("%-22s %-13s %-5d %-8d\n", nama, npm, nilai, rankingAwal);
    }

    public void tampilDataSetelahSorting() {
        System.out.printf("%-22s %-13s %-5d %-8d\n", nama, npm, nilai, rankingAkhir);
    }
}

public class UTSPart1 {

    public static void bubbleSort(Mahasiswa[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].nilai < arr[j + 1].nilai) {
                    Mahasiswa temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void insertionSort(Mahasiswa[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Mahasiswa key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].nilai < key.nilai) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void selectionSort(Mahasiswa[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].nilai > arr[maxIdx].nilai) {
                    maxIdx = j;
                }
            }
            Mahasiswa temp = arr[maxIdx];
            arr[maxIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void updateRankingAkhir(Mahasiswa[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i].setRankingAkhir(i + 1);
        }
    }

    public static Mahasiswa[] copyArray(Mahasiswa[] original) {
        Mahasiswa[] copy = new Mahasiswa[original.length];
        for (int i = 0; i < original.length; i++) {
            copy[i] = new Mahasiswa(original[i].nama, original[i].npm, original[i].nilai, original[i].rankingAwal);
        }
        return copy;
    }

    public static void main(String[] args) {
        // Data baru dengan Salma Salsabila sebagai ranking 1 (nilai tertinggi)
        Mahasiswa[] dataAwal = {
            new Mahasiswa("Ahmad Fauzi", "2024102001", 72, 10),
            new Mahasiswa("Bella Septiani", "2024102002", 86, 5),
            new Mahasiswa("Chandra Wijaya", "2024102003", 93, 3),
            new Mahasiswa("Dewi Anggraini", "2024102004", 68, 11),
            new Mahasiswa("Edo Pratama", "2024102005", 80, 7),
            new Mahasiswa("Fitria Ramadhani", "2024102006", 75, 9),
            new Mahasiswa("Salma Salsabila", "2024102007", 99, 1),
            new Mahasiswa("Gilang Ramadan", "2024102008", 62, 14),
            new Mahasiswa("Haniya Maharani", "2024102009", 88, 4),
            new Mahasiswa("Irfan Hakim", "2024102010", 71, 11),
            new Mahasiswa("Jasmine Azzahra", "2024102011", 90, 3),
            new Mahasiswa("Kevin Hermawan", "2024102012", 56, 15),
            new Mahasiswa("Larasati Putri", "2024102013", 77, 8),
            new Mahasiswa("M. Rafly Andriansyah", "2024102014", 95, 2),
            new Mahasiswa("Nabila Zahra", "2024102015", 64, 13)
        };

        System.out.println("=== DATA AWAL (Ranking Masih Acak) ===");
        System.out.printf("%-22s %-13s %-5s %-8s\n", "Nama", "NPM", "Nilai", "Ranking");
        for (Mahasiswa m : dataAwal) {
            m.tampilDataAwal();
        }

        // Bubble Sort
        Mahasiswa[] bubbleData = copyArray(dataAwal);
        bubbleSort(bubbleData);
        updateRankingAkhir(bubbleData);
        System.out.println("\n=== BUBBLE SORT (Ranking Baru Berdasarkan Nilai) ===");
        System.out.printf("%-22s %-13s %-5s %-8s\n", "Nama", "NPM", "Nilai", "Ranking Baru");
        for (Mahasiswa m : bubbleData) {
            m.tampilDataSetelahSorting();
        }

        // Insertion Sort
        Mahasiswa[] insertionData = copyArray(dataAwal);
        insertionSort(insertionData);
        updateRankingAkhir(insertionData);
        System.out.println("\n=== INSERTION SORT (Ranking Baru Berdasarkan Nilai) ===");
        System.out.printf("%-22s %-13s %-5s %-8s\n", "Nama", "NPM", "Nilai", "Ranking Baru");
        for (Mahasiswa m : insertionData) {
            m.tampilDataSetelahSorting();
        }

        // Selection Sort
        Mahasiswa[] selectionData = copyArray(dataAwal);
        selectionSort(selectionData);
        updateRankingAkhir(selectionData);
        System.out.println("\n=== SELECTION SORT (Ranking Baru Berdasarkan Nilai) ===");
        System.out.printf("%-22s %-13s %-5s %-8s\n", "Nama", "NPM", "Nilai", "Ranking Baru");
        for (Mahasiswa m : selectionData) {
            m.tampilDataSetelahSorting();
        }
    }
}