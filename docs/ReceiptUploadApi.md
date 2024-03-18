# ReceiptUploadApi

All URIs are relative to *https://platform.brexapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewReceipt**](ReceiptUploadApi.md#createNewReceipt) | **POST** /v1/expenses/card/{expense_id}/receipt_upload | Create a new receipt upload |


<a name="createNewReceipt"></a>
# **createNewReceipt**
> CreateAsyncFileUploadResponse createNewReceipt(expenseId, receiptUploadRequest).execute();

Create a new receipt upload

 The &#x60;uri&#x60; will be a pre-signed S3 URL allowing you to upload the receipt securely. This URL can only be used for a &#x60;PUT&#x60; operation and expires 30 minutes after its creation. Once your upload is complete, we will try to match the receipt with existing expenses.  Refer to these [docs](https://docs.aws.amazon.com/AmazonS3/latest/dev/PresignedUrlUploadObject.html) on how to upload to this pre-signed S3 URL. We highly recommend using one of AWS SDKs if they&#39;re available for your language to upload these files. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexExpenses;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReceiptUploadApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://platform.brexapis.com";
    
    // Configure OAuth2 access token for authorization: OAuth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    BrexExpenses client = new BrexExpenses(configuration);
    String receiptName = "receiptName_example"; // The name of the receipt (with the file extension).
    String expenseId = "expenseId_example";
    try {
      CreateAsyncFileUploadResponse result = client
              .receiptUpload
              .createNewReceipt(receiptName, expenseId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getUri());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceiptUploadApi#createNewReceipt");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateAsyncFileUploadResponse> response = client
              .receiptUpload
              .createNewReceipt(receiptName, expenseId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceiptUploadApi#createNewReceipt");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **expenseId** | **String**|  | |
| **receiptUploadRequest** | [**ReceiptUploadRequest**](ReceiptUploadRequest.md)|  | |

### Return type

[**CreateAsyncFileUploadResponse**](CreateAsyncFileUploadResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | receiptUpload 200 response |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

