package uts;

class SelectionSort {

    static void sort(Mahasiswa[] data) {
        int n = data.length;

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (data[j].nilai > data[maxIndex].nilai) {
                    maxIndex = j;
                }
            }

            Mahasiswa temp = data[i];
            data[i] = data[maxIndex];
            data[maxIndex] = temp;

            System.out.println("\n=== Selection Iterasi ke-" + (i + 1) + " ===");
            Main.tampilkan(data);
        }
    }
}