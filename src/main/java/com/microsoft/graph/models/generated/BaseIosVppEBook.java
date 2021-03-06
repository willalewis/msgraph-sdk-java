// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;

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

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Ios Vpp EBook.
 */
public class BaseIosVppEBook extends ManagedEBook implements IJsonBackedObject {


    /**
     * The Vpp Token Id.
     * The Vpp token ID.
     */
    @SerializedName("vppTokenId")
    @Expose
    public java.util.UUID vppTokenId;

    /**
     * The Apple Id.
     * The Apple ID associated with Vpp token.
     */
    @SerializedName("appleId")
    @Expose
    public String appleId;

    /**
     * The Vpp Organization Name.
     * The Vpp token's organization name.
     */
    @SerializedName("vppOrganizationName")
    @Expose
    public String vppOrganizationName;

    /**
     * The Genres.
     * Genres.
     */
    @SerializedName("genres")
    @Expose
    public java.util.List<String> genres;

    /**
     * The Language.
     * Language.
     */
    @SerializedName("language")
    @Expose
    public String language;

    /**
     * The Seller.
     * Seller.
     */
    @SerializedName("seller")
    @Expose
    public String seller;

    /**
     * The Total License Count.
     * Total license count.
     */
    @SerializedName("totalLicenseCount")
    @Expose
    public Integer totalLicenseCount;

    /**
     * The Used License Count.
     * Used license count.
     */
    @SerializedName("usedLicenseCount")
    @Expose
    public Integer usedLicenseCount;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
