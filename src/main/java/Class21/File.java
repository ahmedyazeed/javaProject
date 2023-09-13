package Class21;

public abstract class File {


    private String name;
    private String size;

    public File(String name, String size) {
        this.name = name;
        this.size = size;
    }

    abstract void open();
    void edit(){
        System.out.println("This is the print out of edit method in File parent class "+name+" "+size);
    }
    void close(){
        System.out.println("This is the print out of close method in File parent class "+name+" "+size);
    }
}
class JavaFile extends File{
    public JavaFile(String name, String size) {
        super(name, size);
    }

    @Override
    void open() {
        System.out.println("To open java we need notepad++ or sublime text");

    }
}
class WordFile extends File{
    public WordFile(String name, String size) {
        super(name, size);
    }

    @Override
    void open() {
        System.out.println("To open doc file we need Microsoft word to be installed ");

    }
}
class PdfFile extends File{
    public PdfFile(String name, String size) {
        super(name, size);
    }

    @Override
    void open() {
        System.out.println("To open PDF file we need Adobe Acrobat Reader to be installed");

    }
}
class FileTester{

    public static void main(String[] args) {

        File [] arr={new JavaFile("Java file name","140KB"),new WordFile("Word file name","150KB"),new PdfFile("PDF file name","160KB")};
        for (File f : arr) {
            f.open();
            f.edit();
            f.close();

        }



    }
}
