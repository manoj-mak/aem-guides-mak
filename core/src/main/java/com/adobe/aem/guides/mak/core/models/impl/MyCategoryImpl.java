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
import com.adobe.aem.guides.mak.core.models.MyCategory;
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
    MyCategory.class,
    ComponentExporter.class
}, resourceType = "hello-mak/components/content/-y-category")
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class MyCategoryImpl
    implements MyCategory
{

    @SharedValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String globalTextfieldTest;
    @SharedValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String sharedTextfieldTest;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String textareatest1;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String textareatest2;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String textareatest3;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String textareatest4;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String textareatest5;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String textareatest6;
    @ChildResourceFromRequest(injectionStrategy = InjectionStrategy.OPTIONAL)
    private com.adobe.cq.wcm.core.components.models.Image imageTest1;
    @ChildResourceFromRequest(injectionStrategy = InjectionStrategy.OPTIONAL)
    private com.adobe.cq.wcm.core.components.models.Image imageTest2;
    @ChildResourceFromRequest(injectionStrategy = InjectionStrategy.OPTIONAL)
    private com.adobe.cq.wcm.core.components.models.Image imageTest3;
    @ChildResourceFromRequest(injectionStrategy = InjectionStrategy.OPTIONAL)
    private com.adobe.cq.wcm.core.components.models.Image imageTest4;
    @ChildResourceFromRequest(injectionStrategy = InjectionStrategy.OPTIONAL)
    private com.adobe.cq.wcm.core.components.models.Image imageTest5;
    @ChildResourceFromRequest(injectionStrategy = InjectionStrategy.OPTIONAL)
    private com.adobe.cq.wcm.core.components.models.Image imageTest6;
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
    public String getTextareatest1() {
        return textareatest1;
    }

    @Override
    public String getTextareatest2() {
        return textareatest2;
    }

    @Override
    public String getTextareatest3() {
        return textareatest3;
    }

    @Override
    public String getTextareatest4() {
        return textareatest4;
    }

    @Override
    public String getTextareatest5() {
        return textareatest5;
    }

    @Override
    public String getTextareatest6() {
        return textareatest6;
    }

    @Override
    public com.adobe.cq.wcm.core.components.models.Image getImageTest1() {
        return imageTest1;
    }

    @Override
    public com.adobe.cq.wcm.core.components.models.Image getImageTest2() {
        return imageTest2;
    }

    @Override
    public com.adobe.cq.wcm.core.components.models.Image getImageTest3() {
        return imageTest3;
    }

    @Override
    public com.adobe.cq.wcm.core.components.models.Image getImageTest4() {
        return imageTest4;
    }

    @Override
    public com.adobe.cq.wcm.core.components.models.Image getImageTest5() {
        return imageTest5;
    }

    @Override
    public com.adobe.cq.wcm.core.components.models.Image getImageTest6() {
        return imageTest6;
    }

    @Override
    public String getExportedType() {
        return resource.getResourceType();
    }

}
