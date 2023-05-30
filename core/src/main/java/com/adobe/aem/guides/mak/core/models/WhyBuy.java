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
 * Defines the {@code WhyBuy} Sling Model used for the {@code hello-mak/components/content/why-buy} component.
 * 
 */
@ConsumerType
public interface WhyBuy
    extends ComponentExporter
{


    String getGlobalTextfieldTest();

    String getSharedTextfieldTest();

    com.adobe.cq.wcm.core.components.models.Image getIcon1();

    com.adobe.cq.wcm.core.components.models.Image getIcon2();

    com.adobe.cq.wcm.core.components.models.Image getIcon3();

    com.adobe.cq.wcm.core.components.models.Image getIcon4();

    com.adobe.cq.wcm.core.components.models.Image getIcon5();

    com.adobe.cq.wcm.core.components.models.Image getIcon6();

    com.adobe.cq.wcm.core.components.models.Image getIcon7();

    com.adobe.cq.wcm.core.components.models.Image getIcon8();

    String getPoint1();

    String getPoint2();

    String getPoint3();

    String getPoint4();

    String getPoint5();

    String getPoint6();

    String getPoint7();

    String getPoint8();

}
