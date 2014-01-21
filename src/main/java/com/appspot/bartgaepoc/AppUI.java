package com.appspot.bartgaepoc;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContext;

@Configurable
public class AppUI extends UI {
    
    @Autowired
    private transient ApplicationContext applicationContext;
    
    @Override
    protected void init(VaadinRequest request) {
        VerticalLayout vl = new VerticalLayout();
        
        vl.addComponent(new Button("Show Application Context", new Button.ClickListener() {
            
            @Override
            public void buttonClick(Button.ClickEvent event) {
                String applicationName = applicationContext.getApplicationName();
                Notification.show(applicationName);
            }
        }));
        
        setContent(vl);
    }
    
}
