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

import com.google.common.base.MoreObjects.ToStringHelper;

import nz.co.ctg.foxglove.description.SvgDescription;
import nz.co.ctg.foxglove.description.SvgMetadata;
import nz.co.ctg.foxglove.description.SvgTitle;


/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "contents"
})
@XmlRootElement(name = "animateMotion")
public class SvgAnimateMotion extends AbstractSvgAnimationElement implements ISvgAnimationElement {

    @XmlAttribute(name = "additive")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String additive;

    @XmlAttribute(name = "accumulate")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String accumulate;

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

    @XmlAttribute(name = "path")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String path;

    @XmlAttribute(name = "keyPoints")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String keyPoints;

    @XmlAttribute(name = "rotate")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String rotate;

    @XmlAttribute(name = "origin")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String origin;

    @XmlElements({
        @XmlElement(name = "mpath", required = true, type = SvgMotionPath.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "desc", required = true, type = SvgDescription.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "title", required = true, type = SvgTitle.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "metadata", required = true, type = SvgMetadata.class, namespace = "http://www.w3.org/2000/svg")
    })
    protected List<Object> contents;

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

    public String getCalcMode() {
        if (calcMode == null) {
            return "paced";
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

    public String getPath() {
        return path;
    }

    public void setPath(String value) {
        this.path = value;
    }

    public String getKeyPoints() {
        return keyPoints;
    }

    public void setKeyPoints(String value) {
        this.keyPoints = value;
    }

    public String getRotate() {
        return rotate;
    }

    public void setRotate(String value) {
        this.rotate = value;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the mpathOrDescOrTitleOrMetadata property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mpathOrDescOrTitleOrMetadata property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMpathOrDescOrTitleOrMetadata().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SvgMotionPath }
     * {@link SvgDescription }
     * {@link SvgTitle }
     * {@link SvgMetadata }
     *
     *
     */
    public List<Object> getContents() {
        if (contents == null) {
            contents = new ArrayList<>();
        }
        return this.contents;
    }

    @Override
    protected void toStringDetail(ToStringHelper builder) {
        // TODO Auto-generated method stub

    }

}