package com.aidul.planify; // Sesuaikan packagemu

public class UserSession {
    private static int userId;
    private static String userName;

    // Setter (Menyimpan data saat login)
    public static void setUser(int id, String name) {
        userId = id;
        userName = name;
    }

    // Getter (Mengambil data di dashboard)
    public static int getUserId() {
        return userId;
    }

    public static String getUserName() {
        return userName;
    }
}