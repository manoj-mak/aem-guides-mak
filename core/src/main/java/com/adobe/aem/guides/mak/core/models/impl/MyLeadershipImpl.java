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

import com.adobe.acs.commons.models.injectors.annotation.ChildResourceFromRequest;
import com.adobe.acs.commons.models.injectors.annotation.SharedValueMapValue;
import com.adobe.aem.guides.mak.core.models.MyLeadership;
import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = {
    SlingHttpServletRequest.class
}, adapters = {
    MyLeadership.class,
    ComponentExporter.class
}, resourceType = "hello-mak/components/content/my-leadership")
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class MyLeadershipImpl
    implements MyLeadership
{

    @SharedValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String globalTextfieldTest;
    @SharedValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String sharedTextfieldTest;
    @ChildResourceFromRequest(injectionStrategy = InjectionStrategy.OPTIONAL)
    private com.adobe.cq.wcm.core.components.models.Image profile1;
    @ChildResourceFromRequest(injectionStrategy = InjectionStrategy.OPTIONAL)
    private com.adobe.cq.wcm.core.components.models.Image profile2;
    @ChildResourceFromRequest(injectionStrategy = InjectionStrategy.OPTIONAL)
    private com.adobe.cq.wcm.core.components.models.Image profile3;
    @ChildResourceFromRequest(injectionStrategy = InjectionStrategy.OPTIONAL)
    private com.adobe.cq.wcm.core.components.models.Image profile4;
    @ChildResourceFromRequest(injectionStrategy = InjectionStrategy.OPTIONAL)
    private com.adobe.cq.wcm.core.components.models.Image profile5;
    @ChildResourceFromRequest(injectionStrategy = InjectionStrategy.OPTIONAL)
    private com.adobe.cq.wcm.core.components.models.Image profile6;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String name1;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String name2;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String name3;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String name4;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String name5;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String name6;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String designation1;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String designation2;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String designation3;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String designation4;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String designation5;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String designation6;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String description1;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String description2;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String description3;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String description4;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String description5;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String description6;
    @SlingObject
    private Resource resource;

    @Override
    public String getGlobalTextfieldTest() {
        return globalTextfieldTest;
    }

    @Override
    public String getSharedTextfieldTest() {
        return sharedTextfieldTest;
    }

    @Override
    public com.adobe.cq.wcm.core.components.models.Image getProfile1() {
        return profile1;
    }

    @Override
    public com.adobe.cq.wcm.core.components.models.Image getProfile2() {
        return profile2;
    }

    @Override
    public com.adobe.cq.wcm.core.components.models.Image getProfile3() {
        return profile3;
    }

    @Override
    public com.adobe.cq.wcm.core.components.models.Image getProfile4() {
        return profile4;
    }

    @Override
    public com.adobe.cq.wcm.core.components.models.Image getProfile5() {
        return profile5;
    }

    @Override
    public com.adobe.cq.wcm.core.components.models.Image getProfile6() {
        return profile6;
    }

    @Override
    public String getName1() {
        return name1;
    }

    @Override
    public String getName2() {
        return name2;
    }

    @Override
    public String getName3() {
        return name3;
    }

    @Override
    public String getName4() {
        return name4;
    }

    @Override
    public String getName5() {
        return name5;
    }

    @Override
    public String getName6() {
        return name6;
    }

    @Override
    public String getDesignation1() {
        return designation1;
    }

    @Override
    public String getDesignation2() {
        return designation2;
    }

    @Override
    public String getDesignation3() {
        return designation3;
    }

    @Override
    public String getDesignation4() {
        return designation4;
    }

    @Override
    public String getDesignation5() {
        return designation5;
    }

    @Override
    public String getDesignation6() {
        return designation6;
    }

    @Override
    public String getDescription1() {
        return description1;
    }

    @Override
    public String getDescription2() {
        return description2;
    }

    @Override
    public String getDescription3() {
        return description3;
    }

    @Override
    public String getDescription4() {
        return description4;
    }

    @Override
    public String getDescription5() {
        return description5;
    }

    @Override
    public String getDescription6() {
        return description6;
    }

    @Override
    public String getExportedType() {
        return resource.getResourceType();
    }

}
