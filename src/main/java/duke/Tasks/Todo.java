package duke.Tasks;

public class Todo extends Task {
    private TaskType type = TaskType.TODO;
    public Todo (String description){
        super(description);
    }

    public Todo (String description, boolean isDone) {
        super(description, isDone);
    }

    @Override
    public String showTask(){
        return "[T][" + (isDone ? "✗" : " ") + "] " + description;
    }

    @Override
    public String saveTask() {
        return "T | " + (isDone ? 1 : 0) + " | " + description;

    }
}


