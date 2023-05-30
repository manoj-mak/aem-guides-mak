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
import com.adobe.aem.guides.mak.core.models.InsurancePlans;
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
    InsurancePlans.class,
    ComponentExporter.class
}, resourceType = "hello-mak/components/content/-nsurance--lans")
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class InsurancePlansImpl
    implements InsurancePlans
{

    @SharedValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String globalTextfieldTest;
    @SharedValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String sharedTextfieldTest;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String planName1;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String planName2;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String planName3;
    @ChildResourceFromRequest(injectionStrategy = InjectionStrategy.OPTIONAL)
    private com.adobe.cq.wcm.core.components.models.Image planImage1;
    @ChildResourceFromRequest(injectionStrategy = InjectionStrategy.OPTIONAL)
    private com.adobe.cq.wcm.core.components.models.Image planImage2;
    @ChildResourceFromRequest(injectionStrategy = InjectionStrategy.OPTIONAL)
    private com.adobe.cq.wcm.core.components.models.Image planImage3;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String plan1Description1;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String plan1Description2;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String plan1Description3;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String plan2Description1;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String plan2Description2;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String plan2Description3;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String plan3Description1;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String plan3Description2;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String plan3Description3;
    @ChildResourceFromRequest(injectionStrategy = InjectionStrategy.OPTIONAL)
    private com.adobe.cq.wcm.core.components.models.Image titleImage1;
    @ChildResourceFromRequest(injectionStrategy = InjectionStrategy.OPTIONAL)
    private com.adobe.cq.wcm.core.components.models.Image titleImage2;
    @ChildResourceFromRequest(injectionStrategy = InjectionStrategy.OPTIONAL)
    private com.adobe.cq.wcm.core.components.models.Image titleImage3;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String titleText1;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String titleText2;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String titleText3;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String subtitleText1;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String subtitleText2;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String subtitleText3;
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
    public String getPlanName1() {
        return planName1;
    }

    @Override
    public String getPlanName2() {
        return planName2;
    }

    @Override
    public String getPlanName3() {
        return planName3;
    }

    @Override
    public com.adobe.cq.wcm.core.components.models.Image getPlanImage1() {
        return planImage1;
    }

    @Override
    public com.adobe.cq.wcm.core.components.models.Image getPlanImage2() {
        return planImage2;
    }

    @Override
    public com.adobe.cq.wcm.core.components.models.Image getPlanImage3() {
        return planImage3;
    }

    @Override
    public String getPlan1Description1() {
        return plan1Description1;
    }

    @Override
    public String getPlan1Description2() {
        return plan1Description2;
    }

    @Override
    public String getPlan1Description3() {
        return plan1Description3;
    }

    @Override
    public String getPlan2Description1() {
        return plan2Description1;
    }

    @Override
    public String getPlan2Description2() {
        return plan2Description2;
    }

    @Override
    public String getPlan2Description3() {
        return plan2Description3;
    }

    @Override
    public String getPlan3Description1() {
        return plan3Description1;
    }

    @Override
    public String getPlan3Description2() {
        return plan3Description2;
    }

    @Override
    public String getPlan3Description3() {
        return plan3Description3;
    }

    @Override
    public com.adobe.cq.wcm.core.components.models.Image getTitleImage1() {
        return titleImage1;
    }

    @Override
    public com.adobe.cq.wcm.core.components.models.Image getTitleImage2() {
        return titleImage2;
    }

    @Override
    public com.adobe.cq.wcm.core.components.models.Image getTitleImage3() {
        return titleImage3;
    }

    @Override
    public String getTitleText1() {
        return titleText1;
    }

    @Override
    public String getTitleText2() {
        return titleText2;
    }

    @Override
    public String getTitleText3() {
        return titleText3;
    }

    @Override
    public String getSubtitleText1() {
        return subtitleText1;
    }

    @Override
    public String getSubtitleText2() {
        return subtitleText2;
    }

    @Override
    public String getSubtitleText3() {
        return subtitleText3;
    }

    @Override
    public String getExportedType() {
        return resource.getResourceType();
    }

}
