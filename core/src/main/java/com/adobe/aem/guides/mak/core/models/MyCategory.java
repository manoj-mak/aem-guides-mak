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
 * Defines the {@code MyCategory} Sling Model used for the {@code hello-mak/components/content/-y-category} component.
 * 
 */
@ConsumerType
public interface MyCategory
    extends ComponentExporter
{


    String getGlobalTextfieldTest();

    String getSharedTextfieldTest();

    String getTextareatest1();

    String getTextareatest2();

    String getTextareatest3();

    String getTextareatest4();

    String getTextareatest5();

    String getTextareatest6();

    com.adobe.cq.wcm.core.components.models.Image getImageTest1();

    com.adobe.cq.wcm.core.components.models.Image getImageTest2();

    com.adobe.cq.wcm.core.components.models.Image getImageTest3();

    com.adobe.cq.wcm.core.components.models.Image getImageTest4();

    com.adobe.cq.wcm.core.components.models.Image getImageTest5();

    com.adobe.cq.wcm.core.components.models.Image getImageTest6();

}
