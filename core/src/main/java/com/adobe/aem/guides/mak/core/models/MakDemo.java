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

import java.util.Calendar;
import java.util.List;
import com.adobe.cq.wcm.core.components.models.Image;
import org.osgi.annotation.versioning.ConsumerType;


/**
 * Defines the {@code MakDemo} Sling Model used for the {@code hello-mak/components/content/mak-demo} component.
 * 
 */
@ConsumerType
public interface MakDemo {


    String getGlobalTextfieldTest();

    String getSharedTextfieldTest();

    /**
     * Returns a text value tooltip used somewhere in the component
     * 
     * @return String
     * 
     */
    String getTextfieldTest();

    Boolean getCheckTest();

    String getPathfieldTest();

    String getPagefieldTest();

    List<String> getTagfieldTest();

    String getTextareaTest();

    Calendar getDateTest();

    String getSelectTest();

    String getRadioTest();

    String getHiddenTest();

    Long getNumberfieldTest();

    Image getImageTest();

    List<String> getColors();

    List<DemoLink> getLinks();

}
