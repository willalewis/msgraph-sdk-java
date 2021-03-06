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
 * The class for the Base Education Root.
 */
public class BaseEducationRoot extends Entity implements IJsonBackedObject {


    /**
     * The Classes.
     * 
     */
    public EducationClassCollectionPage classes;

    /**
     * The Schools.
     * 
     */
    public EducationSchoolCollectionPage schools;

    /**
     * The Users.
     * 
     */
    public EducationUserCollectionPage users;

    /**
     * The Me.
     * 
     */
    @SerializedName("me")
    @Expose
    public EducationUser me;


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


        if (json.has("classes")) {
            final BaseEducationClassCollectionResponse response = new BaseEducationClassCollectionResponse();
            if (json.has("classes@odata.nextLink")) {
                response.nextLink = json.get("classes@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("classes").toString(), JsonObject[].class);
            final EducationClass[] array = new EducationClass[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), EducationClass.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            classes = new EducationClassCollectionPage(response, null);
        }

        if (json.has("schools")) {
            final BaseEducationSchoolCollectionResponse response = new BaseEducationSchoolCollectionResponse();
            if (json.has("schools@odata.nextLink")) {
                response.nextLink = json.get("schools@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("schools").toString(), JsonObject[].class);
            final EducationSchool[] array = new EducationSchool[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), EducationSchool.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            schools = new EducationSchoolCollectionPage(response, null);
        }

        if (json.has("users")) {
            final BaseEducationUserCollectionResponse response = new BaseEducationUserCollectionResponse();
            if (json.has("users@odata.nextLink")) {
                response.nextLink = json.get("users@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("users").toString(), JsonObject[].class);
            final EducationUser[] array = new EducationUser[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), EducationUser.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            users = new EducationUserCollectionPage(response, null);
        }
    }
}
