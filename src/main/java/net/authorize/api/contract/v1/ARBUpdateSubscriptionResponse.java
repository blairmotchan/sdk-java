//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.03 at 05:32:06 PM IST 
//


package net.authorize.api.contract.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}ANetApiResponse">
 *       &lt;sequence>
 *         &lt;element name="profile" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}customerProfileIdType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "profile"
})
@XmlRootElement(name = "ARBUpdateSubscriptionResponse")
public class ARBUpdateSubscriptionResponse
    extends ANetApiResponse
{

    protected CustomerProfileIdType profile;

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileIdType }
     *     
     */
    public CustomerProfileIdType getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileIdType }
     *     
     */
    public void setProfile(CustomerProfileIdType value) {
        this.profile = value;
    }

}
