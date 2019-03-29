package com.structural.composite;

public abstract class FileClass {

    private String name;

    public FileClass() {
    }

    public FileClass(String name) {
        this.name=name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void addFile(FileClass file );
    abstract void ls();
    abstract FileClass [] getFiles();
    abstract boolean removeFile(FileClass file);
}
