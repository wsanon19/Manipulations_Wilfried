
package fr.polyschool;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour average complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="average">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="math" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Pc" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="SVT" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "average", propOrder = {
    "math",
    "pc",
    "svt"
})
public class Average {

    protected double math;
    @XmlElement(name = "Pc")
    protected double pc;
    @XmlElement(name = "SVT")
    protected double svt;

    /**
     * Obtient la valeur de la propriété math.
     * 
     */
    public double getMath() {
        return math;
    }

    /**
     * Définit la valeur de la propriété math.
     * 
     */
    public void setMath(double value) {
        this.math = value;
    }

    /**
     * Obtient la valeur de la propriété pc.
     * 
     */
    public double getPc() {
        return pc;
    }

    /**
     * Définit la valeur de la propriété pc.
     * 
     */
    public void setPc(double value) {
        this.pc = value;
    }

    /**
     * Obtient la valeur de la propriété svt.
     * 
     */
    public double getSVT() {
        return svt;
    }

    /**
     * Définit la valeur de la propriété svt.
     * 
     */
    public void setSVT(double value) {
        this.svt = value;
    }

}
