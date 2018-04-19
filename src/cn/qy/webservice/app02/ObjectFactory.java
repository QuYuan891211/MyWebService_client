
package cn.qy.webservice.app02;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cn.qy.webservice.app02 package. 
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

    private final static QName _GetPhoneInformation_QNAME = new QName("http://app02.webService.qy.cn/", "getPhoneInformation");
    private final static QName _GetPhoneInformationResponse_QNAME = new QName("http://app02.webService.qy.cn/", "getPhoneInformationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cn.qy.webservice.app02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPhoneInformation }
     * 
     */
    public GetPhoneInformation createGetPhoneInformation() {
        return new GetPhoneInformation();
    }

    /**
     * Create an instance of {@link GetPhoneInformationResponse }
     * 
     */
    public GetPhoneInformationResponse createGetPhoneInformationResponse() {
        return new GetPhoneInformationResponse();
    }

    /**
     * Create an instance of {@link Phone }
     * 
     */
    public Phone createPhone() {
        return new Phone();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPhoneInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://app02.webService.qy.cn/", name = "getPhoneInformation")
    public JAXBElement<GetPhoneInformation> createGetPhoneInformation(GetPhoneInformation value) {
        return new JAXBElement<GetPhoneInformation>(_GetPhoneInformation_QNAME, GetPhoneInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPhoneInformationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://app02.webService.qy.cn/", name = "getPhoneInformationResponse")
    public JAXBElement<GetPhoneInformationResponse> createGetPhoneInformationResponse(GetPhoneInformationResponse value) {
        return new JAXBElement<GetPhoneInformationResponse>(_GetPhoneInformationResponse_QNAME, GetPhoneInformationResponse.class, null, value);
    }

}
