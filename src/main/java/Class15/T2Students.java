package Class15;

public class T2Students {
    String name;
    double subG1;
    double subG2;
    double subG3;
    double total;
    double avgG;

    public T2Students(String sName,int sSubG1,int sSubG2,int sSubG3){

         name=sName;
         subG1=sSubG1;
         subG2=sSubG2;
         subG3=sSubG3;
    }
    public void averageGrade(){

         total=subG1+subG2+subG3;
         avgG=total/3;
        System.out.println("the average subjects grade for student "+name+" is "+avgG);
    }



}