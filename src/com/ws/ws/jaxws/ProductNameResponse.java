
package com.ws.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.3.0
 * Sun May 13 22:33:28 EET 2018
 * Generated source version: 2.3.0
 */

@XmlRootElement(name = "productNameResponse", namespace = "http://ws.ws.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productNameResponse", namespace = "http://ws.ws.com/")

public class ProductNameResponse {

    @XmlElement(name = "return")
    private java.lang.String _return;

    public java.lang.String getReturn() {
        return this._return;
    }

    public void setReturn(java.lang.String new_return)  {
        this._return = new_return;
    }

}
