package main;

public interface Undoer<T> {
    public void undo();
    public void execute(UndoableCommand<T> command);
    public void redo();
}
