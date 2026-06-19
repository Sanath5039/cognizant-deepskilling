public class TaskManagementSystem {

    static class Task {
        int taskId;
        String taskName;
        String status;

        Task(int taskId, String taskName, String status) {
            this.taskId = taskId;
            this.taskName = taskName;
            this.status = status;
        }

        @Override
        public String toString() {
            return "Task ID: " + taskId +
                    ", Task Name: " + taskName +
                    ", Status: " + status;
        }
    }

    static class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    private Node head;

    public void addTask(Task task) {
        Node newNode = new Node(task);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public Task searchTask(int taskId) {
        Node current = head;

        while (current != null) {
            if (current.task.taskId == taskId) {
                return current.task;
            }
            current = current.next;
        }

        return null;
    }

    public void traverseTasks() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        Node current = head;

        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    public void deleteTask(int taskId) {

        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        if (head.task.taskId == taskId) {
            head = head.next;
            System.out.println("Task deleted successfully.");
            return;
        }

        Node current = head;

        while (current.next != null &&
               current.next.task.taskId != taskId) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Task not found.");
            return;
        }

        current.next = current.next.next;
        System.out.println("Task deleted successfully.");
    }

    public static void main(String[] args) {

        TaskManagementSystem taskList = new TaskManagementSystem();

        taskList.addTask(new Task(101, "Design UI", "Pending"));
        taskList.addTask(new Task(102, "Develop Backend", "In Progress"));
        taskList.addTask(new Task(103, "Testing", "Pending"));

        System.out.println("All Tasks:");
        taskList.traverseTasks();

        System.out.println("\nSearching Task ID 102:");
        Task task = taskList.searchTask(102);

        if (task != null)
            System.out.println(task);
        else
            System.out.println("Task not found.");

        System.out.println("\nDeleting Task ID 102:");
        taskList.deleteTask(102);

        System.out.println("\nTasks After Deletion:");
        taskList.traverseTasks();
    }
}