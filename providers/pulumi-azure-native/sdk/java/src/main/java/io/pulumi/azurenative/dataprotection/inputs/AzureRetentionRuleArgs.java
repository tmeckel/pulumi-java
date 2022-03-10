// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.azurenative.dataprotection.inputs.SourceLifeCycleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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

    @InputImport(name="isDefault")
      private final @Nullable Input<Boolean> isDefault;

    public Input<Boolean> getIsDefault() {
        return this.isDefault == null ? Input.empty() : this.isDefault;
    }

    @InputImport(name="lifecycles", required=true)
      private final Input<List<SourceLifeCycleArgs>> lifecycles;

    public Input<List<SourceLifeCycleArgs>> getLifecycles() {
        return this.lifecycles;
    }

    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Expected value is 'AzureRetentionRule'.
     * 
     */
    @InputImport(name="objectType", required=true)
      private final Input<String> objectType;

    public Input<String> getObjectType() {
        return this.objectType;
    }

    public AzureRetentionRuleArgs(
        @Nullable Input<Boolean> isDefault,
        Input<List<SourceLifeCycleArgs>> lifecycles,
        Input<String> name,
        Input<String> objectType) {
        this.isDefault = isDefault;
        this.lifecycles = Objects.requireNonNull(lifecycles, "expected parameter 'lifecycles' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.objectType = Objects.requireNonNull(objectType, "expected parameter 'objectType' to be non-null");
    }

    private AzureRetentionRuleArgs() {
        this.isDefault = Input.empty();
        this.lifecycles = Input.empty();
        this.name = Input.empty();
        this.objectType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureRetentionRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> isDefault;
        private Input<List<SourceLifeCycleArgs>> lifecycles;
        private Input<String> name;
        private Input<String> objectType;

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

        public Builder isDefault(@Nullable Input<Boolean> isDefault) {
            this.isDefault = isDefault;
            return this;
        }

        public Builder isDefault(@Nullable Boolean isDefault) {
            this.isDefault = Input.ofNullable(isDefault);
            return this;
        }

        public Builder lifecycles(Input<List<SourceLifeCycleArgs>> lifecycles) {
            this.lifecycles = Objects.requireNonNull(lifecycles);
            return this;
        }

        public Builder lifecycles(List<SourceLifeCycleArgs> lifecycles) {
            this.lifecycles = Input.of(Objects.requireNonNull(lifecycles));
            return this;
        }

        public Builder name(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder objectType(Input<String> objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }

        public Builder objectType(String objectType) {
            this.objectType = Input.of(Objects.requireNonNull(objectType));
            return this;
        }
        public AzureRetentionRuleArgs build() {
            return new AzureRetentionRuleArgs(isDefault, lifecycles, name, objectType);
        }
    }
}
