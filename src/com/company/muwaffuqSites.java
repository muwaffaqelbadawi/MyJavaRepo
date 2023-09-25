package com.company;

import java.net.*;
import java.util.*;
import java.applet.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class muwaffuqSites extends JApplet{

    private HashMap<String, URL> webSiteInfo;
    private ArrayList<String> titles;
    private JList mainList;

//    init
    public void init() {
        webSiteInfo = new HashMap<String, URL>();
        titles = new ArrayList<String>();

        grabHTMLInfo();
        add(new JLabel("What website do you want to visit?"), BorderLayout.NORTH);
        mainList = new JList(titles.toArray());

        mainList.addListSelectionListener(
                new ListSelectionListener() {
                    public void valueChanged(ListSelectionEvent event) {
                        Object object = mainList.getSelectedValue();
                        URL newDocument = webSiteInfo.get(object);
                        AppletContext browser = getAppletContext();
                    }
                }
        );
        add(new JScrollPane(mainList), BorderLayout.CENTER);
    }
//        get website info
        public void grabHTMLInfo(){
            String title;
            String address;
            URL url;
            int counter = 0;
            title = ("title"+counter);

            while (title != null){
                address = getParameter("address"+counter);
                try{
                    url = new URL(address);
                    webSiteInfo.put(title,url);
                    titles.add(title);
                }catch(MalformedURLException urlException){
                     urlException.getStackTrace();
                }
                ++counter;
                title = getParameter("title"+counter);
            }
        }
    }