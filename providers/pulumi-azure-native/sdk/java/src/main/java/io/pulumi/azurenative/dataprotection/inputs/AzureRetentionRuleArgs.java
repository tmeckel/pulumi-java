// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.azurenative.dataprotection.inputs.SourceLifeCycleArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Azure retention rule
 * 
 */
public final class AzureRetentionRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureRetentionRuleArgs Empty = new AzureRetentionRuleArgs();

    @Import(name="isDefault")
      private final @Nullable Output<Boolean> isDefault;

    public Output<Boolean> getIsDefault() {
        return this.isDefault == null ? Codegen.empty() : this.isDefault;
    }

    @Import(name="lifecycles", required=true)
      private final Output<List<SourceLifeCycleArgs>> lifecycles;

    public Output<List<SourceLifeCycleArgs>> getLifecycles() {
        return this.lifecycles;
    }

    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * Expected value is 'AzureRetentionRule'.
     * 
     */
    @Import(name="objectType", required=true)
      private final Output<String> objectType;

    public Output<String> getObjectType() {
        return this.objectType;
    }

    public AzureRetentionRuleArgs(
        @Nullable Output<Boolean> isDefault,
        Output<List<SourceLifeCycleArgs>> lifecycles,
        Output<String> name,
        Output<String> objectType) {
        this.isDefault = isDefault;
        this.lifecycles = Objects.requireNonNull(lifecycles, "expected parameter 'lifecycles' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.objectType = Objects.requireNonNull(objectType, "expected parameter 'objectType' to be non-null");
    }

    private AzureRetentionRuleArgs() {
        this.isDefault = Codegen.empty();
        this.lifecycles = Codegen.empty();
        this.name = Codegen.empty();
        this.objectType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureRetentionRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> isDefault;
        private Output<List<SourceLifeCycleArgs>> lifecycles;
        private Output<String> name;
        private Output<String> objectType;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureRetentionRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isDefault = defaults.isDefault;
    	      this.lifecycles = defaults.lifecycles;
    	      this.name = defaults.name;
    	      this.objectType = defaults.objectType;
        }

        public Builder isDefault(@Nullable Output<Boolean> isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Builder isDefault(@Nullable Boolean isDefault) {
            this.isDefault = Codegen.ofNullable(isDefault);
            return this;
        }
        public Builder lifecycles(Output<List<SourceLifeCycleArgs>> lifecycles) {
            this.lifecycles = Objects.requireNonNull(lifecycles);
            return this;
        }
        public Builder lifecycles(List<SourceLifeCycleArgs> lifecycles) {
            this.lifecycles = Output.of(Objects.requireNonNull(lifecycles));
            return this;
        }
        public Builder lifecycles(SourceLifeCycleArgs... lifecycles) {
            return lifecycles(List.of(lifecycles));
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder objectType(Output<String> objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }
        public Builder objectType(String objectType) {
            this.objectType = Output.of(Objects.requireNonNull(objectType));
            return this;
        }        public AzureRetentionRuleArgs build() {
            return new AzureRetentionRuleArgs(isDefault, lifecycles, name, objectType);
        }
    }
}
