package ru.task5;

public class TaskInterfaceTimer implements Task {

    private Thread thread;
    private Integer remainingTime;
    private Boolean running = false;

    public TaskInterfaceTimer(Integer remainingTime) {
        this.remainingTime = remainingTime;
    }

    @Override
    public void start() {

        if (running) {
            System.out.println("Таймер уже запущен!");
            return;
        }

        running = true;
        System.out.println("Таймер запущен!");

        this.thread = new Thread(() -> {
            while (running && remainingTime > 0) {
                System.out.println("Осталось секунд: " + remainingTime + "!");
                remainingTime--;

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    running = false;
                }
            }

            if (remainingTime == 0) {
                System.out.println("Время!");
            }
            running = false;
        });
        thread.start();
    }

    @Override
    public void stop() {
        if (!running) {
            System.out.println("Таймер уже остановлен!");
        }
        running = false;

        if (thread != null) {
            thread.interrupt();
        }

        System.out.println("Таймер остановлен!");
    }

    public static void main(String[] args) throws InterruptedException {

        TaskInterfaceTimer timer = new TaskInterfaceTimer(20);

        timer.start();

        Thread.sleep(3000);

        timer.stop();

        Thread.sleep(3000);

        timer.start();
    }
}
