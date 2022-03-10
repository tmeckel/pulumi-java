// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.ContentKeyPolicyClearKeyConfigurationArgs;
import io.pulumi.azurenative.media.inputs.ContentKeyPolicyFairPlayConfigurationArgs;
import io.pulumi.azurenative.media.inputs.ContentKeyPolicyOpenRestrictionArgs;
import io.pulumi.azurenative.media.inputs.ContentKeyPolicyPlayReadyConfigurationArgs;
import io.pulumi.azurenative.media.inputs.ContentKeyPolicyTokenRestrictionArgs;
import io.pulumi.azurenative.media.inputs.ContentKeyPolicyUnknownConfigurationArgs;
import io.pulumi.azurenative.media.inputs.ContentKeyPolicyUnknownRestrictionArgs;
import io.pulumi.azurenative.media.inputs.ContentKeyPolicyWidevineConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a policy option.
 * 
 */
public final class ContentKeyPolicyOptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContentKeyPolicyOptionArgs Empty = new ContentKeyPolicyOptionArgs();

    /**
     * The key delivery configuration.
     * 
     */
    @InputImport(name="configuration", required=true)
      private final Input<Object> configuration;

    public Input<Object> getConfiguration() {
        return this.configuration;
    }

    /**
     * The Policy Option description.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The requirements that must be met to deliver keys with this configuration
     * 
     */
    @InputImport(name="restriction", required=true)
      private final Input<Object> restriction;

    public Input<Object> getRestriction() {
        return this.restriction;
    }

    public ContentKeyPolicyOptionArgs(
        Input<Object> configuration,
        @Nullable Input<String> name,
        Input<Object> restriction) {
        this.configuration = Objects.requireNonNull(configuration, "expected parameter 'configuration' to be non-null");
        this.name = name;
        this.restriction = Objects.requireNonNull(restriction, "expected parameter 'restriction' to be non-null");
    }

    private ContentKeyPolicyOptionArgs() {
        this.configuration = Input.empty();
        this.name = Input.empty();
        this.restriction = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyOptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Object> configuration;
        private @Nullable Input<String> name;
        private Input<Object> restriction;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyOptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configuration = defaults.configuration;
    	      this.name = defaults.name;
    	      this.restriction = defaults.restriction;
        }

        public Builder configuration(Input<Object> configuration) {
            this.configuration = Objects.requireNonNull(configuration);
            return this;
        }

        public Builder configuration(Object configuration) {
            this.configuration = Input.of(Objects.requireNonNull(configuration));
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder restriction(Input<Object> restriction) {
            this.restriction = Objects.requireNonNull(restriction);
            return this;
        }

        public Builder restriction(Object restriction) {
            this.restriction = Input.of(Objects.requireNonNull(restriction));
            return this;
        }
        public ContentKeyPolicyOptionArgs build() {
            return new ContentKeyPolicyOptionArgs(configuration, name, restriction);
        }
    }
}
