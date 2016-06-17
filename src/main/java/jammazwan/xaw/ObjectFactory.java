
package jammazwan.xaw;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jammazwan.xaw package. 
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

    private final static QName _NoChange_QNAME = new QName("http://xaw.jammazwan/", "noChange");
    private final static QName _NoChangeResponse_QNAME = new QName("http://xaw.jammazwan/", "noChangeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jammazwan.xaw
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NoChange }
     * 
     */
    public NoChange createNoChange() {
        return new NoChange();
    }

    /**
     * Create an instance of {@link NoChangeResponse }
     * 
     */
    public NoChangeResponse createNoChangeResponse() {
        return new NoChangeResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoChange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xaw.jammazwan/", name = "noChange")
    public JAXBElement<NoChange> createNoChange(NoChange value) {
        return new JAXBElement<NoChange>(_NoChange_QNAME, NoChange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoChangeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xaw.jammazwan/", name = "noChangeResponse")
    public JAXBElement<NoChangeResponse> createNoChangeResponse(NoChangeResponse value) {
        return new JAXBElement<NoChangeResponse>(_NoChangeResponse_QNAME, NoChangeResponse.class, null, value);
    }

}
