// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.inputs.FeatureGroupOnlineStoreSecurityConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OnlineStoreConfigPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final OnlineStoreConfigPropertiesArgs Empty = new OnlineStoreConfigPropertiesArgs();

    @InputImport(name="enableOnlineStore")
      private final @Nullable Input<Boolean> enableOnlineStore;

    public Input<Boolean> getEnableOnlineStore() {
        return this.enableOnlineStore == null ? Input.empty() : this.enableOnlineStore;
    }

    @InputImport(name="securityConfig")
      private final @Nullable Input<FeatureGroupOnlineStoreSecurityConfigArgs> securityConfig;

    public Input<FeatureGroupOnlineStoreSecurityConfigArgs> getSecurityConfig() {
        return this.securityConfig == null ? Input.empty() : this.securityConfig;
    }

    public OnlineStoreConfigPropertiesArgs(
        @Nullable Input<Boolean> enableOnlineStore,
        @Nullable Input<FeatureGroupOnlineStoreSecurityConfigArgs> securityConfig) {
        this.enableOnlineStore = enableOnlineStore;
        this.securityConfig = securityConfig;
    }

    private OnlineStoreConfigPropertiesArgs() {
        this.enableOnlineStore = Input.empty();
        this.securityConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OnlineStoreConfigPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enableOnlineStore;
        private @Nullable Input<FeatureGroupOnlineStoreSecurityConfigArgs> securityConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(OnlineStoreConfigPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableOnlineStore = defaults.enableOnlineStore;
    	      this.securityConfig = defaults.securityConfig;
        }

        public Builder enableOnlineStore(@Nullable Input<Boolean> enableOnlineStore) {
            this.enableOnlineStore = enableOnlineStore;
            return this;
        }

        public Builder enableOnlineStore(@Nullable Boolean enableOnlineStore) {
            this.enableOnlineStore = Input.ofNullable(enableOnlineStore);
            return this;
        }

        public Builder securityConfig(@Nullable Input<FeatureGroupOnlineStoreSecurityConfigArgs> securityConfig) {
            this.securityConfig = securityConfig;
            return this;
        }

        public Builder securityConfig(@Nullable FeatureGroupOnlineStoreSecurityConfigArgs securityConfig) {
            this.securityConfig = Input.ofNullable(securityConfig);
            return this;
        }
        public OnlineStoreConfigPropertiesArgs build() {
            return new OnlineStoreConfigPropertiesArgs(enableOnlineStore, securityConfig);
        }
    }
}
