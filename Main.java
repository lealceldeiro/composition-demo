/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
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
			dir = dir.getSubDiretory();
		}
	}
}

class Directory {
    String name;
    Directory subDiretory;
    
    public Directory(String name) {
    	this.name = name;
    }
    
    public Directory(String name, Directory subDiretory) {
    	this.name = name;
    	this.subDiretory = subDiretory;
    }
    
    String getName() { return name; }
    Directory getSubDiretory() { return subDiretory; }
}
