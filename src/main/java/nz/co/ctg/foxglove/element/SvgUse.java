package nz.co.ctg.foxglove.element;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.persistence.oxm.annotations.XmlPath;

import nz.co.ctg.foxglove.AbstractSvgStylable;
import nz.co.ctg.foxglove.ISvgConditionalFeatures;
import nz.co.ctg.foxglove.ISvgElement;
import nz.co.ctg.foxglove.ISvgEventListener;
import nz.co.ctg.foxglove.ISvgLinkable;
import nz.co.ctg.foxglove.ISvgTransformable;
import nz.co.ctg.foxglove.animate.SvgAnimateAttribute;
import nz.co.ctg.foxglove.animate.SvgAnimateColor;
import nz.co.ctg.foxglove.animate.SvgAnimateMotion;
import nz.co.ctg.foxglove.animate.SvgAnimateTransform;
import nz.co.ctg.foxglove.animate.SvgSetAttribute;
import nz.co.ctg.foxglove.attributes.SvgConditionalFeaturesAttributes;
import nz.co.ctg.foxglove.attributes.SvgExternalResourcesAttributes;
import nz.co.ctg.foxglove.attributes.SvgLinkableAttributes;
import nz.co.ctg.foxglove.description.SvgDescription;
import nz.co.ctg.foxglove.description.SvgMetadata;
import nz.co.ctg.foxglove.description.SvgTitle;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "conditionalFeatures", "linkable", "externalResources", "content"
})
@XmlRootElement(name = "use")
public class SvgUse extends AbstractSvgStylable implements ISvgStructuralElement, ISvgEventListener, ISvgConditionalFeatures, ISvgTransformable, ISvgLinkable {

    @XmlPath(".")
    protected final SvgConditionalFeaturesAttributes conditionalFeatures = new SvgConditionalFeaturesAttributes();

    @XmlPath(".")
    protected final SvgLinkableAttributes linkable = new SvgLinkableAttributes();

    @XmlPath(".")
    protected final SvgExternalResourcesAttributes externalResources = new SvgExternalResourcesAttributes();

    @XmlAttribute(name = "onfocusin")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String onfocusin;

    @XmlAttribute(name = "onfocusout")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String onfocusout;

    @XmlAttribute(name = "onactivate")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String onactivate;

    @XmlAttribute(name = "onclick")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String onclick;

    @XmlAttribute(name = "onmousedown")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String onmousedown;

    @XmlAttribute(name = "onmouseup")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String onmouseup;

    @XmlAttribute(name = "onmouseover")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String onmouseover;

    @XmlAttribute(name = "onmousemove")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String onmousemove;

    @XmlAttribute(name = "onmouseout")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String onmouseout;

    @XmlAttribute(name = "onload")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String onload;

    @XmlAttribute(name = "x")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String x;

    @XmlAttribute(name = "y")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String y;

    @XmlAttribute(name = "width")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String width;

    @XmlAttribute(name = "height")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String height;

    @XmlAttribute(name = "transform")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String transform;

    @XmlElements({
        @XmlElement(name = "desc", type = SvgDescription.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "title", type = SvgTitle.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "metadata", type = SvgMetadata.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "animate", type = SvgAnimateAttribute.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "set", type = SvgSetAttribute.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "animateMotion", type = SvgAnimateMotion.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "animateColor", type = SvgAnimateColor.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "animateTransform", type = SvgAnimateTransform.class, namespace = "http://www.w3.org/2000/svg")
    })
    protected List<ISvgElement> content;

    @Override
    public SvgConditionalFeaturesAttributes getConditionalFeaturesAttributes() {
        return conditionalFeatures;
    }

    @Override
    public SvgLinkableAttributes getLinkableAttributes() {
        return linkable;
    }

    @Override
    public SvgExternalResourcesAttributes getExternalResourcesAttributes() {
        return externalResources;
    }

    /**
     * Gets the value of the onfocusin property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @Override
    public String getOnFocusIn() {
        return onfocusin;
    }

    /**
     * Sets the value of the onfocusin property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    @Override
    public void setOnFocusIn(String value) {
        this.onfocusin = value;
    }

    /**
     * Gets the value of the onfocusout property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @Override
    public String getOnFocusOut() {
        return onfocusout;
    }

    /**
     * Sets the value of the onfocusout property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    @Override
    public void setOnFocusOut(String value) {
        this.onfocusout = value;
    }

    /**
     * Gets the value of the onactivate property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @Override
    public String getOnActivate() {
        return onactivate;
    }

    /**
     * Sets the value of the onactivate property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    @Override
    public void setOnActivate(String value) {
        this.onactivate = value;
    }

    /**
     * Gets the value of the onclick property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @Override
    public String getOnClick() {
        return onclick;
    }

    /**
     * Sets the value of the onclick property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    @Override
    public void setOnClick(String value) {
        this.onclick = value;
    }

    /**
     * Gets the value of the onmousedown property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @Override
    public String getOnMouseDown() {
        return onmousedown;
    }

    /**
     * Sets the value of the onmousedown property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    @Override
    public void setOnMouseDown(String value) {
        this.onmousedown = value;
    }

    /**
     * Gets the value of the onmouseup property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @Override
    public String getOnMouseUp() {
        return onmouseup;
    }

    /**
     * Sets the value of the onmouseup property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    @Override
    public void setOnMouseUp(String value) {
        this.onmouseup = value;
    }

    /**
     * Gets the value of the onmouseover property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @Override
    public String getOnMouseOver() {
        return onmouseover;
    }

    /**
     * Sets the value of the onmouseover property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    @Override
    public void setOnMouseOver(String value) {
        this.onmouseover = value;
    }

    /**
     * Gets the value of the onmousemove property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @Override
    public String getOnMouseMove() {
        return onmousemove;
    }

    /**
     * Sets the value of the onmousemove property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    @Override
    public void setOnMouseMove(String value) {
        this.onmousemove = value;
    }

    /**
     * Gets the value of the onmouseout property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @Override
    public String getOnMouseOut() {
        return onmouseout;
    }

    /**
     * Sets the value of the onmouseout property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    @Override
    public void setOnMouseOut(String value) {
        this.onmouseout = value;
    }

    /**
     * Gets the value of the onload property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @Override
    public String getOnLoad() {
        return onload;
    }

    /**
     * Sets the value of the onload property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    @Override
    public void setOnLoad(String value) {
        this.onload = value;
    }

    /**
     * Gets the value of the x property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setX(String value) {
        this.x = value;
    }

    /**
     * Gets the value of the y property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setY(String value) {
        this.y = value;
    }

    /**
     * Gets the value of the width property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setWidth(String value) {
        this.width = value;
    }

    /**
     * Gets the value of the height property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHeight(String value) {
        this.height = value;
    }

    /**
     * Gets the value of the transform property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @Override
    public String getTransform() {
        return transform;
    }

    /**
     * Sets the value of the transform property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    @Override
    public void setTransform(String value) {
        this.transform = value;
    }

    /**
     * Gets the value of the content property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SvgDescription }
     * {@link SvgTitle }
     * {@link SvgMetadata }
     * {@link SvgAnimateAttribute }
     * {@link SvgSetAttribute }
     * {@link SvgAnimateMotion }
     * {@link SvgAnimateColor }
     * {@link SvgAnimateTransform }
     *
     *
     */
    public List<ISvgElement> getContent() {
        if (content == null) {
            content = new ArrayList<>();
        }
        return this.content;
    }

}
