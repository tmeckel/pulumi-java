// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class WebAclRuleVisibilityConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleVisibilityConfigArgs Empty = new WebAclRuleVisibilityConfigArgs();

    /**
     * A boolean indicating whether the associated resource sends metrics to CloudWatch. For the list of available metrics, see [AWS WAF Metrics](https://docs.aws.amazon.com/waf/latest/developerguide/monitoring-cloudwatch.html#waf-metrics).
     * 
     */
    @InputImport(name="cloudwatchMetricsEnabled", required=true)
      private final Input<Boolean> cloudwatchMetricsEnabled;

    public Input<Boolean> getCloudwatchMetricsEnabled() {
        return this.cloudwatchMetricsEnabled;
    }

    /**
     * A friendly name of the CloudWatch metric. The name can contain only alphanumeric characters (A-Z, a-z, 0-9) hyphen(-) and underscore (\_), with length from one to 128 characters. It can't contain whitespace or metric names reserved for AWS WAF, for example `All` and `Default_Action`.
     * 
     */
    @InputImport(name="metricName", required=true)
      private final Input<String> metricName;

    public Input<String> getMetricName() {
        return this.metricName;
    }

    /**
     * A boolean indicating whether AWS WAF should store a sampling of the web requests that match the rules. You can view the sampled requests through the AWS WAF console.
     * 
     */
    @InputImport(name="sampledRequestsEnabled", required=true)
      private final Input<Boolean> sampledRequestsEnabled;

    public Input<Boolean> getSampledRequestsEnabled() {
        return this.sampledRequestsEnabled;
    }

    public WebAclRuleVisibilityConfigArgs(
        Input<Boolean> cloudwatchMetricsEnabled,
        Input<String> metricName,
        Input<Boolean> sampledRequestsEnabled) {
        this.cloudwatchMetricsEnabled = Objects.requireNonNull(cloudwatchMetricsEnabled, "expected parameter 'cloudwatchMetricsEnabled' to be non-null");
        this.metricName = Objects.requireNonNull(metricName, "expected parameter 'metricName' to be non-null");
        this.sampledRequestsEnabled = Objects.requireNonNull(sampledRequestsEnabled, "expected parameter 'sampledRequestsEnabled' to be non-null");
    }

    private WebAclRuleVisibilityConfigArgs() {
        this.cloudwatchMetricsEnabled = Input.empty();
        this.metricName = Input.empty();
        this.sampledRequestsEnabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleVisibilityConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> cloudwatchMetricsEnabled;
        private Input<String> metricName;
        private Input<Boolean> sampledRequestsEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleVisibilityConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchMetricsEnabled = defaults.cloudwatchMetricsEnabled;
    	      this.metricName = defaults.metricName;
    	      this.sampledRequestsEnabled = defaults.sampledRequestsEnabled;
        }

        public Builder cloudwatchMetricsEnabled(Input<Boolean> cloudwatchMetricsEnabled) {
            this.cloudwatchMetricsEnabled = Objects.requireNonNull(cloudwatchMetricsEnabled);
            return this;
        }

        public Builder cloudwatchMetricsEnabled(Boolean cloudwatchMetricsEnabled) {
            this.cloudwatchMetricsEnabled = Input.of(Objects.requireNonNull(cloudwatchMetricsEnabled));
            return this;
        }

        public Builder metricName(Input<String> metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }

        public Builder metricName(String metricName) {
            this.metricName = Input.of(Objects.requireNonNull(metricName));
            return this;
        }

        public Builder sampledRequestsEnabled(Input<Boolean> sampledRequestsEnabled) {
            this.sampledRequestsEnabled = Objects.requireNonNull(sampledRequestsEnabled);
            return this;
        }

        public Builder sampledRequestsEnabled(Boolean sampledRequestsEnabled) {
            this.sampledRequestsEnabled = Input.of(Objects.requireNonNull(sampledRequestsEnabled));
            return this;
        }
        public WebAclRuleVisibilityConfigArgs build() {
            return new WebAclRuleVisibilityConfigArgs(cloudwatchMetricsEnabled, metricName, sampledRequestsEnabled);
        }
    }
}
