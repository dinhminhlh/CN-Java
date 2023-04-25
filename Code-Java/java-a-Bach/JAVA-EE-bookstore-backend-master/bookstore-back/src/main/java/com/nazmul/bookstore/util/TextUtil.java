package com.nazmul.bookstore.util;

/**
 * @author Antonio Goncalves
 *         http://www.antoniogoncalves.org
 *         --
 */
public class TextUtil {

    // ======================================
    // =          Business methods          =
    // ======================================

    public String sanitize(String textToSanitize) {
        return textToSanitize.replaceAll("\\s+", " ");
    }
}
