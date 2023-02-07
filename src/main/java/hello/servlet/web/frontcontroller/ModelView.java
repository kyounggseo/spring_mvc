package hello.servlet.web.frontcontroller;

import java.util.HashMap;
import java.util.Map;

// @Getter @Setter
public class ModelView {

    private String viewName; // view
    private Map<String, Object> model = new HashMap<>(); // model

    public ModelView(String viewName) {
        this.viewName = viewName;
    }

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    public Map<String, Object> getModel() {
        return model;
    }

    public void setModel(Map<String, Object> model) {
        this.model = model;
    }
}
