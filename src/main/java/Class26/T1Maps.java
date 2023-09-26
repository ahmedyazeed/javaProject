package Class26;


import java.util.LinkedHashMap;
/*Create a map of a building. Store floor number and its associated company name
. (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
        Check how many entries you have?
        Update company on a 4th floor
        Remove company on the 7th floor
        Print your map*/
public class T1Maps {
    public static void main(String[] args) {

        LinkedHashMap<Integer,String> building=new LinkedHashMap();
        building.put(1,"Google");
        building.put(2,"Syntax");
        building.put(1,"Dell");
        building.put(4,"Amazon");
        building.put(5,"Alfa");
        building.put(4,"Asus");
        building.put(7,"Ninja");
        System.out.println(building.size());
        System.out.println(building);
        building.replace(4,"Mango");
        System.out.println(building);
        building.remove(7);
        System.out.println(building);
    }}