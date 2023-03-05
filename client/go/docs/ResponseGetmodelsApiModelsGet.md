# ResponseGetmodelsApiModelsGet

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Detail** | [**Detail**](Detail.md) |  | 
**Models** | Pointer to [**[]Model**](Model.md) |  | [optional] 

## Methods

### NewResponseGetmodelsApiModelsGet

`func NewResponseGetmodelsApiModelsGet(detail Detail, ) *ResponseGetmodelsApiModelsGet`

NewResponseGetmodelsApiModelsGet instantiates a new ResponseGetmodelsApiModelsGet object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewResponseGetmodelsApiModelsGetWithDefaults

`func NewResponseGetmodelsApiModelsGetWithDefaults() *ResponseGetmodelsApiModelsGet`

NewResponseGetmodelsApiModelsGetWithDefaults instantiates a new ResponseGetmodelsApiModelsGet object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDetail

`func (o *ResponseGetmodelsApiModelsGet) GetDetail() Detail`

GetDetail returns the Detail field if non-nil, zero value otherwise.

### GetDetailOk

`func (o *ResponseGetmodelsApiModelsGet) GetDetailOk() (*Detail, bool)`

GetDetailOk returns a tuple with the Detail field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDetail

`func (o *ResponseGetmodelsApiModelsGet) SetDetail(v Detail)`

SetDetail sets Detail field to given value.


### GetModels

`func (o *ResponseGetmodelsApiModelsGet) GetModels() []Model`

GetModels returns the Models field if non-nil, zero value otherwise.

### GetModelsOk

`func (o *ResponseGetmodelsApiModelsGet) GetModelsOk() (*[]Model, bool)`

GetModelsOk returns a tuple with the Models field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModels

`func (o *ResponseGetmodelsApiModelsGet) SetModels(v []Model)`

SetModels sets Models field to given value.

### HasModels

`func (o *ResponseGetmodelsApiModelsGet) HasModels() bool`

HasModels returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


