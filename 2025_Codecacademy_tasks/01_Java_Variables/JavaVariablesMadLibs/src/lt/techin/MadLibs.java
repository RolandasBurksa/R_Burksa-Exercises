package lt.techin;

public class MadLibs {
    /*
   Your description here
   */
    public static void main(String[] args){

        String name1 = "", name2 = "";
        String adjective1 = "", adjective2 = "", adjective3 = "";
        String noun1 = "", noun2 = "", noun3 = "", noun4 = "", noun5 = "", noun6 = "";
        String verb1 = "";
        String place1 = "";
        int number = 0;

        //The template for the story
        System.out.println(
                "This morning "  + name1 + " woke up feeling " + adjective1 + ". 'It is going to be a " + adjective2 +
                        " day!' Outside, a bunch of " + noun1 + "s were protesting to keep " + noun2 + " in stores. They began to " +
                        verb1 + " to the rhythm of the " + noun3 + ", which made all the " + noun4 + "s very " + adjective3 + ". Concerned, " +
                        name1 + " texted " + name2 + ", who flew " + name1 + " to " + place1 + " and dropped " + name1 + " in a puddle of frozen " +
                        noun5 + ". " + name1 + " woke up in the year " + number + ", in a world where " + noun6 + "s ruled the world."
        );
    }
}

