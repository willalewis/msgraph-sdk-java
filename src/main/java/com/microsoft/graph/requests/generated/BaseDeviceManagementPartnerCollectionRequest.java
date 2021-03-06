// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
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
 * The class for the Base Device Management Partner Collection Request.
 */
public class BaseDeviceManagementPartnerCollectionRequest extends BaseCollectionRequest<BaseDeviceManagementPartnerCollectionResponse, IDeviceManagementPartnerCollectionPage> implements IBaseDeviceManagementPartnerCollectionRequest {

    /**
     * The request builder for this collection of DeviceManagementPartner
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseDeviceManagementPartnerCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseDeviceManagementPartnerCollectionResponse.class, IDeviceManagementPartnerCollectionPage.class);
    }

    public void get(final ICallback<IDeviceManagementPartnerCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IDeviceManagementPartnerCollectionPage get() throws ClientException {
        final BaseDeviceManagementPartnerCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DeviceManagementPartner newDeviceManagementPartner, final ICallback<DeviceManagementPartner> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DeviceManagementPartnerRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDeviceManagementPartner, callback);
    }

    public DeviceManagementPartner post(final DeviceManagementPartner newDeviceManagementPartner) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceManagementPartnerRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDeviceManagementPartner);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceManagementPartnerCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (DeviceManagementPartnerCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceManagementPartnerCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (DeviceManagementPartnerCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDeviceManagementPartnerCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (DeviceManagementPartnerCollectionRequest)this;
    }

    public IDeviceManagementPartnerCollectionPage buildFromResponse(final BaseDeviceManagementPartnerCollectionResponse response) {
        final IDeviceManagementPartnerCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DeviceManagementPartnerCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DeviceManagementPartnerCollectionPage page = new DeviceManagementPartnerCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
