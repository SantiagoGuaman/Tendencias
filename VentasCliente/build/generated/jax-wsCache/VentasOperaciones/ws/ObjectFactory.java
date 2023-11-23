
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
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

    private final static QName _Exception_QNAME = new QName("http://ws/", "Exception");
    private final static QName _Decrypt_QNAME = new QName("http://ws/", "decrypt");
    private final static QName _DecryptResponse_QNAME = new QName("http://ws/", "decryptResponse");
    private final static QName _Encrypt_QNAME = new QName("http://ws/", "encrypt");
    private final static QName _EncryptResponse_QNAME = new QName("http://ws/", "encryptResponse");
    private final static QName _RegistroUsuario_QNAME = new QName("http://ws/", "registroUsuario");
    private final static QName _RegistroUsuarioResponse_QNAME = new QName("http://ws/", "registroUsuarioResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link Decrypt }
     * 
     */
    public Decrypt createDecrypt() {
        return new Decrypt();
    }

    /**
     * Create an instance of {@link DecryptResponse }
     * 
     */
    public DecryptResponse createDecryptResponse() {
        return new DecryptResponse();
    }

    /**
     * Create an instance of {@link Encrypt }
     * 
     */
    public Encrypt createEncrypt() {
        return new Encrypt();
    }

    /**
     * Create an instance of {@link EncryptResponse }
     * 
     */
    public EncryptResponse createEncryptResponse() {
        return new EncryptResponse();
    }

    /**
     * Create an instance of {@link RegistroUsuario }
     * 
     */
    public RegistroUsuario createRegistroUsuario() {
        return new RegistroUsuario();
    }

    /**
     * Create an instance of {@link RegistroUsuarioResponse }
     * 
     */
    public RegistroUsuarioResponse createRegistroUsuarioResponse() {
        return new RegistroUsuarioResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Decrypt }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Decrypt }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "decrypt")
    public JAXBElement<Decrypt> createDecrypt(Decrypt value) {
        return new JAXBElement<Decrypt>(_Decrypt_QNAME, Decrypt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecryptResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DecryptResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "decryptResponse")
    public JAXBElement<DecryptResponse> createDecryptResponse(DecryptResponse value) {
        return new JAXBElement<DecryptResponse>(_DecryptResponse_QNAME, DecryptResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Encrypt }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Encrypt }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "encrypt")
    public JAXBElement<Encrypt> createEncrypt(Encrypt value) {
        return new JAXBElement<Encrypt>(_Encrypt_QNAME, Encrypt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncryptResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EncryptResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "encryptResponse")
    public JAXBElement<EncryptResponse> createEncryptResponse(EncryptResponse value) {
        return new JAXBElement<EncryptResponse>(_EncryptResponse_QNAME, EncryptResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistroUsuario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistroUsuario }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "registroUsuario")
    public JAXBElement<RegistroUsuario> createRegistroUsuario(RegistroUsuario value) {
        return new JAXBElement<RegistroUsuario>(_RegistroUsuario_QNAME, RegistroUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistroUsuarioResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistroUsuarioResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "registroUsuarioResponse")
    public JAXBElement<RegistroUsuarioResponse> createRegistroUsuarioResponse(RegistroUsuarioResponse value) {
        return new JAXBElement<RegistroUsuarioResponse>(_RegistroUsuarioResponse_QNAME, RegistroUsuarioResponse.class, null, value);
    }

}
