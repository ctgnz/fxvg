package nz.co.ctg.foxglove;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.persistence.oxm.annotations.XmlPath;

import com.google.common.base.MoreObjects.ToStringHelper;

import nz.co.ctg.foxglove.animate.SvgAnimateAttribute;
import nz.co.ctg.foxglove.animate.SvgAnimateColor;
import nz.co.ctg.foxglove.animate.SvgAnimateMotion;
import nz.co.ctg.foxglove.animate.SvgAnimateTransform;
import nz.co.ctg.foxglove.animate.SvgSetAttribute;
import nz.co.ctg.foxglove.attributes.SvgConditionalFeaturesAttributes;
import nz.co.ctg.foxglove.attributes.SvgEventListener;
import nz.co.ctg.foxglove.attributes.SvgExternalResourcesAttributes;
import nz.co.ctg.foxglove.clip.SvgClipPath;
import nz.co.ctg.foxglove.clip.SvgMask;
import nz.co.ctg.foxglove.description.SvgDescription;
import nz.co.ctg.foxglove.description.SvgMetadata;
import nz.co.ctg.foxglove.description.SvgTitle;
import nz.co.ctg.foxglove.element.SvgAnchor;
import nz.co.ctg.foxglove.element.SvgCursor;
import nz.co.ctg.foxglove.element.SvgDefinitions;
import nz.co.ctg.foxglove.element.SvgForeignObject;
import nz.co.ctg.foxglove.element.SvgGroup;
import nz.co.ctg.foxglove.element.SvgImage;
import nz.co.ctg.foxglove.element.SvgMarker;
import nz.co.ctg.foxglove.element.SvgScript;
import nz.co.ctg.foxglove.element.SvgSwitch;
import nz.co.ctg.foxglove.element.SvgSymbol;
import nz.co.ctg.foxglove.element.SvgUse;
import nz.co.ctg.foxglove.element.SvgView;
import nz.co.ctg.foxglove.filter.SvgFilter;
import nz.co.ctg.foxglove.paint.SvgColorProfile;
import nz.co.ctg.foxglove.paint.SvgLinearGradient;
import nz.co.ctg.foxglove.paint.SvgPattern;
import nz.co.ctg.foxglove.paint.SvgRadialGradient;
import nz.co.ctg.foxglove.shape.ISvgShape;
import nz.co.ctg.foxglove.shape.SvgCircle;
import nz.co.ctg.foxglove.shape.SvgEllipse;
import nz.co.ctg.foxglove.shape.SvgLine;
import nz.co.ctg.foxglove.shape.SvgPath;
import nz.co.ctg.foxglove.shape.SvgPolygon;
import nz.co.ctg.foxglove.shape.SvgPolyline;
import nz.co.ctg.foxglove.shape.SvgRectangle;
import nz.co.ctg.foxglove.style.SvgStyle;
import nz.co.ctg.foxglove.text.SvgAltGlyphDef;
import nz.co.ctg.foxglove.text.SvgFont;
import nz.co.ctg.foxglove.text.SvgFontFace;
import nz.co.ctg.foxglove.text.SvgText;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;


/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "svg", propOrder = {
    "externalResources", "conditionalFeatures", "eventListener", "content"
})
@XmlRootElement(name = "svg", namespace = "http://www.w3.org/2000/svg")
public class SvgGraphic extends AbstractSvgStylable implements ISvgStylable, ISvgEventListener, ISvgConditionalFeatures, ISvgFitToViewBox, ISvgExternalResources {

    @XmlAttribute(name = "xmlns")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String xmlns;

    @XmlAttribute(name = "xmlns:xlink")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String xmlnsXlink;

    @XmlAttribute(name = "onunload")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String onUnload;

    @XmlAttribute(name = "onabort")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String onAbort;

    @XmlAttribute(name = "onerror")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String onError;

    @XmlAttribute(name = "onresize")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String onResize;

    @XmlAttribute(name = "onscroll")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String onScroll;

    @XmlAttribute(name = "onzoom")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String onZoom;

    @XmlPath(".")
    protected final SvgExternalResourcesAttributes externalResources = new SvgExternalResourcesAttributes();

    @XmlPath(".")
    protected final SvgConditionalFeaturesAttributes conditionalFeatures = new SvgConditionalFeaturesAttributes();

    @XmlPath(".")
    protected final SvgEventListener eventListener = new SvgEventListener();

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

    @XmlAttribute(name = "viewBox")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String viewBox;

    @XmlAttribute(name = "preserveAspectRatio")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String preserveAspectRatio;

    @XmlAttribute(name = "zoomAndPan")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String zoomAndPan;

    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String version;

    @XmlAttribute(name = "baseProfile")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String baseProfile;

    @XmlAttribute(name = "contentScriptType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String contentScriptType;

    @XmlAttribute(name = "contentStyleType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String contentStyleType;

    @XmlElements({
        @XmlElement(name = "desc", type = SvgDescription.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "title", type = SvgTitle.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "metadata", type = SvgMetadata.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "animate", type = SvgAnimateAttribute.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "set", type = SvgSetAttribute.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "animateMotion", type = SvgAnimateMotion.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "animateColor", type = SvgAnimateColor.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "animateTransform", type = SvgAnimateTransform.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "svg", type = SvgGraphic.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "g", type = SvgGroup.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "defs", type = SvgDefinitions.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "symbol", type = SvgSymbol.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "use", type = SvgUse.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "switch", type = SvgSwitch.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "image", type = SvgImage.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "style", type = SvgStyle.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "path", type = SvgPath.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "rect", type = SvgRectangle.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "circle", type = SvgCircle.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "line", type = SvgLine.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "ellipse", type = SvgEllipse.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "polyline", type = SvgPolyline.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "polygon", type = SvgPolygon.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "text", type = SvgText.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "altGlyphDef", type = SvgAltGlyphDef.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "marker", type = SvgMarker.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "color-profile", type = SvgColorProfile.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "linearGradient", type = SvgLinearGradient.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "radialGradient", type = SvgRadialGradient.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "pattern", type = SvgPattern.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "clipPath", type = SvgClipPath.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "mask", type = SvgMask.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "filter", type = SvgFilter.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "cursor", type = SvgCursor.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "a", type = SvgAnchor.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "view", type = SvgView.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "script", type = SvgScript.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "font", type = SvgFont.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "font-face", type = SvgFontFace.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "foreignObject", type = SvgForeignObject.class, namespace = "http://www.w3.org/2000/svg")
    })
    protected List<ISvgElement> content;


    @Override
    public SvgExternalResourcesAttributes getExternalResourcesAttributes() {
        return externalResources;
    }

    @Override
    public SvgConditionalFeaturesAttributes getConditionalFeaturesAttributes() {
        return conditionalFeatures;
    }

    @Override
    public SvgEventListener getEventListener() {
        return eventListener;
    }

    /**
     * Gets the value of the xmlns property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getXmlns() {
        if (xmlns == null) {
            return "http://www.w3.org/2000/svg";
        } else {
            return xmlns;
        }
    }

    /**
     * Sets the value of the xmlns property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setXmlns(String value) {
        this.xmlns = value;
    }

    /**
     * Gets the value of the xmlnsXlink property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getXmlnsXlink() {
        if (xmlnsXlink == null) {
            return "http://www.w3.org/1999/xlink";
        } else {
            return xmlnsXlink;
        }
    }

    /**
     * Sets the value of the xmlnsXlink property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setXmlnsXlink(String value) {
        this.xmlnsXlink = value;
    }

    /**
     * Gets the value of the onunload property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOnUnload() {
        return onUnload;
    }

    /**
     * Sets the value of the onunload property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOnUnload(String value) {
        this.onUnload = value;
    }

    /**
     * Gets the value of the onabort property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOnAbort() {
        return onAbort;
    }

    /**
     * Sets the value of the onabort property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOnAbort(String value) {
        this.onAbort = value;
    }

    /**
     * Gets the value of the onerror property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOnError() {
        return onError;
    }

    /**
     * Sets the value of the onerror property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOnError(String value) {
        this.onError = value;
    }

    /**
     * Gets the value of the onresize property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOnResize() {
        return onResize;
    }

    /**
     * Sets the value of the onresize property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOnResize(String value) {
        this.onResize = value;
    }

    /**
     * Gets the value of the onscroll property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOnScroll() {
        return onScroll;
    }

    /**
     * Sets the value of the onscroll property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOnScroll(String value) {
        this.onScroll = value;
    }

    /**
     * Gets the value of the onzoom property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOnZoom() {
        return onZoom;
    }

    /**
     * Sets the value of the onzoom property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOnZoom(String value) {
        this.onZoom = value;
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
     * Gets the value of the viewBox property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @Override
    public String getViewBox() {
        return viewBox;
    }

    /**
     * Sets the value of the viewBox property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    @Override
    public void setViewBox(String value) {
        this.viewBox = value;
    }

    /**
     * Gets the value of the preserveAspectRatio property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @Override
    public String getPreserveAspectRatio() {
        if (preserveAspectRatio == null) {
            return "xMidYMid meet";
        } else {
            return preserveAspectRatio;
        }
    }

    /**
     * Sets the value of the preserveAspectRatio property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    @Override
    public void setPreserveAspectRatio(String value) {
        this.preserveAspectRatio = value;
    }

    /**
     * Gets the value of the zoomAndPan property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getZoomAndPan() {
        if (zoomAndPan == null) {
            return "magnify";
        } else {
            return zoomAndPan;
        }
    }

    /**
     * Sets the value of the zoomAndPan property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setZoomAndPan(String value) {
        this.zoomAndPan = value;
    }

    /**
     * Gets the value of the version property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVersion() {
        if (version == null) {
            return "1.1";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the baseProfile property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBaseProfile() {
        return baseProfile;
    }

    /**
     * Sets the value of the baseProfile property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBaseProfile(String value) {
        this.baseProfile = value;
    }

    /**
     * Gets the value of the contentScriptType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getContentScriptType() {
        if (contentScriptType == null) {
            return "application/ecmascript";
        } else {
            return contentScriptType;
        }
    }

    /**
     * Sets the value of the contentScriptType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setContentScriptType(String value) {
        this.contentScriptType = value;
    }

    /**
     * Gets the value of the contentStyleType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getContentStyleType() {
        if (contentStyleType == null) {
            return "text/css";
        } else {
            return contentStyleType;
        }
    }

    /**
     * Sets the value of the contentStyleType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setContentStyleType(String value) {
        this.contentStyleType = value;
    }

    /**
     * Gets the value of the elements property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elements property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElements().add(newItem);
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
     * {@link SvgGraphic }
     * {@link SvgGroup }
     * {@link SvgDefinitions }
     * {@link SvgSymbol }
     * {@link SvgUse }
     * {@link SvgSwitch }
     * {@link SvgImage }
     * {@link SvgStyle }
     * {@link SvgPath }
     * {@link SvgRectangle }
     * {@link SvgCircle }
     * {@link SvgLine }
     * {@link SvgEllipse }
     * {@link SvgPolyline }
     * {@link SvgPolygon }
     * {@link SvgText }
     * {@link SvgAltGlyphDef }
     * {@link SvgMarker }
     * {@link SvgColorProfile }
     * {@link SvgLinearGradient }
     * {@link SvgRadialGradient }
     * {@link SvgPattern }
     * {@link SvgClipPath }
     * {@link SvgMask }
     * {@link SvgFilter }
     * {@link SvgCursor }
     * {@link SvgAnchor }
     * {@link SvgView }
     * {@link SvgScript }
     * {@link SvgFont }
     * {@link SvgFontFace }
     * {@link SvgForeignObject }
     *
     *
     */
    public List<ISvgElement> getContent() {
        if (content == null) {
            content = new ArrayList<>();
        }
        return this.content;
    }

    public Region createGraphic() {
        Pane baseGroup = new Pane();
        baseGroup.setMaxWidth(Double.valueOf(StringUtils.stripEnd(width, "px")));
        baseGroup.setMaxHeight(Double.valueOf(StringUtils.stripEnd(height, "px")));
        content.forEach(child -> {
            if (child instanceof SvgGroup) {
                SvgGroup group = (SvgGroup) child;
                baseGroup.getChildren().add(group.createGroup());
            }
            if (child instanceof ISvgShape<?>) {
                ISvgShape<?> shape = (ISvgShape<?>) child;
                baseGroup.getChildren().add(shape.createShape());
            }
        });
        return baseGroup;
    }

    @Override
    protected void toStringDetail(ToStringHelper builder) {
        super.toStringDetail(builder);
        conditionalFeatures.toStringDetail(builder);
        eventListener.toStringDetail(builder);
        externalResources.toStringDetail(builder);
    }

}
