package designpatterns.structural.composite;

public class BinaryFile extends File{
    private long size;

    public BinaryFile(String name, long size) {
        super(name);
        this.size = size;
    }

    @Override
    public void ls() {
        System.out.println(getName() + "\t" + size);
    }

    @Override
    public void addFile(File file) {
        
    }

    @Override
    public File[] getFiles() {
        return null;
    }

    @Override
    public boolean removeFile(File file) {
        return false;
    }
    
}
