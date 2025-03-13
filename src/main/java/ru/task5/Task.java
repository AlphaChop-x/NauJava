package ru.task5;

interface Task {
    /**
     * Запускает задачу
     */
    void start() throws InterruptedException;

    /**
     * Останавливает задачу
     */
    void stop();
}
