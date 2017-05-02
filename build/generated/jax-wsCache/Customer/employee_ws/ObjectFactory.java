
package employee_ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the employee_ws package. 
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

    private final static QName _DeleteCustomerResponse_QNAME = new QName("http://employee_ws/", "deleteCustomerResponse");
    private final static QName _DeleteCustomer_QNAME = new QName("http://employee_ws/", "deleteCustomer");
    private final static QName _EditcustomerResponse_QNAME = new QName("http://employee_ws/", "editcustomerResponse");
    private final static QName _CreateCustomer_QNAME = new QName("http://employee_ws/", "createCustomer");
    private final static QName _CreateCustomerResponse_QNAME = new QName("http://employee_ws/", "createCustomerResponse");
    private final static QName _Editcustomer_QNAME = new QName("http://employee_ws/", "editcustomer");
    private final static QName _GetCustomerDetails_QNAME = new QName("http://employee_ws/", "getCustomerDetails");
    private final static QName _GetCustomerDetailsResponse_QNAME = new QName("http://employee_ws/", "getCustomerDetailsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: employee_ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCustomerDetailsResponse }
     * 
     */
    public GetCustomerDetailsResponse createGetCustomerDetailsResponse() {
        return new GetCustomerDetailsResponse();
    }

    /**
     * Create an instance of {@link CreateCustomer }
     * 
     */
    public CreateCustomer createCreateCustomer() {
        return new CreateCustomer();
    }

    /**
     * Create an instance of {@link CreateCustomerResponse }
     * 
     */
    public CreateCustomerResponse createCreateCustomerResponse() {
        return new CreateCustomerResponse();
    }

    /**
     * Create an instance of {@link Editcustomer }
     * 
     */
    public Editcustomer createEditcustomer() {
        return new Editcustomer();
    }

    /**
     * Create an instance of {@link GetCustomerDetails }
     * 
     */
    public GetCustomerDetails createGetCustomerDetails() {
        return new GetCustomerDetails();
    }

    /**
     * Create an instance of {@link DeleteCustomer }
     * 
     */
    public DeleteCustomer createDeleteCustomer() {
        return new DeleteCustomer();
    }

    /**
     * Create an instance of {@link EditcustomerResponse }
     * 
     */
    public EditcustomerResponse createEditcustomerResponse() {
        return new EditcustomerResponse();
    }

    /**
     * Create an instance of {@link DeleteCustomerResponse }
     * 
     */
    public DeleteCustomerResponse createDeleteCustomerResponse() {
        return new DeleteCustomerResponse();
    }

    /**
     * Create an instance of {@link CustomerList }
     * 
     */
    public CustomerList createCustomerList() {
        return new CustomerList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://employee_ws/", name = "deleteCustomerResponse")
    public JAXBElement<DeleteCustomerResponse> createDeleteCustomerResponse(DeleteCustomerResponse value) {
        return new JAXBElement<DeleteCustomerResponse>(_DeleteCustomerResponse_QNAME, DeleteCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://employee_ws/", name = "deleteCustomer")
    public JAXBElement<DeleteCustomer> createDeleteCustomer(DeleteCustomer value) {
        return new JAXBElement<DeleteCustomer>(_DeleteCustomer_QNAME, DeleteCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditcustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://employee_ws/", name = "editcustomerResponse")
    public JAXBElement<EditcustomerResponse> createEditcustomerResponse(EditcustomerResponse value) {
        return new JAXBElement<EditcustomerResponse>(_EditcustomerResponse_QNAME, EditcustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://employee_ws/", name = "createCustomer")
    public JAXBElement<CreateCustomer> createCreateCustomer(CreateCustomer value) {
        return new JAXBElement<CreateCustomer>(_CreateCustomer_QNAME, CreateCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://employee_ws/", name = "createCustomerResponse")
    public JAXBElement<CreateCustomerResponse> createCreateCustomerResponse(CreateCustomerResponse value) {
        return new JAXBElement<CreateCustomerResponse>(_CreateCustomerResponse_QNAME, CreateCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Editcustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://employee_ws/", name = "editcustomer")
    public JAXBElement<Editcustomer> createEditcustomer(Editcustomer value) {
        return new JAXBElement<Editcustomer>(_Editcustomer_QNAME, Editcustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://employee_ws/", name = "getCustomerDetails")
    public JAXBElement<GetCustomerDetails> createGetCustomerDetails(GetCustomerDetails value) {
        return new JAXBElement<GetCustomerDetails>(_GetCustomerDetails_QNAME, GetCustomerDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://employee_ws/", name = "getCustomerDetailsResponse")
    public JAXBElement<GetCustomerDetailsResponse> createGetCustomerDetailsResponse(GetCustomerDetailsResponse value) {
        return new JAXBElement<GetCustomerDetailsResponse>(_GetCustomerDetailsResponse_QNAME, GetCustomerDetailsResponse.class, null, value);
    }

}
