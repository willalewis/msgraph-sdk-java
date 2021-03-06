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
 * The class for the Base Device Compliance Policy Setting State Summary Request.
 */
public class BaseDeviceCompliancePolicySettingStateSummaryRequest extends BaseRequest implements IBaseDeviceCompliancePolicySettingStateSummaryRequest {

    /**
     * The request for the DeviceCompliancePolicySettingStateSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseDeviceCompliancePolicySettingStateSummaryRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<DeviceCompliancePolicySettingStateSummary> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the DeviceCompliancePolicySettingStateSummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DeviceCompliancePolicySettingStateSummary> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceCompliancePolicySettingStateSummary from the service
     *
     * @return the DeviceCompliancePolicySettingStateSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceCompliancePolicySettingStateSummary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this DeviceCompliancePolicySettingStateSummary with a source
     *
     * @param sourceDeviceCompliancePolicySettingStateSummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceCompliancePolicySettingStateSummary sourceDeviceCompliancePolicySettingStateSummary, final ICallback<DeviceCompliancePolicySettingStateSummary> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceCompliancePolicySettingStateSummary);
    }

    /**
     * Patches this DeviceCompliancePolicySettingStateSummary with a source
     *
     * @param sourceDeviceCompliancePolicySettingStateSummary the source object with updates
     * @return the updated DeviceCompliancePolicySettingStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceCompliancePolicySettingStateSummary patch(final DeviceCompliancePolicySettingStateSummary sourceDeviceCompliancePolicySettingStateSummary) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceCompliancePolicySettingStateSummary);
    }

    /**
     * Creates a DeviceCompliancePolicySettingStateSummary with a new object
     *
     * @param newDeviceCompliancePolicySettingStateSummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceCompliancePolicySettingStateSummary newDeviceCompliancePolicySettingStateSummary, final ICallback<DeviceCompliancePolicySettingStateSummary> callback) {
        send(HttpMethod.POST, callback, newDeviceCompliancePolicySettingStateSummary);
    }

    /**
     * Creates a DeviceCompliancePolicySettingStateSummary with a new object
     *
     * @param newDeviceCompliancePolicySettingStateSummary the new object to create
     * @return the created DeviceCompliancePolicySettingStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceCompliancePolicySettingStateSummary post(final DeviceCompliancePolicySettingStateSummary newDeviceCompliancePolicySettingStateSummary) throws ClientException {
        return send(HttpMethod.POST, newDeviceCompliancePolicySettingStateSummary);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceCompliancePolicySettingStateSummaryRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (DeviceCompliancePolicySettingStateSummaryRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceCompliancePolicySettingStateSummaryRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (DeviceCompliancePolicySettingStateSummaryRequest)this;
     }

}

