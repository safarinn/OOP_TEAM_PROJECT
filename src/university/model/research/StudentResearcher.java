package university.model.research;

import university.model.users.Teacher;
import university.model.users.User;

/**
 * ============================================================
 * TODO [Нурали]: Реализовать класс StudentResearcher
 * ============================================================
 * Паттерн: Decorator (конкретный декоратор для студента-исследователя)
 * Что нужно сделать:
 *  1. Конструктор — вызвать super(user), инициализировать supervisorTeacher
 *  2. getSupervisorTeacher() / setSupervisorTeacher(t) — геттер/сеттер
 *  3. Все методы Researcher уже реализованы в ResearcherDecorator —
 *     здесь достаточно вызвать super, если поведение не отличается
 * ============================================================
 */
public class StudentResearcher extends ResearcherDecorator {

    public Teacher supervisorTeacher;

    public StudentResearcher(User user, Teacher supervisorTeacher) {
        super(user);
        // TODO [Нурали]: инициализировать supervisorTeacher
        throw new UnsupportedOperationException("TODO [Нурали]: реализовать конструктор StudentResearcher");
    }

    public Teacher getSupervisorTeacher() {
        // TODO [Нурали]: вернуть supervisorTeacher
        throw new UnsupportedOperationException("TODO [Нурали]: реализовать getSupervisorTeacher()");
    }

    public void setSupervisorTeacher(Teacher t) {
        // TODO [Нурали]: установить supervisorTeacher
        throw new UnsupportedOperationException("TODO [Нурали]: реализовать setSupervisorTeacher()");
    }
}
