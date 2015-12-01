/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import com.microsoft.rest.Validator;
import com.squareup.okhttp.ResponseBody;
import fixtures.bodycomplex.models.ArrayWrapper;
import fixtures.bodycomplex.models.Error;
import java.io.IOException;
import java.lang.IllegalArgumentException;
import retrofit.Call;
import retrofit.Response;
import retrofit.Retrofit;

public class ArrayImpl implements Array {
    private ArrayService service;
    AutoRestComplexTestService client;

    public ArrayImpl(Retrofit retrofit, AutoRestComplexTestService client) {
        this.service = retrofit.create(ArrayService.class);
        this.client = client;
    }

    /**
     * Get complex types with array property
     *
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the ArrayWrapper object if successful.
     */
    public ServiceResponse<ArrayWrapper> getValid() throws ServiceException, IOException {
        Call<ResponseBody> call = service.getValid();
        return getValidDelegate(call.execute(), null);
    }

    /**
     * Get complex types with array property
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getValidAsync(final ServiceCallback<ArrayWrapper> serviceCallback) {
        Call<ResponseBody> call = service.getValid();
        call.enqueue(new ServiceResponseCallback<ArrayWrapper>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getValidDelegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<ArrayWrapper> getValidDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new ServiceResponseBuilder<ArrayWrapper>()
                .register(200, new TypeToken<ArrayWrapper>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Put complex types with array property
     *
     * @param complexBody Please put an array with 4 items: "1, 2, 3, 4", "", null, "&amp;S#$(*Y", "The quick brown fox jumps over the lazy dog"
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     */
    public ServiceResponse<Void> putValid(ArrayWrapper complexBody) throws ServiceException, IOException, IllegalArgumentException {
        if (complexBody == null) {
            throw new IllegalArgumentException("Parameter complexBody is required and cannot be null.");
        }
        Validator.validate(complexBody);
        Call<ResponseBody> call = service.putValid(complexBody);
        return putValidDelegate(call.execute(), null);
    }

    /**
     * Put complex types with array property
     *
     * @param complexBody Please put an array with 4 items: "1, 2, 3, 4", "", null, "&amp;S#$(*Y", "The quick brown fox jumps over the lazy dog"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> putValidAsync(ArrayWrapper complexBody, final ServiceCallback<Void> serviceCallback) {
        if (complexBody == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter complexBody is required and cannot be null."));
            return null;
        }
        Validator.validate(complexBody, serviceCallback);
        Call<ResponseBody> call = service.putValid(complexBody);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(putValidDelegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> putValidDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Get complex types with array property which is empty
     *
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the ArrayWrapper object if successful.
     */
    public ServiceResponse<ArrayWrapper> getEmpty() throws ServiceException, IOException {
        Call<ResponseBody> call = service.getEmpty();
        return getEmptyDelegate(call.execute(), null);
    }

    /**
     * Get complex types with array property which is empty
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getEmptyAsync(final ServiceCallback<ArrayWrapper> serviceCallback) {
        Call<ResponseBody> call = service.getEmpty();
        call.enqueue(new ServiceResponseCallback<ArrayWrapper>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getEmptyDelegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<ArrayWrapper> getEmptyDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new ServiceResponseBuilder<ArrayWrapper>()
                .register(200, new TypeToken<ArrayWrapper>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Put complex types with array property which is empty
     *
     * @param complexBody Please put an empty array
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     */
    public ServiceResponse<Void> putEmpty(ArrayWrapper complexBody) throws ServiceException, IOException, IllegalArgumentException {
        if (complexBody == null) {
            throw new IllegalArgumentException("Parameter complexBody is required and cannot be null.");
        }
        Validator.validate(complexBody);
        Call<ResponseBody> call = service.putEmpty(complexBody);
        return putEmptyDelegate(call.execute(), null);
    }

    /**
     * Put complex types with array property which is empty
     *
     * @param complexBody Please put an empty array
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> putEmptyAsync(ArrayWrapper complexBody, final ServiceCallback<Void> serviceCallback) {
        if (complexBody == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter complexBody is required and cannot be null."));
            return null;
        }
        Validator.validate(complexBody, serviceCallback);
        Call<ResponseBody> call = service.putEmpty(complexBody);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(putEmptyDelegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> putEmptyDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Get complex types with array property while server doesn't provide a response payload
     *
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the ArrayWrapper object if successful.
     */
    public ServiceResponse<ArrayWrapper> getNotProvided() throws ServiceException, IOException {
        Call<ResponseBody> call = service.getNotProvided();
        return getNotProvidedDelegate(call.execute(), null);
    }

    /**
     * Get complex types with array property while server doesn't provide a response payload
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getNotProvidedAsync(final ServiceCallback<ArrayWrapper> serviceCallback) {
        Call<ResponseBody> call = service.getNotProvided();
        call.enqueue(new ServiceResponseCallback<ArrayWrapper>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getNotProvidedDelegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<ArrayWrapper> getNotProvidedDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new ServiceResponseBuilder<ArrayWrapper>()
                .register(200, new TypeToken<ArrayWrapper>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

}
