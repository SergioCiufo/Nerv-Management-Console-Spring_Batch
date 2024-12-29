
package com.company.NervManagementConsoleSOAP_SpringBatch.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per stats complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="stats"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="exp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="level" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="supportAbility" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="synchronizationRate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="tacticalAbility" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stats", propOrder = {
    "exp",
    "level",
    "supportAbility",
    "synchronizationRate",
    "tacticalAbility"
})
@XmlSeeAlso({
    Activity.class
})
public abstract class Stats {

    protected Integer exp;
    protected Integer level;
    protected Integer supportAbility;
    protected Integer synchronizationRate;
    protected Integer tacticalAbility;

    /**
     * Recupera il valore della proprietà exp.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExp() {
        return exp;
    }

    /**
     * Imposta il valore della proprietà exp.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExp(Integer value) {
        this.exp = value;
    }

    /**
     * Recupera il valore della proprietà level.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * Imposta il valore della proprietà level.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLevel(Integer value) {
        this.level = value;
    }

    /**
     * Recupera il valore della proprietà supportAbility.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSupportAbility() {
        return supportAbility;
    }

    /**
     * Imposta il valore della proprietà supportAbility.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSupportAbility(Integer value) {
        this.supportAbility = value;
    }

    /**
     * Recupera il valore della proprietà synchronizationRate.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSynchronizationRate() {
        return synchronizationRate;
    }

    /**
     * Imposta il valore della proprietà synchronizationRate.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSynchronizationRate(Integer value) {
        this.synchronizationRate = value;
    }

    /**
     * Recupera il valore della proprietà tacticalAbility.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTacticalAbility() {
        return tacticalAbility;
    }

    /**
     * Imposta il valore della proprietà tacticalAbility.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTacticalAbility(Integer value) {
        this.tacticalAbility = value;
    }

}
