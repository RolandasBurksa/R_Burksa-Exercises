public class StringMethods {

    public static void main(String[] args) {

        String birthDate = "25/11/1982";
        int startIndex = birthDate.indexOf("1982");
        System.out.println("startingIndex = " + startIndex);
        System.out.println("Birth year = " + birthDate.substring(startIndex));

        System.out.println("Month = " + birthDate.substring(3,5));

        String newDate = String.join("/", "25", "11", "1982");
        System.out.println("newDate = " + newDate);

        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1982");
        System.out.println("newDate = " + newDate);
    }
}
