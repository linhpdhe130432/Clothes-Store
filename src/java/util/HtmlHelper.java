/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author sonnt
 */
public class HtmlHelper {

    public static String hyperlink(String label, String href) {
        return "<a class=\"page_hyperlink\" href=\"" + href + "\">" + label + "</a>";
    }

    public static String pagerMen(int pageindex, int pagecount, int gap) {
        String result = "";
        if (pageindex > gap + 1) {
            result += hyperlink("First", "men?page=" + 1);
        }

        for (int i = gap; i > 0; i--) {
            if (pageindex - gap > 0) {
                result += hyperlink("" + (pageindex - i), "men?page=" + (pageindex - i));
            }
        }

        result += "<span class=\"page_pageindex\">" + pageindex + "</span>";

        for (int i = 1; i <= gap; i++) {
            if (pageindex + gap < pagecount) {
                result += hyperlink("" + (pageindex + i), "men?page=" + (pageindex + i));
            }
        }

        if (pageindex + gap < pagecount - 1) {
            result += hyperlink("Last", "men?page=" + pagecount);
        }
        return result;
    }

    public static String pagerWomen(int pageindex, int pagecount, int gap) {
        String result = "";
        if (pageindex > gap + 1) {
            result += hyperlink("First", "women?page=" + 1);
        }

        for (int i = gap; i > 0; i--) {
            if (pageindex - gap > 0) {
                result += hyperlink("" + (pageindex - i), "women?page=" + (pageindex - i));
            }
        }

        result += "<span class=\"page_pageindex\">" + pageindex + "</span>";

        for (int i = 1; i <= gap; i++) {
            if (pageindex + gap < pagecount) {
                result += hyperlink("" + (pageindex + i), "women?page=" + (pageindex + i));
            }
        }

        if (pageindex + gap < pagecount - 1) {
            result += hyperlink("Last", "women?page=" + pagecount);
        }
        return result;
    }

    public static String pagerSale(int pageindex, int pagecount, int gap) {
        String result = "";
        if (pageindex > gap + 1) {
            result += hyperlink("First", "sale?page=" + 1);
        }

        for (int i = gap; i > 0; i--) {
            if (pageindex - gap > 0) {
                result += hyperlink("" + (pageindex - i), "sale?page=" + (pageindex - i));
            }
        }

        result += "<span class=\"page_pageindex\">" + pageindex + "</span>";

        for (int i = 1; i <= gap; i++) {
            if (pageindex + gap < pagecount) {
                result += hyperlink("" + (pageindex + i), "sale?page=" + (pageindex + i));
            }
        }

        if (pageindex + gap < pagecount - 1) {
            result += hyperlink("Last", "sale?page=" + pagecount);
        }
        return result;
    }

    public static String pagerSearch(int pageindex, int pagecount, int gap, String x) {
        String result = "";
        if (pageindex > gap + 1) {
            result += hyperlink("First", "search?search=" + x + "&&page=" + 1);
        }

        for (int i = gap; i > 0; i--) {
            if (pageindex - gap > 0) {
                result += hyperlink("" + (pageindex - i), "search?search=" + x + "&&page=" + (pageindex - i));
            }
        }

        result += "<span class=\"page_pageindex\">" + pageindex + "</span>";

        for (int i = 1; i <= gap; i++) {
            if (pageindex + gap < pagecount) {
                result += hyperlink("" + (pageindex + i), "search?search=" + x + "&&page=" + (pageindex + i));
            }
        }

        if (pageindex + gap < pagecount - 1) {
            result += hyperlink("Last", "search?search=" + x + "&&page=" + pagecount);
        }
        return result;
    }
}
