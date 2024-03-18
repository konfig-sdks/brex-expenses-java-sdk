

# Money

 Money fields can be signed or unsigned. Fields are signed (an unsigned value will be interpreted as positive). The amount of money will be represented in the smallest denomination of the currency indicated. For example, USD 7.00 will be represented in cents with an amount of 700. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **Long** | The amount of money, in the smallest denomination of the currency indicated by currency. For example, when currency is USD, amount is in cents. |  [optional] |
|**currency** | **String** | The type of currency, in ISO 4217 format. Default to USD if not specified |  [optional] |



