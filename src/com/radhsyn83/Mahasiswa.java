package com.radhsyn83;

public class Mahasiswa {
    private String nim;
    private String nama;

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void perkenalkanDiri() {
        System.out.println("Halo everyone");
        System.out.println("My NIM is" + nim);
        System.out.println("My Name is" + nama);
        System.out.println();
    }
}
