package com.structural.composite;

public class BinaryFile extends FileClass {

    private int binarySize;

    public BinaryFile(String name ,int binarySize) {
        super(name);
        this.binarySize = binarySize;
    }

    @Override
    void addFile(FileClass file) {

    }

    @Override
    void ls() {

    }

    @Override
    FileClass[] getFiles() {
        return new FileClass[0];
    }

    @Override
    boolean removeFile(FileClass file) {
        return false;
    }
}
