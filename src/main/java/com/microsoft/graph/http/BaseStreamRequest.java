// ------------------------------------------------------------------------------
// Copyright (c) 2017 Microsoft Corporation
// 
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sub-license, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
// 
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
// 
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// THE SOFTWARE.
// ------------------------------------------------------------------------------

package com.microsoft.graph.http;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.HeaderOption;
import com.microsoft.graph.options.Option;

import java.io.InputStream;
import java.net.URL;
import java.util.List;

/**
 * A request for a binary stream
 *
 * @param <T> the class of the response type
 */
public abstract class BaseStreamRequest<T> implements IHttpStreamRequest {

    /**
     * The base request for this collection request
     */
    private final BaseRequest baseRequest;

    /**
     * Creates the stream request.
     *
     * @param requestUrl    the URL to make the request against
     * @param client        the client which can issue the request
     * @param options       the options for this request
     * @param responseClass the class for the response
     */
    public BaseStreamRequest(final String requestUrl,
                             final IBaseClient client,
                             final List<? extends Option> options,
                             final Class<T> responseClass) {
        baseRequest = new BaseRequest(requestUrl, client, options, responseClass) {
        };
    }

    /**
     * Sends this request
     *
     * @param callback the callback when this request complements. The caller needs to close the stream
     */
    protected void send(final ICallback<InputStream> callback) {
        baseRequest.setHttpMethod(HttpMethod.GET);
        baseRequest.getClient().getHttpProvider().send(this, callback, InputStream.class, null);
    }

    /**
     * Sends this request
     *
     * @return the stream that the caller needs to close
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    protected InputStream send() throws ClientException {
        baseRequest.setHttpMethod(HttpMethod.GET);
        return baseRequest.getClient().getHttpProvider().send(this, InputStream.class, null);
    }

    /**
     * Sends this request
     *
     * @param fileContents the file to upload
     * @param callback     the callback when this request complements. The caller needs to close the stream
     */
    @SuppressWarnings("unchecked")
    protected void send(final byte[] fileContents, final ICallback<T> callback) {
        baseRequest.setHttpMethod(HttpMethod.PUT);
        baseRequest.getClient().getHttpProvider().send(this, callback, (Class<T>) baseRequest.getResponseType(), fileContents);
    }

    /**
     * Sends this request
     *
     * @param fileContents the content of the file to upload
     * @return             the result from the request
     */
    @SuppressWarnings("unchecked")
    protected T send(final byte[] fileContents) {
        baseRequest.setHttpMethod(HttpMethod.PUT);
        return (T) baseRequest.getClient().getHttpProvider().send(this, baseRequest.getResponseType(), fileContents);
    }

    /**
     * Sends this request
     *
     * @param contentStream a stream to supply the contents of the file to upload
     * @param contentLength the length of the content supplied by the stream
     * @param callback      the callback to be called when the request completes
     */
    @SuppressWarnings("unchecked")
    protected void send(final InputStream contentStream, int contentLength, final ICallback<T> callback) {
        baseRequest.setHttpMethod(HttpMethod.PUT);
        baseRequest.getClient().getHttpProvider().send(this, callback, (Class<T>) baseRequest.getResponseType(),
                new InputStreamBody(contentStream,contentLength));
    }

    /**
     * Sends this request
     *
     * @param contentStream a stream to supply the contents of the file to upload
     * @param contentLength the length of the content supplied by the stream
     * @return              the result from the request
     */
    @SuppressWarnings("unchecked")
    protected T send(final InputStream contentStream, int contentLength) {
        baseRequest.setHttpMethod(HttpMethod.PUT);
        return (T) baseRequest.getClient().getHttpProvider().send(this, baseRequest.getResponseType(),
                new InputStreamBody(contentStream,contentLength));
    }

    /**
     * Gets the request URL
     *
     * @return the request URL
     */
    @Override
    public URL getRequestUrl() {
        return baseRequest.getRequestUrl();
    }

    /**
     * Gets the HTTP method
     *
     * @return the HTTP method
     */
    @Override
    public HttpMethod getHttpMethod() {
        return baseRequest.getHttpMethod();
    }

    /**
     * Adds a header to this request
     *
     * @param header the name of the header
     * @param value  the value of the header
     */
    @Override
    public void addHeader(final String header, final String value) {
        baseRequest.addHeader(header, value);
    }

    /**
     * Sets useCaches parameter to cache the response
     *
     * @param useCaches the value of useCaches
     */
    @Override
    public void setUseCaches(boolean useCaches) {
        baseRequest.setUseCaches(useCaches);
    }

    /**
     * Gets useCaches parameter
     *
     * @return the value of useCaches
     */
    @Override
    public boolean getUseCaches() {
        return baseRequest.getUseCaches();
    }

    /**
     * Gets the headers
     *
     * @return the headers
     */
    @Override
    public List<HeaderOption> getHeaders() {
        return baseRequest.getHeaders();
    }

    /**
     * Gets the query options for this request
     *
     * @return the query options for this request
     */
    @Override
    public List<Option> getOptions() {
        return baseRequest.getOptions();
    }
}
