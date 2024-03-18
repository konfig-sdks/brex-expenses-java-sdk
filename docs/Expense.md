

# Expense


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique ID associated with the expense. |  |
|**memo** | **String** | The memo of the expense. |  [optional] |
|**locationId** | **String** |  |  [optional] |
|**departmentId** | **String** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** | The last time the expense was updated. |  |
|**category** | [**Category**](Category.md) |  |  [optional] |
|**merchantId** | **String** |  |  [optional] |
|**budgetId** | **String** |  |  [optional] |
|**originalAmount** | [**Money**](Money.md) |  |  [optional] |
|**purchasedAt** | **OffsetDateTime** | The time the purchase was made. |  [optional] |
|**status** | [**ExpenseStatus**](ExpenseStatus.md) |  |  [optional] |
|**paymentStatus** | [**ExpensePaymentStatus**](ExpensePaymentStatus.md) |  |  [optional] |



