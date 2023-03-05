/*
 * FastAPI
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.Detail;
import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.Model;
import org.openapitools.client.model.ModelResponse;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-05T17:05:35.753622+08:00[Asia/Kuala_Lumpur]")
public class ResponseGetmodelsApiModelsGet extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ResponseGetmodelsApiModelsGet.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ResponseGetmodelsApiModelsGet.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ResponseGetmodelsApiModelsGet' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ErrorResponse> adapterErrorResponse = gson.getDelegateAdapter(this, TypeToken.get(ErrorResponse.class));
            final TypeAdapter<ModelResponse> adapterModelResponse = gson.getDelegateAdapter(this, TypeToken.get(ModelResponse.class));

            return (TypeAdapter<T>) new TypeAdapter<ResponseGetmodelsApiModelsGet>() {
                @Override
                public void write(JsonWriter out, ResponseGetmodelsApiModelsGet value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `ErrorResponse`
                    if (value.getActualInstance() instanceof ErrorResponse) {
                        JsonObject obj = adapterErrorResponse.toJsonTree((ErrorResponse)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `ModelResponse`
                    if (value.getActualInstance() instanceof ModelResponse) {
                        JsonObject obj = adapterModelResponse.toJsonTree((ModelResponse)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: ErrorResponse, ModelResponse");
                }

                @Override
                public ResponseGetmodelsApiModelsGet read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    // deserialize ErrorResponse
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ErrorResponse.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'ErrorResponse'");
                        ResponseGetmodelsApiModelsGet ret = new ResponseGetmodelsApiModelsGet();
                        ret.setActualInstance(adapterErrorResponse.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'ErrorResponse'", e);
                    }

                    // deserialize ModelResponse
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ModelResponse.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'ModelResponse'");
                        ResponseGetmodelsApiModelsGet ret = new ResponseGetmodelsApiModelsGet();
                        ret.setActualInstance(adapterModelResponse.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'ModelResponse'", e);
                    }


                    throw new IOException(String.format("Failed deserialization for ResponseGetmodelsApiModelsGet: no class matched. JSON: %s", jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public ResponseGetmodelsApiModelsGet() {
        super("anyOf", Boolean.FALSE);
    }

    public ResponseGetmodelsApiModelsGet(ErrorResponse o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ResponseGetmodelsApiModelsGet(ModelResponse o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ErrorResponse", new GenericType<ErrorResponse>() {
        });
        schemas.put("ModelResponse", new GenericType<ModelResponse>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return ResponseGetmodelsApiModelsGet.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * ErrorResponse, ModelResponse
     *
     * It could be an instance of the 'anyOf' schemas.
     * The anyOf child schemas may themselves be a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof ErrorResponse) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ModelResponse) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ErrorResponse, ModelResponse");
    }

    /**
     * Get the actual instance, which can be the following:
     * ErrorResponse, ModelResponse
     *
     * @return The actual instance (ErrorResponse, ModelResponse)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ErrorResponse`. If the actual instance is not `ErrorResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ErrorResponse`
     * @throws ClassCastException if the instance is not `ErrorResponse`
     */
    public ErrorResponse getErrorResponse() throws ClassCastException {
        return (ErrorResponse)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ModelResponse`. If the actual instance is not `ModelResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ModelResponse`
     * @throws ClassCastException if the instance is not `ModelResponse`
     */
    public ModelResponse getModelResponse() throws ClassCastException {
        return (ModelResponse)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ResponseGetmodelsApiModelsGet
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate anyOf schemas one by one
    int validCount = 0;
    // validate the json string with ErrorResponse
    try {
      ErrorResponse.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with ModelResponse
    try {
      ModelResponse.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    if (validCount == 0) {
      throw new IOException(String.format("The JSON string is invalid for ResponseGetmodelsApiModelsGet with anyOf schemas: ErrorResponse, ModelResponse. JSON: %s", jsonObj.toString()));
    }
  }

 /**
  * Create an instance of ResponseGetmodelsApiModelsGet given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResponseGetmodelsApiModelsGet
  * @throws IOException if the JSON string is invalid with respect to ResponseGetmodelsApiModelsGet
  */
  public static ResponseGetmodelsApiModelsGet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResponseGetmodelsApiModelsGet.class);
  }

 /**
  * Convert an instance of ResponseGetmodelsApiModelsGet to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

