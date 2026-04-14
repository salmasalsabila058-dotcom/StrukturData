package uts;

class BubbleSort {

    static void sort(Mahasiswa[] data) {
        int n = data.length;

        for (int i = 0; i < n - 1; i++) {
            System.out.println("\n=== Bubble Iterasi ke-" + (i + 1) + " ===");

            for (int j = 0; j < n - i - 1; j++) {
                if (data[j].nilai < data[j + 1].nilai) {
                    Mahasiswa temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }

            Main.tampilkan(data);
        }
    }
}