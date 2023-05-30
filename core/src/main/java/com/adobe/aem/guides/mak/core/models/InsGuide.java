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

package com.adobe.aem.guides.mak.core.models;

import com.adobe.cq.export.json.ComponentExporter;
import org.osgi.annotation.versioning.ConsumerType;


/**
 * Defines the {@code InsGuide} Sling Model used for the {@code hello-mak/components/content/ins-guide} component.
 * 
 */
@ConsumerType
public interface InsGuide
    extends ComponentExporter
{


    String getGlobalTextfieldTest();

    String getSharedTextfieldTest();

    com.adobe.cq.wcm.core.components.models.Image getImage1();

    com.adobe.cq.wcm.core.components.models.Image getImage2();

    com.adobe.cq.wcm.core.components.models.Image getImage3();

    com.adobe.cq.wcm.core.components.models.Image getImage4();

    com.adobe.cq.wcm.core.components.models.Image getImage5();

    com.adobe.cq.wcm.core.components.models.Image getImage6();

    String getTitle1();

    String getTitle2();

    String getTitle3();

    String getTitle4();

    String getTitle5();

    String getTitle6();

    String getDescription1();

    String getDescription2();

    String getDescription3();

    String getDescription4();

    String getDescription5();

    String getDescription6();

}
