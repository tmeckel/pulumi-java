// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class RuleGroupRuleVisibilityConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleVisibilityConfigArgs Empty = new RuleGroupRuleVisibilityConfigArgs();

    /**
     * A boolean indicating whether the associated resource sends metrics to CloudWatch. For the list of available metrics, see [AWS WAF Metrics](https://docs.aws.amazon.com/waf/latest/developerguide/monitoring-cloudwatch.html#waf-metrics).
     * 
     */
    @Import(name="cloudwatchMetricsEnabled", required=true)
      private final Output<Boolean> cloudwatchMetricsEnabled;

    public Output<Boolean> getCloudwatchMetricsEnabled() {
        return this.cloudwatchMetricsEnabled;
    }

    /**
     * A friendly name of the CloudWatch metric. The name can contain only alphanumeric characters (A-Z, a-z, 0-9) hyphen(-) and underscore (_), with length from one to 128 characters. It can't contain whitespace or metric names reserved for AWS WAF, for example `All` and `Default_Action`.
     * 
     */
    @Import(name="metricName", required=true)
      private final Output<String> metricName;

    public Output<String> getMetricName() {
        return this.metricName;
    }

    /**
     * A boolean indicating whether AWS WAF should store a sampling of the web requests that match the rules. You can view the sampled requests through the AWS WAF console.
     * 
     */
    @Import(name="sampledRequestsEnabled", required=true)
      private final Output<Boolean> sampledRequestsEnabled;

    public Output<Boolean> getSampledRequestsEnabled() {
        return this.sampledRequestsEnabled;
    }

    public RuleGroupRuleVisibilityConfigArgs(
        Output<Boolean> cloudwatchMetricsEnabled,
        Output<String> metricName,
        Output<Boolean> sampledRequestsEnabled) {
        this.cloudwatchMetricsEnabled = Objects.requireNonNull(cloudwatchMetricsEnabled, "expected parameter 'cloudwatchMetricsEnabled' to be non-null");
        this.metricName = Objects.requireNonNull(metricName, "expected parameter 'metricName' to be non-null");
        this.sampledRequestsEnabled = Objects.requireNonNull(sampledRequestsEnabled, "expected parameter 'sampledRequestsEnabled' to be non-null");
    }

    private RuleGroupRuleVisibilityConfigArgs() {
        this.cloudwatchMetricsEnabled = Codegen.empty();
        this.metricName = Codegen.empty();
        this.sampledRequestsEnabled = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleVisibilityConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> cloudwatchMetricsEnabled;
        private Output<String> metricName;
        private Output<Boolean> sampledRequestsEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleVisibilityConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchMetricsEnabled = defaults.cloudwatchMetricsEnabled;
    	      this.metricName = defaults.metricName;
    	      this.sampledRequestsEnabled = defaults.sampledRequestsEnabled;
        }

        public Builder cloudwatchMetricsEnabled(Output<Boolean> cloudwatchMetricsEnabled) {
            this.cloudwatchMetricsEnabled = Objects.requireNonNull(cloudwatchMetricsEnabled);
            return this;
        }
        public Builder cloudwatchMetricsEnabled(Boolean cloudwatchMetricsEnabled) {
            this.cloudwatchMetricsEnabled = Output.of(Objects.requireNonNull(cloudwatchMetricsEnabled));
            return this;
        }
        public Builder metricName(Output<String> metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }
        public Builder metricName(String metricName) {
            this.metricName = Output.of(Objects.requireNonNull(metricName));
            return this;
        }
        public Builder sampledRequestsEnabled(Output<Boolean> sampledRequestsEnabled) {
            this.sampledRequestsEnabled = Objects.requireNonNull(sampledRequestsEnabled);
            return this;
        }
        public Builder sampledRequestsEnabled(Boolean sampledRequestsEnabled) {
            this.sampledRequestsEnabled = Output.of(Objects.requireNonNull(sampledRequestsEnabled));
            return this;
        }        public RuleGroupRuleVisibilityConfigArgs build() {
            return new RuleGroupRuleVisibilityConfigArgs(cloudwatchMetricsEnabled, metricName, sampledRequestsEnabled);
        }
    }
}
