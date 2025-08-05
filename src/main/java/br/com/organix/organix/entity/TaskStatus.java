package br.com.organix.organix.entity;

public enum TaskStatus {
    TO_DO(1),
    IN_PROGRESS(2),
    DONE(3),
    BLOCKED(4);

    private final int value;

    TaskStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
