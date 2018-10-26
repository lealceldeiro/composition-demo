package org.sample;

import java.lang.*;

class Main {
    public static void main (String[] args) {
        // create directories
        Directory dir4 = new Directory("directory 4");
        Directory dir3 = new Directory("directory 3", dir4);
        Directory dir2 = new Directory("directory 2", dir3);
        Directory dir1 = new Directory("directory 1", dir2);

        // show them
        System.out.println("Directories:");
        Directory dir = dir1;
        String space = "";
        while(dir != null) {
            System.out.println(space + dir.getName());
            space += "> ";
            dir = dir.getSubDirectory();
        }
    }
}

class Directory {
    String name;
    Directory subDirectory;

    public Directory(String name) {
        this.name = name;
    }

    public Directory(String name, Directory subDirectory) {
        this.name = name;
        this.subDirectory = subDirectory;
    }

    String getName() { return name; }
    Directory getSubDirectory() { return subDirectory; }
}
