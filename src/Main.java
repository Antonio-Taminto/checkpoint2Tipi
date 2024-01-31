import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        Task task1 = new Task("fare la spesa" , false , LocalDate.of(2024,2,10));
        Task task2 = new Task("andare in farmacia" , true , LocalDate.of(2024,2,11));
        Task task3 = new Task("andare dal medico" , false , LocalDate.of(2024,2,1));

        ToDoList toDoList = new ToDoList();
        toDoList.addTask(task1);
        toDoList.addTask(task2);
        toDoList.addTask(task3);

        //vengono stampate tutte le task presenti nella ToDoList
        System.out.println("vengono stampate tutte le task presenti nella ToDoList");
        System.out.println(toDoList.getToString());
        //vengono stampate tutte le task completate presenti nella ToDoList
        System.out.println("vengono stampate tutte le task completate presenti nella ToDoList");
        System.out.println(toDoList.getCompletedTask());
        //vengono stampate tutte le task da fare entro i prossimi due giorni
        System.out.println("vengono stampate tutte le task da fare entro i prossimi due giorni");
        System.out.println(toDoList.getUrgentTask());
    }
}