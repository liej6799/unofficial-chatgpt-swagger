# Detail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Message** | **string** |  | 
**Type** | **string** |  | 
**Param** | Pointer to **interface{}** |  | [optional] 
**Code** | **string** |  | 

## Methods

### NewDetail

`func NewDetail(message string, type_ string, code string, ) *Detail`

NewDetail instantiates a new Detail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewDetailWithDefaults

`func NewDetailWithDefaults() *Detail`

NewDetailWithDefaults instantiates a new Detail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMessage

`func (o *Detail) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *Detail) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *Detail) SetMessage(v string)`

SetMessage sets Message field to given value.


### GetType

`func (o *Detail) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *Detail) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *Detail) SetType(v string)`

SetType sets Type field to given value.


### GetParam

`func (o *Detail) GetParam() interface{}`

GetParam returns the Param field if non-nil, zero value otherwise.

### GetParamOk

`func (o *Detail) GetParamOk() (*interface{}, bool)`

GetParamOk returns a tuple with the Param field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParam

`func (o *Detail) SetParam(v interface{})`

SetParam sets Param field to given value.

### HasParam

`func (o *Detail) HasParam() bool`

HasParam returns a boolean if a field has been set.

### SetParamNil

`func (o *Detail) SetParamNil(b bool)`

 SetParamNil sets the value for Param to be an explicit nil

### UnsetParam
`func (o *Detail) UnsetParam()`

UnsetParam ensures that no value is present for Param, not even an explicit nil
### GetCode

`func (o *Detail) GetCode() string`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *Detail) GetCodeOk() (*string, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *Detail) SetCode(v string)`

SetCode sets Code field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


