
package com.company.NervManagementConsoleSOAP_SpringBatch.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per addMissionEvent complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="addMissionEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mission" type="{http://serviceSOAP.NervManagementConsoleREST.company.com/}mission" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addMissionEvent", propOrder = {
    "mission"
})
public class AddMissionEvent {

    protected Mission mission;

    /**
     * Recupera il valore della proprietà mission.
     * 
     * @return
     *     possible object is
     *     {@link Mission }
     *     
     */
    public Mission getMission() {
        return mission;
    }

    /**
     * Imposta il valore della proprietà mission.
     * 
     * @param value
     *     allowed object is
     *     {@link Mission }
     *     
     */
    public void setMission(Mission value) {
        this.mission = value;
    }

}
