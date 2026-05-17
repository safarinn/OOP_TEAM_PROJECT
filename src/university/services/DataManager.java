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
        this.file = file;
    }

    public static DataManager getInstance() {
        if(instance == null){
            instance = new DataManager("data.ser");
        }
        return instance;
    }

    public void save(Object o) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(o);
        } catch (IOException e) {
            throw new RuntimeException("Error while saving: " + e.getMessage(), e);
        }
    }

    public Object load() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("Error while loading: " + e.getMessage(), e);
        }
    }

    public String getFile() { return file; }
}
