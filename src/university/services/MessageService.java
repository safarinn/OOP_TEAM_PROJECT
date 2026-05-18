package university.services;

import university.model.users.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * ============================================================
 * TODO [Артем]: Реализовать класс MessageService (паттерн Observer)
 * ============================================================
 * Паттерн: Observer
 * Что нужно сделать:
 *  1. Конструктор — инициализировать пустой список subscribers
 *  2. subscribe(e) — добавить Employee e в subscribers
 *  3. unsubscribe(e) — удалить Employee e из subscribers
 *  4. send(m) — доставить Message m:
 *     - если m.getTo() в списке subscribers → уведомить (вывести сообщение или вызвать notify)
 *     - сохранить сообщение в истории (опционально)
 *  5. getSubscribers() — геттер
 * ============================================================
 */
public class MessageService {

    private List<Employee> subscribers;
    private List<Message> history;

    public MessageService() {
        this.subscribers = new ArrayList<>();
        this.history = new ArrayList<>();
    }
    public void send(Message m) {
        history.add(m);
        if (subscribers.contains(m.getTo())) {
            System.out.println("[MessageService] " + m);
        }
    }

    public void subscribe(Employee e) {
        subscribers.add(e);
    }

    public void unsubscribe(Employee e) {
        subscribers.remove(e);
    }

    public List<Employee> getSubscribers() { return subscribers; }
    public List<Message> getHistory() { return history; }
}
