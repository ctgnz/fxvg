package nz.co.ctg.foxglove.animate;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.persistence.oxm.annotations.XmlPath;

import com.google.common.base.MoreObjects.ToStringHelper;

import nz.co.ctg.foxglove.AbstractSvgElement;
import nz.co.ctg.foxglove.ISvgElement;
import nz.co.ctg.foxglove.ISvgExternalResources;
import nz.co.ctg.foxglove.ISvgLinkable;
import nz.co.ctg.foxglove.attributes.SvgExternalResourcesAttributes;
import nz.co.ctg.foxglove.attributes.SvgLinkableAttributes;
import nz.co.ctg.foxglove.description.ISvgDescriptiveElement;
import nz.co.ctg.foxglove.description.SvgDescription;
import nz.co.ctg.foxglove.description.SvgMetadata;
import nz.co.ctg.foxglove.description.SvgTitle;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mpath", propOrder = {
    "linkable", "externalResources", "contents"
})
@XmlRootElement(name = "mpath")
public class SvgMotionPath extends AbstractSvgElement implements ISvgElement, ISvgExternalResources, ISvgLinkable {

    @XmlPath(".")
    private final SvgLinkableAttributes linkable = new SvgLinkableAttributes();

    @XmlPath(".")
    private final SvgExternalResourcesAttributes externalResources = new SvgExternalResourcesAttributes();

    @XmlElements({
        @XmlElement(name = "desc", type = SvgDescription.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "title", type = SvgTitle.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "metadata", type = SvgMetadata.class, namespace = "http://www.w3.org/2000/svg")
    })
    private List<ISvgDescriptiveElement> contents;

    @Override
    public SvgExternalResourcesAttributes getExternalResourcesAttributes() {
        return externalResources;
    }

    @Override
    public SvgLinkableAttributes getLinkableAttributes() {
        return linkable;
    }

    public List<ISvgDescriptiveElement> getContents() {
        if (contents == null) {
            contents = new ArrayList<>();
        }
        return this.contents;
    }

    @Override
    protected void toStringDetail(ToStringHelper builder) {
        super.toStringDetail(builder);
        linkable.toStringDetail(builder);
        externalResources.toStringDetail(builder);
    }

}
