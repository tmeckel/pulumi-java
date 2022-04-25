// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.billingbudgets_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.billingbudgets_v1.enums.GoogleCloudBillingBudgetsV1FilterCalendarPeriod;
import com.pulumi.googlenative.billingbudgets_v1.enums.GoogleCloudBillingBudgetsV1FilterCreditTypesTreatment;
import com.pulumi.googlenative.billingbudgets_v1.inputs.GoogleCloudBillingBudgetsV1CustomPeriodArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A filter for a budget, limiting the scope of the cost to calculate.
 * 
 */
public final class GoogleCloudBillingBudgetsV1FilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudBillingBudgetsV1FilterArgs Empty = new GoogleCloudBillingBudgetsV1FilterArgs();

    /**
     * Optional. Specifies to track usage for recurring calendar period. For example, assume that CalendarPeriod.QUARTER is set. The budget tracks usage from April 1 to June 30, when the current calendar month is April, May, June. After that, it tracks usage from July 1 to September 30 when the current calendar month is July, August, September, so on.
     * 
     */
    @Import(name="calendarPeriod")
    private @Nullable Output<GoogleCloudBillingBudgetsV1FilterCalendarPeriod> calendarPeriod;

    /**
     * @return Optional. Specifies to track usage for recurring calendar period. For example, assume that CalendarPeriod.QUARTER is set. The budget tracks usage from April 1 to June 30, when the current calendar month is April, May, June. After that, it tracks usage from July 1 to September 30 when the current calendar month is July, August, September, so on.
     * 
     */
    public Optional<Output<GoogleCloudBillingBudgetsV1FilterCalendarPeriod>> calendarPeriod() {
        return Optional.ofNullable(this.calendarPeriod);
    }

    /**
     * Optional. If Filter.credit_types_treatment is INCLUDE_SPECIFIED_CREDITS, this is a list of credit types to be subtracted from gross cost to determine the spend for threshold calculations. See [a list of acceptable credit type values](https://cloud.google.com/billing/docs/how-to/export-data-bigquery-tables#credits-type). If Filter.credit_types_treatment is **not** INCLUDE_SPECIFIED_CREDITS, this field must be empty.
     * 
     */
    @Import(name="creditTypes")
    private @Nullable Output<List<String>> creditTypes;

    /**
     * @return Optional. If Filter.credit_types_treatment is INCLUDE_SPECIFIED_CREDITS, this is a list of credit types to be subtracted from gross cost to determine the spend for threshold calculations. See [a list of acceptable credit type values](https://cloud.google.com/billing/docs/how-to/export-data-bigquery-tables#credits-type). If Filter.credit_types_treatment is **not** INCLUDE_SPECIFIED_CREDITS, this field must be empty.
     * 
     */
    public Optional<Output<List<String>>> creditTypes() {
        return Optional.ofNullable(this.creditTypes);
    }

    /**
     * Optional. If not set, default behavior is `INCLUDE_ALL_CREDITS`.
     * 
     */
    @Import(name="creditTypesTreatment")
    private @Nullable Output<GoogleCloudBillingBudgetsV1FilterCreditTypesTreatment> creditTypesTreatment;

    /**
     * @return Optional. If not set, default behavior is `INCLUDE_ALL_CREDITS`.
     * 
     */
    public Optional<Output<GoogleCloudBillingBudgetsV1FilterCreditTypesTreatment>> creditTypesTreatment() {
        return Optional.ofNullable(this.creditTypesTreatment);
    }

    /**
     * Optional. Specifies to track usage from any start date (required) to any end date (optional). This time period is static, it does not recur.
     * 
     */
    @Import(name="customPeriod")
    private @Nullable Output<GoogleCloudBillingBudgetsV1CustomPeriodArgs> customPeriod;

    /**
     * @return Optional. Specifies to track usage from any start date (required) to any end date (optional). This time period is static, it does not recur.
     * 
     */
    public Optional<Output<GoogleCloudBillingBudgetsV1CustomPeriodArgs>> customPeriod() {
        return Optional.ofNullable(this.customPeriod);
    }

    /**
     * Optional. A single label and value pair specifying that usage from only this set of labeled resources should be included in the budget. If omitted, the report includes all labeled and unlabeled usage. An object containing a single `&#34;key&#34;: value` pair. Example: `{ &#34;name&#34;: &#34;wrench&#34; }`. _Currently, multiple entries or multiple values per entry are not allowed._
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Optional. A single label and value pair specifying that usage from only this set of labeled resources should be included in the budget. If omitted, the report includes all labeled and unlabeled usage. An object containing a single `&#34;key&#34;: value` pair. Example: `{ &#34;name&#34;: &#34;wrench&#34; }`. _Currently, multiple entries or multiple values per entry are not allowed._
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Optional. A set of projects of the form `projects/{project}`, specifying that usage from only this set of projects should be included in the budget. If omitted, the report includes all usage for the billing account, regardless of which project the usage occurred on. Only zero or one project can be specified currently.
     * 
     */
    @Import(name="projects")
    private @Nullable Output<List<String>> projects;

    /**
     * @return Optional. A set of projects of the form `projects/{project}`, specifying that usage from only this set of projects should be included in the budget. If omitted, the report includes all usage for the billing account, regardless of which project the usage occurred on. Only zero or one project can be specified currently.
     * 
     */
    public Optional<Output<List<String>>> projects() {
        return Optional.ofNullable(this.projects);
    }

    /**
     * Optional. A set of services of the form `services/{service_id}`, specifying that usage from only this set of services should be included in the budget. If omitted, the report includes usage for all the services. The service names are available through the Catalog API: https://cloud.google.com/billing/v1/how-tos/catalog-api.
     * 
     */
    @Import(name="services")
    private @Nullable Output<List<String>> services;

    /**
     * @return Optional. A set of services of the form `services/{service_id}`, specifying that usage from only this set of services should be included in the budget. If omitted, the report includes usage for all the services. The service names are available through the Catalog API: https://cloud.google.com/billing/v1/how-tos/catalog-api.
     * 
     */
    public Optional<Output<List<String>>> services() {
        return Optional.ofNullable(this.services);
    }

    /**
     * Optional. A set of subaccounts of the form `billingAccounts/{account_id}`, specifying that usage from only this set of subaccounts should be included in the budget. If a subaccount is set to the name of the parent account, usage from the parent account is included. If the field is omitted, the report includes usage from the parent account and all subaccounts, if they exist.
     * 
     */
    @Import(name="subaccounts")
    private @Nullable Output<List<String>> subaccounts;

    /**
     * @return Optional. A set of subaccounts of the form `billingAccounts/{account_id}`, specifying that usage from only this set of subaccounts should be included in the budget. If a subaccount is set to the name of the parent account, usage from the parent account is included. If the field is omitted, the report includes usage from the parent account and all subaccounts, if they exist.
     * 
     */
    public Optional<Output<List<String>>> subaccounts() {
        return Optional.ofNullable(this.subaccounts);
    }

    private GoogleCloudBillingBudgetsV1FilterArgs() {}

    private GoogleCloudBillingBudgetsV1FilterArgs(GoogleCloudBillingBudgetsV1FilterArgs $) {
        this.calendarPeriod = $.calendarPeriod;
        this.creditTypes = $.creditTypes;
        this.creditTypesTreatment = $.creditTypesTreatment;
        this.customPeriod = $.customPeriod;
        this.labels = $.labels;
        this.projects = $.projects;
        this.services = $.services;
        this.subaccounts = $.subaccounts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudBillingBudgetsV1FilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudBillingBudgetsV1FilterArgs $;

        public Builder() {
            $ = new GoogleCloudBillingBudgetsV1FilterArgs();
        }

        public Builder(GoogleCloudBillingBudgetsV1FilterArgs defaults) {
            $ = new GoogleCloudBillingBudgetsV1FilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param calendarPeriod Optional. Specifies to track usage for recurring calendar period. For example, assume that CalendarPeriod.QUARTER is set. The budget tracks usage from April 1 to June 30, when the current calendar month is April, May, June. After that, it tracks usage from July 1 to September 30 when the current calendar month is July, August, September, so on.
         * 
         * @return builder
         * 
         */
        public Builder calendarPeriod(@Nullable Output<GoogleCloudBillingBudgetsV1FilterCalendarPeriod> calendarPeriod) {
            $.calendarPeriod = calendarPeriod;
            return this;
        }

        /**
         * @param calendarPeriod Optional. Specifies to track usage for recurring calendar period. For example, assume that CalendarPeriod.QUARTER is set. The budget tracks usage from April 1 to June 30, when the current calendar month is April, May, June. After that, it tracks usage from July 1 to September 30 when the current calendar month is July, August, September, so on.
         * 
         * @return builder
         * 
         */
        public Builder calendarPeriod(GoogleCloudBillingBudgetsV1FilterCalendarPeriod calendarPeriod) {
            return calendarPeriod(Output.of(calendarPeriod));
        }

        /**
         * @param creditTypes Optional. If Filter.credit_types_treatment is INCLUDE_SPECIFIED_CREDITS, this is a list of credit types to be subtracted from gross cost to determine the spend for threshold calculations. See [a list of acceptable credit type values](https://cloud.google.com/billing/docs/how-to/export-data-bigquery-tables#credits-type). If Filter.credit_types_treatment is **not** INCLUDE_SPECIFIED_CREDITS, this field must be empty.
         * 
         * @return builder
         * 
         */
        public Builder creditTypes(@Nullable Output<List<String>> creditTypes) {
            $.creditTypes = creditTypes;
            return this;
        }

        /**
         * @param creditTypes Optional. If Filter.credit_types_treatment is INCLUDE_SPECIFIED_CREDITS, this is a list of credit types to be subtracted from gross cost to determine the spend for threshold calculations. See [a list of acceptable credit type values](https://cloud.google.com/billing/docs/how-to/export-data-bigquery-tables#credits-type). If Filter.credit_types_treatment is **not** INCLUDE_SPECIFIED_CREDITS, this field must be empty.
         * 
         * @return builder
         * 
         */
        public Builder creditTypes(List<String> creditTypes) {
            return creditTypes(Output.of(creditTypes));
        }

        /**
         * @param creditTypes Optional. If Filter.credit_types_treatment is INCLUDE_SPECIFIED_CREDITS, this is a list of credit types to be subtracted from gross cost to determine the spend for threshold calculations. See [a list of acceptable credit type values](https://cloud.google.com/billing/docs/how-to/export-data-bigquery-tables#credits-type). If Filter.credit_types_treatment is **not** INCLUDE_SPECIFIED_CREDITS, this field must be empty.
         * 
         * @return builder
         * 
         */
        public Builder creditTypes(String... creditTypes) {
            return creditTypes(List.of(creditTypes));
        }

        /**
         * @param creditTypesTreatment Optional. If not set, default behavior is `INCLUDE_ALL_CREDITS`.
         * 
         * @return builder
         * 
         */
        public Builder creditTypesTreatment(@Nullable Output<GoogleCloudBillingBudgetsV1FilterCreditTypesTreatment> creditTypesTreatment) {
            $.creditTypesTreatment = creditTypesTreatment;
            return this;
        }

        /**
         * @param creditTypesTreatment Optional. If not set, default behavior is `INCLUDE_ALL_CREDITS`.
         * 
         * @return builder
         * 
         */
        public Builder creditTypesTreatment(GoogleCloudBillingBudgetsV1FilterCreditTypesTreatment creditTypesTreatment) {
            return creditTypesTreatment(Output.of(creditTypesTreatment));
        }

        /**
         * @param customPeriod Optional. Specifies to track usage from any start date (required) to any end date (optional). This time period is static, it does not recur.
         * 
         * @return builder
         * 
         */
        public Builder customPeriod(@Nullable Output<GoogleCloudBillingBudgetsV1CustomPeriodArgs> customPeriod) {
            $.customPeriod = customPeriod;
            return this;
        }

        /**
         * @param customPeriod Optional. Specifies to track usage from any start date (required) to any end date (optional). This time period is static, it does not recur.
         * 
         * @return builder
         * 
         */
        public Builder customPeriod(GoogleCloudBillingBudgetsV1CustomPeriodArgs customPeriod) {
            return customPeriod(Output.of(customPeriod));
        }

        /**
         * @param labels Optional. A single label and value pair specifying that usage from only this set of labeled resources should be included in the budget. If omitted, the report includes all labeled and unlabeled usage. An object containing a single `&#34;key&#34;: value` pair. Example: `{ &#34;name&#34;: &#34;wrench&#34; }`. _Currently, multiple entries or multiple values per entry are not allowed._
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Optional. A single label and value pair specifying that usage from only this set of labeled resources should be included in the budget. If omitted, the report includes all labeled and unlabeled usage. An object containing a single `&#34;key&#34;: value` pair. Example: `{ &#34;name&#34;: &#34;wrench&#34; }`. _Currently, multiple entries or multiple values per entry are not allowed._
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param projects Optional. A set of projects of the form `projects/{project}`, specifying that usage from only this set of projects should be included in the budget. If omitted, the report includes all usage for the billing account, regardless of which project the usage occurred on. Only zero or one project can be specified currently.
         * 
         * @return builder
         * 
         */
        public Builder projects(@Nullable Output<List<String>> projects) {
            $.projects = projects;
            return this;
        }

        /**
         * @param projects Optional. A set of projects of the form `projects/{project}`, specifying that usage from only this set of projects should be included in the budget. If omitted, the report includes all usage for the billing account, regardless of which project the usage occurred on. Only zero or one project can be specified currently.
         * 
         * @return builder
         * 
         */
        public Builder projects(List<String> projects) {
            return projects(Output.of(projects));
        }

        /**
         * @param projects Optional. A set of projects of the form `projects/{project}`, specifying that usage from only this set of projects should be included in the budget. If omitted, the report includes all usage for the billing account, regardless of which project the usage occurred on. Only zero or one project can be specified currently.
         * 
         * @return builder
         * 
         */
        public Builder projects(String... projects) {
            return projects(List.of(projects));
        }

        /**
         * @param services Optional. A set of services of the form `services/{service_id}`, specifying that usage from only this set of services should be included in the budget. If omitted, the report includes usage for all the services. The service names are available through the Catalog API: https://cloud.google.com/billing/v1/how-tos/catalog-api.
         * 
         * @return builder
         * 
         */
        public Builder services(@Nullable Output<List<String>> services) {
            $.services = services;
            return this;
        }

        /**
         * @param services Optional. A set of services of the form `services/{service_id}`, specifying that usage from only this set of services should be included in the budget. If omitted, the report includes usage for all the services. The service names are available through the Catalog API: https://cloud.google.com/billing/v1/how-tos/catalog-api.
         * 
         * @return builder
         * 
         */
        public Builder services(List<String> services) {
            return services(Output.of(services));
        }

        /**
         * @param services Optional. A set of services of the form `services/{service_id}`, specifying that usage from only this set of services should be included in the budget. If omitted, the report includes usage for all the services. The service names are available through the Catalog API: https://cloud.google.com/billing/v1/how-tos/catalog-api.
         * 
         * @return builder
         * 
         */
        public Builder services(String... services) {
            return services(List.of(services));
        }

        /**
         * @param subaccounts Optional. A set of subaccounts of the form `billingAccounts/{account_id}`, specifying that usage from only this set of subaccounts should be included in the budget. If a subaccount is set to the name of the parent account, usage from the parent account is included. If the field is omitted, the report includes usage from the parent account and all subaccounts, if they exist.
         * 
         * @return builder
         * 
         */
        public Builder subaccounts(@Nullable Output<List<String>> subaccounts) {
            $.subaccounts = subaccounts;
            return this;
        }

        /**
         * @param subaccounts Optional. A set of subaccounts of the form `billingAccounts/{account_id}`, specifying that usage from only this set of subaccounts should be included in the budget. If a subaccount is set to the name of the parent account, usage from the parent account is included. If the field is omitted, the report includes usage from the parent account and all subaccounts, if they exist.
         * 
         * @return builder
         * 
         */
        public Builder subaccounts(List<String> subaccounts) {
            return subaccounts(Output.of(subaccounts));
        }

        /**
         * @param subaccounts Optional. A set of subaccounts of the form `billingAccounts/{account_id}`, specifying that usage from only this set of subaccounts should be included in the budget. If a subaccount is set to the name of the parent account, usage from the parent account is included. If the field is omitted, the report includes usage from the parent account and all subaccounts, if they exist.
         * 
         * @return builder
         * 
         */
        public Builder subaccounts(String... subaccounts) {
            return subaccounts(List.of(subaccounts));
        }

        public GoogleCloudBillingBudgetsV1FilterArgs build() {
            return $;
        }
    }

}
