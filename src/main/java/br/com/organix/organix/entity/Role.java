package br.com.organix.organix.entity;

public enum Role {
    ADMIN(1),
    USER(2),
    MANAGER(3);

    private final int value;

    Role(int value) {
        this.value = value;
    }

    public String getRoleName() {
        return this.name();
    }
}
