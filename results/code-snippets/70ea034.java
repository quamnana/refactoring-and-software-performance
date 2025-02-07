// Before Refactoring 
public final void finish(CellConsumer cellConsumer) {
    endOfRow(cellConsumer);
}

// After Refactoring
public final void finish(CellConsumer cellConsumer) {
    cellConsumer.endOfRow();
}

