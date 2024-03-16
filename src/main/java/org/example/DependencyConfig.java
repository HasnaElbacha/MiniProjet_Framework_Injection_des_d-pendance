package org.example;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "dependencyConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class DependencyConfig {

    @XmlElement(name = "bean")
    private List<Bean> beans;

    public List<Bean> getBeans() {
        return beans;
    }

    public void setBeans(List<Bean> beans) {
        this.beans = beans;
    }
}