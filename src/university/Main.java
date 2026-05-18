package university;

import university.enums.*;
import university.exceptions.*;
import university.model.academic.*;
import university.model.research.*;
import university.model.research.comparators.*;
import university.model.users.*;
import university.services.*;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        header("KBTU — UNIVERSITY INFORMATION SYSTEM");

        // ═══════════════════════════════════════════════════════════
        // 1. ИНИЦИАЛИЗАЦИЯ СЕРВИСОВ
        // ═══════════════════════════════════════════════════════════
        section("1. Инициализация сервисов КБТУ");

        University university     = new University();
        AuthenticationService auth = new AuthenticationService();
        UserFactory factory        = new UserFactory(university);
        MessageService msgService  = new MessageService();
        DataManager dm             = DataManager.getInstance();

        System.out.println("Сервисы КБТУ инициализированы.");

        // ═══════════════════════════════════════════════════════════
        // 2. СОЗДАНИЕ ПОЛЬЗОВАТЕЛЕЙ
        // ═══════════════════════════════════════════════════════════
        section("2. Создание пользователей через UserFactory");

        // Admin
        Admin admin = factory.createAdmin(
                "A1", "a.gushchin", "admin123",
                "Гущин Артем", "a.gushchin@kbtu.kz", auth);

        // Manager — регистратура КБТУ
        Manager manager = factory.createManager(
                "M1", "manager", "mgr123",
                "Менеджер Регистратуры", "manager@kbtu.kz", ManagerType.DEPARTMENT);

        // Teacher — PROFESSOR → автоматически оборачивается в EmployeeResearcher
        Teacher teacher = factory.createTeacher(
                "T1", "r.perdebay", "pass123",
                "Пердебай Рамазан", "r.perdebay@kbtu.kz",
                new Date(), 350000, TeacherTitle.PROFESSOR, "Information Technologies");

        // Students
        Student student1 = factory.createStudent(
                "S1", "n.muratov", "pass123",
                "Муратов Нурали", "n.muratov@kbtu.kz", 2, "Computer Science");

        Student student2 = factory.createStudent(
                "S2", "zh.nurali", "pass123",
                "Жансерік Нурали", "zh.nurali@kbtu.kz", 4, "Computer Science");

        // Регистрация в системе
        auth.registerUser(admin);
        auth.registerUser(manager);
        auth.registerUser(teacher);
        auth.registerUser(student1);
        auth.registerUser(student2);

        // Школа информационных технологий КБТУ
        School school = new School("Школа информационных технологий КБТУ");
        school.addMember(teacher);
        school.addMember(student1);
        school.addMember(student2);
        university.addSchool(school);

        System.out.println("Зарегистрировано пользователей: " + auth.getUsers().size());
        System.out.println(teacher);
        System.out.println(student1);
        System.out.println(student2);

        // ═══════════════════════════════════════════════════════════
        // 3. ADMIN — УПРАВЛЕНИЕ ПОЛЬЗОВАТЕЛЯМИ И ЛОГИ
        // ═══════════════════════════════════════════════════════════
        section("3. Admin (Гущин Артем) — управление пользователями");

        try {
            auth.login("a.gushchin", "admin123");
            System.out.println("Вошёл: " + auth.getCurrentUser().getName());

            Student temp = factory.createStudent(
                    "S99", "test.user", "tmp",
                    "Тестовый Пользователь", "test@kbtu.kz", 1, "Mathematics");
            admin.addUser(temp);
            admin.removeUser("S99");

            System.out.println("Логи системы КБТУ:");
            admin.viewLogs().forEach(log -> System.out.println("  " + log));
            auth.logout();
        } catch (AuthenticationException e) {
            System.out.println("Ошибка входа: " + e.getMessage());
        }

        // ═══════════════════════════════════════════════════════════
        // 4. MANAGER — КУРСЫ КБТУ, НАЗНАЧЕНИЯ, НОВОСТИ
        // ═══════════════════════════════════════════════════════════
        section("4. Manager — курсы КБТУ и назначения");

        Course oop  = new Course("CS201", "Object-Oriented Programming", 5, 30);
        Course algo = new Course("CS301", "Algorithms and Data Structures", 6, 25);

        manager.addCourse(oop);
        manager.addCourse(algo);
        manager.assignTeacher(oop, teacher);
        manager.assignTeacher(algo, teacher);

        News news = new News(
                "Начало семестра в КБТУ",
                "Добро пожаловать на Fall 2026! Регистрация курсов открыта.",
                manager);
        manager.manageNews(news);

        manager.approveRegistration(student1, oop);
        manager.approveRegistration(student2, oop);
        manager.approveRegistration(student1, algo);

        System.out.println("Курсов открыто: " + manager.getCourses().size());
        System.out.println("Студентов в CS201: " + oop.getStudents().size());
        System.out.println(oop);

        System.out.println("Студенты по имени:");
        manager.viewStudentsSortedByName(Arrays.asList(student1, student2))
               .forEach(s -> System.out.println("  " + s.getName()));

        // ═══════════════════════════════════════════════════════════
        // 5. TEACHER — ОЦЕНКИ
        // ═══════════════════════════════════════════════════════════
        section("5. Пердебай Рамазан — выставление оценок");

        Mark m1 = new Mark(28, 27, 38, student1, oop);   // total = 93
        Mark m2 = new Mark(22, 25, 32, student2, oop);   // total = 79
        Mark m3 = new Mark(25, 26, 35, student1, algo);  // total = 86

        teacher.putMark(student1, oop,  m1);
        teacher.putMark(student2, oop,  m2);
        teacher.putMark(student1, algo, m3);

        student1.setGpa(3.8);
        student2.setGpa(2.9);

        System.out.println(student1.getName() + " → CS201: " + m1.getTotal());
        System.out.println(student2.getName() + " → CS201: " + m2.getTotal());
        System.out.println(student1.getName() + " → CS301: " + m3.getTotal());

        System.out.println("Рейтинг студентов по GPA:");
        manager.viewStudentsSortedByGpa(Arrays.asList(student1, student2))
               .forEach(s -> System.out.println("  " + s.getName() + " | GPA=" + s.getGpa()));

        // ═══════════════════════════════════════════════════════════
        // 6. STUDENT — ОЦЕНКИ, ТРАНСКРИПТ, РЕЙТИНГ, ЖАЛОБЫ
        // ═══════════════════════════════════════════════════════════
        section("6. Муратов Нурали — оценки и транскрипт");

        System.out.println(student1.getTranscript());

        System.out.print("Преподаватели CS201: ");
        student1.getTeacherInfo(oop).forEach(t -> System.out.print(t.getName() + " "));
        System.out.println();

        student1.rateTeacher(teacher, 5);
        student2.rateTeacher(teacher, 4);
        double avg = TeacherRating.getAverageRating(teacher, teacher.getRatings());
        System.out.printf("Средний рейтинг %s: %.1f / 5.0%n", teacher.getName(), avg);

        Complaint complaint = new Complaint(teacher, "Недостаточно времени на финальный экзамен");
        teacher.sendComplaint(complaint);
        List<Complaint> complaints = manager.viewComplaints(Arrays.<Employee>asList(teacher));
        System.out.println("Жалоб в регистратуре: " + complaints.size());

        // ═══════════════════════════════════════════════════════════
        // 7. ИССЛЕДОВАТЕЛЬСКАЯ ПОДСИСТЕМА (КБТУ)
        // ═══════════════════════════════════════════════════════════
        section("7. Исследовательская подсистема КБТУ (Decorator + Strategy)");

        // PROFESSOR автоматически добавлен в university.researchers при создании
        Researcher profResearcher = university.findResearcher(teacher);

        ResearchPaper p1 = new ResearchPaper(
                "Machine Learning Applications in Technical Universities",
                Arrays.asList("Perdebay R.", "Muratov N."),
                "IEEE Access", "1-14",
                new Date(), 42, "10.1109/ACCESS.2026.001");

        ResearchPaper p2 = new ResearchPaper(
                "OOP Paradigms in Modern Software Engineering",
                Arrays.asList("Perdebay R."),
                "ACM Computing Surveys", "20-35",
                new Date(System.currentTimeMillis() - 365L * 86_400_000), 18,
                "10.1145/CSUR.2025.002");

        ResearchPaper p3 = new ResearchPaper(
                "Algorithm Optimization for Big Data Processing",
                Arrays.asList("Perdebay R.", "Zhansserik N."),
                "Springer LNCS", "5-20",
                new Date(System.currentTimeMillis() - 730L * 86_400_000), 7,
                "10.1007/LNCS.2024.003");

        profResearcher.addPaper(p1);
        profResearcher.addPaper(p2);
        profResearcher.addPaper(p3);

        System.out.println("H-Index " + teacher.getName() + ": " + profResearcher.getHIndex());

        System.out.println("\nСтатьи по цитированиям (убывание):");
        profResearcher.printPapers(new ByCitationsComp());

        System.out.println("\nСтатьи по дате публикации (новые первые):");
        profResearcher.printPapers(new ByDateComparator());

        System.out.println("\nСтатьи по объёму страниц (убывание):");
        profResearcher.printPapers(new ByPagesComp());

        // Supervisor для Жансерік (4 курс, h-index профессора = 3)
        try {
            student2.setSupervisor(profResearcher);
            System.out.println("\nСупервизор " + student2.getName() +
                    " → " + teacher.getName() +
                    " (h-index=" + profResearcher.getHIndex() + ")");
        } catch (LowHIndexException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Жансерік как StudentResearcher
        StudentResearcher sRes = new StudentResearcher(student2, teacher);
        sRes.addPaper(p2);
        university.addResearcher(sRes);

        // ResearchProject КБТУ
        try {
            ResearchProject project = new ResearchProject(
                    "KBTU-ML-2026",
                    "Machine Learning for Smart Campus",
                    new Date(),
                    new Date(System.currentTimeMillis() + 180L * 86_400_000));
            project.addParticipant(profResearcher);
            project.addParticipant(sRes);
            project.addPaper(p1);
            System.out.println("Участников в проекте: " + project.getParticipants().size());
            System.out.println("Статей в проекте:     " + project.getPapers().size());
        } catch (NotResearcherException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Топ исследователь школы и года
        Researcher topSchool = university.topCitedOfSchool(school);
        if (topSchool instanceof ResearcherDecorator) {
            System.out.println("Топ исследователь ШИТ КБТУ: " +
                    ((ResearcherDecorator) topSchool).getUser().getName());
        }

        Researcher topYear = university.topCitedOfYear(2026);
        if (topYear instanceof ResearcherDecorator) {
            System.out.println("Топ исследователь КБТУ 2026: " +
                    ((ResearcherDecorator) topYear).getUser().getName());
        }

        System.out.println("\nВсе статьи КБТУ (по цитированиям):");
        university.printAllPapers(new ByCitationsComp());

        // ═══════════════════════════════════════════════════════════
        // 8. СООБЩЕНИЯ (Observer)
        // ═══════════════════════════════════════════════════════════
        section("8. Внутренняя почта КБТУ (паттерн Observer)");

        msgService.subscribe(teacher);
        Message msg = new Message(teacher, teacher,
                "Собрание кафедры ИТ",
                "Уважаемые коллеги, собрание состоится завтра в 14:00, ауд. 310.");
        teacher.sendMessage(msgService, msg);
        System.out.println("Сообщений в истории: " + msgService.getHistory().size());

        // ═══════════════════════════════════════════════════════════
        // 9. РАСПИСАНИЕ И АУДИТОРИИ (bonus)
        // ═══════════════════════════════════════════════════════════
        section("9. Расписание КБТУ (bonus)");

        Room room310 = new Room("310", RoomType.LECTURE_HALL, 80);
        Room room205 = new Room("205", RoomType.LAB, 25);

        Lesson lesson1 = new Lesson("L1", LessonType.LECTURE,
                "Введение в ООП — CS201", room310, new Date());
        Lesson lesson2 = new Lesson("L2", LessonType.PRACTICE,
                "Лабораторная по ООП — CS201", room205,
                new Date(System.currentTimeMillis() + 3_600_000));

        try {
            room310.book(lesson1);
            room205.book(lesson2);

            Schedule schedule = new Schedule("Fall 2026 — КБТУ");
            schedule.addLesson(lesson1);
            schedule.addLesson(lesson2);

            oop.addLesson(lesson1);
            oop.addLesson(lesson2);

            Schedule forStudent = schedule.forStudent(student1);
            System.out.println(forStudent);

            Schedule forTeacher = schedule.forTeacher(teacher);
            System.out.println(forTeacher);

        } catch (RoomBookedException e) {
            System.out.println("Конфликт расписания: " + e.getMessage());
        }

        // ═══════════════════════════════════════════════════════════
        // 10. СОХРАНЕНИЕ И ЗАГРУЗКА (Singleton DataManager)
        // ═══════════════════════════════════════════════════════════
        section("10. Сериализация данных КБТУ (паттерн Singleton)");

        dm.save(auth);
        System.out.println("Данные сохранены → " + dm.getFile());

        try {
            AuthenticationService loaded = (AuthenticationService) dm.load();
            System.out.println("Данные загружены. Пользователей в системе: " +
                    loaded.getUsers().size());
            loaded.getUsers().values().forEach(u ->
                System.out.println("  " + u.getName() +
                        " <" + u.getEmail() + "> [" + u.getRole() + "]"));
        } catch (RuntimeException e) {
            System.out.println("Ошибка загрузки: " + e.getMessage());
        }

        // ═══════════════════════════════════════════════════════════
        // 11. ДЕМОНСТРАЦИЯ ИСКЛЮЧЕНИЙ
        // ═══════════════════════════════════════════════════════════
        section("11. Демонстрация исключений системы КБТУ");

        // AuthenticationException — неверный пароль
        try {
            auth.login("n.muratov", "wrongpass");
        } catch (AuthenticationException e) {
            System.out.println("AuthenticationException:  " + e.getMessage());
        }

        // CreditLimitException — Муратов уже имеет 11 кредитов (5+6)
        try {
            Course heavy = new Course("CS999", "Advanced Topics", 15, 10);
            student1.registerCourse(heavy); // 11 + 15 = 26 > 21
        } catch (CreditLimitException e) {
            System.out.println("CreditLimitException:     " + e.getMessage());
        }

        // MaxFailsException — 4-й фейл превышает лимит
        try {
            student2.incrementFails();
            student2.incrementFails();
            student2.incrementFails();
            student2.incrementFails(); // 4-й → exception
        } catch (MaxFailsException e) {
            System.out.println("MaxFailsException:        " + e.getMessage());
        }

        // LowHIndexException — supervisor без статей (h-index = 0 < 3)
        try {
            StudentResearcher lowH = new StudentResearcher(student1, teacher);
            student1.setSupervisor(lowH);
        } catch (LowHIndexException e) {
            System.out.println("LowHIndexException:       " + e.getMessage());
        }

        // NotResearcherException — null участник
        try {
            ResearchProject proj = new ResearchProject(
                    "KBTU-TEST", "Test Project", new Date(), new Date());
            proj.addParticipant(null);
        } catch (NotResearcherException e) {
            System.out.println("NotResearcherException:   " + e.getMessage());
        }

        // RoomBookedException — аудитория 310 уже занята
        try {
            room310.book(lesson1);
        } catch (RoomBookedException e) {
            System.out.println("RoomBookedException:      " + e.getMessage());
        }

        // IllegalArgumentException — рейтинг вне [1..5]
        try {
            student1.rateTeacher(teacher, 10);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }

        header("DEMO КБТУ ЗАВЕРШЁН УСПЕШНО");
    }

    // ── вспомогательные методы ──────────────────────────────────────

    private static void header(String text) {
        String line = "═".repeat(60);
        System.out.println("\n" + line);
        System.out.println("  " + text);
        System.out.println(line);
    }

    private static void section(String text) {
        System.out.println("\n── " + text);
        System.out.println("   " + "─".repeat(text.length()));
    }
}
