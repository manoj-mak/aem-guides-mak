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
import com.adobe.aem.guides.mak.core.models.MyVideoarticle;
import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import com.adobe.cq.wcm.core.components.models.Image;
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
    MyVideoarticle.class,
    ComponentExporter.class
}, resourceType = "hello-mak/components/content/my-videoarticle")
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class MyVideoarticleImpl
    implements MyVideoarticle
{

    @SharedValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String globalTextfieldTest;
    @SharedValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String sharedTextfieldTest;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String title;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String description;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String videoLink;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String articleLink;
    @ChildResourceFromRequest(injectionStrategy = InjectionStrategy.OPTIONAL)
    private Image thumbnailImage;
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
    public String getTitle() {
        return title;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getVideoLink() {
        return videoLink;
    }

    @Override
    public String getArticleLink() {
        return articleLink;
    }

    @Override
    public Image getThumbnailImage() {
        return thumbnailImage;
    }

    @Override
    public String getExportedType() {
        return resource.getResourceType();
    }

}
