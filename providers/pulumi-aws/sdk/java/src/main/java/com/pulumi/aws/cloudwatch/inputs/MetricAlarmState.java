// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch.inputs;

import com.pulumi.aws.cloudwatch.inputs.MetricAlarmMetricQueryGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MetricAlarmState extends com.pulumi.resources.ResourceArgs {

    public static final MetricAlarmState Empty = new MetricAlarmState();

    /**
     * Indicates whether or not actions should be executed during any changes to the alarm&#39;s state. Defaults to `true`.
     * 
     */
    @Import(name="actionsEnabled")
    private @Nullable Output<Boolean> actionsEnabled;

    /**
     * @return Indicates whether or not actions should be executed during any changes to the alarm&#39;s state. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> actionsEnabled() {
        return Optional.ofNullable(this.actionsEnabled);
    }

    /**
     * The list of actions to execute when this alarm transitions into an ALARM state from any other state. Each action is specified as an Amazon Resource Name (ARN).
     * 
     */
    @Import(name="alarmActions")
    private @Nullable Output<List<String>> alarmActions;

    /**
     * @return The list of actions to execute when this alarm transitions into an ALARM state from any other state. Each action is specified as an Amazon Resource Name (ARN).
     * 
     */
    public Optional<Output<List<String>>> alarmActions() {
        return Optional.ofNullable(this.alarmActions);
    }

    /**
     * The description for the alarm.
     * 
     */
    @Import(name="alarmDescription")
    private @Nullable Output<String> alarmDescription;

    /**
     * @return The description for the alarm.
     * 
     */
    public Optional<Output<String>> alarmDescription() {
        return Optional.ofNullable(this.alarmDescription);
    }

    /**
     * The ARN of the CloudWatch Metric Alarm.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The ARN of the CloudWatch Metric Alarm.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The arithmetic operation to use when comparing the specified Statistic and Threshold. The specified Statistic value is used as the first operand. Either of the following is supported: `GreaterThanOrEqualToThreshold`, `GreaterThanThreshold`, `LessThanThreshold`, `LessThanOrEqualToThreshold`. Additionally, the values  `LessThanLowerOrGreaterThanUpperThreshold`, `LessThanLowerThreshold`, and `GreaterThanUpperThreshold` are used only for alarms based on anomaly detection models.
     * 
     */
    @Import(name="comparisonOperator")
    private @Nullable Output<String> comparisonOperator;

    /**
     * @return The arithmetic operation to use when comparing the specified Statistic and Threshold. The specified Statistic value is used as the first operand. Either of the following is supported: `GreaterThanOrEqualToThreshold`, `GreaterThanThreshold`, `LessThanThreshold`, `LessThanOrEqualToThreshold`. Additionally, the values  `LessThanLowerOrGreaterThanUpperThreshold`, `LessThanLowerThreshold`, and `GreaterThanUpperThreshold` are used only for alarms based on anomaly detection models.
     * 
     */
    public Optional<Output<String>> comparisonOperator() {
        return Optional.ofNullable(this.comparisonOperator);
    }

    /**
     * The number of datapoints that must be breaching to trigger the alarm.
     * 
     */
    @Import(name="datapointsToAlarm")
    private @Nullable Output<Integer> datapointsToAlarm;

    /**
     * @return The number of datapoints that must be breaching to trigger the alarm.
     * 
     */
    public Optional<Output<Integer>> datapointsToAlarm() {
        return Optional.ofNullable(this.datapointsToAlarm);
    }

    /**
     * The dimensions for this metric.  For the list of available dimensions see the AWS documentation [here](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
     * 
     */
    @Import(name="dimensions")
    private @Nullable Output<Map<String,String>> dimensions;

    /**
     * @return The dimensions for this metric.  For the list of available dimensions see the AWS documentation [here](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
     * 
     */
    public Optional<Output<Map<String,String>>> dimensions() {
        return Optional.ofNullable(this.dimensions);
    }

    /**
     * Used only for alarms
     * based on percentiles. If you specify `ignore`, the alarm state will not
     * change during periods with too few data points to be statistically significant.
     * If you specify `evaluate` or omit this parameter, the alarm will always be
     * evaluated and possibly change state no matter how many data points are available.
     * The following values are supported: `ignore`, and `evaluate`.
     * 
     */
    @Import(name="evaluateLowSampleCountPercentiles")
    private @Nullable Output<String> evaluateLowSampleCountPercentiles;

    /**
     * @return Used only for alarms
     * based on percentiles. If you specify `ignore`, the alarm state will not
     * change during periods with too few data points to be statistically significant.
     * If you specify `evaluate` or omit this parameter, the alarm will always be
     * evaluated and possibly change state no matter how many data points are available.
     * The following values are supported: `ignore`, and `evaluate`.
     * 
     */
    public Optional<Output<String>> evaluateLowSampleCountPercentiles() {
        return Optional.ofNullable(this.evaluateLowSampleCountPercentiles);
    }

    /**
     * The number of periods over which data is compared to the specified threshold.
     * 
     */
    @Import(name="evaluationPeriods")
    private @Nullable Output<Integer> evaluationPeriods;

    /**
     * @return The number of periods over which data is compared to the specified threshold.
     * 
     */
    public Optional<Output<Integer>> evaluationPeriods() {
        return Optional.ofNullable(this.evaluationPeriods);
    }

    /**
     * The percentile statistic for the metric associated with the alarm. Specify a value between p0.0 and p100.
     * 
     */
    @Import(name="extendedStatistic")
    private @Nullable Output<String> extendedStatistic;

    /**
     * @return The percentile statistic for the metric associated with the alarm. Specify a value between p0.0 and p100.
     * 
     */
    public Optional<Output<String>> extendedStatistic() {
        return Optional.ofNullable(this.extendedStatistic);
    }

    /**
     * The list of actions to execute when this alarm transitions into an INSUFFICIENT_DATA state from any other state. Each action is specified as an Amazon Resource Name (ARN).
     * 
     */
    @Import(name="insufficientDataActions")
    private @Nullable Output<List<String>> insufficientDataActions;

    /**
     * @return The list of actions to execute when this alarm transitions into an INSUFFICIENT_DATA state from any other state. Each action is specified as an Amazon Resource Name (ARN).
     * 
     */
    public Optional<Output<List<String>>> insufficientDataActions() {
        return Optional.ofNullable(this.insufficientDataActions);
    }

    /**
     * The name for this metric.
     * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
     * 
     */
    @Import(name="metricName")
    private @Nullable Output<String> metricName;

    /**
     * @return The name for this metric.
     * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
     * 
     */
    public Optional<Output<String>> metricName() {
        return Optional.ofNullable(this.metricName);
    }

    /**
     * Enables you to create an alarm based on a metric math expression. You may specify at most 20.
     * 
     */
    @Import(name="metricQueries")
    private @Nullable Output<List<MetricAlarmMetricQueryGetArgs>> metricQueries;

    /**
     * @return Enables you to create an alarm based on a metric math expression. You may specify at most 20.
     * 
     */
    public Optional<Output<List<MetricAlarmMetricQueryGetArgs>>> metricQueries() {
        return Optional.ofNullable(this.metricQueries);
    }

    /**
     * The descriptive name for the alarm. This name must be unique within the user&#39;s AWS account
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The descriptive name for the alarm. This name must be unique within the user&#39;s AWS account
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The namespace for this metric. See docs for the [list of namespaces](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/aws-namespaces.html).
     * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    /**
     * @return The namespace for this metric. See docs for the [list of namespaces](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/aws-namespaces.html).
     * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
     * 
     */
    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    /**
     * The list of actions to execute when this alarm transitions into an OK state from any other state. Each action is specified as an Amazon Resource Name (ARN).
     * 
     */
    @Import(name="okActions")
    private @Nullable Output<List<String>> okActions;

    /**
     * @return The list of actions to execute when this alarm transitions into an OK state from any other state. Each action is specified as an Amazon Resource Name (ARN).
     * 
     */
    public Optional<Output<List<String>>> okActions() {
        return Optional.ofNullable(this.okActions);
    }

    /**
     * The period in seconds over which the specified `stat` is applied.
     * 
     */
    @Import(name="period")
    private @Nullable Output<Integer> period;

    /**
     * @return The period in seconds over which the specified `stat` is applied.
     * 
     */
    public Optional<Output<Integer>> period() {
        return Optional.ofNullable(this.period);
    }

    /**
     * The statistic to apply to the alarm&#39;s associated metric.
     * Either of the following is supported: `SampleCount`, `Average`, `Sum`, `Minimum`, `Maximum`
     * 
     */
    @Import(name="statistic")
    private @Nullable Output<String> statistic;

    /**
     * @return The statistic to apply to the alarm&#39;s associated metric.
     * Either of the following is supported: `SampleCount`, `Average`, `Sum`, `Minimum`, `Maximum`
     * 
     */
    public Optional<Output<String>> statistic() {
        return Optional.ofNullable(this.statistic);
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * The value against which the specified statistic is compared. This parameter is required for alarms based on static thresholds, but should not be used for alarms based on anomaly detection models.
     * 
     */
    @Import(name="threshold")
    private @Nullable Output<Double> threshold;

    /**
     * @return The value against which the specified statistic is compared. This parameter is required for alarms based on static thresholds, but should not be used for alarms based on anomaly detection models.
     * 
     */
    public Optional<Output<Double>> threshold() {
        return Optional.ofNullable(this.threshold);
    }

    /**
     * If this is an alarm based on an anomaly detection model, make this value match the ID of the ANOMALY_DETECTION_BAND function.
     * 
     */
    @Import(name="thresholdMetricId")
    private @Nullable Output<String> thresholdMetricId;

    /**
     * @return If this is an alarm based on an anomaly detection model, make this value match the ID of the ANOMALY_DETECTION_BAND function.
     * 
     */
    public Optional<Output<String>> thresholdMetricId() {
        return Optional.ofNullable(this.thresholdMetricId);
    }

    /**
     * Sets how this alarm is to handle missing data points. The following values are supported: `missing`, `ignore`, `breaching` and `notBreaching`. Defaults to `missing`.
     * 
     */
    @Import(name="treatMissingData")
    private @Nullable Output<String> treatMissingData;

    /**
     * @return Sets how this alarm is to handle missing data points. The following values are supported: `missing`, `ignore`, `breaching` and `notBreaching`. Defaults to `missing`.
     * 
     */
    public Optional<Output<String>> treatMissingData() {
        return Optional.ofNullable(this.treatMissingData);
    }

    /**
     * The unit for this metric.
     * 
     */
    @Import(name="unit")
    private @Nullable Output<String> unit;

    /**
     * @return The unit for this metric.
     * 
     */
    public Optional<Output<String>> unit() {
        return Optional.ofNullable(this.unit);
    }

    private MetricAlarmState() {}

    private MetricAlarmState(MetricAlarmState $) {
        this.actionsEnabled = $.actionsEnabled;
        this.alarmActions = $.alarmActions;
        this.alarmDescription = $.alarmDescription;
        this.arn = $.arn;
        this.comparisonOperator = $.comparisonOperator;
        this.datapointsToAlarm = $.datapointsToAlarm;
        this.dimensions = $.dimensions;
        this.evaluateLowSampleCountPercentiles = $.evaluateLowSampleCountPercentiles;
        this.evaluationPeriods = $.evaluationPeriods;
        this.extendedStatistic = $.extendedStatistic;
        this.insufficientDataActions = $.insufficientDataActions;
        this.metricName = $.metricName;
        this.metricQueries = $.metricQueries;
        this.name = $.name;
        this.namespace = $.namespace;
        this.okActions = $.okActions;
        this.period = $.period;
        this.statistic = $.statistic;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.threshold = $.threshold;
        this.thresholdMetricId = $.thresholdMetricId;
        this.treatMissingData = $.treatMissingData;
        this.unit = $.unit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricAlarmState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricAlarmState $;

        public Builder() {
            $ = new MetricAlarmState();
        }

        public Builder(MetricAlarmState defaults) {
            $ = new MetricAlarmState(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionsEnabled Indicates whether or not actions should be executed during any changes to the alarm&#39;s state. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder actionsEnabled(@Nullable Output<Boolean> actionsEnabled) {
            $.actionsEnabled = actionsEnabled;
            return this;
        }

        /**
         * @param actionsEnabled Indicates whether or not actions should be executed during any changes to the alarm&#39;s state. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder actionsEnabled(Boolean actionsEnabled) {
            return actionsEnabled(Output.of(actionsEnabled));
        }

        /**
         * @param alarmActions The list of actions to execute when this alarm transitions into an ALARM state from any other state. Each action is specified as an Amazon Resource Name (ARN).
         * 
         * @return builder
         * 
         */
        public Builder alarmActions(@Nullable Output<List<String>> alarmActions) {
            $.alarmActions = alarmActions;
            return this;
        }

        /**
         * @param alarmActions The list of actions to execute when this alarm transitions into an ALARM state from any other state. Each action is specified as an Amazon Resource Name (ARN).
         * 
         * @return builder
         * 
         */
        public Builder alarmActions(List<String> alarmActions) {
            return alarmActions(Output.of(alarmActions));
        }

        /**
         * @param alarmActions The list of actions to execute when this alarm transitions into an ALARM state from any other state. Each action is specified as an Amazon Resource Name (ARN).
         * 
         * @return builder
         * 
         */
        public Builder alarmActions(String... alarmActions) {
            return alarmActions(List.of(alarmActions));
        }

        /**
         * @param alarmDescription The description for the alarm.
         * 
         * @return builder
         * 
         */
        public Builder alarmDescription(@Nullable Output<String> alarmDescription) {
            $.alarmDescription = alarmDescription;
            return this;
        }

        /**
         * @param alarmDescription The description for the alarm.
         * 
         * @return builder
         * 
         */
        public Builder alarmDescription(String alarmDescription) {
            return alarmDescription(Output.of(alarmDescription));
        }

        /**
         * @param arn The ARN of the CloudWatch Metric Alarm.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The ARN of the CloudWatch Metric Alarm.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param comparisonOperator The arithmetic operation to use when comparing the specified Statistic and Threshold. The specified Statistic value is used as the first operand. Either of the following is supported: `GreaterThanOrEqualToThreshold`, `GreaterThanThreshold`, `LessThanThreshold`, `LessThanOrEqualToThreshold`. Additionally, the values  `LessThanLowerOrGreaterThanUpperThreshold`, `LessThanLowerThreshold`, and `GreaterThanUpperThreshold` are used only for alarms based on anomaly detection models.
         * 
         * @return builder
         * 
         */
        public Builder comparisonOperator(@Nullable Output<String> comparisonOperator) {
            $.comparisonOperator = comparisonOperator;
            return this;
        }

        /**
         * @param comparisonOperator The arithmetic operation to use when comparing the specified Statistic and Threshold. The specified Statistic value is used as the first operand. Either of the following is supported: `GreaterThanOrEqualToThreshold`, `GreaterThanThreshold`, `LessThanThreshold`, `LessThanOrEqualToThreshold`. Additionally, the values  `LessThanLowerOrGreaterThanUpperThreshold`, `LessThanLowerThreshold`, and `GreaterThanUpperThreshold` are used only for alarms based on anomaly detection models.
         * 
         * @return builder
         * 
         */
        public Builder comparisonOperator(String comparisonOperator) {
            return comparisonOperator(Output.of(comparisonOperator));
        }

        /**
         * @param datapointsToAlarm The number of datapoints that must be breaching to trigger the alarm.
         * 
         * @return builder
         * 
         */
        public Builder datapointsToAlarm(@Nullable Output<Integer> datapointsToAlarm) {
            $.datapointsToAlarm = datapointsToAlarm;
            return this;
        }

        /**
         * @param datapointsToAlarm The number of datapoints that must be breaching to trigger the alarm.
         * 
         * @return builder
         * 
         */
        public Builder datapointsToAlarm(Integer datapointsToAlarm) {
            return datapointsToAlarm(Output.of(datapointsToAlarm));
        }

        /**
         * @param dimensions The dimensions for this metric.  For the list of available dimensions see the AWS documentation [here](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
         * 
         * @return builder
         * 
         */
        public Builder dimensions(@Nullable Output<Map<String,String>> dimensions) {
            $.dimensions = dimensions;
            return this;
        }

        /**
         * @param dimensions The dimensions for this metric.  For the list of available dimensions see the AWS documentation [here](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
         * 
         * @return builder
         * 
         */
        public Builder dimensions(Map<String,String> dimensions) {
            return dimensions(Output.of(dimensions));
        }

        /**
         * @param evaluateLowSampleCountPercentiles Used only for alarms
         * based on percentiles. If you specify `ignore`, the alarm state will not
         * change during periods with too few data points to be statistically significant.
         * If you specify `evaluate` or omit this parameter, the alarm will always be
         * evaluated and possibly change state no matter how many data points are available.
         * The following values are supported: `ignore`, and `evaluate`.
         * 
         * @return builder
         * 
         */
        public Builder evaluateLowSampleCountPercentiles(@Nullable Output<String> evaluateLowSampleCountPercentiles) {
            $.evaluateLowSampleCountPercentiles = evaluateLowSampleCountPercentiles;
            return this;
        }

        /**
         * @param evaluateLowSampleCountPercentiles Used only for alarms
         * based on percentiles. If you specify `ignore`, the alarm state will not
         * change during periods with too few data points to be statistically significant.
         * If you specify `evaluate` or omit this parameter, the alarm will always be
         * evaluated and possibly change state no matter how many data points are available.
         * The following values are supported: `ignore`, and `evaluate`.
         * 
         * @return builder
         * 
         */
        public Builder evaluateLowSampleCountPercentiles(String evaluateLowSampleCountPercentiles) {
            return evaluateLowSampleCountPercentiles(Output.of(evaluateLowSampleCountPercentiles));
        }

        /**
         * @param evaluationPeriods The number of periods over which data is compared to the specified threshold.
         * 
         * @return builder
         * 
         */
        public Builder evaluationPeriods(@Nullable Output<Integer> evaluationPeriods) {
            $.evaluationPeriods = evaluationPeriods;
            return this;
        }

        /**
         * @param evaluationPeriods The number of periods over which data is compared to the specified threshold.
         * 
         * @return builder
         * 
         */
        public Builder evaluationPeriods(Integer evaluationPeriods) {
            return evaluationPeriods(Output.of(evaluationPeriods));
        }

        /**
         * @param extendedStatistic The percentile statistic for the metric associated with the alarm. Specify a value between p0.0 and p100.
         * 
         * @return builder
         * 
         */
        public Builder extendedStatistic(@Nullable Output<String> extendedStatistic) {
            $.extendedStatistic = extendedStatistic;
            return this;
        }

        /**
         * @param extendedStatistic The percentile statistic for the metric associated with the alarm. Specify a value between p0.0 and p100.
         * 
         * @return builder
         * 
         */
        public Builder extendedStatistic(String extendedStatistic) {
            return extendedStatistic(Output.of(extendedStatistic));
        }

        /**
         * @param insufficientDataActions The list of actions to execute when this alarm transitions into an INSUFFICIENT_DATA state from any other state. Each action is specified as an Amazon Resource Name (ARN).
         * 
         * @return builder
         * 
         */
        public Builder insufficientDataActions(@Nullable Output<List<String>> insufficientDataActions) {
            $.insufficientDataActions = insufficientDataActions;
            return this;
        }

        /**
         * @param insufficientDataActions The list of actions to execute when this alarm transitions into an INSUFFICIENT_DATA state from any other state. Each action is specified as an Amazon Resource Name (ARN).
         * 
         * @return builder
         * 
         */
        public Builder insufficientDataActions(List<String> insufficientDataActions) {
            return insufficientDataActions(Output.of(insufficientDataActions));
        }

        /**
         * @param insufficientDataActions The list of actions to execute when this alarm transitions into an INSUFFICIENT_DATA state from any other state. Each action is specified as an Amazon Resource Name (ARN).
         * 
         * @return builder
         * 
         */
        public Builder insufficientDataActions(String... insufficientDataActions) {
            return insufficientDataActions(List.of(insufficientDataActions));
        }

        /**
         * @param metricName The name for this metric.
         * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
         * 
         * @return builder
         * 
         */
        public Builder metricName(@Nullable Output<String> metricName) {
            $.metricName = metricName;
            return this;
        }

        /**
         * @param metricName The name for this metric.
         * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
         * 
         * @return builder
         * 
         */
        public Builder metricName(String metricName) {
            return metricName(Output.of(metricName));
        }

        /**
         * @param metricQueries Enables you to create an alarm based on a metric math expression. You may specify at most 20.
         * 
         * @return builder
         * 
         */
        public Builder metricQueries(@Nullable Output<List<MetricAlarmMetricQueryGetArgs>> metricQueries) {
            $.metricQueries = metricQueries;
            return this;
        }

        /**
         * @param metricQueries Enables you to create an alarm based on a metric math expression. You may specify at most 20.
         * 
         * @return builder
         * 
         */
        public Builder metricQueries(List<MetricAlarmMetricQueryGetArgs> metricQueries) {
            return metricQueries(Output.of(metricQueries));
        }

        /**
         * @param metricQueries Enables you to create an alarm based on a metric math expression. You may specify at most 20.
         * 
         * @return builder
         * 
         */
        public Builder metricQueries(MetricAlarmMetricQueryGetArgs... metricQueries) {
            return metricQueries(List.of(metricQueries));
        }

        /**
         * @param name The descriptive name for the alarm. This name must be unique within the user&#39;s AWS account
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The descriptive name for the alarm. This name must be unique within the user&#39;s AWS account
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespace The namespace for this metric. See docs for the [list of namespaces](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/aws-namespaces.html).
         * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace The namespace for this metric. See docs for the [list of namespaces](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/aws-namespaces.html).
         * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        /**
         * @param okActions The list of actions to execute when this alarm transitions into an OK state from any other state. Each action is specified as an Amazon Resource Name (ARN).
         * 
         * @return builder
         * 
         */
        public Builder okActions(@Nullable Output<List<String>> okActions) {
            $.okActions = okActions;
            return this;
        }

        /**
         * @param okActions The list of actions to execute when this alarm transitions into an OK state from any other state. Each action is specified as an Amazon Resource Name (ARN).
         * 
         * @return builder
         * 
         */
        public Builder okActions(List<String> okActions) {
            return okActions(Output.of(okActions));
        }

        /**
         * @param okActions The list of actions to execute when this alarm transitions into an OK state from any other state. Each action is specified as an Amazon Resource Name (ARN).
         * 
         * @return builder
         * 
         */
        public Builder okActions(String... okActions) {
            return okActions(List.of(okActions));
        }

        /**
         * @param period The period in seconds over which the specified `stat` is applied.
         * 
         * @return builder
         * 
         */
        public Builder period(@Nullable Output<Integer> period) {
            $.period = period;
            return this;
        }

        /**
         * @param period The period in seconds over which the specified `stat` is applied.
         * 
         * @return builder
         * 
         */
        public Builder period(Integer period) {
            return period(Output.of(period));
        }

        /**
         * @param statistic The statistic to apply to the alarm&#39;s associated metric.
         * Either of the following is supported: `SampleCount`, `Average`, `Sum`, `Minimum`, `Maximum`
         * 
         * @return builder
         * 
         */
        public Builder statistic(@Nullable Output<String> statistic) {
            $.statistic = statistic;
            return this;
        }

        /**
         * @param statistic The statistic to apply to the alarm&#39;s associated metric.
         * Either of the following is supported: `SampleCount`, `Average`, `Sum`, `Minimum`, `Maximum`
         * 
         * @return builder
         * 
         */
        public Builder statistic(String statistic) {
            return statistic(Output.of(statistic));
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param threshold The value against which the specified statistic is compared. This parameter is required for alarms based on static thresholds, but should not be used for alarms based on anomaly detection models.
         * 
         * @return builder
         * 
         */
        public Builder threshold(@Nullable Output<Double> threshold) {
            $.threshold = threshold;
            return this;
        }

        /**
         * @param threshold The value against which the specified statistic is compared. This parameter is required for alarms based on static thresholds, but should not be used for alarms based on anomaly detection models.
         * 
         * @return builder
         * 
         */
        public Builder threshold(Double threshold) {
            return threshold(Output.of(threshold));
        }

        /**
         * @param thresholdMetricId If this is an alarm based on an anomaly detection model, make this value match the ID of the ANOMALY_DETECTION_BAND function.
         * 
         * @return builder
         * 
         */
        public Builder thresholdMetricId(@Nullable Output<String> thresholdMetricId) {
            $.thresholdMetricId = thresholdMetricId;
            return this;
        }

        /**
         * @param thresholdMetricId If this is an alarm based on an anomaly detection model, make this value match the ID of the ANOMALY_DETECTION_BAND function.
         * 
         * @return builder
         * 
         */
        public Builder thresholdMetricId(String thresholdMetricId) {
            return thresholdMetricId(Output.of(thresholdMetricId));
        }

        /**
         * @param treatMissingData Sets how this alarm is to handle missing data points. The following values are supported: `missing`, `ignore`, `breaching` and `notBreaching`. Defaults to `missing`.
         * 
         * @return builder
         * 
         */
        public Builder treatMissingData(@Nullable Output<String> treatMissingData) {
            $.treatMissingData = treatMissingData;
            return this;
        }

        /**
         * @param treatMissingData Sets how this alarm is to handle missing data points. The following values are supported: `missing`, `ignore`, `breaching` and `notBreaching`. Defaults to `missing`.
         * 
         * @return builder
         * 
         */
        public Builder treatMissingData(String treatMissingData) {
            return treatMissingData(Output.of(treatMissingData));
        }

        /**
         * @param unit The unit for this metric.
         * 
         * @return builder
         * 
         */
        public Builder unit(@Nullable Output<String> unit) {
            $.unit = unit;
            return this;
        }

        /**
         * @param unit The unit for this metric.
         * 
         * @return builder
         * 
         */
        public Builder unit(String unit) {
            return unit(Output.of(unit));
        }

        public MetricAlarmState build() {
            return $;
        }
    }

}
