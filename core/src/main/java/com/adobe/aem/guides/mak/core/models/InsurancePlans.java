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
 * Defines the {@code InsurancePlans} Sling Model used for the {@code hello-mak/components/content/-nsurance--lans} component.
 * 
 */
@ConsumerType
public interface InsurancePlans
    extends ComponentExporter
{


    String getGlobalTextfieldTest();

    String getSharedTextfieldTest();

    String getPlanName1();

    String getPlanName2();

    String getPlanName3();

    com.adobe.cq.wcm.core.components.models.Image getPlanImage1();

    com.adobe.cq.wcm.core.components.models.Image getPlanImage2();

    com.adobe.cq.wcm.core.components.models.Image getPlanImage3();

    String getPlan1Description1();

    String getPlan1Description2();

    String getPlan1Description3();

    String getPlan2Description1();

    String getPlan2Description2();

    String getPlan2Description3();

    String getPlan3Description1();

    String getPlan3Description2();

    String getPlan3Description3();

    com.adobe.cq.wcm.core.components.models.Image getTitleImage1();

    com.adobe.cq.wcm.core.components.models.Image getTitleImage2();

    com.adobe.cq.wcm.core.components.models.Image getTitleImage3();

    String getTitleText1();

    String getTitleText2();

    String getTitleText3();

    String getSubtitleText1();

    String getSubtitleText2();

    String getSubtitleText3();

}
