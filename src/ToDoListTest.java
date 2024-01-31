import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListTest {
    private ToDoList testing = new ToDoList();



    @org.junit.jupiter.api.Test
    void getUrgentTask() throws Exception{
        testing.addTask(new Task("pulire",false,LocalDate.of(2024,2,1)));
        StringBuilder result = testing.getUrgentTask();
        assertEquals("Task: pulire da completare entro la data : 2024-02-01\n",result.toString());
    }

}
