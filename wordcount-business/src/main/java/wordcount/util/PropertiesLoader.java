package wordcount.util;

import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PropertiesLoader {
	
	public static Properties WORDCOUNT_PROPERTIES = getProperties();
	
	public static Properties getProperties() {
		if(WORDCOUNT_PROPERTIES == null){
			String propertieXmlFileName = "wordcount.xml";
			try {
				Properties properties = new Properties();
				properties.loadFromXML(PropertiesLoader.class.getClassLoader().getResourceAsStream(propertieXmlFileName));
				WORDCOUNT_PROPERTIES = properties;
				Logger.getLogger(PropertiesLoader.class.getName()).log(Level.INFO,propertieXmlFileName+" is loaded :");
				Logger.getLogger(PropertiesLoader.class.getName()).log(Level.INFO,properties.toString());
			} catch (InvalidPropertiesFormatException e) {
				Logger.getLogger(PropertiesLoader.class.getName()).log(Level.SEVERE, "Fichier de propriété invalide", e);
			} catch (IOException e) {
				Logger.getLogger(PropertiesLoader.class.getName()).log(Level.SEVERE,"Erreur parsing "+propertieXmlFileName);
			}
		}
		
		return WORDCOUNT_PROPERTIES;
	}
	
}
