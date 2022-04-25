// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.outputs;

import com.pulumi.awsnative.iot.outputs.SecurityProfileBehavior;
import com.pulumi.awsnative.iot.outputs.SecurityProfileMetricToRetain;
import com.pulumi.awsnative.iot.outputs.SecurityProfileTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSecurityProfileResult {
    /**
     * @return A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the profile&#39;s behaviors, but it is also retained for any metric specified here.
     * 
     */
    private final @Nullable List<SecurityProfileMetricToRetain> additionalMetricsToRetainV2;
    /**
     * @return Specifies the destinations to which alerts are sent.
     * 
     */
    private final @Nullable Object alertTargets;
    /**
     * @return Specifies the behaviors that, when violated by a device (thing), cause an alert.
     * 
     */
    private final @Nullable List<SecurityProfileBehavior> behaviors;
    /**
     * @return The ARN (Amazon resource name) of the created security profile.
     * 
     */
    private final @Nullable String securityProfileArn;
    /**
     * @return A description of the security profile.
     * 
     */
    private final @Nullable String securityProfileDescription;
    /**
     * @return Metadata that can be used to manage the security profile.
     * 
     */
    private final @Nullable List<SecurityProfileTag> tags;
    /**
     * @return A set of target ARNs that the security profile is attached to.
     * 
     */
    private final @Nullable List<String> targetArns;

    @CustomType.Constructor
    private GetSecurityProfileResult(
        @CustomType.Parameter("additionalMetricsToRetainV2") @Nullable List<SecurityProfileMetricToRetain> additionalMetricsToRetainV2,
        @CustomType.Parameter("alertTargets") @Nullable Object alertTargets,
        @CustomType.Parameter("behaviors") @Nullable List<SecurityProfileBehavior> behaviors,
        @CustomType.Parameter("securityProfileArn") @Nullable String securityProfileArn,
        @CustomType.Parameter("securityProfileDescription") @Nullable String securityProfileDescription,
        @CustomType.Parameter("tags") @Nullable List<SecurityProfileTag> tags,
        @CustomType.Parameter("targetArns") @Nullable List<String> targetArns) {
        this.additionalMetricsToRetainV2 = additionalMetricsToRetainV2;
        this.alertTargets = alertTargets;
        this.behaviors = behaviors;
        this.securityProfileArn = securityProfileArn;
        this.securityProfileDescription = securityProfileDescription;
        this.tags = tags;
        this.targetArns = targetArns;
    }

    /**
     * @return A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the profile&#39;s behaviors, but it is also retained for any metric specified here.
     * 
     */
    public List<SecurityProfileMetricToRetain> additionalMetricsToRetainV2() {
        return this.additionalMetricsToRetainV2 == null ? List.of() : this.additionalMetricsToRetainV2;
    }
    /**
     * @return Specifies the destinations to which alerts are sent.
     * 
     */
    public Optional<Object> alertTargets() {
        return Optional.ofNullable(this.alertTargets);
    }
    /**
     * @return Specifies the behaviors that, when violated by a device (thing), cause an alert.
     * 
     */
    public List<SecurityProfileBehavior> behaviors() {
        return this.behaviors == null ? List.of() : this.behaviors;
    }
    /**
     * @return The ARN (Amazon resource name) of the created security profile.
     * 
     */
    public Optional<String> securityProfileArn() {
        return Optional.ofNullable(this.securityProfileArn);
    }
    /**
     * @return A description of the security profile.
     * 
     */
    public Optional<String> securityProfileDescription() {
        return Optional.ofNullable(this.securityProfileDescription);
    }
    /**
     * @return Metadata that can be used to manage the security profile.
     * 
     */
    public List<SecurityProfileTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * @return A set of target ARNs that the security profile is attached to.
     * 
     */
    public List<String> targetArns() {
        return this.targetArns == null ? List.of() : this.targetArns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecurityProfileResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<SecurityProfileMetricToRetain> additionalMetricsToRetainV2;
        private @Nullable Object alertTargets;
        private @Nullable List<SecurityProfileBehavior> behaviors;
        private @Nullable String securityProfileArn;
        private @Nullable String securityProfileDescription;
        private @Nullable List<SecurityProfileTag> tags;
        private @Nullable List<String> targetArns;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecurityProfileResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalMetricsToRetainV2 = defaults.additionalMetricsToRetainV2;
    	      this.alertTargets = defaults.alertTargets;
    	      this.behaviors = defaults.behaviors;
    	      this.securityProfileArn = defaults.securityProfileArn;
    	      this.securityProfileDescription = defaults.securityProfileDescription;
    	      this.tags = defaults.tags;
    	      this.targetArns = defaults.targetArns;
        }

        public Builder additionalMetricsToRetainV2(@Nullable List<SecurityProfileMetricToRetain> additionalMetricsToRetainV2) {
            this.additionalMetricsToRetainV2 = additionalMetricsToRetainV2;
            return this;
        }
        public Builder additionalMetricsToRetainV2(SecurityProfileMetricToRetain... additionalMetricsToRetainV2) {
            return additionalMetricsToRetainV2(List.of(additionalMetricsToRetainV2));
        }
        public Builder alertTargets(@Nullable Object alertTargets) {
            this.alertTargets = alertTargets;
            return this;
        }
        public Builder behaviors(@Nullable List<SecurityProfileBehavior> behaviors) {
            this.behaviors = behaviors;
            return this;
        }
        public Builder behaviors(SecurityProfileBehavior... behaviors) {
            return behaviors(List.of(behaviors));
        }
        public Builder securityProfileArn(@Nullable String securityProfileArn) {
            this.securityProfileArn = securityProfileArn;
            return this;
        }
        public Builder securityProfileDescription(@Nullable String securityProfileDescription) {
            this.securityProfileDescription = securityProfileDescription;
            return this;
        }
        public Builder tags(@Nullable List<SecurityProfileTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(SecurityProfileTag... tags) {
            return tags(List.of(tags));
        }
        public Builder targetArns(@Nullable List<String> targetArns) {
            this.targetArns = targetArns;
            return this;
        }
        public Builder targetArns(String... targetArns) {
            return targetArns(List.of(targetArns));
        }        public GetSecurityProfileResult build() {
            return new GetSecurityProfileResult(additionalMetricsToRetainV2, alertTargets, behaviors, securityProfileArn, securityProfileDescription, tags, targetArns);
        }
    }
}
