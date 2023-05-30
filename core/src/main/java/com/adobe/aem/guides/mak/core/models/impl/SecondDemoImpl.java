/*
 * ***********************************************************************
 * Fulcro Consulting pvt ltd CONFIDENTIAL
 * ___________________
 *
 * Copyright 2023 Fulcro Consulting pvt ltd.
 * All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains the property
 * of Fulcro Consulting pvt ltd and its suppliers, if any. The intellectual and
 * technical concepts contained herein are proprietary to Fulcro Consulting pvt ltd
 * and its suppliers and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Fulcro Consulting pvt ltd.
 * ***********************************************************************
 */

package com.adobe.aem.guides.mak.core.models.impl;

import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import com.adobe.acs.commons.models.injectors.annotation.ChildResourceFromRequest;
import com.adobe.acs.commons.models.injectors.annotation.SharedValueMapValue;
import com.adobe.aem.guides.mak.core.models.DemoLink;
import com.adobe.aem.guides.mak.core.models.SecondDemo;
import com.adobe.cq.wcm.core.components.models.Image;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = {
    SlingHttpServletRequest.class
}, adapters = SecondDemo.class, resourceType = "hello-mak/components/content/second-demo")
public class SecondDemoImpl
    implements SecondDemo
{

    @SharedValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String globalTextfieldTest;
    @SharedValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String sharedTextfieldTest;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String textfieldTest;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private Boolean checkTest;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String pathfieldTest;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String pagefieldTest;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private List<String> tagfieldTest;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String textareaTest;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private Calendar dateTest;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String selectTest;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String radioTest;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String hiddenTest;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private Long numberfieldTest;
    @ChildResourceFromRequest(injectionStrategy = InjectionStrategy.OPTIONAL)
    private Image imageTest;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private List<String> colors;
    @ChildResourceFromRequest(injectionStrategy = InjectionStrategy.OPTIONAL)
    private List<DemoLink> links;

    @Override
    public String getGlobalTextfieldTest() {
        return globalTextfieldTest;
    }

    @Override
    public String getSharedTextfieldTest() {
        return sharedTextfieldTest;
    }

    @Override
    public String getTextfieldTest() {
        return textfieldTest;
    }

    @Override
    public Boolean getCheckTest() {
        return checkTest;
    }

    @Override
    public String getPathfieldTest() {
        return pathfieldTest;
    }

    @Override
    public String getPagefieldTest() {
        return pagefieldTest;
    }

    @Override
    public List<String> getTagfieldTest() {
        return tagfieldTest != null ? Collections.unmodifiableList(tagfieldTest) : null;
    }

    @Override
    public String getTextareaTest() {
        return textareaTest;
    }

    @Override
    public Calendar getDateTest() {
        return dateTest;
    }

    @Override
    public String getSelectTest() {
        return selectTest;
    }

    @Override
    public String getRadioTest() {
        return radioTest;
    }

    @Override
    public String getHiddenTest() {
        return hiddenTest;
    }

    @Override
    public Long getNumberfieldTest() {
        return numberfieldTest;
    }

    @Override
    public Image getImageTest() {
        return imageTest;
    }

    @Override
    public List<String> getColors() {
        return colors != null ? Collections.unmodifiableList(colors) : null;
    }

    @Override
    public List<DemoLink> getLinks() {
        return links != null ? Collections.unmodifiableList(links) : null;
    }

}
