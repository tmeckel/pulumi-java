// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1RateRangeResponse;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1RevenueShareRangeResponse;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleTypeMoneyResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetRatePlanResult {
    /**
     * Name of the API product that the rate plan is associated with.
     * 
     */
    private final String apiproduct;
    /**
     * Frequency at which the customer will be billed.
     * 
     */
    private final String billingPeriod;
    /**
     * API call volume ranges and the fees charged when the total number of API calls is within a given range. The method used to calculate the final fee depends on the selected pricing model. For example, if the pricing model is `STAIRSTEP` and the ranges are defined as follows: ```{ "start": 1, "end": 100, "fee": 75 }, { "start": 101, "end": 200, "fee": 100 }, }``` Then the following fees would be charged based on the total number of API calls (assuming the currency selected is `USD`): * 1 call costs $75 * 50 calls cost $75 * 150 calls cost $100 The number of API calls cannot exceed 200.
     * 
     */
    private final List<GoogleCloudApigeeV1RateRangeResponse> consumptionPricingRates;
    /**
     * Pricing model used for consumption-based charges.
     * 
     */
    private final String consumptionPricingType;
    /**
     * Time that the rate plan was created in milliseconds since epoch.
     * 
     */
    private final String createdAt;
    /**
     * Currency to be used for billing. Consists of a three-letter code as defined by the [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) standard.
     * 
     */
    private final String currencyCode;
    /**
     * Description of the rate plan.
     * 
     */
    private final String description;
    /**
     * Display name of the rate plan.
     * 
     */
    private final String displayName;
    /**
     * Time when the rate plan will expire in milliseconds since epoch. Set to 0 or `null` to indicate that the rate plan should never expire.
     * 
     */
    private final String endTime;
    /**
     * Frequency at which the fixed fee is charged.
     * 
     */
    private final Integer fixedFeeFrequency;
    /**
     * Fixed amount that is charged at a defined interval and billed in advance of use of the API product. The fee will be prorated for the first billing period.
     * 
     */
    private final GoogleTypeMoneyResponse fixedRecurringFee;
    /**
     * Time the rate plan was last modified in milliseconds since epoch.
     * 
     */
    private final String lastModifiedAt;
    /**
     * Name of the rate plan.
     * 
     */
    private final String name;
    /**
     * Details of the revenue sharing model.
     * 
     */
    private final List<GoogleCloudApigeeV1RevenueShareRangeResponse> revenueShareRates;
    /**
     * Method used to calculate the revenue that is shared with developers.
     * 
     */
    private final String revenueShareType;
    /**
     * Initial, one-time fee paid when purchasing the API product.
     * 
     */
    private final GoogleTypeMoneyResponse setupFee;
    /**
     * Time when the rate plan becomes active in milliseconds since epoch.
     * 
     */
    private final String startTime;
    /**
     * Current state of the rate plan (draft or published).
     * 
     */
    private final String state;

    @OutputCustomType.Constructor({"apiproduct","billingPeriod","consumptionPricingRates","consumptionPricingType","createdAt","currencyCode","description","displayName","endTime","fixedFeeFrequency","fixedRecurringFee","lastModifiedAt","name","revenueShareRates","revenueShareType","setupFee","startTime","state"})
    private GetRatePlanResult(
        String apiproduct,
        String billingPeriod,
        List<GoogleCloudApigeeV1RateRangeResponse> consumptionPricingRates,
        String consumptionPricingType,
        String createdAt,
        String currencyCode,
        String description,
        String displayName,
        String endTime,
        Integer fixedFeeFrequency,
        GoogleTypeMoneyResponse fixedRecurringFee,
        String lastModifiedAt,
        String name,
        List<GoogleCloudApigeeV1RevenueShareRangeResponse> revenueShareRates,
        String revenueShareType,
        GoogleTypeMoneyResponse setupFee,
        String startTime,
        String state) {
        this.apiproduct = Objects.requireNonNull(apiproduct);
        this.billingPeriod = Objects.requireNonNull(billingPeriod);
        this.consumptionPricingRates = Objects.requireNonNull(consumptionPricingRates);
        this.consumptionPricingType = Objects.requireNonNull(consumptionPricingType);
        this.createdAt = Objects.requireNonNull(createdAt);
        this.currencyCode = Objects.requireNonNull(currencyCode);
        this.description = Objects.requireNonNull(description);
        this.displayName = Objects.requireNonNull(displayName);
        this.endTime = Objects.requireNonNull(endTime);
        this.fixedFeeFrequency = Objects.requireNonNull(fixedFeeFrequency);
        this.fixedRecurringFee = Objects.requireNonNull(fixedRecurringFee);
        this.lastModifiedAt = Objects.requireNonNull(lastModifiedAt);
        this.name = Objects.requireNonNull(name);
        this.revenueShareRates = Objects.requireNonNull(revenueShareRates);
        this.revenueShareType = Objects.requireNonNull(revenueShareType);
        this.setupFee = Objects.requireNonNull(setupFee);
        this.startTime = Objects.requireNonNull(startTime);
        this.state = Objects.requireNonNull(state);
    }

    /**
     * Name of the API product that the rate plan is associated with.
     * 
     */
    public String getApiproduct() {
        return this.apiproduct;
    }
    /**
     * Frequency at which the customer will be billed.
     * 
     */
    public String getBillingPeriod() {
        return this.billingPeriod;
    }
    /**
     * API call volume ranges and the fees charged when the total number of API calls is within a given range. The method used to calculate the final fee depends on the selected pricing model. For example, if the pricing model is `STAIRSTEP` and the ranges are defined as follows: ```{ "start": 1, "end": 100, "fee": 75 }, { "start": 101, "end": 200, "fee": 100 }, }``` Then the following fees would be charged based on the total number of API calls (assuming the currency selected is `USD`): * 1 call costs $75 * 50 calls cost $75 * 150 calls cost $100 The number of API calls cannot exceed 200.
     * 
     */
    public List<GoogleCloudApigeeV1RateRangeResponse> getConsumptionPricingRates() {
        return this.consumptionPricingRates;
    }
    /**
     * Pricing model used for consumption-based charges.
     * 
     */
    public String getConsumptionPricingType() {
        return this.consumptionPricingType;
    }
    /**
     * Time that the rate plan was created in milliseconds since epoch.
     * 
     */
    public String getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Currency to be used for billing. Consists of a three-letter code as defined by the [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) standard.
     * 
     */
    public String getCurrencyCode() {
        return this.currencyCode;
    }
    /**
     * Description of the rate plan.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Display name of the rate plan.
     * 
     */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Time when the rate plan will expire in milliseconds since epoch. Set to 0 or `null` to indicate that the rate plan should never expire.
     * 
     */
    public String getEndTime() {
        return this.endTime;
    }
    /**
     * Frequency at which the fixed fee is charged.
     * 
     */
    public Integer getFixedFeeFrequency() {
        return this.fixedFeeFrequency;
    }
    /**
     * Fixed amount that is charged at a defined interval and billed in advance of use of the API product. The fee will be prorated for the first billing period.
     * 
     */
    public GoogleTypeMoneyResponse getFixedRecurringFee() {
        return this.fixedRecurringFee;
    }
    /**
     * Time the rate plan was last modified in milliseconds since epoch.
     * 
     */
    public String getLastModifiedAt() {
        return this.lastModifiedAt;
    }
    /**
     * Name of the rate plan.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Details of the revenue sharing model.
     * 
     */
    public List<GoogleCloudApigeeV1RevenueShareRangeResponse> getRevenueShareRates() {
        return this.revenueShareRates;
    }
    /**
     * Method used to calculate the revenue that is shared with developers.
     * 
     */
    public String getRevenueShareType() {
        return this.revenueShareType;
    }
    /**
     * Initial, one-time fee paid when purchasing the API product.
     * 
     */
    public GoogleTypeMoneyResponse getSetupFee() {
        return this.setupFee;
    }
    /**
     * Time when the rate plan becomes active in milliseconds since epoch.
     * 
     */
    public String getStartTime() {
        return this.startTime;
    }
    /**
     * Current state of the rate plan (draft or published).
     * 
     */
    public String getState() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRatePlanResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiproduct;
        private String billingPeriod;
        private List<GoogleCloudApigeeV1RateRangeResponse> consumptionPricingRates;
        private String consumptionPricingType;
        private String createdAt;
        private String currencyCode;
        private String description;
        private String displayName;
        private String endTime;
        private Integer fixedFeeFrequency;
        private GoogleTypeMoneyResponse fixedRecurringFee;
        private String lastModifiedAt;
        private String name;
        private List<GoogleCloudApigeeV1RevenueShareRangeResponse> revenueShareRates;
        private String revenueShareType;
        private GoogleTypeMoneyResponse setupFee;
        private String startTime;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRatePlanResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiproduct = defaults.apiproduct;
    	      this.billingPeriod = defaults.billingPeriod;
    	      this.consumptionPricingRates = defaults.consumptionPricingRates;
    	      this.consumptionPricingType = defaults.consumptionPricingType;
    	      this.createdAt = defaults.createdAt;
    	      this.currencyCode = defaults.currencyCode;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.endTime = defaults.endTime;
    	      this.fixedFeeFrequency = defaults.fixedFeeFrequency;
    	      this.fixedRecurringFee = defaults.fixedRecurringFee;
    	      this.lastModifiedAt = defaults.lastModifiedAt;
    	      this.name = defaults.name;
    	      this.revenueShareRates = defaults.revenueShareRates;
    	      this.revenueShareType = defaults.revenueShareType;
    	      this.setupFee = defaults.setupFee;
    	      this.startTime = defaults.startTime;
    	      this.state = defaults.state;
        }

        public Builder setApiproduct(String apiproduct) {
            this.apiproduct = Objects.requireNonNull(apiproduct);
            return this;
        }

        public Builder setBillingPeriod(String billingPeriod) {
            this.billingPeriod = Objects.requireNonNull(billingPeriod);
            return this;
        }

        public Builder setConsumptionPricingRates(List<GoogleCloudApigeeV1RateRangeResponse> consumptionPricingRates) {
            this.consumptionPricingRates = Objects.requireNonNull(consumptionPricingRates);
            return this;
        }

        public Builder setConsumptionPricingType(String consumptionPricingType) {
            this.consumptionPricingType = Objects.requireNonNull(consumptionPricingType);
            return this;
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }

        public Builder setCurrencyCode(String currencyCode) {
            this.currencyCode = Objects.requireNonNull(currencyCode);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setEndTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder setFixedFeeFrequency(Integer fixedFeeFrequency) {
            this.fixedFeeFrequency = Objects.requireNonNull(fixedFeeFrequency);
            return this;
        }

        public Builder setFixedRecurringFee(GoogleTypeMoneyResponse fixedRecurringFee) {
            this.fixedRecurringFee = Objects.requireNonNull(fixedRecurringFee);
            return this;
        }

        public Builder setLastModifiedAt(String lastModifiedAt) {
            this.lastModifiedAt = Objects.requireNonNull(lastModifiedAt);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRevenueShareRates(List<GoogleCloudApigeeV1RevenueShareRangeResponse> revenueShareRates) {
            this.revenueShareRates = Objects.requireNonNull(revenueShareRates);
            return this;
        }

        public Builder setRevenueShareType(String revenueShareType) {
            this.revenueShareType = Objects.requireNonNull(revenueShareType);
            return this;
        }

        public Builder setSetupFee(GoogleTypeMoneyResponse setupFee) {
            this.setupFee = Objects.requireNonNull(setupFee);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public GetRatePlanResult build() {
            return new GetRatePlanResult(apiproduct, billingPeriod, consumptionPricingRates, consumptionPricingType, createdAt, currencyCode, description, displayName, endTime, fixedFeeFrequency, fixedRecurringFee, lastModifiedAt, name, revenueShareRates, revenueShareType, setupFee, startTime, state);
        }
    }
}
