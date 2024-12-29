
package com.company.NervManagementConsoleSOAP_SpringBatch.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per mission complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="mission"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://serviceSOAP.NervManagementConsoleREST.company.com/}activity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="missionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="image" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/&gt;
 *         &lt;element name="participantsMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="eventMission" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="available" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mission", propOrder = {
    "missionId",
    "description",
    "image",
    "participantsMax",
    "eventMission",
    "available"
})
public class Mission
    extends Activity
{

    protected Integer missionId;
    protected String description;
    protected Object image;
    protected Integer participantsMax;
    protected Boolean eventMission;
    protected Boolean available;

    /**
     * Recupera il valore della proprietà missionId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMissionId() {
        return missionId;
    }

    /**
     * Imposta il valore della proprietà missionId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMissionId(Integer value) {
        this.missionId = value;
    }

    /**
     * Recupera il valore della proprietà description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Imposta il valore della proprietà description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Recupera il valore della proprietà image.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getImage() {
        return image;
    }

    /**
     * Imposta il valore della proprietà image.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setImage(Object value) {
        this.image = value;
    }

    /**
     * Recupera il valore della proprietà participantsMax.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParticipantsMax() {
        return participantsMax;
    }

    /**
     * Imposta il valore della proprietà participantsMax.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParticipantsMax(Integer value) {
        this.participantsMax = value;
    }

    /**
     * Recupera il valore della proprietà eventMission.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEventMission() {
        return eventMission;
    }

    /**
     * Imposta il valore della proprietà eventMission.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEventMission(Boolean value) {
        this.eventMission = value;
    }

    /**
     * Recupera il valore della proprietà available.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvailable() {
        return available;
    }

    /**
     * Imposta il valore della proprietà available.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAvailable(Boolean value) {
        this.available = value;
    }

}
