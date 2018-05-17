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
 * The interface for the Base Role Definition With Reference Request.
 */
public interface IBaseRoleDefinitionWithReferenceRequest extends IHttpRequest {

    void post(final RoleDefinition newRoleDefinition, final IJsonBackedObject payload, final ICallback<RoleDefinition> callback);

    RoleDefinition post(final RoleDefinition newRoleDefinition, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<RoleDefinition> callback);

    RoleDefinition get() throws ClientException;

	void delete(final ICallback<RoleDefinition> callback);

	void delete() throws ClientException;

	void patch(final RoleDefinition sourceRoleDefinition, final ICallback<RoleDefinition> callback);

	RoleDefinition patch(final RoleDefinition sourceRoleDefinition) throws ClientException;

    IBaseRoleDefinitionWithReferenceRequest select(final String value);

    IBaseRoleDefinitionWithReferenceRequest expand(final String value);

}
