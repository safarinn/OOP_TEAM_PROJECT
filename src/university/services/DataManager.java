package university.services;

import java.io.*;

/**
 * ============================================================
 * TODO [Артем]: Реализовать класс DataManager (паттерн Singleton)
 * ============================================================
 * Паттерн: Singleton
 * Что нужно сделать:
 *  1. getInstance() — вернуть единственный экземпляр (ленивая инициализация)
 *  2. save(o) — сериализовать объект o в файл this.file через ObjectOutputStream
 *  3. load() — десериализовать и вернуть объект из файла через ObjectInputStream
 *
 * Важно: конструктор приватный, instance статический.
 * ============================================================
 */
public class DataManager {

    private static DataManager instance;
    private String file;

    private DataManager(String file) {
        // TODO [Артем]: инициализировать this.file
        throw new UnsupportedOperationException("TODO [Артем]: реализовать приватный конструктор DataManager");
    }

    public static DataManager getInstance() {
        // TODO [Артем]: если instance == null, создать new DataManager("data.ser"), вернуть instance
        throw new UnsupportedOperationException("TODO [Артем]: реализовать getInstance()");
    }

    public void save(Object o) {
        // TODO [Артем]: записать o в файл через ObjectOutputStream / FileOutputStream
        throw new UnsupportedOperationException("TODO [Артем]: реализовать save()");
    }

    public Object load() {
        // TODO [Артем]: прочитать объект из файла через ObjectInputStream / FileInputStream
        throw new UnsupportedOperationException("TODO [Артем]: реализовать load()");
    }

    public String getFile() { return file; }
}
