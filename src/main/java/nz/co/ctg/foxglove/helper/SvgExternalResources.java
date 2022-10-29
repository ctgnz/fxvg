package nz.co.ctg.foxglove.helper;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class SvgExternalResources {

    @XmlAttribute(name = "externalResourcesRequired")
    private boolean externalResourcesRequired;

    public boolean isExternalResourcesRequired() {
        return externalResourcesRequired;
    }

    public void setExternalResourcesRequired(boolean value) {
        this.externalResourcesRequired = value;
    }

}
