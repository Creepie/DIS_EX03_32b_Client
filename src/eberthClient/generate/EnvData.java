
package eberthClient.generate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java-Klasse für envData complex type.
 * 
 * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="envData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="temp" type="{http://www.w3.org/2001/XMLSchema}double"/&amp;gt;
 *         &amp;lt;element name="feels_like" type="{http://www.w3.org/2001/XMLSchema}double"/&amp;gt;
 *         &amp;lt;element name="temp_min" type="{http://www.w3.org/2001/XMLSchema}double"/&amp;gt;
 *         &amp;lt;element name="temp_max" type="{http://www.w3.org/2001/XMLSchema}double"/&amp;gt;
 *         &amp;lt;element name="pressure" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="humidity" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "envData", propOrder = {
    "temp",
    "feelsLike",
    "tempMin",
    "tempMax",
    "pressure",
    "humidity"
})
public class EnvData {

    protected double temp;
    @XmlElement(name = "feels_like")
    protected double feelsLike;
    @XmlElement(name = "temp_min")
    protected double tempMin;
    @XmlElement(name = "temp_max")
    protected double tempMax;
    protected int pressure;
    protected int humidity;

    /**
     * Ruft den Wert der temp-Eigenschaft ab.
     * 
     */
    public double getTemp() {
        return temp;
    }

    /**
     * Legt den Wert der temp-Eigenschaft fest.
     * 
     */
    public void setTemp(double value) {
        this.temp = value;
    }

    /**
     * Ruft den Wert der feelsLike-Eigenschaft ab.
     * 
     */
    public double getFeelsLike() {
        return feelsLike;
    }

    /**
     * Legt den Wert der feelsLike-Eigenschaft fest.
     * 
     */
    public void setFeelsLike(double value) {
        this.feelsLike = value;
    }

    /**
     * Ruft den Wert der tempMin-Eigenschaft ab.
     * 
     */
    public double getTempMin() {
        return tempMin;
    }

    /**
     * Legt den Wert der tempMin-Eigenschaft fest.
     * 
     */
    public void setTempMin(double value) {
        this.tempMin = value;
    }

    /**
     * Ruft den Wert der tempMax-Eigenschaft ab.
     * 
     */
    public double getTempMax() {
        return tempMax;
    }

    /**
     * Legt den Wert der tempMax-Eigenschaft fest.
     * 
     */
    public void setTempMax(double value) {
        this.tempMax = value;
    }

    /**
     * Ruft den Wert der pressure-Eigenschaft ab.
     * 
     */
    public int getPressure() {
        return pressure;
    }

    /**
     * Legt den Wert der pressure-Eigenschaft fest.
     * 
     */
    public void setPressure(int value) {
        this.pressure = value;
    }

    /**
     * Ruft den Wert der humidity-Eigenschaft ab.
     * 
     */
    public int getHumidity() {
        return humidity;
    }

    /**
     * Legt den Wert der humidity-Eigenschaft fest.
     * 
     */
    public void setHumidity(int value) {
        this.humidity = value;
    }

}
