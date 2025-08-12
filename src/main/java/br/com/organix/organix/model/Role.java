package br.com.organix.organix.model;

public enum Role {
    ADMIN(1),
    USER(2),
    MANAGER(3);

    private final int value;

    Role(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
