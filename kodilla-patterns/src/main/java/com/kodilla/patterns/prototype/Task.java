package com.kodilla.patterns.prototype;
import java.util.Objects;

public class Task {

    private final String name;

    public Task(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "              Task [" + name + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task)) return false;
        Task task = (Task) o;
        return Objects.equals(getName(), task.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
