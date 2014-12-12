package org.evildethow.stripes.action;

import net.sourceforge.stripes.action.*;
import net.sourceforge.stripes.integration.spring.SpringBean;
import org.evildethow.service.HomeService;

@UrlBinding("/Home.htm")
public class HomeActionBean implements ActionBean {

    @SpringBean
    private HomeService homeService;

    private ActionBeanContext context;

    public ActionBeanContext getContext() {
        return context;
    }

    public void setContext(ActionBeanContext context) {
        this.context = context;
    }

    @DefaultHandler
    public Resolution view() {
        return new ForwardResolution("/WEB-INF/jsp/home.jsp");
    }

    public String getJavaVersion() {
        return homeService.getJavaVersion();
    }

    public String getOsName() {
        return homeService.getOsName();
    }
}
