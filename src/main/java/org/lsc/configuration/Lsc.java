//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.12.16 at 01:28:04 AM CET 
//


package org.lsc.configuration;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="connections" type="{http://lsc-project.org/XSD/lsc-core-2.0.xsd}connectionsType"/>
 *         &lt;element name="audits" type="{http://lsc-project.org/XSD/lsc-core-2.0.xsd}auditsType"/>
 *         &lt;element name="tasks" type="{http://lsc-project.org/XSD/lsc-core-2.0.xsd}tasksType"/>
 *         &lt;element name="security" type="{http://lsc-project.org/XSD/lsc-core-2.0.xsd}securityType" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="revision" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "lsc", namespace = "http://lsc-project.org/XSD/lsc-core-2.0.xsd")
public class Lsc {

    @XmlElement(namespace = "http://lsc-project.org/XSD/lsc-core-2.0.xsd", required = true)
    protected ConnectionsType connections;
    @XmlElement(namespace = "http://lsc-project.org/XSD/lsc-core-2.0.xsd", required = true)
    protected AuditsType audits;
    @XmlElement(namespace = "http://lsc-project.org/XSD/lsc-core-2.0.xsd", required = true)
    protected TasksType tasks;
    @XmlElement(namespace = "http://lsc-project.org/XSD/lsc-core-2.0.xsd")
    protected SecurityType security;
    @XmlAttribute
    protected String id;
    @XmlAttribute
    protected BigInteger revision;

    /**
     * Gets the value of the connections property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionsType }
     *     
     */
    public ConnectionsType getConnections() {
        return connections;
    }

    /**
     * Sets the value of the connections property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionsType }
     *     
     */
    public void setConnections(ConnectionsType value) {
        this.connections = value;
    }

    /**
     * Gets the value of the audits property.
     * 
     * @return
     *     possible object is
     *     {@link AuditsType }
     *     
     */
    public AuditsType getAudits() {
        return audits;
    }

    /**
     * Sets the value of the audits property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditsType }
     *     
     */
    public void setAudits(AuditsType value) {
        this.audits = value;
    }

    /**
     * Gets the value of the tasks property.
     * 
     * @return
     *     possible object is
     *     {@link TasksType }
     *     
     */
    public TasksType getTasks() {
        return tasks;
    }

    /**
     * Sets the value of the tasks property.
     * 
     * @param value
     *     allowed object is
     *     {@link TasksType }
     *     
     */
    public void setTasks(TasksType value) {
        this.tasks = value;
    }

    /**
     * Gets the value of the security property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityType }
     *     
     */
    public SecurityType getSecurity() {
        return security;
    }

    /**
     * Sets the value of the security property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityType }
     *     
     */
    public void setSecurity(SecurityType value) {
        this.security = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the revision property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRevision() {
        return revision;
    }

    /**
     * Sets the value of the revision property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRevision(BigInteger value) {
        this.revision = value;
    }

}
