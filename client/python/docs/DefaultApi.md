# openapi_client.DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_models_api_models_get**](DefaultApi.md#get_models_api_models_get) | **GET** /api/models | Getmodels


# **get_models_api_models_get**
> AnyOfErrorResponseModelResponse get_models_api_models_get()

Getmodels

### Example

* Api Key Authentication (APIKeyHeader):
```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: APIKeyHeader
configuration = openapi_client.Configuration(
    host = "http://localhost",
    api_key = {
        'token': 'YOUR_API_KEY'
    }
)
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    
    try:
        # Getmodels
        api_response = api_instance.get_models_api_models_get()
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling DefaultApi->get_models_api_models_get: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AnyOfErrorResponseModelResponse**](AnyOfErrorResponseModelResponse.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

