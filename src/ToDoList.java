import java.time.LocalDate;
import java.util.ArrayList;

public class ToDoList {
    private ArrayList<Task> taskArrayList;

    public ToDoList(){
        this.taskArrayList = new ArrayList<>();
    }

    public ArrayList<Task> getTaskArrayList() {
        return taskArrayList;
    }

    public void setTaskArrayList(ArrayList<Task> taskArrayList) {
        this.taskArrayList = taskArrayList;
    }


    public StringBuilder getToString() {
        StringBuilder string = new StringBuilder();
        for(Task task : taskArrayList){
            string.append(task.getToString());
            string.append("\n");
        }
        return string;
    }

    public void addTask(Task task) throws Exception {
        if(!taskArrayList.contains(task)){
            taskArrayList.add(task);
        }else {
            throw new Exception();
        }
    }
    public void removeTask(Task task){
        taskArrayList.remove(task);
    }

    public StringBuilder getCompletedTask(){
        StringBuilder string = new StringBuilder();
        for(Task task : taskArrayList){
            if(task.getCompleted()){
                string.append(task.getToString());
                string.append("\n");
            }
        }
        return string;
    }
    public StringBuilder getUrgentTask(){
        StringBuilder string = new StringBuilder();
        for (Task task : taskArrayList){
            if(task.getExpiration().isBefore(LocalDate.now().plusDays(2)) && !task.getCompleted()){
                string.append(task.getToString());
                string.append("\n");
            }
        }
        return string;
    }

}
