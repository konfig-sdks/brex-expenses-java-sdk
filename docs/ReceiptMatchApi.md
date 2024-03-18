# ReceiptMatchApi

All URIs are relative to *https://platform.brexapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewReceiptMatch**](ReceiptMatchApi.md#createNewReceiptMatch) | **POST** /v1/expenses/card/receipt_match | Create a new receipt match |


<a name="createNewReceiptMatch"></a>
# **createNewReceiptMatch**
> CreateAsyncFileUploadResponse createNewReceiptMatch(receiptMatchRequest).execute();

Create a new receipt match

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
import com.konfigthis.client.api.ReceiptMatchApi;
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
    String receiptName = "receiptName_example"; // The name of the receipt (with the file extension). It will be used in the matching result email.
    try {
      CreateAsyncFileUploadResponse result = client
              .receiptMatch
              .createNewReceiptMatch(receiptName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getUri());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceiptMatchApi#createNewReceiptMatch");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateAsyncFileUploadResponse> response = client
              .receiptMatch
              .createNewReceiptMatch(receiptName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReceiptMatchApi#createNewReceiptMatch");
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
| **receiptMatchRequest** | [**ReceiptMatchRequest**](ReceiptMatchRequest.md)|  | |

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
| **200** | receiptMatch 200 response |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |

