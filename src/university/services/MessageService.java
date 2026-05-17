package university.services;

import university.model.users.Employee;

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

    public MessageService() {
        // TODO [Артем]: инициализировать пустой список subscribers
        throw new UnsupportedOperationException("TODO [Артем]: реализовать конструктор MessageService");
    }

    public void send(Message m) {
        // TODO [Артем]: доставить m получателю; если получатель subscribed — уведомить
        throw new UnsupportedOperationException("TODO [Артем]: реализовать send()");
    }

    public void subscribe(Employee e) {
        // TODO [Артем]: добавить e в subscribers
        throw new UnsupportedOperationException("TODO [Артем]: реализовать subscribe()");
    }

    public void unsubscribe(Employee e) {
        // TODO [Артем]: удалить e из subscribers
        throw new UnsupportedOperationException("TODO [Артем]: реализовать unsubscribe()");
    }

    public List<Employee> getSubscribers() { return subscribers; }
}
