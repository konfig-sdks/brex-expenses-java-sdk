<div align="left">

[![Visit Brex](./header.png)](https://brex.com)

# [Brex](https://brex.com)


The Expenses API allows you to manage accounting and expenses information.


</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Brex&serviceName=Expenses&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>brex-expenses-java-sdk</artifactId>
  <version>0.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:brex-expenses-java-sdk:0.1"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/brex-expenses-java-sdk-0.1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://platform.brexapis.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CardExpensesApi* | [**getById**](docs/CardExpensesApi.md#getById) | **GET** /v1/expenses/card/{expense_id} | Get an expense
*CardExpensesApi* | [**list**](docs/CardExpensesApi.md#list) | **GET** /v1/expenses/card | List expenses
*CardExpensesApi* | [**updateExpense**](docs/CardExpensesApi.md#updateExpense) | **PUT** /v1/expenses/card/{expense_id} | Update an expense
*ReceiptMatchApi* | [**createNewReceiptMatch**](docs/ReceiptMatchApi.md#createNewReceiptMatch) | **POST** /v1/expenses/card/receipt_match | Create a new receipt match
*ReceiptUploadApi* | [**createNewReceipt**](docs/ReceiptUploadApi.md#createNewReceipt) | **POST** /v1/expenses/card/{expense_id}/receipt_upload | Create a new receipt upload


## Documentation for Models

 - [Budget](docs/Budget.md)
 - [Category](docs/Category.md)
 - [CreateAsyncFileUploadResponse](docs/CreateAsyncFileUploadResponse.md)
 - [Department](docs/Department.md)
 - [ExpandableExpense](docs/ExpandableExpense.md)
 - [ExpandableExpenseBudget](docs/ExpandableExpenseBudget.md)
 - [ExpandableExpenseDepartment](docs/ExpandableExpenseDepartment.md)
 - [ExpandableExpenseLocation](docs/ExpandableExpenseLocation.md)
 - [ExpandableExpenseMerchant](docs/ExpandableExpenseMerchant.md)
 - [ExpandableExpensePayment](docs/ExpandableExpensePayment.md)
 - [ExpandableExpenseUser](docs/ExpandableExpenseUser.md)
 - [Expense](docs/Expense.md)
 - [ExpensePaymentStatus](docs/ExpensePaymentStatus.md)
 - [ExpenseStatus](docs/ExpenseStatus.md)
 - [Location](docs/Location.md)
 - [Merchant](docs/Merchant.md)
 - [Money](docs/Money.md)
 - [PageExpandableExpense](docs/PageExpandableExpense.md)
 - [Payment](docs/Payment.md)
 - [Receipt](docs/Receipt.md)
 - [ReceiptMatchRequest](docs/ReceiptMatchRequest.md)
 - [ReceiptUploadRequest](docs/ReceiptUploadRequest.md)
 - [UpdateExpenseRequest](docs/UpdateExpenseRequest.md)
 - [User](docs/User.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
