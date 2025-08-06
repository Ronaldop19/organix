package br.com.organix.organix.model;

public enum Role {
    ADMIN(1),
    USER(2),
    MANAGER(3);

    @SuppressWarnings("unused")
    private final int value;

    Role(int value) {
        this.value = value;
    }

    public String getRoleName() {
        return this.name();
    }
}
