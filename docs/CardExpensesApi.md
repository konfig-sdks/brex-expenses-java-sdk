# CardExpensesApi

All URIs are relative to *https://platform.brexapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getById**](CardExpensesApi.md#getById) | **GET** /v1/expenses/card/{expense_id} | Get an expense |
| [**list**](CardExpensesApi.md#list) | **GET** /v1/expenses/card | List expenses |
| [**updateExpense**](CardExpensesApi.md#updateExpense) | **PUT** /v1/expenses/card/{expense_id} | Update an expense |


<a name="getById"></a>
# **getById**
> ExpandableExpense getById(expenseId).expand(expand).execute();

Get an expense

Get an expense by its ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexExpenses;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardExpensesApi;
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
    String expenseId = "expenseId_example";
    List<String> expand = Arrays.asList(); // Get additional details for the expense, e.g. merchant mcc code, by passing in `expand[]=merchant`. Query parameters include `location`, `department`, `merchant`, `receipts.download_uris`, `user`, `budget` and `payment`.
    try {
      ExpandableExpense result = client
              .cardExpenses
              .getById(expenseId)
              .expand(expand)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getMemo());
      System.out.println(result.getLocationId());
      System.out.println(result.getLocation());
      System.out.println(result.getDepartmentId());
      System.out.println(result.getDepartment());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getCategory());
      System.out.println(result.getMerchantId());
      System.out.println(result.getMerchant());
      System.out.println(result.getReceipts());
      System.out.println(result.getBudgetId());
      System.out.println(result.getBudget());
      System.out.println(result.getOriginalAmount());
      System.out.println(result.getPurchasedAt());
      System.out.println(result.getStatus());
      System.out.println(result.getPaymentStatus());
      System.out.println(result.getUserId());
      System.out.println(result.getUser());
      System.out.println(result.getPayment());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardExpensesApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExpandableExpense> response = client
              .cardExpenses
              .getById(expenseId)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardExpensesApi#getById");
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
| **expand** | [**List&lt;String&gt;**](String.md)| Get additional details for the expense, e.g. merchant mcc code, by passing in &#x60;expand[]&#x3D;merchant&#x60;. Query parameters include &#x60;location&#x60;, &#x60;department&#x60;, &#x60;merchant&#x60;, &#x60;receipts.download_uris&#x60;, &#x60;user&#x60;, &#x60;budget&#x60; and &#x60;payment&#x60;. | [optional] |

### Return type

[**ExpandableExpense**](ExpandableExpense.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | getExpense 200 response |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="list"></a>
# **list**
> PageExpandableExpense list().expand(expand).userId(userId).parentExpenseId(parentExpenseId).budgetId(budgetId).status(status).paymentStatus(paymentStatus).purchasedAtStart(purchasedAtStart).purchasedAtEnd(purchasedAtEnd).cursor(cursor).limit(limit).execute();

List expenses

List expenses under the same account. Admin and bookkeeper have access to any expense, and regular users can only access their own.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexExpenses;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardExpensesApi;
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
    List<String> expand = Arrays.asList(); // Get additional details for the expense, e.g. merchant mcc code, by passing in `expand[]=merchant`. Query parameters include `location`, `department`, `merchant`, `receipts.download_uris`, `user`, `budget` and `payment`.
    List<String> userId = Arrays.asList(); // Get expenses belong to provided user(s).
    List<String> parentExpenseId = Arrays.asList(); // Get itemized expenses belong to provided parent expenses ID(s).
    List<String> budgetId = Arrays.asList();
    List<ExpenseStatus> status = Arrays.asList();
    List<ExpensePaymentStatus> paymentStatus = Arrays.asList();
    OffsetDateTime purchasedAtStart = OffsetDateTime.parse("
2023-01-01T23:59:59.999
"); //  Shows only expenses with a `purchased_at` on or after this date-time. This parameter is the date-time notation as defined by [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6), e.g. 2022-11-12T23:59:59.999 
    OffsetDateTime purchasedAtEnd = OffsetDateTime.parse("
2023-01-10T23:59:59.999
"); //  Shows only expenses with a `purchased_at` on or before this date-time. This parameter is the date-time notation as defined by [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6), e.g. 2022-11-12T23:59:59.999 
    String cursor = "cursor_example"; //  The cursor to use for pagination. This is the `next_cursor` value returned from the previous response. 
    Integer limit = 56;
    try {
      PageExpandableExpense result = client
              .cardExpenses
              .list()
              .expand(expand)
              .userId(userId)
              .parentExpenseId(parentExpenseId)
              .budgetId(budgetId)
              .status(status)
              .paymentStatus(paymentStatus)
              .purchasedAtStart(purchasedAtStart)
              .purchasedAtEnd(purchasedAtEnd)
              .cursor(cursor)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextCursor());
      System.out.println(result.getItems());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardExpensesApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PageExpandableExpense> response = client
              .cardExpenses
              .list()
              .expand(expand)
              .userId(userId)
              .parentExpenseId(parentExpenseId)
              .budgetId(budgetId)
              .status(status)
              .paymentStatus(paymentStatus)
              .purchasedAtStart(purchasedAtStart)
              .purchasedAtEnd(purchasedAtEnd)
              .cursor(cursor)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardExpensesApi#list");
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
| **expand** | [**List&lt;String&gt;**](String.md)| Get additional details for the expense, e.g. merchant mcc code, by passing in &#x60;expand[]&#x3D;merchant&#x60;. Query parameters include &#x60;location&#x60;, &#x60;department&#x60;, &#x60;merchant&#x60;, &#x60;receipts.download_uris&#x60;, &#x60;user&#x60;, &#x60;budget&#x60; and &#x60;payment&#x60;. | [optional] |
| **userId** | [**List&lt;String&gt;**](String.md)| Get expenses belong to provided user(s). | [optional] |
| **parentExpenseId** | [**List&lt;String&gt;**](String.md)| Get itemized expenses belong to provided parent expenses ID(s). | [optional] |
| **budgetId** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **status** | [**List&lt;ExpenseStatus&gt;**](ExpenseStatus.md)|  | [optional] |
| **paymentStatus** | [**List&lt;ExpensePaymentStatus&gt;**](ExpensePaymentStatus.md)|  | [optional] |
| **purchasedAtStart** | **OffsetDateTime**|  Shows only expenses with a &#x60;purchased_at&#x60; on or after this date-time. This parameter is the date-time notation as defined by [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6), e.g. 2022-11-12T23:59:59.999  | [optional] |
| **purchasedAtEnd** | **OffsetDateTime**|  Shows only expenses with a &#x60;purchased_at&#x60; on or before this date-time. This parameter is the date-time notation as defined by [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6), e.g. 2022-11-12T23:59:59.999  | [optional] |
| **cursor** | **String**|  The cursor to use for pagination. This is the &#x60;next_cursor&#x60; value returned from the previous response.  | [optional] |
| **limit** | **Integer**|  | [optional] |

### Return type

[**PageExpandableExpense**](PageExpandableExpense.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | listExpenses 200 response |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="updateExpense"></a>
# **updateExpense**
> Expense updateExpense(expenseId, updateExpenseRequest).execute();

Update an expense

Update an expense. Admin and bookkeeper have access to any expense, and regular users can only access their own.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexExpenses;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardExpensesApi;
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
    String expenseId = "expenseId_example";
    String memo = "memo_example"; // Expense memo.
    try {
      Expense result = client
              .cardExpenses
              .updateExpense(expenseId)
              .memo(memo)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getMemo());
      System.out.println(result.getLocationId());
      System.out.println(result.getDepartmentId());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getCategory());
      System.out.println(result.getMerchantId());
      System.out.println(result.getBudgetId());
      System.out.println(result.getOriginalAmount());
      System.out.println(result.getPurchasedAt());
      System.out.println(result.getStatus());
      System.out.println(result.getPaymentStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardExpensesApi#updateExpense");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Expense> response = client
              .cardExpenses
              .updateExpense(expenseId)
              .memo(memo)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardExpensesApi#updateExpense");
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
| **updateExpenseRequest** | [**UpdateExpenseRequest**](UpdateExpenseRequest.md)|  | |

### Return type

[**Expense**](Expense.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | updateExpense 200 response |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

