package lt.techin;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.util.Map;

public class WebScraperWithLogin {
    private static final String LOGIN_URL = "https://webas02.loh-group.com/ext(bD1lbiZjPTMyMA==)/rittal/infosys/index.htm";
    private static final String SEARCH_URL = "https://webas02.loh-group.com/ext(bD1lbiZjPTMyMA==)/rittal/infosys/artinfo/list.htm?sap-params=c2Vzc2lvbl9pZD00RkZCOEU3NEVDRUIxRURGQkNBNEQwQjQ1Q0JDQjVEMyZwX21hdG5yPTAwMDAwMDAwMDAwNTMyNjEyMQ%3d%3d";
//    private static final String SEARCH_URL = "https://webas02.loh-group.com/ext(bD1lbiZjPTMyMA==)/rittal/infosys/artinfo/list.htm?sap-params=";

    public static void main(String[] args) {
        try {
            // Step 1: Login and maintain session
            Map<String, String> sessionCookies = login("1190002780", "altusauab");

            if (sessionCookies != null) {
                // Step 2: Search for a product
                String searchQuery = "5326121"; // Change this to the desired search query
                Document searchResults = searchProduct(searchQuery, sessionCookies);
//
                if (searchResults != null) {
                    // Step 3: Extract product information
                    extractAndCopyProductInfo(searchResults);
                }
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    // Method to log in and return session cookies
    private static Map<String, String> login(String username, String password) throws IOException {
        Connection.Response response = Jsoup.connect(LOGIN_URL)
                .data("username", username, "password", password)
                .method(Connection.Method.POST)
                .execute();

        if (response.statusCode() == 200) {
            System.out.println("Login successful!");
            return response.cookies(); // Return session cookies for authentication
        } else {
            System.out.println("Login failed!");
            return null;
        }
    }

    //     Method to perform product search using session cookies
    private static Document searchProduct(String query, Map<String, String> cookies) throws IOException {
        Document doc = Jsoup.connect(SEARCH_URL + query)
                .cookies(cookies)
                .get();

        System.out.println("Search results retrieved for: " + query);
        return doc;
    }

    // Extract and copy product information
    private static void extractAndCopyProductInfo(Document doc) {

        Elements numbers = doc.select("span.urTxtStd.urVt1");

//        Elements numbers = doc.select("span.TextView.urTxtEmph_urVt1.Comm./imp._code_no.");

        if (numbers.size() >= 3) {
            System.out.println("Comm./imp. code no.: " + numbers.get(0).text());
            System.out.println("Gross Weight: " + numbers.get(1).text());
            System.out.println("Volume: " + numbers.get(2).text());
        } else {
            System.out.println("Not enough data found.");
        }



//        Elements products = doc.select(".p_matnr"); // Adjust CSS selector as needed

//        if (!products.isEmpty()) {
//            StringBuilder productInfo = new StringBuilder();
//
//            for (Element product : products) {
//                String name = product.select(".product-title").text(); // Adjust CSS selector
//                String price = product.select(".product-price").text(); // Adjust CSS selector
//
//                if (!name.isEmpty() && !price.isEmpty()) {
//                    productInfo.append("Product: ").append(name)
//                            .append(" - Price: ").append(price)
//                            .append("\n");
//                }
//            }

//            if (productInfo.length() > 0) {
//                System.out.println(productInfo.toString());
//                copyToClipboard(productInfo.toString());
//            } else {
//                System.out.println("No products found - first.");
//            }
//        } else {
//            System.out.println("No products found - second.");
//        }


    }

    // Method to copy text to clipboard
    private static void copyToClipboard(String text) {
        StringSelection stringSelection = new StringSelection(text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
        System.out.println("Product details copied to clipboard!");
    }
}