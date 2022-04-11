// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class RecordAliasGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RecordAliasGetArgs Empty = new RecordAliasGetArgs();

    /**
     * Set to `true` if you want Route 53 to determine whether to respond to DNS queries using this resource record set by checking the health of the resource record set. Some resources have special requirements, see [related part of documentation](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/resource-record-sets-values.html#rrsets-values-alias-evaluate-target-health).
     * 
     */
    @Import(name="evaluateTargetHealth", required=true)
      private final Output<Boolean> evaluateTargetHealth;

    public Output<Boolean> getEvaluateTargetHealth() {
        return this.evaluateTargetHealth;
    }

    /**
     * DNS domain name for a CloudFront distribution, S3 bucket, ELB, or another resource record set in this hosted zone.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * Hosted zone ID for a CloudFront distribution, S3 bucket, ELB, or Route 53 hosted zone. See `resource_elb.zone_id` for example.
     * 
     */
    @Import(name="zoneId", required=true)
      private final Output<String> zoneId;

    public Output<String> getZoneId() {
        return this.zoneId;
    }

    public RecordAliasGetArgs(
        Output<Boolean> evaluateTargetHealth,
        Output<String> name,
        Output<String> zoneId) {
        this.evaluateTargetHealth = Objects.requireNonNull(evaluateTargetHealth, "expected parameter 'evaluateTargetHealth' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.zoneId = Objects.requireNonNull(zoneId, "expected parameter 'zoneId' to be non-null");
    }

    private RecordAliasGetArgs() {
        this.evaluateTargetHealth = Codegen.empty();
        this.name = Codegen.empty();
        this.zoneId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecordAliasGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> evaluateTargetHealth;
        private Output<String> name;
        private Output<String> zoneId;

        public Builder() {
    	      // Empty
        }

        public Builder(RecordAliasGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.evaluateTargetHealth = defaults.evaluateTargetHealth;
    	      this.name = defaults.name;
    	      this.zoneId = defaults.zoneId;
        }

        public Builder evaluateTargetHealth(Output<Boolean> evaluateTargetHealth) {
            this.evaluateTargetHealth = Objects.requireNonNull(evaluateTargetHealth);
            return this;
        }
        public Builder evaluateTargetHealth(Boolean evaluateTargetHealth) {
            this.evaluateTargetHealth = Output.of(Objects.requireNonNull(evaluateTargetHealth));
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder zoneId(Output<String> zoneId) {
            this.zoneId = Objects.requireNonNull(zoneId);
            return this;
        }
        public Builder zoneId(String zoneId) {
            this.zoneId = Output.of(Objects.requireNonNull(zoneId));
            return this;
        }        public RecordAliasGetArgs build() {
            return new RecordAliasGetArgs(evaluateTargetHealth, name, zoneId);
        }
    }
}
