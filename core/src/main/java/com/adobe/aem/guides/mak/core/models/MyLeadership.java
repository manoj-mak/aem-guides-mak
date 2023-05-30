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
 * Defines the {@code MyLeadership} Sling Model used for the {@code hello-mak/components/content/my-leadership} component.
 * 
 */
@ConsumerType
public interface MyLeadership
    extends ComponentExporter
{


    String getGlobalTextfieldTest();

    String getSharedTextfieldTest();

    com.adobe.cq.wcm.core.components.models.Image getProfile1();

    com.adobe.cq.wcm.core.components.models.Image getProfile2();

    com.adobe.cq.wcm.core.components.models.Image getProfile3();

    com.adobe.cq.wcm.core.components.models.Image getProfile4();

    com.adobe.cq.wcm.core.components.models.Image getProfile5();

    com.adobe.cq.wcm.core.components.models.Image getProfile6();

    String getName1();

    String getName2();

    String getName3();

    String getName4();

    String getName5();

    String getName6();

    String getDesignation1();

    String getDesignation2();

    String getDesignation3();

    String getDesignation4();

    String getDesignation5();

    String getDesignation6();

    String getDescription1();

    String getDescription2();

    String getDescription3();

    String getDescription4();

    String getDescription5();

    String getDescription6();

}
