package ru.mirea.shandykova.room;

import android.app.Application;

import androidx.room.Room;

public class App extends Application {
    public static ru.mirea.shandykova.room.App instance;
    private ru.mirea.shandykova.room.AppDatabase database;
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        database = Room.databaseBuilder(this, ru.mirea.shandykova.room.AppDatabase.class, "database")
                .allowMainThreadQueries()
                .build();
    }
    public static ru.mirea.shandykova.room.App getInstance() {
        return instance;
    }
    public ru.mirea.shandykova.room.AppDatabase getDatabase() {
        return database;
    }
}
