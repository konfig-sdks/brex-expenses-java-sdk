

# ExpandableExpense

The expense object that has expandable fields, e.g., `location`, `department`, and `receipts`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique ID associated with the expense. |  |
|**memo** | **String** | The memo of the expense. |  [optional] |
|**locationId** | **String** |  |  [optional] |
|**location** | [**ExpandableExpenseLocation**](ExpandableExpenseLocation.md) |  |  [optional] |
|**departmentId** | **String** |  |  [optional] |
|**department** | [**ExpandableExpenseDepartment**](ExpandableExpenseDepartment.md) |  |  [optional] |
|**updatedAt** | **OffsetDateTime** | The last time the expense was updated. |  |
|**category** | [**Category**](Category.md) |  |  [optional] |
|**merchantId** | **String** |  |  [optional] |
|**merchant** | [**ExpandableExpenseMerchant**](ExpandableExpenseMerchant.md) |  |  [optional] |
|**receipts** | [**List&lt;Receipt&gt;**](Receipt.md) | A list of receipts associated with the expense. |  [optional] |
|**budgetId** | **String** |  |  [optional] |
|**budget** | [**ExpandableExpenseBudget**](ExpandableExpenseBudget.md) |  |  [optional] |
|**originalAmount** | [**Money**](Money.md) |  |  [optional] |
|**purchasedAt** | **OffsetDateTime** | The time the purchase was made. |  [optional] |
|**status** | [**ExpenseStatus**](ExpenseStatus.md) |  |  [optional] |
|**paymentStatus** | [**ExpensePaymentStatus**](ExpensePaymentStatus.md) |  |  [optional] |
|**userId** | **String** |  |  [optional] |
|**user** | [**ExpandableExpenseUser**](ExpandableExpenseUser.md) |  |  [optional] |
|**payment** | [**ExpandableExpensePayment**](ExpandableExpensePayment.md) |  |  [optional] |



