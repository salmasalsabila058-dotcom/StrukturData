package uts;

class InsertionSort {

    static void sort(Mahasiswa[] data) {
        for (int i = 1; i < data.length; i++) {
            Mahasiswa key = data[i];
            int j = i - 1;

            while (j >= 0 && data[j].nilai < key.nilai) {
                data[j + 1] = data[j];
                j--;
            }

            data[j + 1] = key;

            System.out.println("\n=== Insertion Iterasi ke-" + i + " ===");
            Main.tampilkan(data);
        }
    }
}