package university;

import university.services.AuthenticationService;
import university.services.DataManager;
import university.services.University;
import university.services.UserFactory;

/**
 * ============================================================
 * Точка входа в систему
 * ============================================================
 * Распределение задач:
 *
 *  Рамазан  — model/users/ (User, Admin, Manager, Employee, Student, Teacher)
 *              + enums/ + exceptions/ (CreditLimit, MaxFails)
 *
 *  Нур      — model/academic/ (Course, Lesson, Mark, Room, Schedule,
 *              Attendance, TeacherRating, News, Complaint)
 *              + exceptions/ (RoomBooked)
 *
 *  Нурали   — model/research/ (Researcher, ResearcherDecorator,
 *              StudentResearcher, EmployeeResearcher, ResearchPaper,
 *              ResearchProject, comparators/)
 *              + exceptions/ (LowHIndex, NotResearcher)
 *
 *  Артем    — services/ (University, DataManager, UserFactory,
 *              AuthenticationService, MessageService, Message, Report,
 *              School, Log)
 *              + exceptions/ (Authentication)
 * ============================================================
 *
 * TODO [Артем]: после реализации DataManager и AuthenticationService —
 *   инициализировать сервисы и загрузить данные через DataManager.getInstance()
 *
 * TODO [Рамазан]: после реализации User-иерархии —
 *   добавить демо-пользователей через UserFactory
 *
 * TODO [Нурали]: после реализации Research-подсистемы —
 *   добавить демо-статьи и проверить сортировку через comparators
 *
 * TODO [Нур]: после реализации Schedule и Course —
 *   создать демо-расписание и проверить checkConflicts()
 * ============================================================
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== University Information System ===");
        System.out.println("Реализация ещё не готова. Смотри TODO-комментарии в каждом классе.");

        // TODO [Артем]: University university = new University();
        // TODO [Артем]: DataManager dm = DataManager.getInstance();
        // TODO [Артем]: AuthenticationService auth = new AuthenticationService();
        // TODO [Артем]: UserFactory factory = new UserFactory();

        // TODO [Рамазан]: создать тестовых пользователей через factory
        // TODO [Нурали]: создать ResearchPaper и ResearchProject, проверить h-index
        // TODO [Нур]: создать Course с Lesson, проверить Schedule
    }
}
