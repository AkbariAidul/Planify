package com.aidul.planify;

public class Planify {

    public static void main(String[] args) {
        // Logika: Buka form Login dulu, dan tampilkan (setVisible true)
        // Pastikan kamu sudah Import LoginForm jika diminta, atau ketik manual.
        
        LoginForm login = new LoginForm();
        login.setVisible(true);
        
        // Lokasi form akan di tengah layar komputer
        login.setLocationRelativeTo(null); 
    }
}