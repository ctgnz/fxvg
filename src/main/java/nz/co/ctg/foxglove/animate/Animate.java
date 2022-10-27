//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2021.03.25 at 03:40:09 PM NZDT
//


package nz.co.ctg.foxglove.animate;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import nz.co.ctg.foxglove.description.Desc;
import nz.co.ctg.foxglove.description.Metadata;
import nz.co.ctg.foxglove.description.Title;


/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "contents"
})
@XmlRootElement(name = "animate")
public class Animate extends SvgAnimationElement {

    @XmlAttribute(name = "attributeName", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String attributeName;

    @XmlAttribute(name = "attributeType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String attributeType;

    @XmlAttribute(name = "calcMode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String calcMode;

    @XmlAttribute(name = "values")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String values;

    @XmlAttribute(name = "keyTimes")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String keyTimes;

    @XmlAttribute(name = "keySplines")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String keySplines;

    @XmlAttribute(name = "from")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String from;

    @XmlAttribute(name = "by")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String by;

    @XmlAttribute(name = "additive")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String additive;

    @XmlAttribute(name = "accumulate")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String accumulate;

    @XmlElements({
        @XmlElement(name = "desc", type = Desc.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "title", type = Title.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "metadata", type = Metadata.class, namespace = "http://www.w3.org/2000/svg")
    })
    protected List<Object> contents;

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String value) {
        this.attributeName = value;
    }

    public String getAttributeType() {
        return attributeType;
    }

    public void setAttributeType(String value) {
        this.attributeType = value;
    }

    public String getCalcMode() {
        if (calcMode == null) {
            return "linear";
        } else {
            return calcMode;
        }
    }

    public void setCalcMode(String value) {
        this.calcMode = value;
    }

    public String getValues() {
        return values;
    }

    public void setValues(String value) {
        this.values = value;
    }

    public String getKeyTimes() {
        return keyTimes;
    }

    public void setKeyTimes(String value) {
        this.keyTimes = value;
    }

    public String getKeySplines() {
        return keySplines;
    }

    public void setKeySplines(String value) {
        this.keySplines = value;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String value) {
        this.from = value;
    }

    public String getBy() {
        return by;
    }

    public void setBy(String value) {
        this.by = value;
    }

    public String getAdditive() {
        if (additive == null) {
            return "replace";
        } else {
            return additive;
        }
    }

    public void setAdditive(String value) {
        this.additive = value;
    }

    public String getAccumulate() {
        if (accumulate == null) {
            return "none";
        } else {
            return accumulate;
        }
    }

    public void setAccumulate(String value) {
        this.accumulate = value;
    }

    /**
     * Gets the value of the descOrTitleOrMetadata property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descOrTitleOrMetadata property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescOrTitleOrMetadata().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Desc }
     * {@link Title }
     * {@link Metadata }
     *
     *
     */
    public List<Object> getContents() {
        if (contents == null) {
            contents = new ArrayList<>();
        }
        return this.contents;
    }

}
