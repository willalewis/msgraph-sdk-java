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
 * The class for the Base Terms And Conditions Request Builder.
 */
public class BaseTermsAndConditionsRequestBuilder extends BaseRequestBuilder implements IBaseTermsAndConditionsRequestBuilder {

    /**
     * The request builder for the TermsAndConditions
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseTermsAndConditionsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the ITermsAndConditionsRequest instance
     */
    public ITermsAndConditionsRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ITermsAndConditionsRequest instance
     */
    public ITermsAndConditionsRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new TermsAndConditionsRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public ITermsAndConditionsAssignmentCollectionRequestBuilder assignments() {
        return new TermsAndConditionsAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    public ITermsAndConditionsAssignmentRequestBuilder assignments(final String id) {
        return new TermsAndConditionsAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }
    public ITermsAndConditionsAcceptanceStatusCollectionRequestBuilder acceptanceStatuses() {
        return new TermsAndConditionsAcceptanceStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("acceptanceStatuses"), getClient(), null);
    }

    public ITermsAndConditionsAcceptanceStatusRequestBuilder acceptanceStatuses(final String id) {
        return new TermsAndConditionsAcceptanceStatusRequestBuilder(getRequestUrlWithAdditionalSegment("acceptanceStatuses") + "/" + id, getClient(), null);
    }
}
