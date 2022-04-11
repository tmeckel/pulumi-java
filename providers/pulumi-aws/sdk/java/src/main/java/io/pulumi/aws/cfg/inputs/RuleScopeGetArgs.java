// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cfg.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleScopeGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleScopeGetArgs Empty = new RuleScopeGetArgs();

    /**
     * The IDs of the only AWS resource that you want to trigger an evaluation for the rule. If you specify a resource ID, you must specify one resource type for `compliance_resource_types`.
     * 
     */
    @Import(name="complianceResourceId")
      private final @Nullable Output<String> complianceResourceId;

    public Output<String> getComplianceResourceId() {
        return this.complianceResourceId == null ? Codegen.empty() : this.complianceResourceId;
    }

    /**
     * A list of resource types of only those AWS resources that you want to trigger an evaluation for the ruleE.g., `AWS::EC2::Instance`. You can only specify one type if you also specify a resource ID for `compliance_resource_id`. See [relevant part of AWS Docs](http://docs.aws.amazon.com/config/latest/APIReference/API_ResourceIdentifier.html#config-Type-ResourceIdentifier-resourceType) for available types.
     * 
     */
    @Import(name="complianceResourceTypes")
      private final @Nullable Output<List<String>> complianceResourceTypes;

    public Output<List<String>> getComplianceResourceTypes() {
        return this.complianceResourceTypes == null ? Codegen.empty() : this.complianceResourceTypes;
    }

    /**
     * The tag key that is applied to only those AWS resources that you want you want to trigger an evaluation for the rule.
     * 
     */
    @Import(name="tagKey")
      private final @Nullable Output<String> tagKey;

    public Output<String> getTagKey() {
        return this.tagKey == null ? Codegen.empty() : this.tagKey;
    }

    /**
     * The tag value applied to only those AWS resources that you want to trigger an evaluation for the rule.
     * 
     */
    @Import(name="tagValue")
      private final @Nullable Output<String> tagValue;

    public Output<String> getTagValue() {
        return this.tagValue == null ? Codegen.empty() : this.tagValue;
    }

    public RuleScopeGetArgs(
        @Nullable Output<String> complianceResourceId,
        @Nullable Output<List<String>> complianceResourceTypes,
        @Nullable Output<String> tagKey,
        @Nullable Output<String> tagValue) {
        this.complianceResourceId = complianceResourceId;
        this.complianceResourceTypes = complianceResourceTypes;
        this.tagKey = tagKey;
        this.tagValue = tagValue;
    }

    private RuleScopeGetArgs() {
        this.complianceResourceId = Codegen.empty();
        this.complianceResourceTypes = Codegen.empty();
        this.tagKey = Codegen.empty();
        this.tagValue = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleScopeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> complianceResourceId;
        private @Nullable Output<List<String>> complianceResourceTypes;
        private @Nullable Output<String> tagKey;
        private @Nullable Output<String> tagValue;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleScopeGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.complianceResourceId = defaults.complianceResourceId;
    	      this.complianceResourceTypes = defaults.complianceResourceTypes;
    	      this.tagKey = defaults.tagKey;
    	      this.tagValue = defaults.tagValue;
        }

        public Builder complianceResourceId(@Nullable Output<String> complianceResourceId) {
            this.complianceResourceId = complianceResourceId;
            return this;
        }
        public Builder complianceResourceId(@Nullable String complianceResourceId) {
            this.complianceResourceId = Codegen.ofNullable(complianceResourceId);
            return this;
        }
        public Builder complianceResourceTypes(@Nullable Output<List<String>> complianceResourceTypes) {
            this.complianceResourceTypes = complianceResourceTypes;
            return this;
        }
        public Builder complianceResourceTypes(@Nullable List<String> complianceResourceTypes) {
            this.complianceResourceTypes = Codegen.ofNullable(complianceResourceTypes);
            return this;
        }
        public Builder complianceResourceTypes(String... complianceResourceTypes) {
            return complianceResourceTypes(List.of(complianceResourceTypes));
        }
        public Builder tagKey(@Nullable Output<String> tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public Builder tagKey(@Nullable String tagKey) {
            this.tagKey = Codegen.ofNullable(tagKey);
            return this;
        }
        public Builder tagValue(@Nullable Output<String> tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public Builder tagValue(@Nullable String tagValue) {
            this.tagValue = Codegen.ofNullable(tagValue);
            return this;
        }        public RuleScopeGetArgs build() {
            return new RuleScopeGetArgs(complianceResourceId, complianceResourceTypes, tagKey, tagValue);
        }
    }
}
