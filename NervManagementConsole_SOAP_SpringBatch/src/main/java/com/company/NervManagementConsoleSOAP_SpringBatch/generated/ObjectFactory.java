
package com.company.NervManagementConsoleSOAP_SpringBatch.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.company.NervManagementConsoleSOAP_SpringBatch.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddMissionEvent_QNAME = new QName("http://serviceSOAP.NervManagementConsoleREST.company.com/", "addMissionEvent");
    private final static QName _AddMissionEventResponse_QNAME = new QName("http://serviceSOAP.NervManagementConsoleREST.company.com/", "addMissionEventResponse");
    private final static QName _Mission_QNAME = new QName("http://serviceSOAP.NervManagementConsoleREST.company.com/", "mission");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.company.NervManagementConsoleSOAP_SpringBatch.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddMissionEvent }
     * 
     */
    public AddMissionEvent createAddMissionEvent() {
        return new AddMissionEvent();
    }

    /**
     * Create an instance of {@link AddMissionEventResponse }
     * 
     */
    public AddMissionEventResponse createAddMissionEventResponse() {
        return new AddMissionEventResponse();
    }

    /**
     * Create an instance of {@link Mission }
     * 
     */
    public Mission createMission() {
        return new Mission();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMissionEvent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddMissionEvent }{@code >}
     */
    @XmlElementDecl(namespace = "http://serviceSOAP.NervManagementConsoleREST.company.com/", name = "addMissionEvent")
    public JAXBElement<AddMissionEvent> createAddMissionEvent(AddMissionEvent value) {
        return new JAXBElement<AddMissionEvent>(_AddMissionEvent_QNAME, AddMissionEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMissionEventResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddMissionEventResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://serviceSOAP.NervManagementConsoleREST.company.com/", name = "addMissionEventResponse")
    public JAXBElement<AddMissionEventResponse> createAddMissionEventResponse(AddMissionEventResponse value) {
        return new JAXBElement<AddMissionEventResponse>(_AddMissionEventResponse_QNAME, AddMissionEventResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Mission }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Mission }{@code >}
     */
    @XmlElementDecl(namespace = "http://serviceSOAP.NervManagementConsoleREST.company.com/", name = "mission")
    public JAXBElement<Mission> createMission(Mission value) {
        return new JAXBElement<Mission>(_Mission_QNAME, Mission.class, null, value);
    }

}
