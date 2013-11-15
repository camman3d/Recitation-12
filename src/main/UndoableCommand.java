package main;

public interface UndoableCommand<T> {
    public void execute();
    public void undo();
}
