package designpatterns.structural.composite;

public class Main {
    public static void main(String[] args) {
        File root1 = createTreeOne();
        root1.ls();
    }

    private static File createTreeOne() {
        File file1 = new BinaryFile("File1", 100);
        Directory dir1 = new Directory("dir1");
        dir1.addFile(file1);
        File file2 = new BinaryFile("File2", 200);
        File file3 = new BinaryFile("File3", 150);
        Directory dir2 = new Directory("dir2");
        dir2.addFile(file2);
        dir2.addFile(file3);
        File file4 = new BinaryFile("File4", 400);
        File file5 = new BinaryFile("File5", 550);
        Directory dir3 = new Directory("dir3");
        dir3.addFile(file4);
        dir3.addFile(file5);
        dir2.addFile(dir1);
        dir2.addFile(dir3);
        System.out.println(dir2);
        return dir2;
    }
}