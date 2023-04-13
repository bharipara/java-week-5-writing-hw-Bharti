package java_week_5_homework;
/**
 * Created by Jay Vaghani
 */
/*
Write a Java program to create a new array list, add some colours (string)
and printout the collection using for each loop.
 */
import java.util.ArrayList;

public class Program_4_ColoursArrayList {

        public static void main(String[] args) {
            ArrayList<String> colorList = new ArrayList<>();
            colorList.add("RED");
            colorList.add("BLUE");
            colorList.add("GREEN");
            colorList.add("YELLOW");
            colorList.add("BLACK");
            colorList.add("WHITE");
            colorList.add("ORANGE");
            colorList.add("PURPLE");
            colorList.add("CYAN");

            for (String colourList : colorList) {
                System.out.print(colourList + ", ");
            }
        }
    }


