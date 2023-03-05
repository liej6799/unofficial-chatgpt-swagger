# \DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetModelsApiModelsGet**](DefaultApi.md#GetModelsApiModelsGet) | **Get** /api/models | Getmodels



## GetModelsApiModelsGet

> ResponseGetmodelsApiModelsGet GetModelsApiModelsGet(ctx).Execute()

Getmodels

### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DefaultApi.GetModelsApiModelsGet(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DefaultApi.GetModelsApiModelsGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetModelsApiModelsGet`: ResponseGetmodelsApiModelsGet
    fmt.Fprintf(os.Stdout, "Response from `DefaultApi.GetModelsApiModelsGet`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGetModelsApiModelsGetRequest struct via the builder pattern


### Return type

[**ResponseGetmodelsApiModelsGet**](ResponseGetmodelsApiModelsGet.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

