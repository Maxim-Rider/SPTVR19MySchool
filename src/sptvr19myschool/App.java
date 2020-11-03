
package sptvr19myschool;

import java.util.Scanner;
import sptvr19myschool.entity.Person;
import sptvr19myschool.tools.managers.PersonManager;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import sptvr19myschool.entity.Journal;
import sptvr19myschool.entity.Subject;
import sptvr19myschool.tools.managers.SubjectManager;
import sptvr19myschool.tools.severs.SaveToFile;
import sptvr19myschool.tools.managers.JournalManager;




class App {
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    
    private Scanner scanner = new Scanner(System.in);
    
    private  List<Person> listPersons = new ArrayList<>(); 
    private  List<Subject> listSubjects = new ArrayList<>();
    private  List<Journal> listJournals = new ArrayList<>(); 
    
    private PersonManager personManager = new PersonManager();
    private SubjectManager subjectManager = new SubjectManager();
    private JournalManager journalManager = new JournalManager();

    public App() {
        SaveToFile saveToFile = new SaveToFile();
        this.listPersons = saveToFile.loadFromFile("listPersons");
        this.listSubjects = saveToFile.loadFromFile("listSubjects");
        this.listJournals = saveToFile.loadFromFile("listJournals");
    }
    
    public void run(){
        
        System.out.println("✖-- ==="+ BLUE +" ۩ Моя школа ۩"+ RESET +" === --✖");
        boolean repeat = true;
        do{
            System.out.println("┏━━━━━━Задачи:━━━━━━┓");
            System.out.println(" ╬═══════════════╬");
            System.out.println(" ║ 0. Выход из программы  ║");
            System.out.println(" ║ 1. Добавить ученика    ║");
            System.out.println(" ║ 2. Список учеников     ║");
            System.out.println(" ║ 3. Добавить учителя    ║");
            System.out.println(" ║ 4. Список учителей     ║");
            System.out.println(" ║ 5. Добавить предмет    ║");
            System.out.println(" ║ 6. Список предметов    ║");
            System.out.println(" ║ 7. Выставить оценку    ║");
            System.out.println(" ║ 8. Оценки ученика      ║");
            System.out.println(" ║ 9. Оценки по предмету  ║");
            System.out.println(" ╬═══════════════╬");
            System.out.println("Выберите задачу: ");
            String task = scanner.nextLine();
            switch (task) {
                case "0":
                    System.out.println("------ ======= Выход из программы ======= ------");
                    repeat = false;
                    break;
                case "1":
                    Person student = personManager.createPerson("STUDENT");
                    personManager.addPersonToList(student, listPersons);
                    
                    break;
                case "2":
                    personManager.printListStudents(listPersons);
                    break;
                case "3":
                    Person teacher = personManager.createPerson("TEACHER");
                    personManager.addPersonToList(teacher, listPersons);
                    break;
                case "4":
                    personManager.printListTeachers(listPersons);
                    break;
                case "5":
                    Subject subject = subjectManager.createSubject(listPersons);
                    subjectManager.addSubjectToList(subject, listSubjects);
                    break;
                case "6":
                    subjectManager.printlistSubjects(listSubjects);
                    break;
                case "7":
                    journalManager.setMarkToUser(listSubjects, listPersons, listJournals);
                    break;
                case "8":
                    journalManager.printMarksUser(listPersons,listJournals);
                    break;
                case "9":
                    journalManager.printMarksForSubject(listJournals, listSubjects);
                    break;
                default:
                    System.out.println("Нет такой задачи. Выберите из списка.");;
            }
        }while(repeat);
    }
}