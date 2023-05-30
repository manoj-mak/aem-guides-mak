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
import com.adobe.aem.guides.mak.core.models.InsGuide;
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
    InsGuide.class,
    ComponentExporter.class
}, resourceType = "hello-mak/components/content/ins-guide")
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class InsGuideImpl
    implements InsGuide
{

    @SharedValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String globalTextfieldTest;
    @SharedValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String sharedTextfieldTest;
    @ChildResourceFromRequest(injectionStrategy = InjectionStrategy.OPTIONAL)
    private com.adobe.cq.wcm.core.components.models.Image image1;
    @ChildResourceFromRequest(injectionStrategy = InjectionStrategy.OPTIONAL)
    private com.adobe.cq.wcm.core.components.models.Image image2;
    @ChildResourceFromRequest(injectionStrategy = InjectionStrategy.OPTIONAL)
    private com.adobe.cq.wcm.core.components.models.Image image3;
    @ChildResourceFromRequest(injectionStrategy = InjectionStrategy.OPTIONAL)
    private com.adobe.cq.wcm.core.components.models.Image image4;
    @ChildResourceFromRequest(injectionStrategy = InjectionStrategy.OPTIONAL)
    private com.adobe.cq.wcm.core.components.models.Image image5;
    @ChildResourceFromRequest(injectionStrategy = InjectionStrategy.OPTIONAL)
    private com.adobe.cq.wcm.core.components.models.Image image6;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String title1;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String title2;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String title3;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String title4;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String title5;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String title6;
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
    public com.adobe.cq.wcm.core.components.models.Image getImage1() {
        return image1;
    }

    @Override
    public com.adobe.cq.wcm.core.components.models.Image getImage2() {
        return image2;
    }

    @Override
    public com.adobe.cq.wcm.core.components.models.Image getImage3() {
        return image3;
    }

    @Override
    public com.adobe.cq.wcm.core.components.models.Image getImage4() {
        return image4;
    }

    @Override
    public com.adobe.cq.wcm.core.components.models.Image getImage5() {
        return image5;
    }

    @Override
    public com.adobe.cq.wcm.core.components.models.Image getImage6() {
        return image6;
    }

    @Override
    public String getTitle1() {
        return title1;
    }

    @Override
    public String getTitle2() {
        return title2;
    }

    @Override
    public String getTitle3() {
        return title3;
    }

    @Override
    public String getTitle4() {
        return title4;
    }

    @Override
    public String getTitle5() {
        return title5;
    }

    @Override
    public String getTitle6() {
        return title6;
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
