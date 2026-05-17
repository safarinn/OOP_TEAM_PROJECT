package university.model.academic;

import university.enums.RoomType;

/**
 * ============================================================
 * TODO [Нур]: Реализовать класс Room (бонус)
 * ============================================================
 * Что нужно сделать:
 *  1. Конструктор — инициализировать number, type, capacity
 *  2. Геттеры для всех полей
 *  3. При бронировании аудитории через Schedule — проверять занятость,
 *     иначе бросать RoomBookedException (см. Schedule)
 * ============================================================
 */
public class Room {

    private String number;
    private RoomType type;
    private int capacity;

    public Room(String number, RoomType type, int capacity) {
        // TODO [Нур]: инициализировать поля
        throw new UnsupportedOperationException("TODO [Нур]: реализовать конструктор Room");
    }

    public String getNumber()  { return number; }
    public RoomType getType()  { return type; }
    public int getCapacity()   { return capacity; }
}
