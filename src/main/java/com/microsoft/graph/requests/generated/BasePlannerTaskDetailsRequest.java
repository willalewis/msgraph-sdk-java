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
 * The class for the Base Planner Task Details Request.
 */
public class BasePlannerTaskDetailsRequest extends BaseRequest implements IBasePlannerTaskDetailsRequest {

    /**
     * The request for the PlannerTaskDetails
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BasePlannerTaskDetailsRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<PlannerTaskDetails> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the PlannerTaskDetails from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<PlannerTaskDetails> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PlannerTaskDetails from the service
     *
     * @return the PlannerTaskDetails from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerTaskDetails get() throws ClientException {
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
     * Patches this PlannerTaskDetails with a source
     *
     * @param sourcePlannerTaskDetails the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final PlannerTaskDetails sourcePlannerTaskDetails, final ICallback<PlannerTaskDetails> callback) {
        send(HttpMethod.PATCH, callback, sourcePlannerTaskDetails);
    }

    /**
     * Patches this PlannerTaskDetails with a source
     *
     * @param sourcePlannerTaskDetails the source object with updates
     * @return the updated PlannerTaskDetails
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerTaskDetails patch(final PlannerTaskDetails sourcePlannerTaskDetails) throws ClientException {
        return send(HttpMethod.PATCH, sourcePlannerTaskDetails);
    }

    /**
     * Creates a PlannerTaskDetails with a new object
     *
     * @param newPlannerTaskDetails the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final PlannerTaskDetails newPlannerTaskDetails, final ICallback<PlannerTaskDetails> callback) {
        send(HttpMethod.POST, callback, newPlannerTaskDetails);
    }

    /**
     * Creates a PlannerTaskDetails with a new object
     *
     * @param newPlannerTaskDetails the new object to create
     * @return the created PlannerTaskDetails
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerTaskDetails post(final PlannerTaskDetails newPlannerTaskDetails) throws ClientException {
        return send(HttpMethod.POST, newPlannerTaskDetails);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPlannerTaskDetailsRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (PlannerTaskDetailsRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPlannerTaskDetailsRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (PlannerTaskDetailsRequest)this;
     }

}

