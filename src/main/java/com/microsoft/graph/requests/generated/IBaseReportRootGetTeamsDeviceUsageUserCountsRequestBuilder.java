// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Report Root Get Teams Device Usage User Counts Request Builder.
 */
public interface IBaseReportRootGetTeamsDeviceUsageUserCountsRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IReportRootGetTeamsDeviceUsageUserCountsRequest
     *
     * @return the IReportRootGetTeamsDeviceUsageUserCountsRequest instance
     */
    IReportRootGetTeamsDeviceUsageUserCountsRequest buildRequest();

    /**
     * Creates the IReportRootGetTeamsDeviceUsageUserCountsRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetTeamsDeviceUsageUserCountsRequest instance
     */
    IReportRootGetTeamsDeviceUsageUserCountsRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
