package model;
import java.util.Locale;
import java.util.ResourceBundle;

public class Language {
    String languageCode;
    ResourceBundle labels;

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public Language(String languageCode) {
        Locale locale = new Locale(languageCode);
        labels = ResourceBundle.getBundle("locale",locale);
        this.languageCode = languageCode;
    }

    public String getLabels(String code) {
        return labels.getString(code);
    }
}

