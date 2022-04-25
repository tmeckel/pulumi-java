// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch.inputs;

import com.pulumi.aws.cloudwatch.inputs.MetricAlarmMetricQueryMetricArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MetricAlarmMetricQueryArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetricAlarmMetricQueryArgs Empty = new MetricAlarmMetricQueryArgs();

    /**
     * The ID of the account where the metrics are located, if this is a cross-account alarm.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The ID of the account where the metrics are located, if this is a cross-account alarm.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The math expression to be performed on the returned data, if this object is performing a math expression. This expression can use the id of the other metrics to refer to those metrics, and can also use the id of other expressions to use the result of those expressions. For more information about metric math expressions, see Metric Math Syntax and Functions in the [Amazon CloudWatch User Guide](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax).
     * 
     */
    @Import(name="expression")
    private @Nullable Output<String> expression;

    /**
     * @return The math expression to be performed on the returned data, if this object is performing a math expression. This expression can use the id of the other metrics to refer to those metrics, and can also use the id of other expressions to use the result of those expressions. For more information about metric math expressions, see Metric Math Syntax and Functions in the [Amazon CloudWatch User Guide](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax).
     * 
     */
    public Optional<Output<String>> expression() {
        return Optional.ofNullable(this.expression);
    }

    /**
     * A short name used to tie this object to the results in the response. If you are performing math expressions on this set of data, this name represents that data and can serve as a variable in the mathematical expression. The valid characters are letters, numbers, and underscore. The first character must be a lowercase letter.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return A short name used to tie this object to the results in the response. If you are performing math expressions on this set of data, this name represents that data and can serve as a variable in the mathematical expression. The valid characters are letters, numbers, and underscore. The first character must be a lowercase letter.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * A human-readable label for this metric or expression. This is especially useful if this is an expression, so that you know what the value represents.
     * 
     */
    @Import(name="label")
    private @Nullable Output<String> label;

    /**
     * @return A human-readable label for this metric or expression. This is especially useful if this is an expression, so that you know what the value represents.
     * 
     */
    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    /**
     * The metric to be returned, along with statistics, period, and units. Use this parameter only if this object is retrieving a metric and not performing a math expression on returned data.
     * 
     */
    @Import(name="metric")
    private @Nullable Output<MetricAlarmMetricQueryMetricArgs> metric;

    /**
     * @return The metric to be returned, along with statistics, period, and units. Use this parameter only if this object is retrieving a metric and not performing a math expression on returned data.
     * 
     */
    public Optional<Output<MetricAlarmMetricQueryMetricArgs>> metric() {
        return Optional.ofNullable(this.metric);
    }

    /**
     * Specify exactly one `metric_query` to be `true` to use that `metric_query` result as the alarm.
     * 
     */
    @Import(name="returnData")
    private @Nullable Output<Boolean> returnData;

    /**
     * @return Specify exactly one `metric_query` to be `true` to use that `metric_query` result as the alarm.
     * 
     */
    public Optional<Output<Boolean>> returnData() {
        return Optional.ofNullable(this.returnData);
    }

    private MetricAlarmMetricQueryArgs() {}

    private MetricAlarmMetricQueryArgs(MetricAlarmMetricQueryArgs $) {
        this.accountId = $.accountId;
        this.expression = $.expression;
        this.id = $.id;
        this.label = $.label;
        this.metric = $.metric;
        this.returnData = $.returnData;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricAlarmMetricQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricAlarmMetricQueryArgs $;

        public Builder() {
            $ = new MetricAlarmMetricQueryArgs();
        }

        public Builder(MetricAlarmMetricQueryArgs defaults) {
            $ = new MetricAlarmMetricQueryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The ID of the account where the metrics are located, if this is a cross-account alarm.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The ID of the account where the metrics are located, if this is a cross-account alarm.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param expression The math expression to be performed on the returned data, if this object is performing a math expression. This expression can use the id of the other metrics to refer to those metrics, and can also use the id of other expressions to use the result of those expressions. For more information about metric math expressions, see Metric Math Syntax and Functions in the [Amazon CloudWatch User Guide](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax).
         * 
         * @return builder
         * 
         */
        public Builder expression(@Nullable Output<String> expression) {
            $.expression = expression;
            return this;
        }

        /**
         * @param expression The math expression to be performed on the returned data, if this object is performing a math expression. This expression can use the id of the other metrics to refer to those metrics, and can also use the id of other expressions to use the result of those expressions. For more information about metric math expressions, see Metric Math Syntax and Functions in the [Amazon CloudWatch User Guide](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax).
         * 
         * @return builder
         * 
         */
        public Builder expression(String expression) {
            return expression(Output.of(expression));
        }

        /**
         * @param id A short name used to tie this object to the results in the response. If you are performing math expressions on this set of data, this name represents that data and can serve as a variable in the mathematical expression. The valid characters are letters, numbers, and underscore. The first character must be a lowercase letter.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id A short name used to tie this object to the results in the response. If you are performing math expressions on this set of data, this name represents that data and can serve as a variable in the mathematical expression. The valid characters are letters, numbers, and underscore. The first character must be a lowercase letter.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param label A human-readable label for this metric or expression. This is especially useful if this is an expression, so that you know what the value represents.
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label A human-readable label for this metric or expression. This is especially useful if this is an expression, so that you know what the value represents.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param metric The metric to be returned, along with statistics, period, and units. Use this parameter only if this object is retrieving a metric and not performing a math expression on returned data.
         * 
         * @return builder
         * 
         */
        public Builder metric(@Nullable Output<MetricAlarmMetricQueryMetricArgs> metric) {
            $.metric = metric;
            return this;
        }

        /**
         * @param metric The metric to be returned, along with statistics, period, and units. Use this parameter only if this object is retrieving a metric and not performing a math expression on returned data.
         * 
         * @return builder
         * 
         */
        public Builder metric(MetricAlarmMetricQueryMetricArgs metric) {
            return metric(Output.of(metric));
        }

        /**
         * @param returnData Specify exactly one `metric_query` to be `true` to use that `metric_query` result as the alarm.
         * 
         * @return builder
         * 
         */
        public Builder returnData(@Nullable Output<Boolean> returnData) {
            $.returnData = returnData;
            return this;
        }

        /**
         * @param returnData Specify exactly one `metric_query` to be `true` to use that `metric_query` result as the alarm.
         * 
         * @return builder
         * 
         */
        public Builder returnData(Boolean returnData) {
            return returnData(Output.of(returnData));
        }

        public MetricAlarmMetricQueryArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
